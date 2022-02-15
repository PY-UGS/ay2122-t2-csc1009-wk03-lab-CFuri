import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        double ninterestrate, nloan;
        int nyears;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter annual interest rate: ");
        ninterestrate = sc.nextDouble();
        System.out.print("Enter number of years as an integer: ");
        nyears = sc.nextInt();
        System.out.print("Enter loan amount: ");
        nloan =sc.nextDouble();
        Loan aloan = new Loan(ninterestrate,nyears,nloan);
        aloan.getLoanAmount();
        System.out.println("The monthly payment is " + String.format("%.2f",aloan.getMonthlyPayment()));
        System.out.println("The total payment is " + String.format("%.2f",aloan.getTotalPayment()));
        
    }
}
