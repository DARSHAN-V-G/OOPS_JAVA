
import java.util.Scanner;
public class AscendingSort {
    public static void main(String aString[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
