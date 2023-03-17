package com.falco.exercises.oop.bankaccount;

public class BankAccountPro extends AbstractBankAccount{

    public BankAccountPro(String IBAN, double balance) {
        super(IBAN, balance, 0.02, 1);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount - operationFee);
    }

    @Override
    public double withdraw(double amount) {
        // con il costruttore so che le operationFee sono = 1
        applyFee();
        return super.withdraw(amount);
    }

    public static void main(String[] args) {
        BankAccountPro bp = new BankAccountPro("ITABICABNUMERI", 1000.00);
        bp.withdraw(10);
    }
}
