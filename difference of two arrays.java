/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++)
        arr1[i]=scn.nextInt();
        int n2=scn.nextInt();
        int[] arr2=new int[n2];
        for(int i=0;i<n2;i++)
        arr2[i]=scn.nextInt();
        int n3=n2>n1?n2:n1;
        int[] arr3=new int[n3];
        while((n1<n2?n1:n2)>0){
            arr3[n3-1]=arr2[n2-1]-arr1[n1-1];
            if(arr3[n3-1]<0){
                arr3[n3-1]+=10;
                arr2[n2-2]--;
            }
            n1--;
            n2--;
            n3--;
        }
        while(n2>0){
            arr3[n3-1]=arr2[n2-1];
            n2--;
            n3--;
        }
        for(int i=0;i<arr3.length;i++){
            if(arr3[i]!=0){
                for(;i<arr3.length;i++)
                System.out.print(arr3[i]);
                break;
             }
            
         }
    }
}