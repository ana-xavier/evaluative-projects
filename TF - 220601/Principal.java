import java.util.Scanner;
public class Principal
{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        Loja trabalhoFinal = new Loja(); 
        int opcao;
        
        String nomeInf;
        double valorInf;
        int novoEstoque, qtEstoqueInf, compraRe;
        
        do{
            opcao = menuPrincipal();
            switch(opcao){
                case 1:
                    System.out.println("\n  >> Cadastrar produto");
                    System.out.print("     Informe o nome do produto: ");
                    nomeInf = entrada.nextLine();
                    System.out.print("     Informe o valor unitário do produto: ");
                    valorInf = Double.parseDouble(entrada.nextLine());
                    System.out.print("     Informe a quantidade estocada: ");
                    qtEstoqueInf = Integer.parseInt(entrada.nextLine());
                    
                    trabalhoFinal.cadastraProduto(nomeInf, valorInf, qtEstoqueInf);
                    break;
                case 2:
                    System.out.println("\n  >> Registrar estoque");
                    System.out.print("     Informe o nome do produto: ");
                    nomeInf = entrada.nextLine();
                    System.out.print("     Informe a quantidade de estoque entrando: ");
                    novoEstoque = Integer.parseInt(entrada.nextLine());
                    
                    trabalhoFinal.identificarProduto(nomeInf, novoEstoque);
                    break;
                case 3:
                    int escolhaLista;
                    do{
                        escolhaLista = menuListarProdutos();
                        switch(escolhaLista){
                            case 1:
                                trabalhoFinal.visualizarProdutos(escolhaLista);  
                                break;
                            case 2:
                                trabalhoFinal.visualizarProdutos(escolhaLista);  
                                break;
                            case 3:
                                trabalhoFinal.visualizarProdutos(escolhaLista);
                                break;
                            case 0:
                                break;
                        }
                    }while(escolhaLista != 0);
                    break;
                case 4:
                    int escolhaCompra;
                    do{
                        escolhaCompra = menuRegistrarCompra();
                        switch(escolhaCompra){
                            case 1:
                                System.out.println("\nProdutos disponíveis: ");
                                trabalhoFinal.visualizarProdutos(2);
                                
                                System.out.print("     Informe o nome do produto: ");
                                nomeInf = entrada.nextLine();
                                System.out.print("     Informe a quantidade de unidades: ");
                                compraRe = Integer.parseInt(entrada.nextLine());
                                
                                trabalhoFinal.compraRealizada(nomeInf, compraRe);
                                
                                escolhaCompra = menuCompra();
                                if(escolhaCompra == 2){
                                    System.out.print("Compra finalizada!");
                                }
                                break;
                            case 2:
                                System.out.println("Compra finalizada!");
                                break;
                        }
                    }while(escolhaCompra != 2);
                    break;
                case 5:
                    int escolhaControle;
                    do{
                        escolhaControle = menuControleLoja();
                        switch(escolhaControle){
                            case 1:
                                trabalhoFinal.controleLoja(escolhaControle);
                                break;
                            case 2:
                                trabalhoFinal.controleLoja(escolhaControle);
                                break;
                            case 3:
                                trabalhoFinal.controleLoja(escolhaControle);
                                break;
                            case 4:
                                trabalhoFinal.controleLoja(escolhaControle);
                                break;
                            case 0:
                                break;
                            
                        }
                    }while(escolhaControle != 0);
                    break;
            }
        }while(opcao != 0);
        System.out.println("Fim do programa");
    }
    public static int menuPrincipal(){
        Scanner entrada = new Scanner(System.in);
        int opcao;
        
        do{
            System.out.println("\nMenu de opções");
            System.out.println("1 - Cadastrar produtos");
            System.out.println("2 - Registrar estoque");
            System.out.println("3 - Visualização de produtos");
            System.out.println("4 - Registro de compra");
            System.out.println("5 - Controle da loja");
            System.out.println("0 - Sair do programa");
            System.out.print("Opção desejada: ");
            opcao = entrada.nextInt();
        }while(opcao < 0 || opcao > 5);
        
        if(opcao < 0 || opcao > 5){
            System.out.println("Opção inválida.");
        }
        return opcao;
    }
    public static int menuListarProdutos(){
        Scanner entrada = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("\n  >> Lista de produtos");
            System.out.println("1 - Listar todos os produtos");
            System.out.println("2 - Listar produtos disponíveis");
            System.out.println("3 - Listar produtos com estoque zero");
            System.out.println("0 - Voltar para o menu principal");
            System.out.print("Opção desejada: ");
            opcao = entrada.nextInt();
        }while(opcao < 0 || opcao > 3);
        
        if(opcao < 0 || opcao > 3){
            System.out.println("Opção inválida.");
        }
        return opcao;
    }
    public static int menuRegistrarCompra(){
        Scanner entrada = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("\n  >> Registrar compra");
            System.out.println("1 - Selecionar produtos");
            System.out.println("2 - Finalizar compra");
            System.out.print("Opção desejada: ");
            opcao = entrada.nextInt();
        }while(opcao < 1 || opcao > 2);
        
        if(opcao < 1 || opcao > 2){
            System.out.println("Opção inválida.");
        }
        return opcao;
    }
    public static int menuCompra(){
        Scanner entrada = new Scanner(System.in);
        int opcao;
        System.out.println("\n1 - Desejo realizar nova compra");
        System.out.println("2 - Não desejo realizar nova compra");
        opcao = entrada.nextInt();
        
        return opcao;
    }
    public static int menuControleLoja(){
        Scanner entrada = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("\n  >> Controle da loja"); 
            System.out.println("1 - Quantidade de produtos vendidos");
            System.out.println("2 - Quantidade de vendas");
            System.out.println("3 - Valor total das vendas");
            System.out.println("4 - Valor médio das vendas");
            System.out.println("0 - Voltar para o menu principal");
            System.out.print("Opção desejada: ");
            opcao = entrada.nextInt();
        }while(opcao < 0 || opcao > 4);
        
        if(opcao < 0 || opcao > 4){
            System.out.println("Opção inválida.");
        }
        return opcao;
    }
}
