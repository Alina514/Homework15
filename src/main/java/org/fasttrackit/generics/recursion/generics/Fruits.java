package org.fasttrackit.generics.recursion.generics;

import jdk.jfr.Category;

public class Fruits implements ShopItem<Fruits> {
    private String name;
    private int price;
    private Category category;


    public Fruits(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public Category category() {
        return category;
    }

    @Override
    public Fruits getItemDetails() {
        return this;
    }
}
