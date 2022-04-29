 import java.util.*;
 public class fibonacci{
 public static void main(String args[]){
 int n,first=0;next=1;
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 System.out.println("The first"+n+"Fibonaccinumbers are:");
 System.out.println(first+""+next);
 for(int i=1;i<=n-2;i++){
 int sum=first+next;first=next;
 next=sum;
 System.out.println(""+sum);}}}}
