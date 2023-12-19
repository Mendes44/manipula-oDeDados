package manipulandoPastasComFile;

import java.io.File;
import java.util.Scanner;

public class InfoCaminho {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// INFORMAÇÕES DO CAMINHO DO ARQUIVO
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName()); // Serve para pegar somente o nome do arquivo
		System.out.println("getParent: " + path.getParent()); // Pega o caminho
		System.out.println("getPath: " + path.getPath()); // Pega todo o caminho + arquivo
		
		sc.close();

	}

}
