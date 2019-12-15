package com.codeclan.example.restaurantservice.enums;

public enum Ingredient {

    WHITERICE(200, true),
    BROWNRICE(150, true),
    SAUSAGE(100, false),
    ASPARAGUS(75, true),
    POTATOES(100, true);

    private final int price;
    private final boolean vegetarianFriendly;

    Ingredient(int price, boolean vegetarianFriendly) {
        this.price = price;
        this.vegetarianFriendly = vegetarianFriendly;
    }
        public int getPrice(){
            return this.price;
        }

        public boolean getVegetarianFriendly(){
        return this.vegetarianFriendly;
    }


}
