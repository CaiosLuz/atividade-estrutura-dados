package gerenciadorTarefas;

public class Tarefa {
	String descricao;
	String dataCriacao;
	
	public Tarefa(String descricao, String dataCriacao) {
		this.descricao = descricao;
		this.dataCriacao = dataCriacao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public String getDataCriacao() {
		return dataCriacao;
	}
	
	@Override
	public String toString() {
		return "Tarefa: " + descricao + " - Data criação: " + dataCriacao;
	}
}
