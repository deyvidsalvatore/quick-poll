package com.deyvidsantos.quickpoll.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.deyvidsantos.quickpoll.domain.Vote;
import com.deyvidsantos.quickpoll.dto.OptionCount;
import com.deyvidsantos.quickpoll.dto.VoteResult;
import com.deyvidsantos.quickpoll.repositories.VoteRepository;

@RestController
public class ComputeResultController {

    @Inject
    private VoteRepository voteRepository;

    /**
     * Calcula o resultado de uma votação com base nos votos.
     *
     * @param pollId o ID da votação para a qual o resultado deve ser calculado
     * @return ResponseEntity contendo o resultado da votação calculado
     */
    @GetMapping("/computeresult")
    public ResponseEntity<?> computeResult(@RequestParam Long pollId) {
        VoteResult voteResult = new VoteResult();
        Iterable<Vote> allVotes = voteRepository.findByPoll(pollId);

        // Algoritmo para contar os votos
        int totalVotes = 0;
        Map<Long, OptionCount> tempMap = new HashMap<Long, OptionCount>();
        for (Vote v : allVotes) {
            totalVotes++;
            OptionCount optionCount = tempMap.get(v.getOption().getId());
            if (optionCount == null) {
                optionCount = new OptionCount();
                optionCount.setOptionId(v.getOption().getId());
                optionCount.setCount(0); // Inicializa a propriedade count com 0
                tempMap.put(v.getOption().getId(), optionCount);
            }
            optionCount.setCount(optionCount.getCount() + 1);
        }

        voteResult.setTotalVotes(totalVotes);
        voteResult.setResults(tempMap.values());

        return new ResponseEntity<>(voteResult, HttpStatus.OK);
    }
}
