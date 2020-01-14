package Array;

import java.util.Scanner;

public class Body implements IMethods {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void insert(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
        }
        System.out.println("Elements of array successfully entered");
    }

    @Override
    public void delete(int[] ar, int value) {
        int i = search(ar, value);
        if (i >= 0) {
            for (int j = i; j < ar.length - 1; j++) {
                ar[j] = ar[j + 1];
            }
        } else {
            System.out.println(value + "is not present for delete");
        }
    }

    @Override
    public int search(int[] ar, int value) {
        int result = -1;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == value) {
                result = i;
                break;
            }
        }
        return result;
    }

    @Override
    public int[] sort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        return array;
    }
}