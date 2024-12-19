/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practice1;
import java.util.Scanner;

/**
 *
 * @author matth
 */
public class Practice1 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
             
       
        
        int cases;
        System.out.println("Enter number of test Cases:");
        cases = inp.nextInt();
        double [] number = new double [cases]; 
        
        double sum = 0; 
        
      for (int i = 0; i < cases; i++) { 
            System.out.println(i + 1 + "#"  );
            number[i] = inp.nextDouble();
            sum += number[i];
           
          
            
        }
        
        Arrays.sort(number);
        double average = (double) sum / cases;
      
        
        System.out.printf("Average  = %.2f\n", average);
        System.out.println("is the minimum " + number[0]);
        System.out.println("is the maximum " + number[number.length - 1 ]);
        

    }
}
