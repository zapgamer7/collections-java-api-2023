package setInterface.Pesquisa;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numero;

    public Contato(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String toString(){
        return "NOME: " + nome + " NUMERO: " + numero;
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Contato)) return false;
        Contato outro = (Contato) o;
        
        return nome == outro.nome;
    }

    public int hashCode(){
        return Objects.hash(getNome());
    }

}
