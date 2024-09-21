import java.util.Scanner;
public class ATM_Machine {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice;
        float balance=0;
        int amnt;
        char ch='y';
        while(ch=='y'){
            System.out.print("1.Credit\n2.Debit\n3.Check Balance\nEnter your choice : ");
            choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter amount to be credited : ");
                amnt = sc.nextInt();
                balance+=amnt;
                System.out.println("Current Balance : "+balance);
                break;
            case 2 : 
                System.out.print("Enter amount to be debited : ");
                amnt = sc.nextInt();
                if(amnt>balance){
                    System.out.println("Insufficient Balance");
                }else{
                balance-=amnt;
                System.out.println("Current Balance : "+balance);
                }
                break;
            case 3:
                System.out.println("Current Balance : "+balance);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        System.out.print("Do you wish to continue (y/n) : ");
        ch=sc.next().charAt(0);
    }
    }
}
