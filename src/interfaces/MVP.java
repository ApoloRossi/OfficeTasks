package interfaces;

import java.util.Date;
import java.util.List;

import bean.Tarefa;

public interface MVP {
	
	interface ModelImpl{
		void update(int id, String descricao, String andamento, int prioridade, boolean status, String observacao,
				String data);
		void insert(String descricao, String andamento, int prioridade, boolean status, String observacao,
				String data);
		List<Tarefa> select(String date);
		
		int validateUser(String user,char[] psw);
		
	}
	
	interface ViewImpl{
		
		
	}
	
	interface ControllerGerenciaImpl{
		List<Tarefa> getTasks(String date);
		void inserirTarefa(String descricao, String andamento, int prioridade, boolean status, String observacao,
				String data);
		void alterarTarefa(int id, String descricao, String andamento, int prioridade, boolean status, String observacao,
				String data);
		
		boolean verificaData(Date date);
	}
	
	interface ControllerLoginImpl{
		int validateUser(String user,char[] psw);				
	}
	

}
