package manipulandoPastasComFile;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastas {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com o caminho da pasta: ");
		String strPath = sc.nextLine();
		
		File path = new File (strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("PASTAS: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		// Para ler arquivos
		File[] files = path.listFiles(File::isFile);
		System.out.println("ARQUIVOS: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		// Criação de pastas 
		
		boolean sucesso = new File(strPath + "\\pastaSubdiaria").mkdir();
		System.out.println("Diretorio creado com sucesso: " + sucesso);
		
		sc.close();
	}
	
}
