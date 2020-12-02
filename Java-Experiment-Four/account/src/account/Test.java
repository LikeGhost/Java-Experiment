package account;

import java.util.Date;

public class Test {
    public static void printWithDrawMessage(Account account,double out){
        if(account.withdraw(out)){
            System.out.println("取款成功！");
        }
        else{
            System.out.println("取款失败！");
        }
    }
    public static void printfDepositMessage(Account account,double in){
        account.deposit(in);
        System.out.println("存款成功！");
    }
    public static void main(String []args){
        Account [] accounts=new Account[3];
        accounts[0]=new Account("123412341234124",10000,0.01,new Date(2001-1900,1,1));
        accounts[1]=new CheckingAccount("1234567890123456",10000,0.01,new Date(2001-1900,1,1),5000);
        accounts[2]=new SavingAccount("9876543210987654",10000,0.02,new Date(2001-1900,1,1));
        //测试
        for(Account account:accounts) {
            System.out.println("账户信息：");
            System.out.println(account.toString());
            printWithDrawMessage(account,10000);
            printWithDrawMessage(account,5000);
            printWithDrawMessage(account,5000);
            System.out.println(account.toString());
            printfDepositMessage(account,5000);
            printfDepositMessage(account,5000);
            System.out.println(account.toString());
            System.out.println("");
        }

    }
}
