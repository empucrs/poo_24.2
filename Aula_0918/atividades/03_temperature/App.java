import java.util.Scanner;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcao;
        double valor;

        while (true) {
            System.out.println("Escolha o tipo de conversão: ");
            System.out.println("  (0) De Fahrenheit to Celsius ");
            System.out.println("  (1) De Celsius to Fahrenheit ");
            System.out.print("Escolha: ");
            opcao=sc.nextLine().toUpperCase().charAt(0);
            if((opcao!='0') &&(opcao !='1'))
                throw new IllegalArgumentException("Opcao escolhida é invalida");

            System.out.print("Informe o valor a ser convertido: ");
            valor = Double.parseDouble(sc.nextLine());

            try{
                if(opcao=='0')
                    System.out.println("Temperatura "+valor+"ºF equivale a "+Util.toCelsius(valor)+"ºC");
                else
                    System.out.println("Temperatura "+valor+"ºC equivale a "+Util.toFahrenheit(valor)+"ºF");
            }
            catch(Exception e){
                e.printStackTrace();
            }
            

            
        }
    }
}