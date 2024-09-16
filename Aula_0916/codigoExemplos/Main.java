/*
EXEMPLO04 -> Há ocorrencia de exceção: 
  comandos anteriores ao try são executado
  Bloco try é executado até o momento em que uma exceção ocorra. O bloco para de ser executado no momento em que o erro ocorre. Como resultado, o último comando do bloco não é executado.
  Bloco catch é definido com várias exceções possíveis. A exceção mais adequada é achada e executada.
  Bloco finally é completamente executado
  Comando após o finally é executado
  Como resultado, o programa não é abortado, sendo executado até o final.
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
      catch(NullPointerException e){
        System.out.println("Uma exceção foi lançada - 1");
        System.out.println(e.getMessage());        
        System.out.println(e);        
      }
      catch(RuntimeException e){
        System.out.println("Uma exceção foi lançada - 3");
        System.out.println(e.getMessage());        
        System.out.println(e);        
      }      
      catch(Exception e){
        System.out.println("Uma exceção foi lançada - 2");
        System.out.println(e.getMessage());        
        System.out.println(e);        
      }      

      finally{
        System.out.println("O bloco finally foi acesssado");
      }

      System.out.println("Primeiro comando após o bloco de try/catch");



  }
}