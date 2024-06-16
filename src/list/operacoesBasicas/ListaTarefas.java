package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    // atributo

    private List<Tarefa> tarefasList;

    public ListaTarefas() {
        this.tarefasList = new ArrayList<>();
    }

    // metodos

    public void adicionarTarefa(String descricao) {
        tarefasList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefasList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefasList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefasList.size();
    }

    public void obterDescreicoesTarefas() {
        System.out.println(tarefasList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();


        System.out.println("O número total de elementos é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescreicoesTarefas();
    }
}
