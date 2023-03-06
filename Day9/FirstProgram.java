import java.util.Scanner;

class Test{

Test(){
System.out.println("\t\t\t 2D Array Rotation 90 Degree Clockwise");
}

void setElements(int arr[][]){
Scanner sc1=new Scanner(System.in);
for(int i=0;i<arr.length;i++){
System.out.println("Enter Array Elements For Row "+(i+1));
for(int j=0;j<arr[i].length;j++){
arr[i][j]=sc1.nextInt();
}
}
}

void getElements(int arr[][]){
for(int i=0;i<arr.length;i++){
for(int j=0;j<arr[i].length;j++){
System.out.print(" "+arr[i][j]+" |");
}
System.out.println();
}
}

void doSwap(int arr[][],int i,int j){
int temp=0;
temp=arr[i][j];
arr[i][j]=arr[j][i];
arr[j][i]=temp;
}

void doTransposeEqual(int arr[][]){
for(int i=0;i<arr.length;i++){
for(int j=0;j<i;j++){
doSwap(arr,i,j);
}
}
}

int[][] doTransposeNotEqual(int arr[][],int a,int b){
int a1[][]=new int[b][a];
for(int i=0;i<arr.length;i++){
for(int j=0;j<arr[i].length;j++){
a1[j][i]=arr[i][j];
}
}
return a1;
}

void doRotate(int arr[][],int a,int b){
if(a==b){
doTransposeEqual(arr);
for(int i=0;i<arr.length;i++){
for(int j=arr.length-1;j>i;j--){
doSwap(arr,i,j);
}
}
getElements(arr);
}else{
int[][] a2=doTransposeNotEqual(arr,a,b);
for(int i=0;i<a2.length;i++){
for(int j=a2.length-1;j>i;j--){
doSwap(a2,i,j);
}
}
getElements(a2);
}
}

}

class FirstProgram{

public static void main(String args[]){

Test ob=new Test();
Scanner sc=new Scanner(System.in);

System.out.println("Enter Number Of Rows : ");
int row=sc.nextInt();
System.out.println("Enter Number Of Columns : ");
int column=sc.nextInt();

int arr[][]=new int[row][column];

System.out.println("Enter Array Elements : ");
ob.setElements(arr);
System.out.println("Entered 2D Array is : ");
ob.getElements(arr);
System.out.println("90 Degree Clockwise Rotation Of This 2D Array Is : ");
ob.doRotate(arr,row,column);
}

}