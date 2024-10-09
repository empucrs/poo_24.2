import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Questao03 {

	public static void main(String[] args) {

		System.out.println("Iniciando a abertura do aquivo "+args[0]);

		Map<String, Integer> listaDePalavras = new HashMap<>();

		Path path1 = Paths.get(args[0]);
		try (BufferedReader reader = Files.newBufferedReader(path1, Charset.forName("utf8"))) {
			String line = null;			
			line=reader.readLine();
			
			while(line!=null){
				Integer contagem = listaDePalavras.get(line);
				//if(contagem== null) contagem=1;
				//else contagem=contagem+1;
				contagem=(contagem==null)?1:contagem+1;
				//System.out.println("Chave: "+ line +"; valor: "+contagem);
				listaDePalavras.put(line, contagem);
				line=reader.readLine();
			}

			Object [] keys = listaDePalavras.keySet().toArray();
			Arrays.sort(keys);

			for(Object p : keys)
				System.out.println("A chave "+(String)p+" ocorreu "+listaDePalavras.get((String)p)+" vezes");

			

		}
		catch (IOException x) {
			System.err.format("Erro de E/S: %s%n", x);
		}

		System.out.println("Finalizando a manipula do arquivo "+args[0]);

	}
}
