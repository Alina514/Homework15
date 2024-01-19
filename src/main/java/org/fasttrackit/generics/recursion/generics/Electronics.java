package org.fasttrackit.generics.recursion.generics;


public class Electronics implements ShopItem<Electronics> {
    private final String name;
    private final int price;
    private final Category category;

    public Electronics(String name, int price, Category category) {
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
    public Electronics getItemDetails() {
        return this;
    }

}
