package org.example;

import java.util.Scanner;
public class Main {
    static void main() {
        String [] options={"decreasing Triangle","Square","increasing Triangle"};
        Scanner scanner= new Scanner(System.in);
        System.out.println("What shape do you want to print your options are :");
        for(int i=0;i< options.length;i++){
            System.out.println(i+": "+options[i]);
        }
        try {
            System.out.print("Enter the selection option number :");
            int SelectedOption = scanner.nextInt();
            switch (SelectedOption) {
                case 0:
                    HalfDownTriangle new1 = new HalfDownTriangle(5);
                    break;
                case 1:
                    Square square = new Square(5, 5);
                    break;
                case 2:
                    IncreasingTriangle increasingTriangle = new IncreasingTriangle(5);
                    break;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
