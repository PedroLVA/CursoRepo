package aula28_07.exercicio1;

public class ContaEspecial extends ContaBancaria {

    public ContaEspecial(String numero, double saldo, double limite) {
        super(numero, saldo, limite);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor do saque deve ser positivo.");
            return;
        }

        if (valor <= this.saldo + this.limite) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso (usando limite especial).");
        } else {
            System.out.println("Limite de saque excedido. Saldo + Limite disponível: R$ " + (this.saldo + this.limite));
        }
    }

}