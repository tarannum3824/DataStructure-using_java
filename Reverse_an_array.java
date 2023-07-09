//programe to reverse an array
import java.util.Scanner;
class Reverse_an_array{
    public static void main(String [] args){
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the size of an array:");
        size=sc.nextInt();
        int [] array=new int[size];
        System.out.println("Enter the elemnts:");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        //main logic
        int a=0;
        int b=size-1;
        //swapping the first and last values and so on
        while(a<b){
            int temp=array[a];
            array[a]=array[b];
            array[b]=temp;
            a++;
            b--;
        }
        //printing the reverse of given array
        System.out.println("the reverse of given array is:" );
        for(int j=0;j<size;j++){
            System.out.println( array[j] + " ");
            
        }

    }
}
        