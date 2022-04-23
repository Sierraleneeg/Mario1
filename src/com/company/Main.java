package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner mario = new Scanner(System.in);
        int height;
        do {
            System.out.println("Height of tower between 1-8 ");
            while (!mario.hasNextInt()) {
                System.out.println("Nope- 1-8 I said");
                mario.next();
            }
            height = mario.nextInt();
        }
        while (height <= 1 || height > 9);
        System.out.println("Height: " + height);
        System.out.println("Stored: " + height);

        for (int row = 0; row < height; row++) {
            for (int col = 1; col < height - row; col++) {
                System.out.print(" ");
            }
            for (int hash = 0; hash <= row; hash++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}


