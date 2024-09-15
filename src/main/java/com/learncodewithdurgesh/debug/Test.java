package com.learncodewithdurgesh.debug;

public class Test {

    public static void main(String[] args) {
        System.out.println("Going to debug our simple SpringBoot Framework's Application!");
        int[] myarr = {1, 2, 3, 4, 5};
        int sum = getSum(myarr);
        System.out.println("Sum: " + sum);
    }

    public static int getSum(int arr[]) {
        int s = 0;
        for(int i = 0; i < arr.length; i++) {
            s = s + arr[i];
        }
        s = s + 3;
        return s;
    }

}
