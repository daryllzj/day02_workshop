package sdf;

public class FixedDepositAccount extends BankAccount {

    private float interest = 3;
    private int duration = 6;
    private boolean revisedInterest;
    private boolean revisedDuration;

    public FixedDepositAccount(String clientName) {
        super(clientName);
    }

    public FixedDepositAccount(String clientName, float accountBal) {
        super(clientName, accountBal);
    }

    public FixedDepositAccount(String clientName, float accountBal, float interest) {
        super(clientName, accountBal);
        this.interest = interest;
    }

    public FixedDepositAccount(String clientName, float accountBal, float interest, int duration) {
        super(clientName, accountBal);
        this.interest = interest;
        this.duration = duration;
    }

    

    public void setRevisedInterest(boolean revisedInterest) {
        this.revisedInterest = revisedInterest = true;
    }

    public boolean setRevisedDuration(int newMonth) {
        try {
            if (revisedDuration = true) {
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        this.duration = newMonth;
        return revisedDuration = true;
    }

    public boolean setRevisedInterest(float newinterest) {
        try {
            if (revisedInterest = true) {
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        this.interest = newinterest;
        return revisedInterest = true;
    }

    @Override
    public void withdraw(float amount) {
    }

    @Override
    public void deposit(float amount){}

    public float getBalance(){
        return (1 + this.interest)*duration + super.getAccountBal();
    }

    

    
    
}
