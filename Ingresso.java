package DioConceitoHerençaExercicio;

public sealed abstract class Ingresso permits Inteira, Meia {
	
	// Codigo melhorado
	
	    private String nomeDoFilme;
	    private int valor;
	    private String informacao;

	    public Ingresso(int valor, String nomeDoFilme, String informacao) {
	        this.valor = valor;
	        this.nomeDoFilme = nomeDoFilme;
	        this.informacao = informacao;
	    }

	    public int getValor() {
	        return valor;
	    }

	    public String getNomeDoFilme() {
	        return nomeDoFilme;
	    }

	    public String getInformacao() {
	        return informacao;
	    }
	}

	
