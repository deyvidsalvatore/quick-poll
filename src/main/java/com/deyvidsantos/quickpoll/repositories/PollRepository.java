package com.deyvidsantos.quickpoll.repositories;

import org.springframework.data.repository.CrudRepository;

import com.deyvidsantos.quickpoll.domain.Poll;

public interface PollRepository extends CrudRepository<Poll, Long>{
    
}
