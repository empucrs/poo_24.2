import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class App {

	 public static void main(String[]  args) {
		
		 String[] files = new String[]{ "texto01.txt","texto02.txt", "texto03.txt",
				 "texto04.txt", "texto05.txt","texto06.txt", "texto07.txt",
				 "texto08.txt", "texto09.txt","texto10.txt" };

		 TextAnalysis dicionario = new TextAnalysis(files);
		 
		 // listarArquivos(String) ficou obsoleto após implementar
		 //                        método abaixo
		 dicionario.listarArquivos("Arquimedes");
		 dicionario.listarArquivos("Beatles");
		 dicionario.listarArquivos("física");
		 dicionario.listarArquivos("nome");
		 
		 dicionario.listarArquivos(new String[]{"matemática"});
		 dicionario.listarArquivos(new String[]{"Arquimedes"});
	
		 dicionario.listarArquivos(new String[]{"Arquimedes", "matemática"});
		 dicionario.listarArquivos(new String[]{"Arquimedes", "física", "nome"});
		 
		 dicionario.listarPalavras("texto04.txt");
		 
		 dicionario.listarPalavrasComuns("texto01.txt", "texto04.txt");
		 dicionario.listarPalavrasComuns("texto04.txt", "texto05.txt");
		}

	
}
