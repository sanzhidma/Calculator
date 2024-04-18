package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int result = calculater();
        System.out.println(result);
    }

    private static int calculater() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение:");
        String str = sc.nextLine().replaceAll("\\s", "");
        String[] trr = str.split("[+\\-*/]");
        if (trr.length != 2) {
            throw new RuntimeException("Формат математической операции не удовлетворен");
        }
        String trr1 = trr[0];
        String trr2 = trr[1];
        int a1;
        int a2;
        try {
            a1 = Integer.parseInt(trr1);
            a2 = Integer.parseInt(trr2);
        } catch (NumberFormatException exception) {
            throw new RuntimeException("Используйте только числа");
        }
        if (a1 > 10 || a2 > 10) {
            throw new ArithmeticException("Число не может быть больше десяти");
        }
        if (a1 < 0 || a2 < 0) {
            throw new ArithmeticException("Число не может быть меньше нуля");
        }
        else if (str.contains("+")) {
            return a1 + a2;
        }
        else if (str.contains("-")) {
            return a1 - a2;
        }
        else if (str.contains("*")) {
            return a1 * a2;
        }
        else if (str.contains("/")) {
            return a1 / a2;
        }
        throw new RuntimeException("Неверный оператор");
    }
}