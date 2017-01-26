package Domain;

public class AtualizadorDeContas {
	
	private double saldoTotal = 0, selic;
	
	public void roda(Conta c){
		
		System.out.println("Saldo anterior -> " + c.saldo + ".");
		c.atualiza(0.01);
		System.out.println("Saldo final -> " + c.saldo + ".");
		saldoTotal += c.saldo;
		
	}

	public double getSaldoTotal() {
		// TODO Auto-generated method stub
		return saldoTotal;
	}
	
	

}
