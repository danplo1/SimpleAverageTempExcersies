package com.company;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        double[] temp = new double[7];

        Scanner inputScanner = new Scanner(System.in);

        for (int i =0; i < temp.length; i++){
            System.out.println("Podaj temperaturę na dany dzień " + (i+1) +" :");
            temp[i] = inputScanner.nextDouble();
            
        }
        double summarizedTemp =0;
        for( double temperature:temp){
            summarizedTemp +=temperature;
        }
        System.out.println("Srednia temperatura wynosi " + (summarizedTemp/temp.length));
    }

}
