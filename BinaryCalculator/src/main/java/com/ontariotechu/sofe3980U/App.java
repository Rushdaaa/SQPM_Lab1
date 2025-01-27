package com.ontariotechu.sofe3980U;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first binary number:");
        String bin1 = scanner.nextLine();

        System.out.println("Enter the second binary number:");
        String bin2 = scanner.nextLine();

        Binary binary1 = new Binary(bin1);
        Binary binary2 = new Binary(bin2);

        Binary orResult = Binary.or(binary1, binary2);
        Binary andResult = Binary.and(binary1, binary2);
        Binary multiplyResult = Binary.multiply(binary1, binary2);

        System.out.println("OR Result: " + orResult.getValue());
        System.out.println("AND Result: " + andResult.getValue());
        System.out.println("Multiply Result: " + multiplyResult.getValue());

        scanner.close();
    }
}
