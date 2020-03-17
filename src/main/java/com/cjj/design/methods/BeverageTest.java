package com.cjj.design.methods;

public class BeverageTest {

    public static void main(String[] args) {
        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("\n Making tea...");
        teaWithHook.prepareRecipe();

        System.out.println("\n Making coffee...");
        coffeeWithHook.prepareRecipe();
    }
}
