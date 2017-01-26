package Domain;

public class Banco {
	
	public static int cont = 1;
	
	Conta[] listaContas = new Conta[cont];
	
	public void adicionaConta(Conta conta){
		listaContas[cont -1] = conta;
		cont ++;
	}
	
	public Conta posicaoDaConta(int x){
		
		return listaContas[x];
	}
	
	public int pegaTotalDeContas(){
		return cont - 1;
	}
}
