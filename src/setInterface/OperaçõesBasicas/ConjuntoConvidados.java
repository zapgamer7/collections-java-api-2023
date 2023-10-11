package setInterface.OperaçõesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados(){
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoDeConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;

        for(Convidado c : convidadosSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();



        conjuntoConvidados.adicionarConvidado("cauan", 1);
        conjuntoConvidados.adicionarConvidado("edivaldo", 2);
        conjuntoConvidados.adicionarConvidado("julida", 3);
        conjuntoConvidados.adicionarConvidado("tereza", 4);
        conjuntoConvidados.adicionarConvidado("heloisa", 4);
        
        conjuntoConvidados.exibirConvidados();
        System.out.println("|");
        System.out.println("no momenteto " + conjuntoConvidados.contarConvidados() + " pessoas foram convidadas para a festa");

        
    }

}
