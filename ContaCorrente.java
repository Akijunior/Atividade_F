package Domain;

public class ContaCorrente extends Conta{
	
	@Override
	public void atualiza(double taxa){
		super.atualiza(taxa * 2);
	}
	
	public void deposita(double valor){
		saldo += (valor - 0.10);
	}

}
