package aula28_07.exercicio1;

public class MainExc1 {
    public static void main(String[] args) {
        System.out.println("Testando Conta Comum ");


        ContaBancaria contaComum = new ContaBancaria("101", 1000.0, 0.0);
        contaComum.consultarSaldo(); // consulta

        contaComum.sacar(200.0); // sacou certo
        contaComum.consultarSaldo();


        contaComum.depositar(500.0); // depositou certo
        contaComum.consultarSaldo();

        contaComum.sacar(1500.0); // nao tem saldo
        contaComum.consultarSaldo(); // saldo igual

        System.out.println("\n=======================================\n");

        System.out.println("--- Testando Conta Especial ---");

        ContaEspecial contaEspecial = new ContaEspecial("202", 1000.0, 500.0);
        contaEspecial.consultarSaldo();


        contaEspecial.sacar(200.0);
        contaEspecial.consultarSaldo();



        contaEspecial.sacar(1000.0);
        contaEspecial.consultarSaldo();

        // Deposito para ccobrir o saldo negativo
        contaEspecial.depositar(300.0);
        contaEspecial.consultarSaldo();

        // Tentando ultrapassar saldo + limite
        // saldo + limite = 600
        contaEspecial.sacar(700.0); // limite excedito
        contaEspecial.consultarSaldo(); // saldo se mantem o mesmo
    }
}
