/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atm_machine;

/**
 *
 * @author yadav
 */
public class ATM {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;

    public ATM(){

    }
    // getter setter
    
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }


    public double getDepositAmount(){
        return depositAmount;
    }
    public void setDepositAmount(double depositAmount){
        this.depositAmount=depositAmount;
    }


    public double getwithdrawamount(){
        return withdrawAmount;
    }
    public void setwithdrawamount(double withdrawAmount ){
        this.withdrawAmount=withdrawAmount;

    }
}
