/*
EXEMPLO03 -> Há ocorrencia de exceção, mas o catch tem uma sinalização de exceção errada a ser capturada: 
  comandos anteriores ao try são executado
  Bloco try é executado até o momento em que uma exceção ocorra. O bloco para de ser executado no momento em que o erro ocorre. Como resultado, o último comando do bloco não é executado.
  Bloco catch é buscado, mas não encontra a exceção adequada. O resultado é equivalente a não ter um bloco try/catch.
  Bloco finally é completamente executado
  Comando após o finally não é executado
  Como resultado, o programa É abortado.
*/
public class Main{
  public static void main (String args[]) {

      int vet[] = new int[10];

      for(int i=0; i<10; i++)
        vet[i]=i;

      try{

        System.out.println("Primeiro comando no try ANTES o laço");

        for(int i=0; i<20; i++){
          System.out.print("Posição "+i+": ");
          System.out.println(vet[i]);        
        }

        System.out.println("Primeiro comando no try após o laço");

      }
      catch(NumberFormatException e){
        System.out.println("Uma exceção foi lançada - 1");
        System.out.println(e.getMessage());        
        System.out.println(e);        
      }
      finally{
        System.out.println("O bloco finally foi acesssado");
      }

      System.out.println("Primeiro comando após o bloco de try/catch");



  }
}