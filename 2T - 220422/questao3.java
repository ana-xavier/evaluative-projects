/*
 * Aluna Ana Carolina Xavier
 * Turma: 11
 * Questão 3
 */
import java.util.Scanner;
import java.util.Random;

public class questao3
{
   public static void main(String[] args)
   {
       //Introdução
       // ---> Definindo variáveis iniciais.
       Scanner entrada = new Scanner(System.in);
       Random vAleat = new Random();
       
       int candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0, nulos = 0, brancos = 0;
       
       // ---> Descrição
       System.out.println("Eleição presidencial: votos!");
       
       // ---> Interação com usuário.
       System.out.print("Insira o número de votantes da eleição: ");
       int votantes = entrada.nextInt();
       
       //Desenvolvimento
       /*
        * ---> Lógica do laço:
        *      -> Inicializa a variável votos em 0.
        *      -> Analisa se o número de votos é menor ou igual que o número de votantes.
        *      -> Acrescenta ++ na variável votos.
        *      -> Na variável códigos, vai definir que ela no mínimo é 1 mais o número randomizado (até 6).
        */
       for(int votos = 1; votos <= votantes; votos++){
           int codigos = 1 + vAleat.nextInt(6);
           //System.out.println("O voto n°" + votos + " votou em " + codigos); ***Verificação***
           
           // ---> Analisa os números randomizados (códigos) com os votos.
           // ---> A cada código analizado acrescentará ++ em sua respectiva variável. 
           if(codigos == 1){
               candidato1++;
           }else if(codigos == 2){
               candidato2++;
           }else if(codigos == 3){
               candidato3++;
           }else if(codigos == 4){
               candidato4++;
           }else if(codigos == 5){
               nulos++;
           }else{
               brancos++;
           }
       }
       //Conclusão
       // ---> Mostrando o resultado para o usuário.
       System.out.println("VOTOS:\n ---> Candidato 1: " + candidato1 + "\n ---> Candidato 2: " + candidato2 + "\n ---> Candidato 3: " + candidato3 + "\n ---> Candidato 4: " + candidato4 + "\n ---> Nulos: " + nulos + "\n ---> Em branco: " + brancos);
   }
}
