package com.deyvidsantos.quickpoll.dto;

public class OptionCount {
    
    private Long optionId;
    private Integer count;
    

    public Long getOptionId() {
        return this.optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}
