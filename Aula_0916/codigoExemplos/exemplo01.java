/*
EXEMPLO01 -> não há ocorrencia de exceção: 
  comandos anteriores ao try são executado
  Bloco try é completamente executado
  Bloco catch não é executado
  Bloco finally é completamente executado
  Comando após o finally é executado
*/
public class Main{
  public static void main (String args[]) {

      int vet[] = new int[10];

      for(int i=0; i<10; i++)
        vet[i]=i;

      try{

        System.out.println("Primeiro comando no try ANTES o laço");

        for(int i=0; i<10; i++){
          System.out.print("Posição "+i+": ");
          System.out.println(vet[i]);        
        }

        System.out.println("Primeiro comando no try após o laço");

      }
      catch(Exception e){
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