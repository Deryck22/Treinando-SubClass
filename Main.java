package DioConceitoHerençaExercicio;

public class Main {
	
	    public static void main(String[] args) {
	        imprimirBilhete(new Meia());
	        imprimirBilhete(new Inteira());
	    }

	    public static void imprimirBilhete(Ingresso ingresso) {
	        System.out.printf("\n======= %s =======\n", ingresso.getClass().getSimpleName());

	        switch (ingresso) {
	            case Meia meia -> {
	               meia.setNomeDoFilme("La Casa de Papel");
	                meia.setInformacao("Dublado");
	                System.out.println("Código: " + meia.getCodIngressoMeia());
	                System.out.println("Filme: " + meia.getNomeDoFilme());
	                System.out.println("Valor da meia entrada: R$ " + meia.getValorReal());
	                System.out.println("Informação: " + meia.getInformacao());
	            }
	            case Inteira inteira -> {
	               // inteira.setNomeDoFilme("Fênix");
	               // inteira.setInformacao("Dublado às 19h ou Legendado às 20:45");
	                inteira.setPessoas(4);
	                System.out.println("Código: " + inteira.getCodIngressoInt());
	                System.out.println("Filme: " + inteira.getNomeDoFilme());
	                System.out.println("Valor total: R$ " + inteira.getValorReal());
	                System.out.println("Informação: " + inteira.getInformacao());
	            }
	        }
	    }
	}

	
	
	/*
	 * praticando com os meus conceitos:
	 
	public static void main(String args[]) {
	 Bilhete(new Meia());
	Bilhete(new Inteira());
	}
	
	
	
	public static void Bilhete(Ingresso ingresso) {
			
		System.out.printf("\n=======%s=======\n", ingresso.getClass().getCanonicalName());
		
		
		switch(ingresso) {
		case Meia meia ->  {
			meia.setNomeDoFilme("Lá casa de papel");
			meia.setInformacao("Dublado");
			
			System.out.println(meia.getCodIngressoMeia());
			System.out.println(meia.getNomeDoFilme());
			System.out.println(" Valor do Ingresso pela metade: R$" +meia.getValor()/ 2 );
			System.out.println(meia.getInformacao());
			
		}
		case Inteira inteira ->{
			inteira.setNomeDoFilme("Fenix");
			inteira.setInformacao("Dublado as 19h ou " + "Legendado às 20:45");
			inteira.setPessoas(1);
			
			
			System.out.println(inteira.getCodIngressoInt());
			System.out.println(inteira.getNomeDoFilme());
			System.out.println(inteira.getPessoas());
			System.out.println(inteira.getInformacao());
		}
		}
	
		System.out.printf("\n=======%s=======\n", ingresso.getClass().getCanonicalName());
		
	}
}*/
