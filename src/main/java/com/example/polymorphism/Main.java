package com.example.polymorphism;

public class Main {

    public static void main (String[] args) {

        Shape[] arr = new Shape[]{new Cicle(), new Square(), new Triange()};
        for (int i = 0; i < arr.length; i++) {
            arr[i].drow();
        }
    }
}
