package com.Cherkasov;

import com.Cherkasov.Object.Lock;
import com.Cherkasov.Service.ArrayService;

import java.util.Arrays;

public class Main {
    public static void main(String[] arg) {
        ArrayService arrayService = new ArrayService();
        int length = arrayService.createLength();
        int[] arrayOfNumbers = arrayService.createArray(length);
        System.out.println("Наш масив: " + Arrays.toString(arrayOfNumbers));
        int choice = arrayService.chooseWayOfSorting();
        arrayService.sort(choice, arrayOfNumbers);
        arrayService.everyThirdCube(arrayOfNumbers);
        System.out.println("Масив з кожним третім значенням в кубі: "
                + Arrays.toString(arrayOfNumbers));
        Lock lock = new Lock(arrayOfNumbers);
        lock.printArray();
    }
}


