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

	
	
