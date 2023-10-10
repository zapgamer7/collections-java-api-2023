package list.OperaçõesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
        System.out.println("SUA TAREFA FOI ADICIONADA COM SUCESSO");
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for(Tarefa t: tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
        
    }
    
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefa(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("comprar macarrão");
        listaTarefa.adicionarTarefa("comprar macarrão");
        listaTarefa.obterDescricoesTarefa();

        System.out.println(listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("comprar macarrão");

        listaTarefa.obterDescricoesTarefa();
    }
}
