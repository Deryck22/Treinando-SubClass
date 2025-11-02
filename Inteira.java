package DioConceitoHerençaExercicio;

public final class Inteira extends Ingresso {
	

	    private int codIngressoInt = 7;
	    private int pessoas;

	    public Inteira() {
	        super(95, "Homem piramide", "Legendado");
	    }

	    public void setPessoas(int pessoas) {
	        this.pessoas = pessoas;
	    }

	    public double getValorReal() {
	        double valor = getValor() * pessoas;
	        if (pessoas >= 3) valor -= valor * 0.05;
	        return valor;
	    }

	    public int getCodIngressoInt() {
	        return codIngressoInt;
	    }
	}

	
	/*
	 * praticando com os meus conceitos:
	
	private int codIngressoInt = 7;
	private int pessoas = 0;
	private double valorComDesconto = getValor() - (getValor() * 0.05) ;

	
	public double getValorComDesconto() {
		return valorComDesconto;
	}

	public void setPessoas(int pessoas) {
		
		this.pessoas = pessoas;
	}
	
	public String getPessoas() {	
		
		if (pessoas >= 3) { 
		    System.out.println(" Você contempla os requisitos para o desconto de 5% em cada ingresso.");
		    System.out.println(" Valor com desconto por ingresso: R$ " + getValorComDesconto());
		    
		} else {
		  System.out.println(" Valor a ser pago por ingresso: R$ " + getValor());
		}
		return " Quantidade de ingresso: " + pessoas;
	}
	public String getCodIngressoInt() {
		return  "\n Digito verificador : " +codIngressoInt;
	} */
	

