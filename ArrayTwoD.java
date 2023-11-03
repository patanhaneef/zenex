import java.util.*;
import java. lang.*;
class ArrayTwoD
{
public static void main(String args[ ])
{
Scanner in=new Scanner(System.in);
int a[ ] [ ]= new int [10] [10];
int m,n; //To read no. of rows and columns
System.out.print("\n Enter no. of Rows:");
m= in.nextInt();
System.out.print ("\n Enter no. of Columns :");
n= in.nextInt(); //To read values into array
System.out.println("Enter "+m*n+" elements:");
for (int i=0 ; i<m; i++)
{
 for(int j=0; j<n; j++)
 {
 a[i] [j]= in.nextInt();
 }
}
//To print array values 
System.out.println("Two dimensional array elements are:");
for (int i=0; i<m; i++)
{
 for (int j=0; j<n; j++)
 {
 System.out.print(" "+a [i] [j]);
 }
 System.out.println(" ");
 }
}
}