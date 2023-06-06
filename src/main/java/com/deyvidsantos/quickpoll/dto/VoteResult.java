package com.deyvidsantos.quickpoll.dto;

import java.util.Collection;

public class VoteResult {
    
    private Integer totalVotes;
    private Collection<OptionCount> results;


    public Integer getTotalVotes() {
        return this.totalVotes;
    }

    public void setTotalVotes(Integer totalVotes) {
        this.totalVotes = totalVotes;
    }

    public Collection<OptionCount> getResults() {
        return this.results;
    }

    public void setResults(Collection<OptionCount> results) {
        this.results = results;
    }

}
