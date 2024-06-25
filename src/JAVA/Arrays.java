package JAVA;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     /*    int [] marks = {5,4,2,5,6,6};
        for(int i = marks.length - 1 ; i >= 0; i--){
            System.out.println(marks[i]);
         }
            for(int element: marks){
                System.out.println(element);
            }
        */
        //Q1:-
  /*   float [] a = new float[5];
    a[0]=10.5f;
    a[1]=56.6f;
    a[2]=87.9f;
    a[3]=21.7f;
    a[4]=69.2f;
    float k = 0;
    for(float b :a){
     k = (k + b);
  }
  System.out.println(k);
*/
        //Q2:-
  /*
  int[] a = {10,66,88,1,2,55,66,69};
  int num = 69;
  for(int b :a){
    if(num==b){
        System.out.println("Hell, Yess");
        break;
    }
  }
  // iska aur ek soch lawde
*/
        //Q3:-
 /*float[]marks = {55.4f,89.12f,88.3f,14.6f};
 float sum = 0;
 for(float s : marks){
    sum+=s;
 }
System.out.println("The avg marks is equal to:- "+ sum/marks.length);
*/
//Q4:-
int[][] mat1 = {{5,6,1},
                {7,9,3}};
int[][] mat2 = {{4,8,6},
                {2,8,7}};
int[][]sum = {{0,0,0},
              {0,0,0}};
for(int i = 0 ; i<mat1.length;i++){
       for(int k = 0 ; k<mat1[i].length;k++){
        sum[i][k] = mat1[i][k] + mat2[i][k];
        System.out.print (sum[i][k]+" ");
       }
       System.out.println(" ");
}

//Q5:-
/*
int [] a ={7,5,6,9,2,6};
for(int i = a.length - 1 ; i>=0 ; i--){
    System.out.print(a[i]+" ");
}
*/
//Q5:-(Second Method)
/*
int array [] = {4,5,2,4,8,7,5};
int l = array.length;
int k = Math.floorDiv(l, 2);
int temp;
for(int i = 0 ; i<k ; i++){
  temp = array[i];
  array[i]=array[l-1-i];
  array[l-1-i]=array[i];
}
for(int a : array){
  System.out.print(a+" ");
}
*/
//Q6:-
/*
int a [] = {4,5,8,9,6,4,7,55};
int max = 0;
for(int b : a){
   if(b>max){
    max = b;
   }
}
System.out.println(max);
*/
//Q7:-
/*int array [] = {4,5,8,9,6,4,7,55};
int min = Integer.MAX_VALUE;

for(int i = 0 ; i < array.length ; i++){
  if(array[i]<min){
    min = array[i];
  }
}
System.out.println(min);

for(int a : array){
  if(a<min){
    min = a;
  }
}
System.out.println(min);
*/
//Q8:-
/*int a [] = {1,2,3,4,5,6,7};
boolean isSorted = true ;
for(int i = 0 ; i < a.length - 1 ; i++){
   if(a[i]>a[i+1]){
    isSorted=false;
    break;
   }
}
if(isSorted){
  System.out.println("Yes it is sorted!!!");
}
else{
  System.out.println("No, it is not sorted!!");
}
*/
    }
}
