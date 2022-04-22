/*
 * Aluna: Ana Carolina Xavier
 * Turma: 11
 * Questão 2
 */
import java.util.Scanner;

public class questao2
{
    public static void main(String[] args)
    {
        //Introdução
        // ---> Definindo variáveis inicias.
        Scanner entrada = new Scanner(System.in);
        int numero, soma = 0, nDivisao;
        
        // ---> Descrição 
        System.out.println("Algoritmo para analisar se o número é perfeito.\n"); //\n para haver outra quebra de linha (melhor visualização)
        
        // ---> Interação com o usuário.
        System.out.print("ATENÇÃO! O número deve ser inteiro, \npositivo e maior que zero.\nInsira um número: ");
        numero = entrada.nextInt();
    
        // ---> Já que todos os divisores de um número perfeito, exceto ele mesmo, 
        //      é igual ou maior que sua metade. Portanto,
        int metNumero = numero/2;
        
        //Desenvolvimento
        /* ---> Lógica do laço:
         *      -> Inicializamos a variável nDivisao em 1.
         *      -> Analisará se nDivisao é menor ou igual a metade do número inserido pelo usuário.
         *      -> Acresenta ++ na variável nDivisao (para realizar nova análise até chegar no limite 
         *         da condição).
         *      -> Na variável soma (inicializada anteriormente em 0) será somado o seu valor inicial
         *         mais o valor acrescentado na variavel nDivisao.
         */ 
        
        for(nDivisao = 1; nDivisao <= metNumero; nDivisao++){
            if(numero % nDivisao == 0){
                soma = soma + nDivisao;
                //System.out.println(nDivisao);  ***Verificação***
            }
        }
 
        //Conclusão
        // ---> Mostrando resultado final para o usuário a partir da analise da soma realizada no laço for.
        if(soma == numero){
            System.out.println("O número " + numero + " é perfeito! :D");
        }else{
            System.out.println("O número " + numero + " não é perfeito! D:");
        }
    }
}
