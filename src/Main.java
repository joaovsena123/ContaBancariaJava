import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Voce e (1) Cliente ou (2) Funcionario?");
        int opcao = sc.nextInt();
        sc.nextLine();
        if (opcao == 1) {
            conta minhaConta = new conta("12345-6", "Ana");
            System.out.println("Digite o titular da conta: ");
            minhaConta.setTitular(sc.nextLine());
            System.out.print("Digite um valor a depositar: ");
            double valorD = sc.nextDouble();

            if (minhaConta.depositar(valorD)) {
                System.out.println("deposito realizado");
            } else {
                System.out.println("deposito recusado");
            }
            System.out.print("Digite um valor para sacar: ");
            double valorS = sc.nextDouble();
            if (minhaConta.sacar(valorS)) {
                System.out.println("Saque aprovado");
            } else {
                System.out.println("Saque recusado");
            }
            System.out.println("Numero da conta: " + minhaConta.getNumeroconta());
            System.out.println("Titular: " + minhaConta.getTitular());
            System.out.println("Saldo: " + minhaConta.getSaldo());
            if (minhaConta.sacar(valorS)) {
                System.out.println("Saque: " + valorS);
            }
        } else if (opcao == 2) {
            funcionario meuFuncionario = new funcionario("joao", "CEO", 10000);
            System.out.println("FUNCIONARIO");
            System.out.println("nome: " + meuFuncionario.getNome());
            System.out.println("cargo: " + meuFuncionario.getCargo());
            System.out.println("salario: " + meuFuncionario.getSalario());
            //Teste de Erro//
            //funcionario meuFuncionario2 = new funcionario("" , "" , -10);//
            //System.out.println("FUNCIONARIO 2");//
            //System.out.println("nome: " + meuFuncionario2.getNome());//
            //System.out.println("cargo: " + meuFuncionario2.getCargo());//
            //System.out.println("salario: " + meuFuncionario2.getSalario());//
        }
    }
}