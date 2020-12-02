package account;

import java.util.Date;

public class CheckingAccount extends Account {
    private double limit;//透支上限
    private double overdrawn;//当前透支额
    public CheckingAccount(String id, double balance, double rate, Date openDate, double limit) {
        super(id, balance, rate, openDate);
        this.limit = limit;
        this.overdrawn=0;
    }
    public void deposit(double in){
        if(overdrawn>=in){
            overdrawn =overdrawn-in;
        }
        else{
            super.setBalance(in-overdrawn);
            overdrawn=0;
        }
    }
    public boolean withdraw(double out){
        double res=getBalance()-out;
        if(res>=0){
            setBalance(res);
            return true;
        }
        else{
            if(Math.abs(res)<=limit-overdrawn){
                setBalance(0);
                overdrawn=overdrawn+Math.abs(res);
                return true;
            }
            else{
                return false;
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", limit=" + limit +
                ", overdrawn=" + overdrawn;
    }
}
