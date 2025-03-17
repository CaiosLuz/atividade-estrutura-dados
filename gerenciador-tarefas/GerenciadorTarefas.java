package gerenciadorTarefas;

public class GerenciadorTarefas {
	
	private Pilha tarefasPrioritarias = new Pilha();
	private FilaPrioridade tarefasPrioridadeNumerica = new FilaPrioridade();
	private Fila tarefasRegulares = new Fila();
	
	public void addTarefaRegular(String descricao, String dataCriacao) {
		tarefasRegulares.addTarefa(new TarefaRegular(descricao, dataCriacao));
	}
	
	public void addTarefaPrioritaria(String descricao, String dataCriacao) {
		tarefasPrioritarias.addTarefa(new TarefaPrioritaria(descricao, dataCriacao));
	}
	
	public void addTarefaPrioridadeNumerica(String descricao, String dataCriacao, int prioridade) {
		tarefasPrioridadeNumerica.addTarefa(new TarefaPrioridadeNumerica(descricao, dataCriacao, prioridade));
	}
	
	public void processarProximaTarefa() {
		if(!tarefasPrioritarias.estaVazia()) {
			System.out.println("Processando tarefa prioritária: " + tarefasPrioritarias.removerTarefa());
		} else if(!tarefasPrioridadeNumerica.estaVazia()) {
			System.out.println("Processando tarefa com prioridade numérica: " + tarefasPrioridadeNumerica.removerTarefa());
		} else if(!tarefasRegulares.estaVazia()) {
			System.out.println("Processando tarefa regular: " + tarefasRegulares.removerTarefa());
		} else {
			System.out.println("Não há tarefas pendentes");
		}
	}
	
	public void exibirTarefasPendentes() {
		System.out.println("\nTarefas prioritárias");
		tarefasPrioritarias.listar();
		System.out.println("\nTarefas com prioridade numérica");
		tarefasPrioridadeNumerica.listar();
		System.out.println("\nTarefas regulares");
		tarefasRegulares.listar();
	}
}
