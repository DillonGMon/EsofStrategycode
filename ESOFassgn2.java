/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esofassgn2;
import java.util.Random;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author dillo
 */
public class ESOFassgn2 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args){
       boolean flag = false;
       while(!flag){
          System.out.println("Choose your Tool:\n1. Mathematica\n2. Mtool\n3. MyMath\n4. Exit");

        Scanner input = new Scanner(System.in);

        Tool myTool = new Mathematica();
        int selection = 0;
        boolean valid = false;


        do {

            do {
                try {
                    selection = input.nextInt();
                    valid = true;
                } catch (InputMismatchException e) {
                    input.next();
                    System.out.println("Please input an integer.");
                }
            } while (!valid);

            valid = false;

            switch(selection){
                case 1: 
                    myTool = new Mathematica();
                    System.out.println("You Selected Mathematica");    
                    valid = true;
                    break;
                case 2: 
                     myTool = new Mtool();
                     System.out.println("You Selected Mtool");    
                     valid = true;
                    break;
                case 3: 
                    myTool = new MyMath();
                    System.out.println("You Selected MyMath");    
                    valid = true;
                    break;
                case 4:
                    flag = true;
                    System.exit(0);
                    break;
                default:
                    System.out.println("please make a valid selection");
                    break;
            }
            
            
                
                
        } while(!valid);


        System.out.println(selection);
        
        
        int array[] = new int[10];
                for( int i = 0; i<10; i++)
                {
                    double rand = (Math.random()*100);
                    array[i]= (int)rand; 
                }
        myTool.mathSort(array);
        myTool.setSort();
        for( int i = 0; i<10; i++)
                {   
                    double rand = (Math.random()*100);
                    array[i]= (int)rand; 
                }
        myTool.mathSort(array);
       }
           
    }
}

    

