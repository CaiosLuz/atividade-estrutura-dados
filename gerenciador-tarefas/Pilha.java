package gerenciadorTarefas;

import java.util.ArrayList;

public class Pilha {
	
	private ArrayList<TarefaPrioritaria> tarefas = new ArrayList<>();
	
	public void addTarefa(TarefaPrioritaria tarefa) {
		tarefas.add(tarefa);
	}
	
	public TarefaPrioritaria removerTarefa() {
		if(tarefas.isEmpty()) {
			return null;
		}
		return tarefas.remove(tarefas.size() - 1);
	}
	
	public boolean estaVazia() {
		return tarefas.isEmpty();
	}
	
	public void listar() {
		for(int i = tarefas.size() - 1; i >= 0; i--) {
			System.out.println(tarefas.get(i));
		}
	}
}
