package com.falco.exercises.oop.bankaccount;

public class BankAccountEasy extends AbstractBankAccount {

    public BankAccountEasy(String IBAN, double balance, double interestRate, double operationFee) {
        super(IBAN, balance, 0.0, 0.0);
    }

    @Override
    public double transfer(BankAccount bank, double amount) {
        String countryCodeSrc = IBAN.substring(0,2);
        String countryCodeDst = bank.getIBAN().substring(0,2);
        // due paesi diversi
        if(!countryCodeSrc.equals(countryCodeDst)){
            throw new IllegalArgumentException("International Transfer invalid");
        }
        double allowedAmount = withdraw(amount);
        bank.deposit(allowedAmount);
        return allowedAmount;
    }

    @Override
    public double withdraw(double amount) {
        // il conto non puo andare in negativo
        double allowedAmount = Math.min(amount,balance);
        return super.withdraw(allowedAmount);
    }
}
