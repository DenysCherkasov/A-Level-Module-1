package com.Cherkasov.Object;

import java.util.Arrays;


public final class Lock {
    private final int[] LockArray;

    public Lock(final int[] LockArray) {
        this.LockArray = LockArray;
    }

    public int[] getArray() {
        return Arrays.copyOf(LockArray, LockArray.length);

    }

    public void printArray() {
        System.out.println(Arrays.toString(LockArray));
    }
}
