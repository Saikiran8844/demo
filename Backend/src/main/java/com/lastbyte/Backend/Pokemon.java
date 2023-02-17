package com.lastbyte.Backend;

public class Pokemon {
    private int id;
    private  String name;
    private  int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setId(int id) {
        this.id = id;
    }
}
