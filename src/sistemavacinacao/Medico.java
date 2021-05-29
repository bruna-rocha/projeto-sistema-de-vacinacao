
package sistemavacinacao;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import telas.TelaLogin;
import telas.TelaMedico;

public class Medico extends Pessoa implements Login{
    private int CRM;
    private String especialidade;
    private boolean residente;

    public Medico() {
    }

    public Medico(int CRM, String especialidade, boolean residente) {
        this.CRM = CRM;
        this.especialidade = especialidade;
        this.residente = residente;
    }

    public int getCRM() {
        return CRM;
    }

    public void setCRM(int CRM) {
        this.CRM = CRM;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public boolean isResidente() {
        return residente;
    }

    public void setResidente(boolean residente) {
        this.residente = residente;
    }
    
    public String prescrevervacinas(String Vacina[]){
        Medico m = new Medico();
        String v[] = new String[Vacina.length];

        return v[0];
    }

    //@Override
    public void fazerLogin(String usuario, String senha) {
        Vacina objVacina = new Vacina();
        if(usuario.equalsIgnoreCase("2378") && senha.equals("m2378")){
            JOptionPane.showMessageDialog(null, "Login realizado com sucesso!" , "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                 
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "O que deseja fazer? \n 1 - Prescrever vacina \n 2 - Sair" , "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE));
            
            if (opcao == 1){
                objVacina.setNome(JOptionPane.showInputDialog(null, "Doutor(a), prescreva a vacina: " , "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE));
                JOptionPane.showMessageDialog(null, "Prescrição realizada com sucesso! \n Nome da vacina: " + objVacina.getNome(), "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
            }else if (opcao == 2){
                JOptionPane.showMessageDialog(null, "Até outra hora, doutor(a)!" , "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Número inválido!" , "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                fazerLogin(usuario, senha);
            }
        }else{
            JOptionPane.showMessageDialog(null, " Usuário ou Senha inválidos, tente novamente" , "Sistema de Vacina", JOptionPane.ERROR_MESSAGE);
        }
    }
}
