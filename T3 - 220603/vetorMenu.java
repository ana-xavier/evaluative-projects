/**
 * Trabalho 3 de programação; 
 * primeiro semestre de Ciência da Computação.
 * 
 * Menu de opção com operações sobre um vetor.
 * 
 * @author Ana Carolina Xavier 
 * @param informando o valor igual a alguma das opções disponíveis.
 * @return retorna o valor final da operação selecionada.
 */
import java.util.Scanner;
import java.util.Random;

public class vetorMenu
{
    static int [] vResultado;
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int menu;
        
        System.out.println("Para acessar o menu é necessário primeiro criar um vetor");
        System.out.println("     Você deseja criar um vetor?");
        System.out.println("     1 --> Sim");
        System.out.println("     2 --> Não");
        int usrRes = entrada.nextInt();
        
        if(usrRes == 1){
            criarVetor();
            System.out.println("Vetor criado! Agora segue o menu!\n");

            do{
             menu = menuPrincipal();
             
             if(menu != 0){
                 switch(menu){
                     case 1:
                         criarVetor();
                         System.out.println("Vetor criado :D\n");
                         break;
                     case 2:
                         preencherVetor();
                         System.out.println("Vetor preenchido :D\n");
                         break;
                     case 3:
                         listarVetor();
                         break;
                     case 4:
                         ordenarVetor();
                         break;
                     case 5:
                         picosVetor();
                         break;
                     default:
                         System.out.println("A opção " + usrRes + " não é válida, amigo");
                         break;
                 }
             }
            }while(menu != 0);
        }else if(usrRes == 2){
            System.out.println("Fim do programa. Até outra hora!");
        }else{
            System.out.println("Opção inválida :(");
        }
    }
    
    public static int menuPrincipal(){
        Scanner localUsr = new Scanner(System.in);
        
        do{
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("+     Opções do menu            +");
            System.out.println("+  1 - Criar novo vetor         +");
            System.out.println("+  2 - Preencher vetor          +");
            System.out.println("+  3 - Listar vetor             +");
            System.out.println("+  4 - Ordenar vetor            +");
            System.out.println("+  5 - Verificar picos do vetor +");
            System.out.println("+  0 - Sair                     +");
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.print("Qual será a opção desejada? ");
            int usrRes = localUsr.nextInt();
            
            if((usrRes >= 0) && (usrRes <= 5)){
                return usrRes;
            }else{
                System.out.println("Opção desejada inválida.");
            }
            
        }while(true);
    }
    
    public static int[] criarVetor(){
        Scanner localUsr = new Scanner(System.in);
        System.out.println("+++++ Criação de vetor :D");
        System.out.print("      Insira o tamanho do vetor: ");
        int tamVet = localUsr.nextInt();
        vResultado = new int[tamVet];
        return vResultado;
    }
    
    public static int[] preencherVetor(){
        Scanner localUsr = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("+++++ Preencher o vetor :D");
        System.out.print("           Insira o valor máximo: ");
        int usrRes = localUsr.nextInt();
        for(int pos = 0; pos < vResultado.length; pos++){
            vResultado[pos] = ran.nextInt(1 + usrRes); //"+1" para começar do 1, e não do 0
        }
        return vResultado;
    }
    
    public static int[] listarVetor(){
        Scanner localUsr = new Scanner(System.in);
        int tElementos = 0, media, acimaMedia = 0;
        
        System.out.println("+++++ Listar o vetor :D");
        System.out.println("     Como deseja listar o vetor?");
        System.out.println("     1 --> Todos os elementos");
        System.out.println("     2 --> Elementos acima da média");
        System.out.println("     3 --> Elementos acima de um valor específico");
        System.out.print("Qual será a opção desejada? ");
        int usrRes = localUsr.nextInt();
        
        if(usrRes == 1){
            System.out.println("Listando todos os elementos:");
            for(int pos = 0; pos < vResultado.length; pos++){
                System.out.println("O elemento na posição v["+pos+"] --> " + vResultado[pos]);
            }
            System.out.println();
        }else if(usrRes == 2){
            for(int aElementos: vResultado){
                tElementos += aElementos;
            }
            media = tElementos/vResultado.length;
            for(int oElemento: vResultado){
                if(oElemento > media){
                    acimaMedia++;
                }
            }
            System.out.println("A média dos elementos foi: " + media);
            System.out.println("A quantidade de elementos acima da media: " + acimaMedia);
            for(int pos = 0; pos < vResultado.length; pos++){
                if(vResultado[pos] > media){
                    System.out.println("Elemento acima da média: " + vResultado[pos]);
                }
            }
            System.out.println();
        }else if(usrRes == 3){
            System.out.print("Valor específico: ");
            usrRes = localUsr.nextInt();
            for(int oElemento: vResultado){
                if(oElemento > usrRes){
                    acimaMedia++;
                }
            }
            System.out.println("A quantidade de elementos acima da media: " + acimaMedia);
            for(int pos = 0; pos < vResultado.length; pos++){
                if(vResultado[pos] > usrRes){
                    System.out.println("Elemento acima da média: " + vResultado[pos]);
                }
            }
            if(acimaMedia <= 0){
                System.out.println("Não existem elementos acima de "+usrRes+". Tente outra vez");
            }
            System.out.println();
        }else{
            System.out.println("Calma ai amigo, essa opção é inválida, tenta outra vez:D");
        }
        return vResultado;
    }
    
    public static int[] ordenarVetor(){
        Scanner localUsr = new Scanner(System.in);
        System.out.println("+++++ Ordenar o vetor :D");
        System.out.println("     (Observação: após ordenar o vetor uma vez, não será posição que ele volte a ordenação original)");
        System.out.println("     Como deseja ordenar o vetor?");
        System.out.println("     1 --> Ordem crescente");
        System.out.println("     2 --> Ordem decrescente");
        System.out.print("Qual será a opção desejada? ");
        int usrRes = localUsr.nextInt();
        
        if(usrRes == 1){
            System.out.print("Elementos na ordem atual: ");
            for(int pos = 0; pos < vResultado.length; pos++){
                    System.out.print(vResultado[pos] + ", ");
            }        
            System.out.println();
            for(int posA = 0; posA < vResultado.length -1; posA++){
                for(int posB = posA+1; posB < vResultado.length; posB++){
                    if(vResultado[posA] > vResultado[posB]){
                        int aux = vResultado[posA];
                        vResultado[posA] = vResultado[posB];
                        vResultado[posB] = aux;
                    }
                }
            }
            System.out.print("Elementos em ordem crescente: ");
            for(int pos = 0; pos < vResultado.length; pos++){
                    System.out.print(vResultado[pos] + ", ");
            }
            System.out.println();
        }else if(usrRes == 2){
            System.out.print("Elementos na ordem atual: ");
            for(int pos = 0; pos < vResultado.length; pos++){
                    System.out.print(vResultado[pos] + ", ");
            }
            System.out.println();
            for(int posA = 0; posA < vResultado.length -1; posA++){
                for(int posB = posA+1; posB < vResultado.length; posB++){
                    if(vResultado[posA] < vResultado[posB]){
                        int aux = vResultado[posA];
                        vResultado[posA] = vResultado[posB];
                        vResultado[posB] = aux;
                    }
                }
            }
            System.out.print("Elementos em ordem decrescente: ");
            for(int pos = 0; pos < vResultado.length; pos++){
                    System.out.print(vResultado[pos] + ", ");
            }
            System.out.println();
        }else{
            System.out.println("Calma ai amigo, essa opção é inválida, tenta outra vez:D");
        }
        System.out.println();
        return vResultado;
    }
    
    public static int[] picosVetor(){
        Scanner localUsr = new Scanner(System.in);
        System.out.println("+++++ Encontrar os picos do vetor :D");
        System.out.println("     Deseja encontrar o maior ou menor pico do vetor?");
        System.out.println("     1 --> Maior/máximo");
        System.out.println("     2 --> Menor/minímo");
        System.out.print("Qual será a opção desejada? ");
        int usrRes = localUsr.nextInt(); 
        
        if(usrRes == 1){
            int maior = vResultado[0] ;
            for(int pos = 0; pos < vResultado.length; pos++){
                if(vResultado[pos] > maior){
                    vResultado[maior] = vResultado[pos];
                    System.out.println("O pico máximo do vetor é: "+ vResultado[maior] + " na posição " + pos);
                }
            }
        }else if(usrRes == 2){
            int menor = vResultado[0];
            for(int pos = 0; pos < vResultado.length; pos++){
                if(vResultado[pos] < menor){
                    vResultado[menor] = vResultado[pos];
                    System.out.println("O pico minímo do vetor é: "+ vResultado[menor] + " na posição " + pos);
                }
            }
        }else{
            System.out.println("Calma ai amigo, essa opção é inválida, tenta outra vez:D");
        }
        return vResultado;
    }
}
