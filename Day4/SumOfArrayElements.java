import java.util.Scanner;
class SumOfArrayElements{
public static void main(String args[]){
int arr[]=new int[10];
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your Array Elements : ");
int sum=0;
for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
sum+=arr[i];
}
System.out.println("Sum Of All Array Elements is : "+sum);
}
}