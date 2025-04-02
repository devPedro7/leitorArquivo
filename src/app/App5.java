package app;

import java.io.File;
import java.util.Scanner;

public class App5 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
		
		//LENDO O CAMINHO INFORMADO PELO USUÁRIO
		System.out.println("Insira um caminho de pasta: ");
		String strCaminho = leitor.nextLine();
		
		//INSTANCIANDO CAMINHO
		File caminho = new File(strCaminho);
		
		//CAPTURANDO AS PASTAS DENTRO DO CAMINHO INFORMADO - DEVEMOS ARMAZENAR EM UMA LISTA
		//INSTANCIAMOS UM VETOR DE PASTAS, E DENTRO DA FUNÇÃO PASSAMOS UMA EXPRESSÃO LAMBDA COMO ARGUMENTO DA FUNÇÃO
		//ELA LISTA APENAS O QUE É DIRETÓRIO
		File[] pastas = caminho.listFiles(File::isDirectory);
		
		//IMPRIMINDO NA TELA AS PASTAS
		System.out.println("PASTAS:");
		for(File pasta : pastas) {
			System.out.println(pasta);
		}
		
		//CRIANDO LISTA PARA ARQUIVOS
		File[] arquivos = caminho.listFiles(File::isFile);
		
		//IMPRIMINDO NA TELA OS ARQUIVOS
		for(File arquivo : arquivos) {
			System.out.println(arquivo);
		}
		
		/*BÔNUS - CRIAÇÃO DE UMA SUBPASTA, A PARTIR DA PASTA ORIGINAL*/
		//SE ELE CONSEGUIR CRIAR, ELE RETORNA TRUE.
		boolean sucesso = new File(strCaminho + "\\pastaCriadaNova").mkdir();
		
		//TESTANDO SE FUNCIONOU
		System.out.println("Pasta criada com sucesso: " + sucesso);
		
		leitor.close();
		
	}

}
