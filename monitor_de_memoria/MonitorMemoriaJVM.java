public class MonitorMemoriaJVM {
	
	public static void main(String[]args) {
		
		Runtime rt = Runtime.getRuntime();
		/* A classe Runtime representa o ambiente de execução da JVM. */
		System.out.println("Memória alocada para JVM: "+ rt.totalMemory()+ " Byte");
		/* getRuntime() retorna a instância única da classe Runtime */
		
		rt.gc(); /*gc() solicita que a JVM execute o Garbage Collecto */
		
		
		//gc() solicita que a JVM execute o Garbage Collector
		System.out.println("Memória alocada para a JVM após executar a GC: " + rt.totalMemory() +" Byte ");
		
		double m1 , m2; 
		
		m1 = rt.freeMemory();
		//freeMemory() retorna a quantidade de memória livre
		System.out.println("Memória disponível para criação dos objetos "+ rt.freeMemory()+ " Byte ");
		//O vetor precisa ser preenchido para evitar otimizações da JVM.
		double[]vetor = new double[100000];
		
		for(int i = 0; i<vetor.length ; i++) {
			
			vetor[i] = i * 1.0;
			
			m2 = rt.freeMemory();
			System.out.println("Memória disponível depois da criação dos objetos "+ rt.freeMemory()+ " Byte");
			
			System.out.println("Memória utilizada : "+ (m1 - m2 )+ " bytes");
			
			rt.gc();
			
			System.out.println("Memória depois de executar o Garbage Colector "+ rt.freeMemory() + " byte");
		}
		
	
	}

}