/*
EXEMPLO02a -> Código elaborados sem o uso de bloco try/catch onde uma exceção ocorre
*/
public class Main{
  public static void main (String args[]) {

      int vet[] = new int[10];

      for(int i=0; i<10; i++)
        vet[i]=i;

	System.out.println("Primeiro comando ANTES o laço");

	for(int i=0; i<20; i++){
	  System.out.print("Posição "+i+": ");
	  System.out.println(vet[i]);        
	}

	System.out.println("Primeiro comando DEPOIS do laço");

  }
}