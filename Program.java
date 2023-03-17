package com.udemy.cursojavacompletonelioalves.exercicios.exercicioBanco;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioBanco.entidades.Conta;
import com.udemy.cursojavacompletonelioalves.exercicios.exercicioHotel.model.exceptions.DomainException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.CompactNumberFormat;
import java.text.ParseException;

public class Program {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter account data");

            System.out.print("Number :");
            int number = Integer.parseInt(in.readLine());
            System.out.print("Holder: ");
            String holder = in.readLine();
            System.out.print("initial balance: ");
            double initialBalance = Double.parseDouble(in.readLine());
            System.out.print("Withdraw limit: ");
            double withdrawLimit = Double.parseDouble(in.readLine());

            Conta acc1 = new Conta(number, holder, initialBalance, withdrawLimit);

            System.out.print("Enter amount for withdraw: ");
            double valueWithdraw = Double.parseDouble(in.readLine());
            acc1.withdraw(valueWithdraw);
            System.out.print(acc1);
        }
        catch (DomainException e){
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error!");
        }


    }
}
