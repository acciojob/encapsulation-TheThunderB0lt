package com.driver;

public class Main {
    public static void main(String args[]) {
        RWOnly name = new RWOnly();

        name.setName("Nikith Kumar N");

        System.out.println(name.getName());
    }
}