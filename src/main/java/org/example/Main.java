package org.example;

import java.util.Scanner;
public class Main {
    static void main() {
        String [] options={"decreasing Triangle","Square","increasing Triangle","right Sided Triangle","Full Triangle"};
        Scanner scanner= new Scanner(System.in);
        System.out.println("What shape do you want to print your options are :");
        for(int i=0;i< options.length;i++){
            System.out.println(i+": "+options[i]);
        }
        try {
            while (true){
            System.out.print("Enter the selection option number :");
            int SelectedOption = scanner.nextInt();
            switch (SelectedOption) {
                case 0:
                    DecreasingTriangle new1 = new DecreasingTriangle(5,"*");
                    System.out.println("");
                    break;
                case 1:
                    Square square = new Square(5, 5);
                    System.out.println("");

                    break;
                case 2:
                    IncreasingTriangle increasingTriangle = new IncreasingTriangle(5,"*");
                    System.out.println("");
                    break;
                case 3:
                    RightSidedTriangle rightSidedTriangle = new RightSidedTriangle();
                    System.out.println("");
                    break;
                case 4:
                    FullTriangle fullTriangle =new FullTriangle();
                    System.out.println("");
                    break;
            }}
        } catch (Exception e) {
            System.out.println("Exited the program");
        }
    }
}
