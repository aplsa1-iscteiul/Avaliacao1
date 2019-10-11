
public class Teste {
	
	private String cadeira;
	private int valores;
	private boolean aprovado;
	private static final int  notaMinima = 10;
	
	public Teste(String cadeira, int valores){
		this.cadeira = cadeira;
		this.valores = valores;
	}
	
	public void resultado(){
		if (this.valores >= notaMinima){
			aprovado = true;
		System.out.println("Aluno reprovado");
		}
		else {
			aprovado = false;
			System.out.println("Aluno provado");
		}
	}
	

}
