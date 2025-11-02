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

	
	
