import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;


public class AppConjuntos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Frase:");
		String texto = sc.nextLine();
		Set<String> unicos = new HashSet<String>();
        Set<String> duplic = new HashSet<String>();

        // frase; 1 3 5 7 3 5 2"
        // unicos: [ 1, 3, 5, 7, 2 ]
        // dups  : [ 3, 5 ]

        for (String a: texto.split(" "))
            //if (unicos.add(a) == false)
            if ( !unicos.add(a) )   //  if (unicos.add(a) == false)
                // Se já tem, adiciona nos duplicados
                duplic.add(a);

        // Remove do original os que também estão nos duplicados
        // - operação de diferença
        unicos.removeAll(duplic);
        System.out.println("Palavras não repetidas: " + unicos);
        System.out.println("Palavras repetidas: " + duplic);


        Aeroporto a1 = new Aeroporto("POA", "Porto Alegre");
        Aeroporto a2 = new Aeroporto("GRU", "São Paulo");

        HashSet<Aeroporto> aeroportos = new HashSet<>();

        aeroportos.add(a1);
        aeroportos.add(a1);

        aeroportos.add(a2);

        aeroportos.add(a1);
        aeroportos.add(a2);

        aeroportos.add(new Aeroporto("POA", "Porto Alegres"));
        aeroportos.add(new Aeroporto("POA", "Porto Alegrex"));

        for (Aeroporto a : aeroportos) {
            System.out.println(a.hashCode()+" => "+a);
        }


	}

}
