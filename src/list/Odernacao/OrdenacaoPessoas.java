package list.Odernacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas(){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List <Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List <Pessoa> pessoasPorAltura= new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoa = new OrdenacaoPessoas();

        ordenacaoPessoa.adicionarPessoa("nome 1", 18, 1.92);
        ordenacaoPessoa.adicionarPessoa("nome 2", 39, 2.0);
        ordenacaoPessoa.adicionarPessoa("pessoa 3", 20, 1.70);

        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println("||||||||||||||||||");
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
    }
}
