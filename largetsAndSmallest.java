import java.util.Scanner;
public class largetsAndSmallest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of the array");
        arr[0]=sc.nextInt();
        int max = arr[0];
        int min = arr[0];
        for(int i=1;i<size;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Largest - "+max+"\nSmallest - "+min);
    }
}