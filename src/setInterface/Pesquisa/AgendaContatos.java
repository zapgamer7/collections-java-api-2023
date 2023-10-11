package setInterface.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }
    
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();

        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome));
            contatosPorNome.add(c);
        }
        return contatosPorNome;
    }

    public Contato atualizarNomeContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;

        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                break;
            }
            contatoAtualizado = c;
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        
        agendaContatos.adicionarContato("cauan", 1999745876);
        agendaContatos.adicionarContato("cauan abreu", 1223232323);
        agendaContatos.adicionarContato("julinda", 1321312342);
        System.out.println(agendaContatos.pesquisarPorNome("cauan"));
        agendaContatos.atualizarNomeContato("cauan", 232323);
        System.out.println(agendaContatos.pesquisarPorNome("cauan"));
    }
}
