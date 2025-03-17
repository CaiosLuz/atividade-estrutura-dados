package gerenciadorTarefas;

import java.util.ArrayList;

public class Fila {
	
	private ArrayList<TarefaRegular> tarefas = new ArrayList<>();
	
	public void addTarefa(TarefaRegular tarefa) {
		tarefas.add(tarefa);
	}
	
	public TarefaRegular removerTarefa() {
		if(tarefas.isEmpty()) {
			return null;
		}
		return tarefas.remove(0);
	}
	
	public boolean estaVazia() {
		return tarefas.isEmpty();
	}
	
	public void listar() {
		for(TarefaRegular tarefa : tarefas) {
			System.out.println(tarefa);
		}
	}
}
