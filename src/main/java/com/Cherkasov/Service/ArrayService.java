package com.Cherkasov.Service;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayService {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public int createLength() {
        System.out.println("Введіть розмір масиву чисел (від 1 до 10):");
        int length = scanner.nextInt();
        while (length < 10) {
            System.out.println("Введено некоректне значення! %n" +
                    "Введіть розмір масиву чисел (від 1 до 10):");
            length = scanner.nextInt();
        }
        return length;
    }

    public int chooseWayOfSorting() {
        System.out.println("Як будемо сортувати массив? Напишіть 1, " +
                "якщо за зростанням, або 2, якщо за спаданням");
        int choice = scanner.nextInt();
        while (choice < 1 && choice > 2) {
            System.out.println("Введено некоректне значення! %n" +
                    "Як будемо сортувати массив? Напишіть 1, " +
                    "якщо за зростанням, або 2, якщо за спаданням");
            choice = scanner.nextInt();
        }
        return choice;
    }

    public int[] createArray(final int length) {
        int[] arrayOfNumbers = new int[length];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = random.nextInt(-100, 100);
        }
        return arrayOfNumbers;
    }


    public int[] sort(final int choice, final int[] arrayOfNumbers) {
        if (choice == 1) {
            sortAscending(arrayOfNumbers);
        }
        if (choice == 2) {
            sortDescending(arrayOfNumbers);
        }
        return arrayOfNumbers;
    }

    public int[] sortAscending(final int[] arrayOfNumbers) {
        for (int i = 1; i < arrayOfNumbers.length; i++) {
            int current = arrayOfNumbers[i];
            int j = i - 1;
            while (j >= 0 && current < arrayOfNumbers[j]) {
                arrayOfNumbers[j + 1] = arrayOfNumbers[j];
                j--;
            }
            arrayOfNumbers[j + 1] = current;
        }
        System.out.println("Відсортований масив за зростанням: "
                + Arrays.toString(arrayOfNumbers));
        return arrayOfNumbers;
    }

    public int[] sortDescending(final int[] arrayOfNumbers) {
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            int position = i;
            int min = arrayOfNumbers[i];
            for (int j = i + 1; j < arrayOfNumbers.length; j++) {
                if (arrayOfNumbers[j] > min) {
                    position = j;
                    min = arrayOfNumbers[j];
                }
            }
            arrayOfNumbers[position] = arrayOfNumbers[i];
            arrayOfNumbers[i] = min;
        }

        System.out.println("Відсортований масив за спаданням: "
                + Arrays.toString(arrayOfNumbers));
        return arrayOfNumbers;
    }

    public int[] everyThirdCube(final int[] arrayOfNumbers) {
        for (int i = 0; i < arrayOfNumbers.length; i += 3) {
            arrayOfNumbers[i] = pow(arrayOfNumbers[i], 3);
        }
        return arrayOfNumbers;
    }

    public int pow(int value, int powValue) {
        if (powValue == 1) {
            return value;
        } else {
            return value * pow(value, powValue - 1);
        }
    }

}
