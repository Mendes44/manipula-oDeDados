package app;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		
		//Para ler o arquivo e mostrar na tela - BÁSICO
		
		//Instancia o objeto do tipo file
		File file = new File("c:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner (file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		}
		//hasNextLine = Serve para ver se tem mais linhas para ser lidas dentro do arquivo. 
		//E o sc.nextLine = serve para ler o arquivo

	}

}
