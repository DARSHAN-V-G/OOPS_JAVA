import java.util.Scanner;
public class sumOfNaturalNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        System.out.println("Sum of natural number till "+num+" is "+(num*(num+1))/2);
    }
}