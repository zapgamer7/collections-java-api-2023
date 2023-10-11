package setInterface.OperaçõesBasicas;

import java.util.Objects;

public class Convidado {
    private String nome;

    private int codigoConvite;

    public Convidado(String nome, int codigoConvite){
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public boolean equals(Object o){
        

        if(this == o) return true;
        if  (!(o instanceof Convidado))return false;
        Convidado outro = (Convidado) o;
        return Objects.equals(codigoConvite, outro.codigoConvite);
    }

    @Override
    public int hashCode(){
        return Objects.hash(getCodigoConvite());
    }

    @Override
    public String toString(){
        return "NOME: " + nome + " CODIGO DE CONVITE: " + codigoConvite;
    }

}
