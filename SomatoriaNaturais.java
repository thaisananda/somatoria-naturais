package controller;

public class SomatoriaNaturais {

	public SomatoriaNaturais () {
		super ();
	}
	
	public int somatoria(int N) {
	/* 
	 * Condição de parada
	 * Se o N for menor ou igual a 0, retornaremos 0
	 */
		
		if (N <= 0){
		  return 0;	
		  /* 
			 * Relação de chamada dos passos:
			 * A função soma N com a somatória dos números anteriores, quando o N atinge a condição de parada (0),
			 * retorna-se o valor 0.
		 */  
		  
	} else {
		return N + somatoria(N - 1); //Chamada da função
	}
 }

}

