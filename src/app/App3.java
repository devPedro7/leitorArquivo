package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App3 {

	public static void main(String[] args) {

		// BLOCO TRY-WITH-RESOURCES - MUITO MELHOR PRA MEXER COM STREAMS DO QUE ABRIR E
		// FECHAR MANUALMENTE ELAS.
		// DECLARA UM OU MAIS RECURSOS E GARANTE QUE ESSES RECURSOS SEJAM FECHADOS AO
		// FINAL DO BLOCO
		// SERÁ O MESMO CÓDIGO DO APP2 PORÉM DE UMA FORMA MAIS ROBUSTA E MELHOR

		String caminho = "C:\\teste\\java.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(caminho))){


			String linha = br.readLine();// VAI LER UMA LINHA DO ARQUIVO, SE TIVER NO FINAL E NÃO TIVER NADA, ELE
											// RETORNA null

			while (linha != null) {
				System.out.println("Lendo arquivo: " + linha);
				linha = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Erro ao ler arquivo: " + e.getMessage());
		}
	}
}
