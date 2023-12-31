import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int k){
      k=k%a.length;
      if(k<0)
      k+=a.length;
    int[] temp=new int[k];
    for(int i=a.length-1,j=k-1;j>=0;j--){
        temp[j]=a[i];
        for(int x=a.length-1;x>0;x--){
            a[x]=a[x-1];
        }
    }
    for(int i=0;i<k;i++)
    a[i]=temp[i];
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}