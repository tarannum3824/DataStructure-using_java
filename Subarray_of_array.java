// programe to print all subarrays of array
//or programe to print subset of any set
import java.util.Scanner;
class Subarray_of_array{
    public static void main(String [] args){
        int size;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of an array:");
        size=sc.nextInt();
        int [] array=new int[size];
        System.out.println("Enter the elements in array:");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        //main logic
        System.out.println("The subarray of given array is:");
        //a stand fir initial index
        for(int a=0;a<size;a++){
            //b stand for end index
            for(int b=a;b<size;b++){
                // c is for printing the subarrays
                for(int c=0;c<=b;c++){
                    System.out.println(array[c] + " ");
                }
            }
        }
     }
}
