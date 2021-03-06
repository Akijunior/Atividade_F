package App;

import Domain.AtualizadorDeContas;
import Domain.Conta;
import Domain.ContaCorrente;
import Domain.ContaPoupanca;

public class TestaAtualizadorDeContas {
	
	public static void main(String[] args) {
		Conta c = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		AtualizadorDeContas adc = new AtualizadorDeContas();
		
		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);
		
		System.out.println("Saldo Total: " + adc.getSaldoTotal() + ".");
	}
}
