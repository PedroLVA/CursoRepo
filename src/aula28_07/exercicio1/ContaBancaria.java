package aula28_07.exercicio1;

public class ContaBancaria {

    protected String numero;
    protected double saldo;
    protected double limite;

    public ContaBancaria(String numero, double saldo, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor do saque deve ser positivo.");
            return;
        }

        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucess");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque de R$" + valor + ".");
        }
    }


    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Deposito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual da conta " + this.numero + ": R$ " + this.saldo);
    }

    @Override
    public String toString() {
        return "ContaBancaria [numero=" + numero + ", saldo=" + saldo + ", limite=" + limite + "]";
    }



}
