package com.falco.exercises.oop.bankaccount;

public interface BankAccount {
    public void addInterest();
    public void deposit(double money);
    public double getBalance();
    public String getIBAN();
    public double getInterestRate();
    public double getOperationFee();
    public void setBalance(double balance);
    public void setIBAN(String IBAN);
    public void setInterestRate(double rate);
    public void setOperationFee(double fee);
    public double transfer(BankAccount bank, double sum );
    public double withdraw(double money);
}
