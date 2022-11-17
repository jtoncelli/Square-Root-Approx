package com.company;
import java.util.Scanner;
class Main {
    public static double sqrt(double a, int iterations) {
        double b = 0.0;
        for (int i = 0; i <= iterations; i++){
            if (i == 0) {b = a/2;}
            else{
                b = 0.5*(b + (a/b));
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Please enter a positive number: ");
            String input = scan.nextLine();
            double a = Double.parseDouble(input);
            System.out.println("Please enter number of iterations: ");
            input = scan.nextLine();
            int iterations = Integer.parseInt(input);
            if(iterations < 0 || a < 0.0){
                System.out.println("Invalid input");
            }
            else{
                System.out.println("Sqaure root: ");
                double root = sqrt(a, iterations);
                System.out.println(root);
                System.out.println("Difference when squared:");
                double diff = (root*root) - a;
                System.out.println(diff);
            }
        }catch(IllegalArgumentException e){
            System.out.println("Invalid Input");
        }
    }
}
