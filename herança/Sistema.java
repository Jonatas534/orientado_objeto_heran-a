package dome.heran�a;

import java.util.Scanner;

public class Sistema {
	private BaseDados dados;
	private Scanner teclado;

	public Sistema() {
		dados = new BaseDados();
		teclado = new Scanner(System.in);

	}

	public static void main(String[] args) {
		Sistema sis = new Sistema();
		sis.exibeMenu();

	}

	private void exibeMenu() { // menu principal
		int opcao = 0;
		do {
			System.out.println("\n\n - Sistema de Multimidias ");
			System.out.println("\n   =========================");
			System.out.println("  1 - Cadastrar Multimidias|");
			System.out.println("  2 - Listar Multimidias ");
			System.out.println("  0 - Sair          |");
			System.out.println("   =========================\n");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				cadastrarMultimidias();
				break;
			case 2:
				listar();
				break;

			case 0:
				break;
			default:
				System.out.println("Op��o Inv�lida!");
				break;
			}
		} while (opcao != 0);
	}

	public void listar() {

		dados.listar();


		}
	

	private void cadastrarMultimidias() {
		teclado.nextLine();
		System.out.println("Informe o tipo de Midia:");
		String tipo = teclado.nextLine();

	

		if (tipo.equals("cd")) {

			teclado.nextLine();
			System.out.println("Informe o nome do Artista:");
			String artista = teclado.nextLine();
			
			System.out.println("Informe o coment�rio sobre o cd ");
			String comentario = teclado.nextLine();
			
			System.out.println(" A midia est� emprestada? sim/n�o");
			String estaEmprestado = teclado.nextLine();

			System.out.println("Informe o t�tulo do Cd:");
			String titulo = teclado.nextLine();

			System.out.println("Informe o numero de m�sicas do Cd:");
			int nroMusicas = teclado.nextInt();
			
			
			System.out.println("Informe o tempo de Dura��o da midia:");
			double tempoDuracao = teclado.nextDouble();
			
			Cd cd = new Cd(comentario,  estaEmprestado.equals("sim") ? true : false, 
					tempoDuracao,titulo,artista,nroMusicas);
			dados.inserir(cd);
		}

		if (tipo.equals("video")) {

			teclado.nextLine();

			System.out.println("Informe o coment�rio sobre o video ");
			String comentario = teclado.nextLine();
			
			System.out.println("Informe o diretor do video:");
			String diretor = teclado.nextLine();
			
			System.out.println(" O video  est� emprestado? sim/n�o");
			String estaEmprestado = teclado.nextLine();
			
			System.out.println("Informe o tempo de Dura��o da midia:");
			double tempoDura��o = teclado.nextDouble();
			
			Video video = new Video(comentario, diretor, estaEmprestado.equals("sim") ? true : false, tempoDura��o,diretor);
			dados.inserir(video);

		}

		if (tipo.equals("dvd")) {
			
			
			teclado.nextLine();
			
			System.out.println("Informe o coment�rio sobre o dvd ");
			String comentario = teclado.nextLine();
			
			System.out.println(" O Dvd  est� emprestado? sim/n�o");
			String estaEmprestado = teclado.nextLine();
			
			System.out.println("Informe o tempo de Dura��o da midia:");
			double tempoDura��o = teclado.nextDouble();
			
			teclado.nextLine();
			System.out.println("Informe o tipo de dvd:(DVD-RAW, DVD-ROW,DVD-R...");
			String tiposDvd = teclado.nextLine();
			
			
			Dvd dvd = new Dvd(comentario, estaEmprestado.equals("sim") ? true : false, tempoDura��o, tiposDvd);
			dados.inserir(dvd);

		}

	}

}
