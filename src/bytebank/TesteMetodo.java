package bytebank;

public class TesteMetodo {
	public static void main(String[] args) {
		Conta contaBianca = new Conta();
		contaBianca.saldo = 100;
		contaBianca.deposita(50);
		
		System.out.println("Valor do saldo Bianca: "+contaBianca.saldo);
		contaBianca.saca(20);
		System.out.println(contaBianca.saldo);
	}

}
