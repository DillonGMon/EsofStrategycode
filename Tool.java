package esofassgn2;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dillo
 */
public abstract class Tool {
   
    
   private sortBehavior sb = new BubbleSort();      //makes a varirable sb
   
   
  public int[] mathSort(int arr[])
  {
      sb.sort(arr);
      return arr;
  }
  
  public void setSort()
  {
     System.out.println("press 1 to change to bubble sort, 2 for insertion or 3 for merge");
     
     Scanner keyboard = new Scanner(System.in);
     boolean flag = false;
     
     while(!flag){
     int input = keyboard.nextInt();
    
     switch(input){
         case 1:
             sb = new BubbleSort();
             flag= true;
                  System.out.println("sort method set to bubble sort");

             break;
         case 2:
             sb = new InsertionSort();
             flag= true;
             System.out.println("sort method set to intsertion sort");
             break;
         case 3: 
             sb= new mergeSort();
             flag= true;
             System.out.println("sort method set to merge sort");

            break;
         default: 
             System.out.println("please enter a number");
             
             break;
                 
     }        
         
     }
    
  
  }
          
       public sortBehavior getSort()
     {
         return sb;
     }
    
    
    
}
