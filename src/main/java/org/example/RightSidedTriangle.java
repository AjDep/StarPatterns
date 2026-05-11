package org.example;

public class RightSidedTriangle {
    int n=5;
    RightSidedTriangle(){
        for(int i=0;i<=n;i++){
            for(int a=i;a<=n;a++){
                System.out.print(" ");
            }
            for(int a=0;a<=i;a++){
                System.out.print("x");
            };
            System.out.println();
        }

    }

}
