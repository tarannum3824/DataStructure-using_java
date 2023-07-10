//transpose of matrics
//transpose of matrics is always done in square matrics means having same column and row
import java.util.Scanner;
class Transpose_of_matrics{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("Entre the number of rows:" );
        int r=sc.nextInt();
        System.out.println("Entre the number of colums:" );
        int c=sc.nextInt();
        int [][] array=new int [r][c];
        System.out.println("Enter the elements in array:");
        for( i=0;i<array.length;i++){
            for(j=0;j<array[0].length;j++){
                array[i][j]=sc.nextInt();
            }
            System.out.println("");
        }
        System.out.println("THE TRAVERSE OF MATRICS IS:");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("THE TRANSPOSE OF MATRICS IS:");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print(array[j][i]+" ");
            }
            System.out.println("");
        }

    }
}