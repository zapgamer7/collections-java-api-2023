package Map.OperaçõesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos(){
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, int telefone){
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatosMap.isEmpty()){
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatosMap.isEmpty()){
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("cauan", 1999745876);
        agendaContatos.adicionarContato("julinda", 1999945434);
        agendaContatos.adicionarContato("edivaldo", 1999940437);

        agendaContatos.exibirContatos();
        System.out.println("|||");
        System.out.println(agendaContatos.pesquisarPorNome("cauan"));

        agendaContatos.removerContato("cauan");

        System.out.println(agendaContatos.pesquisarPorNome("cauan"));

    }
}
