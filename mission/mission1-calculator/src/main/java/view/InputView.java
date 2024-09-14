package view;

import java.util.Scanner;

public class InputView {
    private final Scanner sc = new Scanner(System.in);

    public int num1() {
        System.out.println("Enter num1: ");
        return sc.nextInt();
    }

    public int num2() {
        System.out.println("Enter num2: ");
        return sc.nextInt();
    }
}
