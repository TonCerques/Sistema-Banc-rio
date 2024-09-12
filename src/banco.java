import java.util.Scanner;

public class banco {
	public Scanner ler = new Scanner(System.in);
	private String nome;
	private int numCont;
	private int agencia;
	private Double saldo;
	private String data;
	private String cpf;
	

		public void setCpf (String cpf) {
			this.cpf = cpf;}
		public String getCpf () {
			return cpf;
		}
	
	
		public void setNome (String nome) { //NOME
			System.out.println("Nome: ");
			this.nome = ler.next();
		}
		public String getNome() {
			return nome;}
		
		public void setnumCont (int numCont) {	// NUMERO DA CONTA
			System.out.println("N° da Conta: ");
			this.numCont = ler.nextInt();    }
		public int getNumcont() {
			return numCont;}
		
		public void setAgencia (int agencia) {
			this.agencia = agencia;}
		public int getAgencia () { // AGENCIA
			return agencia;	}
		
		public void setSaldo (Double saldo) {
			this.saldo = saldo;	}
		public Double getSaldo() { // SALDO
			return saldo;}
		
		public void setData (String data) {
			this.data = data;} // DATA
		public String getData () {
			return data;}

		public void saldo (double saldo) {
			this.saldo = 500.00;
		}
		
		public banco () {
			
			
			
			
		}
		
		
		public void sacar (double saldo) {
			double n1;
			double sacar;
			System.out.println("Você deseja sacar: ");
			sacar = ler.nextInt();
			n1 = sacar -= saldo;
			if (sacar >= saldo) {
				System.out.println("Não é possível realizar o saque");
			}
		}
		public void depositar (double saldo) {
			double n1;
			double depo;
			System.out.println("Você deseja depositar: ");
			depo = ler.nextInt();
			n1 = depo - saldo;
			if (depo <= saldo) {
			System.out.println("Não é possível realizar o depósito");}
		}
		
			
			
			
}// fim class
