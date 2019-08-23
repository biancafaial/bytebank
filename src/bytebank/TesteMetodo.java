package bytebank;

public class TesteMetodo {
	public static void main(String[] args) {
		Conta contaBianca = new Conta();
		contaBianca.saldo = 100;
		contaBianca.deposita(50);
		System.out.println("Valor do saldo Bianca: " + contaBianca.saldo);
		
		boolean conseguiuRetirar = contaBianca.saca(20);
		System.out.println(contaBianca.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaKarla = new Conta();
		contaKarla.saldo = 1000;
		
		if(contaKarla.tranferencia(300, contaBianca)) {
			System.out.println("Tranferencia feita com sucesso");
		}else {
			System.out.println("Saldo insuficiente para transferência");
		}
		System.out.println("Saldo Atual Karla "+contaKarla.saldo);
		System.out.println("Saldo Atual Bianca "+contaBianca.saldo);
		
	}

}
