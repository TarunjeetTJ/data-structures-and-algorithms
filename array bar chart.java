/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        int maxval=0;
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
            if(arr[i]>maxval)
            maxval=arr[i];
        }
        while(maxval>0){
            for(int k=0;k<arr.length;k++){
                if(arr[k]==maxval){
                    System.out.print("*");
                    arr[k]--;
                }
                else
                System.out.print(" ");
            }
            System.out.println();
            maxval--;
        }
    }
}