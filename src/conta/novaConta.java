package conta;
import conta.movimentacoes;
import java.util.Scanner;
public class novaConta {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);


        System.out.println("Conta Bancaria ");

        System.out.println("Digite seu CPF ");   // Entrada de dados e informações
        long CPF = input.nextLong();
        System.out.println("informe seu nome: ");
        input.nextLine();
        String nome = input.nextLine();

        movimentacoes Motive = new movimentacoes(CPF, nome);
        System.out.println("Olá, "+Motive.getNome()+" qual operação deseja fazer?");

        System.out.println("Depositar presione 1");
        System.out.println("Sacar presione 2");

         int opera = input.nextInt();

        if (opera == 1){                                   // metodo de deposito
            System.out.println("Insira o valor de deposito ");
            double valor = input.nextDouble();
            movimentacoes CD = new movimentacoes(valor);
            System.out.println("valor atualizado "+CD.Depositar());
        }

                                                            // Criar o metodo de sacar












    }
}
