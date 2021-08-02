package thread;

public class Teste {

	public static void main(String[] args) {
		// Criando objetos da classe TarefaExibeMensagens que implementa runnable
		TarefaExibeMensagens tarefa1 = new TarefaExibeMensagens("Olá");
		TarefaExibeMensagens tarefa2 = new TarefaExibeMensagens("Java");
		TarefaExibeMensagens tarefa3 = new TarefaExibeMensagens("threads");

		// tarefas devem ser executadas dentro de objetos da classe thread
		/*
		 * crie objetos da classe Thread com parametro de objetos da classe que
		 * implementa runnable
		 */
		Thread thread1 = new Thread(tarefa1);
		Thread thread2 = new Thread(tarefa2);
		Thread thread3 = new Thread(tarefa3);

		// Iniciando tarefas
		thread1.start();
		thread2.start();
		thread3.start();
		

	}

}
