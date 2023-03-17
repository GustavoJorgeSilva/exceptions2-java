package com.udemy.cursojavacompletonelioalves.exercicios.exercicioBanco.entidades;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioHotel.model.exceptions.DomainException;

public class Conta {

    private Integer accountNumber;
    private String accountHolder;

    private Double balance;
    private Double withDrawLimit;

    public Conta() {

    }

    public Conta(Integer accountNumber, String accountHolder, Double balance, Double withDrawLimit) {

        if(balance < 0){
            throw new DomainException("Error! the balance cannot be less than 0");
        }
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.withDrawLimit = withDrawLimit;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithDrawLimit() {
        return withDrawLimit;
    }

    public void deposit(Double value) {
        balance += value;
    }

    public void withdraw(Double value) {
        if (withDrawLimit < value || balance <= 0) {
            throw new DomainException("The withdraw limit is lower than requested");
        } else {
            balance -= value;
        }
    }

    @Override
    public String toString() {
        return "New balance: " +
                 String.format("%.2f ",balance)
                ;
    }
}
