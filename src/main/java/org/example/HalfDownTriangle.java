package org.example;

public class HalfDownTriangle {
    HalfDownTriangle(int rows){
        for(int i=rows;i>=0;i--){
            System.out.println("");
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
        }
    }
}
