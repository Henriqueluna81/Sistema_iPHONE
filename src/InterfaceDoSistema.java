import java.util.Scanner;

import com.iPHONE.funcoes.iPHONE;

public class InterfaceDoSistema {
    public static void main(String[] args) throws Exception {

        iPHONE iphone = new iPHONE();
        Scanner scanner = new Scanner(System.in);

        String escolhaLigacao;

        System.out.println("\n 1 - Telefone \n 2 - Navegador \n 3 - Reprodutor musical");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1: {
                System.out.println(" \n 1 - Contatos \n 2 - dicar número");
                int escolhaTelefone = scanner.nextInt();
                // Funções do app telefonico
                switch (escolhaTelefone) {
                    case 1: {
                        iphone.exibirContatos();
                        System.out.println("Deseja ligar para alguém? (Sim/Não) ");
                        escolhaLigacao = scanner.next();
                        iphone.setLigacao(escolhaLigacao);
                        iphone.ligar();
                        break;
                    }
                    case 2: {
                        System.out.println("Função em andamento...");
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case 2: {
                iphone.exibirPaginas();
                break;
            }
            case 3: {
                iphone.selecionarMusica();
                break;
            }
            default:
                System.out.println("Encerrando...");
        }

        scanner.close();
    }
}
