package org.fasttrackit.generics.recursion.generics;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shop<Clothes> clothesShop = new Shop<>();
        clothesShop.addItem(new Clothes("T-shirt", 25, Category.NEW));
        clothesShop.addItem(new Clothes("shirt", 70, Category.NEW));
        clothesShop.addItem(new Clothes("Jeans", 100, Category.ON_SALE));
        clothesShop.myItems();

        Shop<Electronics> electronicsShop = new Shop<>();
        electronicsShop.addItem(new Electronics("SmartPhone", 200, Category.REFURBISHED));
        electronicsShop.addItem(new Electronics("Fridge", 500, Category.NEW));
        electronicsShop.addItem(new Electronics("Washing machine", 2000, Category.NEW));
        electronicsShop.myItems();

        Shop<Fruits> fruitsShop = new Shop<>();
        fruitsShop.addItem(new Fruits("apple", 2, Category.ON_SALE));
        fruitsShop.myItems();


        System.out.println("Electronics with category NEW:");
        List<Electronics> newElectronics = electronicsShop.findByCategory(Category.NEW);
        for (Electronics electronic : newElectronics) {
            System.out.println("Name" + electronic.name() + ", Price: " + electronic.price() + ", Category: " + electronic.category());
        }

        System.out.println("Items by lower price are:");
        List<Electronics> lowerPriceElectronic = electronicsShop.findByLowerPrice(700);
        for (Electronics electronics : lowerPriceElectronic) {
            System.out.println("Name " + electronics.name() + "Price " + electronics.price() + "Category" + electronics.category());
        }

        Clothes foundClothes = clothesShop.findByName("Jeans");
        if (foundClothes != null) {
            System.out.println("Name: " + foundClothes.name() + ", Price: " + foundClothes.price() + ", Category: " + foundClothes.category());
        } else {
            System.out.println("Item not found.");
        }


        Clothes removedClothes = clothesShop.removeItem("Jeans");
        if (removedClothes != null) {
            System.out.println("Removed item - Name: " + removedClothes.name() + ", Price: " + removedClothes.price() + ", Category: " + removedClothes.category());
        } else {
            System.out.println("Item not found.");
        }

        System.out.println("My Clothes Shop after removed item is : ");
        clothesShop.myItems();


    }
}
