
package sistemavacinacao;

import javax.swing.JOptionPane;

public class Enfermeira extends Pessoa implements Login {
    private int coren;

    public Enfermeira() {
    }

    public Enfermeira(int coren) {
        this.coren = coren;
    }

    public int getCoren() {
        return coren;
    }

    public void setCoren(int coren) {
        this.coren = coren;
    }
    public void aplicarVacinas(String Vacina[]){
        
    }
    
    @Override
    public void fazerLogin(String usuario, String senha) {
        if(usuario.equalsIgnoreCase("2588") && senha.equals("e2588")){
            JOptionPane.showMessageDialog(null, "Login realizado com sucesso!" , "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                   
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "O que deseja fazer? \n 1 - Aplicar vacina \n 2 - Sair" , "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE));
                if (opcao == 1){
                    String aplicarVacina = JOptionPane.showInputDialog(null, "Enfermeiro(a), " , "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
            }else if (opcao == 2){
                JOptionPane.showMessageDialog(null, "Até outra hora, enfermeiro(a)!" , "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Número inválido!" , "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                fazerLogin(usuario, senha);
            }

        }else{
                JOptionPane.showMessageDialog(null, " Usuário ou Senha inválidos, tente novamente" , "Sistema de Vacina", JOptionPane.ERROR_MESSAGE);
        }
        }
}
    
