/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menucdteca;

/**
 *
 * @author Admin
 */
public class MenuCdteca {
    // encapsula os atributos
    private VendaCD vcd; // adicionamos essa linha para mostrar o vendaCD
    private Cdteca cdteca;
    private int opçao;
    private ConversorNumeros conversor;
    private EntradaSaidaDados io;
    
    
    public MenuCdteca() {
        // instancia os objetos
    this.vcd = new VendaCD();
    this.cdteca = new Cdteca();
    this.opçao = -1 ;
    this.conversor = new ConversorNumeros();
    this.io = new EntradaSaidaDados();
}
    public void executarCdteca() {
          do {
             // executa a classa 
            this.executarMenuPrincipal();      
            this.avaliarOpcaoEscolhida();
            // avalia a opção escolhida até que a opção seja 0 
        } while (this.opçao != 0);
    }
    private void executarMenuPrincipal() {
        // cria a interface grafica
        String mensagemMenu = "selecione uma opção"
           + "\n 1  - Cadastrar CD"
           + "\n 2  - Cadastrar Percentual de Venda do CD"   
           + "\n 3 - Consultar CD e Preço de Venda"
           + "\n 0 - Sair";
          
           
         // ,mostra as opções do menu
         String entradaDados = io.entradaDados(mensagemMenu);
         this.opçao = conversor.StringToInt (entradaDados);
        
    }
    // avalia a opção escolhida
    private void avaliarOpcaoEscolhida() {
        switch(this.opçao) {
          // dependendo do valor escolhido pelo usuario ele retorna o case 1,2,3 ou fecha o programa
            case 1 :
                String codcd = io.entradaDados("Código:");
                String titulo = io.entradaDados("Título:");
                String artista = io.entradaDados("Artista:");
                Double preco = conversor.stringToDouble(io.entradaDados("Preço:"));
                cdteca.cadastrarCD(codcd, titulo, artista, preco);
                break;
                
            case 2 :
                double percentual = conversor.stringToDouble(io.entradaDados("Percentual: "));
               cdteca.cadastrarPercentual(percentual);
                
            
                break;
            case 3:
                vcd.calcularPrecoVenda(cdteca);
                io.saidaDados(
                " \n Código:  " + cdteca.getcodcd() +
                " \n Titulo:  " + cdteca.gettitulo() +
                " \n Artista:  " + cdteca.getartista() +
                " \n Preço:  " + cdteca.getpreco() +
                " \n Valor cd: " + vcd.getvalorcd() 
                );
                break;
            case 0:
                io.saidaDados("Obrigado pela atenção");
                break;
                // default = caso o usuario não digite um numero permitido aparece a mensagem "OPÇÃO INVALIDA"
            default: 
                io.saidaDados("Opção Inválida");
                break;
                }
    }
  }

