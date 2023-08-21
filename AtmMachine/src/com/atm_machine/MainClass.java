/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atm_machine;

/**
 *
 * @author yadav
 */
import java.io.ObjectInputFilter.Status;
import java.util.*;
public class MainClass {
    public static void main(String[]arg){
        AtmOperationInterface op=new AtmoperationImplement();
        int atmnumber=1234567890;
        int atmpin=12345;
        Scanner in=new Scanner (System.in);
        System.out.println("Welcome to Atm Machine !!!");
        System.out.print("Enter Atm Number :");
        int atmNumber=in.nextInt();
        System.out.print("Enter Atm Pin :");
        int pin=in.nextInt();
        if((atmnumber==atmNumber)&&(atmpin==pin)){
            System.out.println("\nValidation Done");
            while(true){
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.Tansaction History\n5.Exit");
                System.out.println("");
                System.out.print("Enter choice :");
                int choice=in.nextInt();
                if(choice==1){
                    op.viewBalance();
                    System.out.println("");

                }
                else if(choice==2){
                    System.out.print("Enter amount to withdraw :");
                    double withdrawAmount=in.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                    System.out.println("");

                }
                else if(choice==3){
                    System.out.print("Enter Amount to Deposit :");
                       double depositAmount=in.nextDouble();
                       op.depositAmount(depositAmount);
                       System.out.println("");
                }
                else if(choice==4){
                    op.transactionHistory();
                    System.out.println("");

                }
                else if(choice==5){
                    System.out.println("collect your atm card\n Thank you for using the atm ");
                    System.exit(0);
                    
                }
                else{
                    System.out.println("please enter correct choice");
                }
            }
        }
        else{
            System.out.print("Incorrect Atm number or pin");
            System.exit(0);

        }

    }
}
