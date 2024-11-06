import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner newscanner = new Scanner(System.in);
        System.out.println("------------------------------ \nWELCOME TO LUV'S BANK ");
        System.out.println("Your Account Number is: 61332 ");

        double bal = 0;


        while (true) {

            System.out.println("\n------------------------------");
            System.out.println("A. CHECK BALANCE");
            System.out.println("B. DEPOSIT AMOUNT");
            System.out.println("C. WITHDRAW AMOUNT");
            System.out.println("D. ACCOUNT INFO");
            System.out.println("E. EXIT");
            System.out.println("Enter a option \n---------------------");


            String decide = newscanner.next();

            if (decide.equals("B")) {
                System.out.println("Enter the Amount you want to Deposit: ");
                double newbal = newscanner.nextDouble();

                if (newbal>=0) {
                    bal = bal + newbal;
                    System.out.println("Your Final Balance is : " + bal + "rs." +
                            "\n Thank you for Banking with LUV'S BANK..");
                } else {
                    System.out.println("Enter the Correct Amount.");
                }
            }else if (decide.equals("C")) {
                System.out.println("Enter the Amount you want to Withdraw: ");
                double subbal = newscanner.nextDouble();
                if (subbal>=0) {
                if (subbal > bal) {
                    System.out.println("Entered amount exceeds your account balance.. ");
                } else {
                    bal = bal - subbal;
                    System.out.println("Your Final Balance is : " + bal + "rs." +
                            "\n Thank you for Banking with LUV'S BANK..");

                }
            } else {
                    System.out.println("Enter the correct Amount");
                }
            }else if (decide.equals("A")) {
                System.out.println("Your Balance in Account is : " + bal + "rs");
            } else if (decide.equals("D")) {
                System.out.println("Your Name : Mr Luv Agrawal \n " +
                        "Your Account Opened Date is : 12/10/2023" + " \nYour Age is : 17 Years");
            }else if (decide.equals("E")) {
                System.out.println("Thanks for banking with LUV'S BANK..");
                break;
            } else {
                System.out.println("Enter a Correct option.");
            }
        }
        newscanner.close();
    }
}