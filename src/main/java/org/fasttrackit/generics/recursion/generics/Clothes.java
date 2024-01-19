package org.fasttrackit.generics.recursion.generics;

import jdk.jfr.Category;

public class Clothes implements ShopItem<Clothes> {
    private String name;
    private int price;
    private final org.fasttrackit.generics.recursion.generics.Category category;

    public Clothes(String name, int price, org.fasttrackit.generics.recursion.generics.Category category) {
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
    public Clothes getItemDetails() {
        return this;
    }

}
