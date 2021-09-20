package com.Codezeon.crud.dailycode.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="QUES_TBL")

public class Question
{
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String link;
    private String status;
    private int diff = 50;
}
