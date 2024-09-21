import java.util.Scanner;
public class pascal_triangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i-1;j++){
                System.out.print(" ");
            }
            int[] arr2 = new int[i+1];
            arr2[0]=1;
            arr2[i]=1;
            for(int j=1;j<=i-1;j++){
                arr2[j]=arr[j]+arr[j-1];
            }
            for(int j=0;j<=i;j++){
                arr[j]=arr2[j];
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }

    }
}
