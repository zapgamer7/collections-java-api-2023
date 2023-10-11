package setInterface.Ordenação;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, long codigo, double preco, int quantidade){
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int hashCode(){
        return Objects.hash(getCodigo());
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Produto)) return false;
        
        Produto outro = (Produto) o;

        return getCodigo() == outro.getCodigo();
    }
    
    public String toString(){
        return "NOME: " + nome + " CODIGO: " + codigo + " PREÇO: " + preco + " QUANTIDADE: " + quantidade;
    }

    @Override
    public int compareTo(Produto o) {
        return nome.compareToIgnoreCase(o.getNome());
    }
}

class ComparatorPorPreco implements Comparator<Produto>{



    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());

    }

}
