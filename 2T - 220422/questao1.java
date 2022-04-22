/*
 * Aluna: Ana Carolina Xavier
 * Turma: 11
 * Questão 1
 */
public class questao1
{
    public static void main(String[] args)
    {
        //Introdução
        // ---> Definindo valores iniciais.
        double chico = 1.5, ze = 1.1;
        int anos = 1; //No ano 1, Chico e Zé terão as alturas indicadas ^ 
        
        // ---> Descrição
        System.out.println("Algoritmo que calcula quantos anos demorará\npara Zé ultrapassar a altura de Chico.\n");
        
        //Desenvolvimento
        // ---> Calculo para acrescentar a altura dos meninos, e o contator de anos.
        while(chico >= ze){
            chico = chico + 0.02;
            ze = ze + 0.03;
            anos++;
        }
        //Conclusão
        // ---> Altura final de cada menino.
        System.out.printf("Chico --> %.2f\n",chico);
        System.out.printf("Zé --> %.2f\n",ze);
        // ---> Resultado final em anos.
        System.out.printf("Em %d anos, Zé ultrapassará a altura de Chico.\n", anos);
    }
}
