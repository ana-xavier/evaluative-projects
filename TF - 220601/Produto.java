public class Produto{
    private String nome;
    private double valor, valorCompras;
    private int qtEstoque, qtVendas = 0;
    
    public Produto(String nomeInf, double valorInf, int qtEstoqueInf){
        nome = nomeInf;
        if(valorInf > 0){
            valor = valorInf;
        }else{
            System.out.println("Valor inválido. Valor padronizado em $0.");
        }
        if(qtEstoqueInf > 0){
            qtEstoque = qtEstoqueInf;
        }else{
            System.out.println("Valor inválido. Estoque padronizado em 0.");
        }
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getValor(){
        return valor;
    }
    
    public int getQtEstoque(){
        return qtEstoque;
    }
    
    public int getNovoEstoque(int novoEstoque){
        qtEstoque += novoEstoque;
        return qtEstoque;
    }
    
    public void CompraRealizada(int compraRe){
        qtEstoque = qtEstoque - compraRe;
        valorCompras = compraRe * valor;
    }
    
    public void QtVendas(){
        qtVendas++;
    }
    
    public double getValorCompra(){
        return valorCompras;
    }
    
    public int getQtVendas(){
        return qtVendas;
    }
    
    public String toString(){
        return "Produto: " + nome + ": Valor unitário: R$" + valor + " Estoque: " + qtEstoque; 
    }
}