/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esofassgn2;

import java.util.Arrays;

/**
 *
 * @author dillo
 */

public class BubbleSort implements sortBehavior{
    
    @Override
    public int [] sort(int arr[])
    {
        System.out.println(Arrays.toString(arr));       //prints the unsorted array
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {                           //code copied form https://www.geeksforgeeks.org/bubble-sort/ to save time on simple algorithm
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        System.out.println(Arrays.toString(arr));  //prints the sorted array
        return arr;
    }
    
}
