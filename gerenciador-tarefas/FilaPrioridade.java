package gerenciadorTarefas;

import java.util.ArrayList;

public class FilaPrioridade {
	
	private ArrayList<TarefaPrioridadeNumerica> tarefas = new ArrayList<>();
	
	public void addTarefa(TarefaPrioridadeNumerica tarefa) {
		tarefas.add(tarefa);
		tarefas.sort((t1, t2) -> Integer.compare(t1.getPrioridade(), t2.getPrioridade()));
	}
	
	public TarefaPrioridadeNumerica removerTarefa() {
		if(tarefas.isEmpty()) {
			return null;
		}
		return tarefas.remove(0);
	}
	
	public boolean estaVazia() {
		return tarefas.isEmpty();
	}
	
	public void listar() {
		for(TarefaPrioridadeNumerica tarefa : tarefas) {
			System.out.println(tarefa);
		}
	}
}
