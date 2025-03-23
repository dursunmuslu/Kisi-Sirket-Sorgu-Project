package com.snmp.snmp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class JobDto {

    private Long id;

    private String position;

    public JobDto(long id, String position) {
        this.id = id;
        this.position = position;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



}
