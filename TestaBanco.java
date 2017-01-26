package App;

import java.util.Iterator;

import Domain.AtualizadorDeContas;
import Domain.Banco;
import Domain.Conta;
import Domain.ContaCorrente;
import Domain.ContaPoupanca;

public class TestaBanco {
	
public static void main(String[] args) {
	
	Conta c = new Conta();
	Conta cc = new ContaCorrente();
	Conta cp = new ContaPoupanca();
	
	Banco banco = new Banco();
	AtualizadorDeContas adc = new AtualizadorDeContas();
	
	c.deposita(1000);
	cc.deposita(1000);
	cp.deposita(1000);
	
	banco.adicionaConta(c);
	banco.adicionaConta(cc);
	banco.adicionaConta(cp);
	
	for(int i = 0; i < banco.cont - 1; i++){
		adc.roda(banco.posicaoDaConta(i));
	}
	System.out.println("Saldo Total: " + adc.getSaldoTotal() + ".");
	
	
}

}
