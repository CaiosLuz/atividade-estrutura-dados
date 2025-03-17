package gerenciadorTarefas;

public class Main {
	public static void main(String[] args) {
		
		GerenciadorTarefas gerenciador = new GerenciadorTarefas();
	
		gerenciador.addTarefaRegular("Enviar relatório", "16/03/2025");
		gerenciador.addTarefaPrioritaria("Resolver problema problema urgente", "16/03/2025");
		gerenciador.addTarefaPrioridadeNumerica("Atualizar banco de dados", "16/03/2025", 5);
		gerenciador.addTarefaPrioridadeNumerica("Corrigir erros de digitação", "16/03/2025", 2);
		gerenciador.addTarefaRegular("Preparar apresentação", "16/03/2025");
		gerenciador.addTarefaRegular("Preparar café", "16/03/2025");
		
		gerenciador.processarProximaTarefa();
		gerenciador.processarProximaTarefa();
		gerenciador.processarProximaTarefa();
		gerenciador.processarProximaTarefa();
		
		gerenciador.exibirTarefasPendentes();
	}	
}
