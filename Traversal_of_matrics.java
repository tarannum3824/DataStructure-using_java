//programe to print traversal of 2D array or count each element in matrics
import java.util.*;
class Traversal_of_matrics{
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the  no of row in an array:");
        int r=sc.nextInt();
        System.out.println("Enter the no of column in an array:");
        int c=sc.nextInt();
        int [][] array=new int[r][c];
        //taking input as values
        System.out.println("Enter the elements in array: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                array[i][j]=sc.nextInt();
            }
        }
        //main logic of traversing in matrics or in 2D array
        System.out.println("THE TRAVERSING OF 2D ARRAY IS:");
        for(int a=0;a<r;a++){
            for(int b=0;b<c;b++){
                System.out.println(array[a][b]);
            }
        }
    }
} 