package com.example.alertdialog13072020;

public interface OrderBuilder {
    OrderBuilder orderType(OrderType orderType);
    OrderBuilder breadType(BreadType breadType);
    OrderBuilder sauceType(SauceType sauceType);
    OrderBuilder vegetableType(VegetableType vegetableType);
    Order build();
}
