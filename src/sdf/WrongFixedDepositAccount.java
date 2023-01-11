package sdf;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class WrongFixedDepositAccount {

    private String clientName;
    private String accountNum;
    private float accountBal;
    private List<String> operations = new ArrayList<>();
    private Boolean status = true;
    private float interest = 3;
    private int duration = 6;
    private int intCounter;
    private int durCounter;
    private String creationDate;
    private String closingDate;

    LocalDateTime myDateObj = LocalDateTime.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

    public WrongFixedDepositAccount(String clientName) {
        this.clientName = clientName;
        this.accountBal =0.f;
    }
    
    public WrongFixedDepositAccount(String clientName, float accountBal) {
        this.clientName = clientName;
        this.accountBal = accountBal;
    }

    public WrongFixedDepositAccount(String clientName, float accountBal, float interest) {
        this.clientName = clientName;
        this.accountBal = accountBal;
        this.interest = interest;
    }

    public WrongFixedDepositAccount(String clientName, float accountBal, float interest, int duration) {
        this.clientName = clientName;
        this.accountBal = accountBal;
        this.interest = interest;
        this.duration = duration;
    }

    public void deposit(float deposit) {
        try {
            if (this.accountBal<0.f || !status ) {
                throw new IllegalArgumentException();
            }
            this.accountBal += deposit;
            String formattedDate = myDateObj.format(myFormatObj);
            String transaction = String.format("Deposit $%s at %s",deposit,formattedDate);
            System.out.println(transaction);
            this.operations.add(transaction);
        } catch (Exception e) {
            System.err.println(e);
        }
    }


    public void withdraw(float amount) {

        try {
            if (!status || amount < 0 ) {
                throw new IllegalArgumentException();
            }
            this.accountBal -= amount;
            String formattedDate = myDateObj.format(myFormatObj);
            String transaction = String.format("Withdraw $%s at %s",amount,formattedDate);
            System.out.println(transaction);
            this.operations.add(transaction);
        } catch (Exception e) {
            System.err.println(e);
        }
        
    }
    // generated getters and setters
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public Float getAccountBal() {
        return accountBal;
    }

    public void setAccountBal(Float accountBal) {
        this.accountBal = accountBal;
    }

    public List<String> getOperations() {
        return operations;
    }

    public void setOperations(List<String> operations) {
        this.operations = operations;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(String closingDate) {
        this.closingDate = closingDate;
    }

    
}
