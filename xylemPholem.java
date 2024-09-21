import java.util.Scanner;

public class xylemPholem {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = sc.nextInt();
    int last = num%10;
    int first=0;
    int digit;
    int meanSum=0;
    num/=10;
    while(num!=0){
        digit=num%10;
        meanSum+=digit;
        num/=10;
        first=digit;
    }
    meanSum-=first;
    if(meanSum==(first+last)){
        System.out.println("Xylem number");
    }else{
        System.out.println("Pholem number");
    }
}    
}