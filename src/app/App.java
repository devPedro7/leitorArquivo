package app;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		File file = new File("C:\\teste\\java.txt");
		/*VAI FACILITAR PARA ACESSAR E ENCAPSULAR O ARQUIVO*/ 
		Scanner leitor = null;
		/*ESTANCIANDO O SCANNER APARTIR DO FILE*/
		
		try {
			leitor = new Scanner(file); //QUER DIZER QUE O SCANNER VAI RECEBER O ARQUIVO
			while(leitor.hasNextLine()) {//VERIFICNDO SE POSSUI UMA NOVA LINHA NO ARQUIVO
				System.out.println(leitor.nextLine());//LENDO A LINHA DO ARQUIVO
			}
		}catch(IOException e) {
			System.out.println("Erro ao ler arquivo: " + e.getMessage());
		}
		finally {
			if(leitor != null) {
				leitor.close();//FECHANDO O SCANNER INDEPENDENTE SE FOI POSSIVEL A LEITURA OU NÃO
			}
		}
	}

}
