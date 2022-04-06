/*
 * Trabalho (T1) realizado pela aluna Ana Carolina Xavier,
 * primeiro semestre Ciência da Computação,
 * para a disciplina Fundamentos da Programação,
 * PUCRS,
 * 22103003-4.
 * 
 * 06/04/2022
 * 
 */

import java.util.Scanner;

public class AnaCarolinaXavier
{
    public static void main(String[] args)
    {
        //INTRODUÇÃO-------------|
        //--> Definir variáveis de entrada e saída.
        double salario, imposto;
        int faixa = ' ';
        //--> Variáveis para definir o valor final de cada faixa (ex: valorFinalFaixa2)
        double valorFF1,valorFF2,valorFF3,valorFF4, valorFF5;
        //--> Variáveis para definir os calculos de cada faixa (ex: valorFaixa2)
        double valorF2,valorF3,valorF4;
        //--> Variáveis para definir os valores de cada imposto sobre cada faixa (ex: valorImpostoFaixa2)
        double valorImpostoF2, valorImpostoF3, valorImpostoF4, valorImpostoF5;
        Scanner entrada = new Scanner(System.in);
        
        //--> Definir proposta do programa.
        System.out.println("Programa destinado a calcular o imposto de renda\na ser cobrado a partir do salário recebido.");
        
        //DESENVOLVIMENTO--------|
        //--> Solicitar valor de entrada; salário do usuário.
        System.out.print("--> Informe seu salário (exemplo de formatação: 2500,70): ");
        salario = entrada.nextDouble();
        
        //--> Realizando condição para encaixe de usuário na faixa correta (1-5).
        if(salario < 1903.98){
            faixa = 1;
        } else if(salario >= 1903.98 && salario < 2826.65){
            faixa = 2;
        } else if(salario >= 2826.65 && salario < 3751.06){
            faixa = 3;
        }else if(salario >=3751.06 && salario < 4664.68){
            faixa = 4;
        }else{
            faixa = 5;
        }
        
        //--> Realizando valor final de cada faixa por salário.
        valorFF1 = 0;
        valorFF2 = ((((salario)-(1903.98))*(7.5))/100);
        valorFF3 = (((((salario)-(2826.65))*15)/100));
        valorFF4 = ((((salario)-(3751.06))*(22.5))/100);
        valorFF5 = (((((salario)-(4664.68))*(27.5))/100));
        
        //--> Realizando calculo (padrão; para salário que passarem pela faixa, mas não estão dentro dela) por faixa.
        valorF2 = ((((2826.65)-(1903.98))*(7.5))/100);
        valorF3 = (((((3751.06)-(2826.65))*15)/100));
        valorF4 = ((((4664.68)-(3751.06))*(22.5))/100);
        
        //--> Realizando calculo do valo final o imposto.
        valorImpostoF2 = valorFF1 + valorFF2;
        valorImpostoF3 = valorFF1 + valorF2 + valorFF3;
        valorImpostoF4 = valorFF1 + valorF2 + valorF3 + valorFF4;
        valorImpostoF5 = valorFF1 + valorF2 + valorF3 + valorF4 + valorFF5;
        
        switch(faixa){
            case 1: //Salário até 1.903,98
                System.out.printf("\nRecebendo o salário " + salario + " você está isento de pagar imposto de renda.\n+ 1° faixa --> R$%.2f\n",valorFF1);
                break;
            case 2: //Salário de 1.903,98 até 2.826,65
                //--> Print de informação de valores.
                System.out.printf("\nRecebendo o salário " + salario + " você será cobrado:\n+ 1° faixa        --> R$%.2f\n+ 2° faixa - 7,5%% --> R$%.2f", valorFF1, valorFF2);
                //--> Print de conclusão; valor total
                System.out.printf("\nPortanto, o valor a pagar será de: R$%.2f\n", valorImpostoF2); 
                break;
            case 3: //Salário de 2.826,65 até 3.751,06
                //--> Print de informação de valores.
                System.out.printf("\nRecebendo o salário " + salario + " você será cobrado:\n+ 1° faixa         --> R$%.2f\n+ 2° faixa - 7,5%%  --> R$%.2f\n+ 3° faixa - 15%%   --> R$%.2f", valorFF1, valorF2, valorFF3);
                //--> Print de conclusão; valor total.
                System.out.printf("\nPortanto, o valor a pagar será de: R$%.2f\n", valorImpostoF3); 
                break;
            case 4: //Salário de 3.751,06 até 4.664,68
                //--> Print de informação de valores.
                System.out.printf("\nRecebendo o salário " + salario + " você será cobrado:\n+ 1° faixa         --> R$%.2f\n+ 2° faixa - 7,5%%  --> R$%.2f\n+ 3° faixa - 15%%   --> R$%.2f\n+ 4° faixa - 22,5%% --> R$%.2f", valorFF1, valorF2, valorF3, valorFF4);
                //--> Print de conclusão; valor total.
                System.out.printf("\nPortanto, o valor a pagar será de: R$%.2f\n", valorImpostoF4); 
                break;
            case 5: //Salário maior ou igual a 4.664,68
                //--> Print de informação de valores.
                System.out.printf("\nRecebendo o salário " + salario + " você será cobrado:\n+ 1° faixa         --> R$%.2f\n+ 2° faixa - 7,5%%  --> R$%.2f\n+ 3° faixa - 15%%   --> R$%.2f\n+ 4° faixa - 22,5%% --> R$%.2f\n+ 5° faixa - 27,5%% --> R$%.2f", valorFF1, valorF2, valorF3, valorF4, valorFF5);
                //--> Print de conclusão; valor total.
                System.out.printf("\nPortanto, o valor a pagar será de: R$%.2f\n", valorImpostoF5); 
                break;
        }
        //CONCLUSÃO--------------|
        System.out.println("That's all folks :D\n");
    }
}
