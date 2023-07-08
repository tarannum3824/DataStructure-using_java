//operations in 2D array or in matrics
import java.util.Scanner;
public class Intro{
    public static void main(String [] args){
        int [][] array =new int [4][5];
        array[2][4]=6;                            //set the value of index (2,4)
        System.out.println("the value in index (2,4) is " +  array[2][4]);          //printing the value of array of particular index
       
        System.out.println("the value in index (2,3) is " + array[2][3]);          //here 0 is printed becouse initialy not set any value to the index(2,3)
        
        //how to get number of rows and column 
        System.out.println(array.length);         //here it will give the rows of 2d array
        
        System.out.println(array[0].length);         //it will print the length of 0th index value means number of column

        //traversal
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                System.out.println(array[i][j]);
            }
        }
    }
}

