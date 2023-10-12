/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author snehayenduri
 */
public class AccountDirectory {
    private ArrayList<Account> accountList;

    public AccountDirectory() {
        accountList = new ArrayList<>();
    }
    
    public Account addAccount(Account account){
        accountList.add(account);
        return account;
    }
    
    public void deleteAccount(Account account){
        accountList.remove(account);
    }
    
    public Account searchAccount (String accountNumber){
        for(Account account : accountList){
            if(accountNumber.equals(account.getAccountNumber())){
                return account;
            }
        }
        return null;
    }
    
    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }
    
    
}
