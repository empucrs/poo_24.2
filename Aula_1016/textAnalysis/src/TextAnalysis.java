import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TextAnalysis {

	private Map<String, ArrayList<String>> dicionario;
	
	public TextAnalysis(String[] files) {
		dicionario = new HashMap<>();

		for (String fname : files ) {
			dicionario.put(fname, new ArrayList<String>());
			this.carregaDados(fname);
		}
	}
	
	public void listarArquivos(String palavra) {		
		System.out.println(" A palavra "+ palavra);
		for(String fileName: dicionario.keySet()){
			if(dicionario.get(fileName).contains(palavra.toLowerCase().replaceAll("[^a-zA-Záéíóúçãõàâôê-]"," ")))
				System.out.println(fileName);
		}
		System.out.println();
	}
	
	public void listarArquivos(String[] palavras) {
		System.out.println("A ser implementado");		
	}
	
	public void listarPalavras(String fileName) {
		System.out.println("A ser implementado");		
	}
	
	public void listarPalavrasComuns(String f1, String f2) {
		System.out.println("A ser implementado");		
	}

	private void carregaDados(String fileName) {
		Path path1 = Paths.get(fileName);
		System.out.println("\nArquivo: "+fileName);

		try (BufferedReader reader = Files.newBufferedReader(path1, Charset.forName("utf8"))) {
			String line;
			ArrayList<String> aux = new ArrayList<String>();

			while ((line = reader.readLine()) != null) {
				line = line.toLowerCase().replaceAll("[^a-zA-Záéíóúçãõàâôê-]"," ");
				String [] palavras = line.split(" ");
				for(String palavra: palavras)
					aux.add(palavra);
				// aqui vc tem de fazer...
				//System.out.println(line);
			}
			dicionario.put(fileName, aux);

			System.out.println("-=-=-"+fileName+"-=-=-");
			aux = dicionario.get(fileName);
			for(String str: aux)
				System.out.print(str+", ");
			System.out.println("\n\n");

		} catch (IOException e) {
			System.out.println("Erro na leitura: "+e.getMessage());
		}
	}
}

