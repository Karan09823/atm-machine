/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atm_machine;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author yadav
 */
public class AtmoperationImplement implements AtmOperationInterface {
    ATM atm=new ATM();
    Map<Double,String> ministat=new HashMap<>();

    @Override
     public void viewBalance(){
        System.out.print("Available Balance : "+atm.getBalance());
        System.out.println("");

     }

     @Override
     public void withdrawAmount(double withdrawAmount){
         if(atm.getBalance()>=withdrawAmount){
             ministat.put(withdrawAmount,"Amount withdrawn");
             
             System.out.println(withdrawAmount+"collect the cash");
             atm.setBalance( atm.getBalance()-withdrawAmount);
             viewBalance();
         }
         else{
             System.out.println("Insufficient Balance !!");
         }
        
         
     }

     @Override
     public void depositAmount(double depositAmount){
         ministat.put(depositAmount,"Amount Deposited" );
        System.out.println(depositAmount+" Deposited Successfully !!");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
        System.out.println("");
     }

     @Override
     public void transactionHistory(){
         for(Map.Entry<Double,String>m:ministat.entrySet()){
             System.out.println(m.getKey()+" "+m.getValue());
         }
        
     }
    
}
