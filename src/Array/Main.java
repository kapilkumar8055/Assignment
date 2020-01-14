package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Body body = new Body();
        int[] ar = new int[size];
        body.insert(ar);
        System.out.println(Arrays.toString(ar));
        System.out.println("Enter element  for search");
        int searchValue = scanner.nextInt();
        int index = body.search(ar, searchValue);
        if (index >= 0) {
            System.out.println("Element is found at the index " + index);
        } else {
            System.out.println("Element is not found");
        }
        System.out.println("Array after sort");
        System.out.println(Arrays.toString(body.sort(ar)));
    }
}
