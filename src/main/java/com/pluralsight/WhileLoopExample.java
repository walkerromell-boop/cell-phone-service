package com.pluralsight;

public class WhileLoopExample {
    public static void main(String[] args) {
        int count = 0;
        while (count <= 100000) {
            System.out.println(count);
            count = count + 5;
        }

    }
}
