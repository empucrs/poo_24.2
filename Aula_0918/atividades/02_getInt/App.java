import java.util.Scanner;

/**
 * App
 */
public class App {

    // getInt
    //  => pedir um valor ao usuário
    //  => conferir se é um inteiro
    //    => se sim, retorna o valor inteiro
    //    => se não, lança a exceção IllegalArgumentException
    public static int getInt(){
        System.out.print("Informe um valor inteiro: ");

        Scanner sc = new Scanner(System.in);
        String valor = sc.nextLine();

        for(int i=0; i<valor.length(); i++)
            if(!((valor.charAt(i)>='0') && (valor.charAt(i)<='9')))
                throw new IllegalArgumentException("O valor informado não é um inteiro: "+valor);
        
        return Integer.parseInt(valor);

    }

    public static int getInt2(){ 
        System.out.print("Informe um valor inteiro: ");

        Scanner sc = new Scanner(System.in);
        try {
            Integer valor = sc.nextInt();                
            return valor;
        } catch (Exception e) {
            System.out.println("Houve um erro no valor informado");
            throw new IllegalArgumentException("Valor não é inteiro");
        }        

    }


    public static void main(String[] args) {

        System.out.println("O valor capturado foi "+ getInt2());
        
    }

    
}