package DioConceitoHerençaExercicio;

public final class Meia extends Ingresso{
		
	    private int codIngressoMeia = 4;

	    public Meia() {
	        super(9, "Power blu", "Dublado");
	    }

	    public int getCodIngressoMeia() {
	        return codIngressoMeia;
	    }

	    public double getValorReal() {
	        return getValor() / 2.0;
	    }

		public void setNomeDoFilme(String string) {
			return ;
			
		}

		public void setInformacao(String string) {
			return;
			
		}
	}

	
	/*
	 * praticando com os meus conceitos:
	 * 
	 * private int codIngressoMeia = 4;
	
	public String getCodIngressoMeia() {
		return "\n Digito verificador : "+codIngressoMeia ;
	}*/

	
		


