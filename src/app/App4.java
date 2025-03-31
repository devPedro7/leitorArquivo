package app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App4 {

	public static void main(String[] args) {

		//FileWriter - STREAM DE ESCRITA DE CARACTERES EM ARQUIVOS
		
		/* FORMAS DE INSTANCIAR O FILEWRITER:
		 
		CRIA/RECRIA O ARQUIVO: new FileWriter(caminho) - SE FOR INSTANCIADO ASSIM, E O ARQUIVO NÃO EXISTIR, ELE CRIA, SE ELE NÃO EXISTIR ELE VAI SER RECRIADO
		
		ACRESCENTA AO ARQUIVO EXISTENTE: new FileWriter(caminho, true) - DESTA FORMA ELE ACRESCENTA AO ARQUIVO EXISTENTE, ELE VAI SER ABERTO E TUDO O QUE FOR 
		ESCRITO, VAI SER ADICIOANDO AO FINAL DO ARQUIVO.
		
		*/
		
		//BufferedWriter - MAIS RAPIDO PARA ESCREVER
		
		String[] linhas = new String [] {"Bom dia", "Boa tarde", "Boa noite"};
		
		//CRIANDO STRING PARA O CAMINHO DO ARQUIVO
		String caminho = "C:\\teste\\writer.txt";
		
		try(BufferedWriter bf = new BufferedWriter(new FileWriter(caminho))){
			
			
			for(String linha : linhas) {
				bf.write(linha);
				bf.newLine();// POR PADRÃO ELE NÃO TEM QUEBRA DE LINHA, E PARA ISSO CHAMAMOS ESSA FUNÇÃO
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
