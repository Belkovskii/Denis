package com.company;

public class Multiplication_table {

    public static void main (String[] args) {
        int row[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int column[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                System.out.println(row[i] +(" x ")+column[j] +(" = ") + row[i]*column[j]);
            }
            System.out.println("\n");
        }
    }
}
