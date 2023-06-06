package com.deyvidsantos.quickpoll.dto.error;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ErrorDetail {
    
    private String title;
    private Integer status;
    private String detail;
    private Long timeStamp;
    private String path;
    private String developerMessage;

    private Map<String,List<ValidationError>>errors=new HashMap<String,List<ValidationError>>();


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDetail() {
        return this.detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Long getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDeveloperMessage() {
        return this.developerMessage;
    }

    public void setDeveloperMessage(String developerMessage) {
        this.developerMessage = developerMessage;
    }

    public Map<String,List<ValidationError>> getErrors() {
        return this.errors;
    }

    public void setErrors(Map<String,List<ValidationError>> errors) {
        this.errors = errors;
    }
    
}
