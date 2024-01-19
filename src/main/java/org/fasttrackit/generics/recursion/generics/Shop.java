package org.fasttrackit.generics.recursion.generics;

import java.util.ArrayList;
import java.util.List;

public class Shop< T extends ShopItem> {
    private final List<T> items;


    public Shop() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    public void myItems() {
        for (T item : items) {
            System.out.println("Name: " + item.name() + ", Price: " + item.price() + ", Category: " + item.category().toString());
        }
    }
    public List<T> findByCategory(Category cat) {
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if (item.category() == cat) {
                result.add(item);
            }
        }
        return result;
    }
    public List<T> findByLowerPrice(int maxPrice){
        List<T> result2 = new ArrayList<>();
        for(T item : items){
            if(item.price() <= maxPrice){
                result2.add(item);
            }
        }
        return result2;
    }

    public T findByName(String name) {
        for (T item : items) {
            if (item.name().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public T removeItem(String name) {
        for (T item : items) {
            if (item.name().equals(name)) {
                items.remove(item);
                return item;
            }
        }
        return null;
    }
}
