package com.star.recoder;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Jiaxin CHEN
 * @version 1.0
 * @since 2018-12-14 15:43
 */
public class Question {

    private int number;

    private String name;

    private Set<String> tags;

    private int frequency;

    private boolean star;

    private Set<String> companies;

    // 0: easy, 1: mid, 2: hard, 3: very hard
    private int difficulty;

    private Date date;

    public Question(int number, String name, int diff) {
        this.number = number;
        this.name = name;
        this.tags = new HashSet<>();
        this.frequency = 1;
        this.star = false;
        this.companies = new HashSet<>();
        this.difficulty = diff;
        this.date = new Date();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public boolean isStar() {
        return star;
    }

    public void setStar(boolean star) {
        this.star = star;
    }

    public Set<String> getCompanies() {
        return companies;
    }

    public void setCompanies(Set<String> companies) {
        this.companies = companies;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public Date getDate() {
        return date;
    }

    public void setDate() {
        this.date = new Date();
    }
}
