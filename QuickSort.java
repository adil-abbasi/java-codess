import java.util.Scanner;
public class QuickSort {
    public static int Partition(int arr[],int start,int end){
        int pivot=arr[end];
        int i=start-1;
        for(int j=start;j<end;j++){
            if(arr[j]< pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[end];
        arr[end]=temp;
        return i;
    }
    public static void quicksort(int arr[],int start,int end){
        if(start<end){
            int p=Partition(arr, start, end);
            quicksort(arr, start, p-1);
            quicksort(arr, p+1, end);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter size of array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter element at index "+i+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Original Array : ");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
        System.out.print("Sorted Array : ");
        quicksort(arr, 0, arr.length-1);
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
