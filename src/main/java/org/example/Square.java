package org.example;

public class Square {
    Square(int rows,int columns){
        for(int i=0;i<=rows;i++){
            for(int j=0;j<=columns;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
