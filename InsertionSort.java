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
public class InsertionSort implements sortBehavior{
    
    public int[] sort(int arr[] )
    {
        System.out.println(Arrays.toString(arr));       //prints the unsorted array
         int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
                                                //algorithm from https://www.geeksforgeeks.org/insertion-sort/
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
                System.out.println(Arrays.toString(arr));       //prints the sorted array

        return arr;
    }
    
}
