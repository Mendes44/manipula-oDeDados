package fileWriterBufferWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterBufferedWriter {

	public static void main(String[] args) {
		/*
		 * FileWriter (Stream de escrita de caracteres em arquivos)
		 * 
		 * Cria/recria o arquivo: new FileWriter(path)
		 * Acrescenta ao arquivo existente: new FileWriter(path, true)
		 * 
		 * BufferedWriter = mais rápido. trata os dados no buffer.
		 */
		
		String[] lines = new String[] {"Boa Noite", "Boa Tarde", "Boa Noite"};
		String path = "c:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
