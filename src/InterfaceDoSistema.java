import java.util.Scanner;

import com.iPHONE.funcoes.iPHONE;

public class InterfaceDoSistema {
    public static void main(String[] args) throws Exception {

        iPHONE iphone = new iPHONE();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opção: \n 1- Telefone \n 2- Navegador \n 3- Reprodutor musical");
        int escolha = scanner.nextInt();


        switch (escolha) {
            case 1:{
                iphone.ligar();
                break;
            }
            case 2:{
                iphone.exibirPaginas();
                break;
            }
            case 3:{
                iphone.selecionarMusica();
                break;
            }
            default:
                System.out.println("Encerrando...");
            }
    }
}
