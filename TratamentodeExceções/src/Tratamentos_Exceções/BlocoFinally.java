package Tratamentos_Exceções;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BlocoFinally {

	public static void main(String[] args) {
		File file = new File("C:\\temp\\in.txt");		//entrou no diretorio do arquivo e imprimiu o que estava escrito
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} finally {		//fecha os scanner e os arquivos, mesmo dando certo ou não 	
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finally block executed");
		}
	}

}
