package fileReader_BufferReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BlocoTryWithResoucers {

	public static void main(String[] args) {
		/*
		 * Opção melhor para se trabalhar com Streams.
		 * 
		 * Esse e um bloco try que declara um ou mais recursos, e garante que esses recursos serão fechados
		 * ao final do bloco
		 * 
		 * Esta disponivel a partir do JAVA 7 em diante.
		 */

		String path = "c:\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
	}

}
