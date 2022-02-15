import java.util.Date;
public class Loan {
    public double annualInterestRate,loanAmount,monthlyPayment;
    public int numberOfYears;
    Date dateobj = new Date();

    public Loan(){
        this.dateobj = new Date();
    }

    public Loan(double ninterestrate, int nyears, double nloan){
        annualInterestRate = ninterestrate;
        numberOfYears = nyears;
        loanAmount = nloan;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public int getNumberOfYears(){
        return numberOfYears;
    }
    public double getLoanAmount(){
        return loanAmount;
    }
    public void setAnnualInterestRate(double x){
        annualInterestRate = x;
    }
    public void setNumberOfYears(int y){
        numberOfYears = y;
    }
    public void setLoanAmount(double z){
        loanAmount = z;
    }
    public double getMonthlyPayment(){
        double monthlyInterestRate = (annualInterestRate/100)/12;
        monthlyPayment = (loanAmount * monthlyInterestRate)/(1-(1/Math.pow((1 + monthlyInterestRate),numberOfYears*12)));
        return monthlyPayment;
    }
    public double getTotalPayment(){
        double totalPayment = monthlyPayment * numberOfYears * 12;
        return totalPayment;
    }
    public void getLoanDate(){
        System.out.println("The loan was created on "+ dateobj.toString());
    }

}
