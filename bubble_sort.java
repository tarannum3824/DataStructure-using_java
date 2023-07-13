import java.util.Arrays;
class bubble_sort{
    public static void BubbleSortAlgorithm(int [] array){
        int n=array.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    public static void main(String [] args){
        int [] array1={35,23,43,45,76,87,84,26,48};
        BubbleSortAlgorithm(array1);
        System.out.println("The sorted array is");
        System.out.println(Arrays.toString(array1));
    }
}
