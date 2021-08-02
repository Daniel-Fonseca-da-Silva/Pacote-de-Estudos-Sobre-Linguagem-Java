package thread;

public class TarefaExibeMensagens implements Runnable {

	private String msg;

	public TarefaExibeMensagens(String msg) {
		this.msg = msg;
	}

	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i + " : " + this.msg);
		if(i % 100 == 0)
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
}
