package poo1.aula01_08.desafio4;

import java.util.Scanner;
import java.util.Locale;

public class Conta {
    private Cliente cliente;
    private String numero;
    private double saldo;
    private static final double TAXA_OPERACAO = 0.50;

    public Conta(Cliente cliente, String numero, double saldoInicial) {
        this.cliente = cliente;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor - TAXA_OPERACAO;
        } else {
            System.err.println("Valor de depósito deve ser positivo.");
        }
    }

    public boolean sacar(double valor) {
        double valorTotalDebito = valor + TAXA_OPERACAO;
        if (valor > 0 && this.saldo >= valorTotalDebito) {
            this.saldo -= valorTotalDebito;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(Conta contaDestino, double valor) {
        double valorTotalDebito = valor + TAXA_OPERACAO;
        if (valor > 0 && this.saldo >= valorTotalDebito) {
            this.saldo -= valorTotalDebito;
            contaDestino.saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean pagar(double valorConta) {
        double valorTotalDebito = valorConta + TAXA_OPERACAO;
        if (valorConta > 0 && this.saldo >= valorTotalDebito) {
            this.saldo -= valorTotalDebito;
            return true;
        } else {
            return false;
        }
    }

    public void renderJuros(double taxa) {
        if (taxa > 0) {
            double juros = this.saldo * taxa;
            this.saldo += juros;
        } else {
            System.err.println("A taxa de juros deve ser um valor positivo.");
        }
    }
}

