public class Loja
{
    private int nProdutos, nProdutosDisponiveis;
    private double quantidadeProdutos, quantidadeVendas;
    private double compraRealizada, valorVT, valorMV;
    private Produto [] listaProdutos = new Produto[100];

    public boolean cadastraProduto(String nome, double valor, int qtEstoque){
        if(nProdutos < 100){
            listaProdutos[nProdutos] = new Produto(nome, valor, qtEstoque);
            nProdutos++;
            return true;
        }else{
            return false;
        }
    }
    public void identificarProduto(String nomeInf, int nvEstoque){
        Produto resultado = null;
        for(int pos = 0; pos < nProdutos; pos++){
            if(listaProdutos[pos] != null){
                if(listaProdutos[pos].getNome().toUpperCase().contains(nomeInf.toUpperCase())){
                    listaProdutos[pos].getNovoEstoque(nvEstoque);
                }
            }
        }
        if(nvEstoque != 0){
            System.out.println("Dados de estoque registrado");
            for(int pos = 0; pos < nProdutos; pos++){
                if(listaProdutos[pos].getNome() == nomeInf){
                    System.out.println(listaProdutos[pos].toString());
                }
            }   
            }else{
                System.out.println("O estoque do produto " + nomeInf + " não foi registrado.");
            }
    }
    public int visualizarProdutos(int opcao){
        if(nProdutos == 0){
            System.out.println("Não há produtos cadastrados.");
        }else if(opcao == 1){
            System.out.println("Há " + nProdutos + " produtos cadastrados.");
            for(int pos = 0; pos < nProdutos; pos++){
                System.out.printf("     Produto_%02d (%s): R$ %.2f Estoque: %02d unidades.\n", pos, listaProdutos[pos].getNome(), listaProdutos[pos].getValor(), listaProdutos[pos].getQtEstoque());
            }
        }else if(opcao == 2){
            for(int pos = 0; pos < nProdutos; pos++){
                if(listaProdutos[pos].getQtEstoque() != 0){
                    System.out.printf("     Produto_%02d (%s): R$ %.2f Estoque: %02d unidades.\n", pos, listaProdutos[pos].getNome(), listaProdutos[pos].getValor(), listaProdutos[pos].getQtEstoque());
                    nProdutosDisponiveis++;
                }
            }
            if(nProdutosDisponiveis == 0){
                System.out.println("Não há produtos disponíveis no momento");
            }
        }else if(opcao == 3){
            for(int pos = 0; pos < nProdutos; pos++){
                if(listaProdutos[pos].getQtEstoque() == 0){
                    System.out.printf("     Produto_%02d (%s): R$ %.2f Estoque: %02d unidades.\n", pos, listaProdutos[pos].getNome(), listaProdutos[pos].getValor(), listaProdutos[pos].getQtEstoque());
                }else{
                    System.out.println("Não há produtos sem estoque.");
                }
            }
        }
        return 0;
    }
    public void compraRealizada(String nomeInf, int compraRe){
        for(int pos = 0; pos < nProdutos; pos++){
            if(listaProdutos[pos].getNome().toUpperCase().contains(nomeInf.toUpperCase())){
                listaProdutos[pos].CompraRealizada(compraRe);
                listaProdutos[pos].QtVendas();
                quantidadeProdutos = quantidadeProdutos + compraRe;
            }
        }
        for(int pos = 0; pos < nProdutos; pos++){
            if(listaProdutos[pos].getNome().toUpperCase().contains(nomeInf.toUpperCase())){
                quantidadeVendas = listaProdutos[pos].getQtVendas();
                compraRealizada = listaProdutos[pos].getValorCompra();
                valorVT = valorVT + compraRealizada;
            }
        }
    }
    public int controleLoja(int escolha){
        if(escolha == 1){
            System.out.printf("Quantidade total de produtos vendidos: %.0f", quantidadeProdutos);
        }else if(escolha == 2){
            System.out.printf("Quantidade total de vendas:  %.0f", quantidadeVendas);
        }else if(escolha == 3){
            System.out.printf("Valor total das vendas: %.2f", valorVT);
        }else if(escolha == 4){
            valorMV = (valorVT/quantidadeProdutos);
            System.out.printf("Valor médio das vendas: %.2f", valorMV);
        }
        return 0;
    }
}
