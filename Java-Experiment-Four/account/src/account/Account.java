package account;

import java.util.Date;

public  class Account {
    private String id;
    private double balance;
    private double rate;
    private Date openDate;

    public Account(String id, double balance, double rate, Date openDate) {
        this.id = id;
        this.balance = balance;
        this.rate = rate;
        this.openDate = openDate;
    }

    public void deposit(double in){
        this.balance=this.balance+in;
    }
    public  boolean withdraw(double out){
        if(out<=getBalance()){
            setBalance(getBalance()-out);
            return true;
        }
        else{
            return false;
        }

    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getRate() {
        return rate;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", balance=" + balance +
                ", rate=" + rate +
                ", openDate=" + openDate ;
    }
}
