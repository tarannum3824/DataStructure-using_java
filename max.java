//find the maximum value in given array
import java.util.Scanner;
class max{
    public static void main(String []args){
        //initializing array
        int [] array=new int[5];

        //here min.value=(-infinity)
        int max=Integer.MIN_VALUE; 

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the elements:");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }

        //main logic
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
    }
      System.out.println(" The greatest value in array is:" + max);
        }
}