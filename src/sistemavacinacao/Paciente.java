
package sistemavacinacao;

import javax.swing.JOptionPane;

public class Paciente extends Pessoa implements Login{
    private String cartaoDeAgendamento;
    private int cartaoDoSus;

    public Paciente() {
    }

    public Paciente(String cartaoDeAgendamento, int cartaoDoSus) {
        this.cartaoDeAgendamento = cartaoDeAgendamento;
        this.cartaoDoSus = cartaoDoSus;
    }

    public String getCartaoDeAgendamento() {
        return cartaoDeAgendamento;
    }

    public void setCartaoDeAgendamento(String cartaoDeAgendamento) {
        this.cartaoDeAgendamento = cartaoDeAgendamento;
    }

    public int getCartaoDoSus() {
        return cartaoDoSus;
    }

    public void setCartaoDoSus(int cartaoDoSus) {
        this.cartaoDoSus = cartaoDoSus;
    }
    
    public void agendaConsulta(){
        
    }

    @Override
    public void fazerLogin(String usuario, String senha) {
        if(usuario.equalsIgnoreCase("1234") && senha.equals("p1234")){
            JOptionPane.showMessageDialog(null, "Login realizado com sucesso!" , "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                   
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "O que deseja fazer? \n 1 - Agendar consulta \n 2 - Tomar vacina \n 3 - Sair" , "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE));
            if (opcao == 1){
                String agendarConsulta = JOptionPane.showInputDialog(null, "Paciente, por gentileza nos informe a data da consulta, por exemplo: 05/05/2021 às 10h00 " , "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Agendamento realizado com sucesso! \n"+ agendarConsulta , "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
            }else if (opcao == 3){
                JOptionPane.showMessageDialog(null, "Volte sempre!" , "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Número inválido!" , "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                fazerLogin(usuario, senha);
            }

        }else{
                JOptionPane.showMessageDialog(null, " Usuário ou Senha inválidos, tente novamente" , "Sistema de Vacina", JOptionPane.ERROR_MESSAGE);
        }
    }
}
