package com.iPHONE.funcoes;

import com.iPHONE.funcoes.model.Navegador;
import com.iPHONE.funcoes.model.ReprodutorMusical;
import com.iPHONE.funcoes.model.Telefone;

public class iPHONE implements Telefone, ReprodutorMusical, Navegador {

    String[] contatos = {"Ana", "Bruno", "Carlos", "Humberto", "Magda", "Luiz", "Chefe"};
    private String ligacao;


    public String getLigacao() {
        return ligacao;
    }

    public void setLigacao(String ligacao) {
        this.ligacao = ligacao;
    }

    //Métodos de Telefone
    @Override
    public void ligar() {
        System.out.println("Sua escolha foi: "+ getLigacao());
    }

    @Override
    public void atender() {

    }

    @Override
    public void iniciarCorreioVoz() {

    }

    @Override
    public void exibirContatos() {

        for(String contato : contatos ){
            System.out.println(contato);
        }

    }

    @Override
    public void encerrarChamada() {

    }

    //Métodos de ReprodutorMusical
    @Override
    public void tocar() {
   
    }

    @Override
    public void pausar() {

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecione uma música:");
    }

    //Métodos de Navegador
    @Override
    public void exibirPaginas() {
        System.out.println("Abrindo Safira...");
    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void atualizarPagina() {

    }

}
