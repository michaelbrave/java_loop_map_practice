package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] num = ask();
        int sum = sum(num);
        int product = product(num);
        int largest = largest(num);
        int smallest = smallest(num);
        System.out.printf("the sum of the numbers was %d\n", sum);
        System.out.printf("the product of the numbers was %d\n", product);
        System.out.printf("the largest of the numbers was %d\n", largest);
        System.out.printf("the smallest of the numbers was %d\n", smallest);
    }

    public static int[] ask() {
        // ask for 5 numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input 5 numbers");
        int[] inputNum = {0,0,0,0,0};
        for (int i= 0; i < inputNum.length; i++) {
            System.out.printf("please enter number %d\n", i+1);
            inputNum[i] = scanner.nextInt();
        }
        return inputNum;
    }
    public static int sum(int[] num) {
        // find sum
        int sum = 0;
        for(int i = 0; i < num.length; i++) {
            //System.out.printf("%d\n", num[i]);
            sum += num[i];
        }
        return sum;
    }
    public static int product(int[] num) {
        // find product
        int product = num[0];
        for(int i = 0; i < num.length; i++) {
            //System.out.printf("%d\n", num[i]);
            product *= num[i];
        }
        return product;
    }
    public static int largest(int[] num) {
        // find largest
        int largest = num[0];
        for(int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                //System.out.printf("%d\n", num[i]);
                largest = num[i];
            }
        }
        return largest;
    }
    public static int smallest(int[] num) {
        // find smallest
        int smallest = num[0];
        for(int i = 0; i < num.length; i++) {
            if (smallest > num[i]) {
                //System.out.printf("%d\n", num[i]);
                smallest = num[i];
            }
        }
        return smallest;
    }

}


