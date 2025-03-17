package gerenciadorTarefas;

public class TarefaPrioridadeNumerica extends Tarefa{
	
	private int prioridade;
	
	public TarefaPrioridadeNumerica(String descricao, String dataCriacao, int prioridade) {
		super(descricao, dataCriacao);
		this.prioridade = prioridade;
	}
	
	public int getPrioridade() {
		return prioridade;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - (Prioridade: " + prioridade + ")";
	}
}
