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

        if (opera == 1){                                     // metodo de deposito
            System.out.println("Insira o valor de deposito ");
            double valor = input.nextDouble();
            movimentacoes CD = new movimentacoes(valor);
            System.out.println("valor atualizado "+CD.Depositar());
        } else if (opera == 2) {
            System.out.println("Insira o valor para saque ");
            double valor = input.nextDouble();
            if(valor < Motive.getSaldo()){
                Motive.Sacar();
            }
            System.out.println("Valor atualizado "+Motive.Sacar());
        }
            System.out.println("Deseja fazer mais alguma operação sim/não");

         String resposta = input.nextLine();
         boolean continuar;

                                                              // Criando a opção de nova operação
         if(resposta.equalsIgnoreCase("sim")){
             System.out.println("Depositar presione 1");
             System.out.println("Sacar presione 2");
             int newopera = input.nextInt();

             if (newopera == 1){
                 System.out.println("Insira o valor de deposito ");
                 double valor = input.nextDouble();
                 movimentacoes CD = new movimentacoes(valor);
                 System.out.println("valor atualizado "+CD.Depositar());
             } else if (newopera == 2) {
                 System.out.println("Insira o valor para saque ");
                 double valor = input.nextDouble();
                 if(valor < Motive.getSaldo()){
                     Motive.Sacar();
                 }
                 System.out.println("Valor atualizado "+Motive.Sacar());
             }

         }













    }
}
