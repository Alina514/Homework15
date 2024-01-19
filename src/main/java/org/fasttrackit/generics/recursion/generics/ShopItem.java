package org.fasttrackit.generics.recursion.generics;

import jdk.jfr.Category;


public interface ShopItem<T> {
    String name();
    int price();
    Category category();
    T getItemDetails();

}
