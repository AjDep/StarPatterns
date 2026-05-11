package org.example;

public class IncreasingTriangle {
    IncreasingTriangle(int rows,String Symbol){
    for(int i=0;i<=rows;i++){
        for(int j=0;j<i;j++){
            System.out.print(Symbol);
        }
        System.out.println("");
    }
}}
