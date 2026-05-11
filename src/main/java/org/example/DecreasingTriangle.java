package org.example;

public class DecreasingTriangle {
    DecreasingTriangle(int rows,String Symbol){
        for(int i=0;i<=rows;i++){
            System.out.println("");
            for(int j=i;j<=rows;j++){
                System.out.print(Symbol);
            }
        }
    }
}
