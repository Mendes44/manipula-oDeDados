package fileReader_BufferReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBufferReader {

	public static void main(String[] args) {
		/*
		 * FileReader = Stream de leitura de caracteres a partir de arquivos
		 * STREAM = UMA SEQUENCIA!
		 * 
		 * BufferedReader = Mais Rápido, implementa algumas melhorias com stack de memoria
		 */

		// Modo manual de como abrir e fechar as stream
		
		String path = "c:\\temp\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
