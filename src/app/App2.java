package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App2 {

	public static void main(String[] args) {

		//INSTANCIANDO O FileReader - STREAM DE LEITURA DE CARACTERE A PARTIR DE ARQUIVOS
		//INSTANCIANDO O BufferedReader - LEITOR DE ARQUIVOS MAIS RÁPIDO UTILIZANDO O BUFFER DE MEMÓRIA
		
		//ESTA TAMBÉM É UMA FORMA DE LEITURA DE ARQUIVO ASSIM COMO NA AULA ANTERIOR (ESTA É MAIS ROBUSTA)
		
		String caminho = "C:\\teste\\java.txt";
		
		//IMPLEMENTACAO MAIS BASICA 
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader(caminho);
			br = new BufferedReader(fr);
			
			String linha = br.readLine();//VAI LER UMA LINHA DO ARQUIVO, SE TIVER NO FINAL E NÃO TIVER NADA, ELE RETORNA null
			
			while(linha != null){
				System.out.println("Lendo arquivo: " + linha);
				linha = br.readLine();
			}
			
			
		} catch (IOException e) {
			System.out.println("Erro ao ler arquivo: " + e.getMessage());
		}
		finally{
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
