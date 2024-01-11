package aula04;

public class Caneta {
	public String modelo,cor;
	private boolean tampada;
	private float ponta;
	
	
	public Caneta() {
      this.cor ="Preta";
      this.tampar();
		 
	 }
	
	

	public String getMondelo() {
		return this.modelo;
	}
	public void setModelo(String m) {
		this.modelo = m ;
					
	}
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float p) {
		this.ponta = p;
	}
	public void tampar() {
		this.tampada = true;
	}
	
	public void destamada() {
		this.tampada = false;		
	}
	
	public void status() {
		System.out.println("Sobre a caneta:");
		System.out.println("Modelo: "+ this.modelo);
		System.out.println("Ponta: "+ this.ponta);
		System.out.println("Cor: "+ this.cor);
		System.out.println("Tampada: "+ this.tampada );
		
		
	}
}
