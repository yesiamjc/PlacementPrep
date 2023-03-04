// imports 

import java.util.Scanner;

// main class

class MaxOfArray{

static int maxOfArray(int a[]){
int max=0;
for(int i=0;i<a.length;i++){
if(a[i]>max)
max=a[i];
}
return max;
}

static void printArray(int b[]){
for(int i=0;i<b.length;i++){
System.out.print(b[i]+" ");
}
}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("\t\t\t Max Element Of Array Finder ");
System.out.println("Enter Size Of Your Array : ");
int size=sc.nextInt();
int arr[]=new int[size];
System.out.println("Enter Array Elements : ");
for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
System.out.println("Your Entered Array : ");
printArray(arr);
System.out.println();.
System.out.println("Max Value Of Your Array is : "+maxOfArray(arr));
}
}