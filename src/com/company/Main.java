package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of array:- ");
        int size = scan.nextInt();
        int arr[] = new int[size];
        // for loop for input
        for(int i=0; i<size; i++){
            System.out.print("Enter the value for " + i + " :-");
            arr[i] = scan.nextInt();
        }
        // Seletion coding
        for(int i=0; i< arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j< arr.length-1; j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            //swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        // for loop for output
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
