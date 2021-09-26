package com.nikita;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение");
        String s = scanner.nextLine();
        BracketsBalancer bracketsBalancer = new BracketsBalancer();
        System.out.println(bracketsBalancer.isBalanced(s));
    }
}


