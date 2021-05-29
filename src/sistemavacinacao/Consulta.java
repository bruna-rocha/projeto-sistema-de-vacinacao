package sistemavacinacao;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Consulta{
    private Medico medico;
    private Enfermeira enfermeira;
    private Paciente paciente;
    private ArrayList vacina;
    private Data data;
    
    public Consulta() {
        
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Enfermeira getEnfermeira() {
        return enfermeira;
    }

    public void setEnfermeira(Enfermeira enfermeira) {
        this.enfermeira = enfermeira;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public ArrayList getVacina() {
        return vacina;
    }

    public void setVacina(ArrayList vacina) {
        this.vacina = vacina;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
    
    public static void main(String[] args) {
        Enfermeira objEnfermeira = new Enfermeira();
        Medico objMedico = new Medico();
        Paciente objPaciente = new Paciente();
        Vacina objVacina = new Vacina();
        
        
        objPaciente.setIdade(5);
       
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null," Digite a opção que deseja: \n1 -  médico\n2 - enfermeira \n3 - paciente \n ", "Sistema de Vacina", JOptionPane.QUESTION_MESSAGE));
        
        String usuario, senha;
        switch (opcao){
            case 1:
                    JOptionPane.showMessageDialog(null, "Bem-vindo(a) Doutor(a)! \n Faça login para continuar.", "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                    usuario = JOptionPane.showInputDialog(null," Digite o seu usuário", "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                    senha   = JOptionPane.showInputDialog(null," Digite a sua senha", "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                    
                    objMedico.fazerLogin(usuario, senha);
                    
                    break;
             case 2:
                    JOptionPane.showMessageDialog(null, "Bem-vindo(a) Enfermeiro(a)! \n Faça login para continuar.", "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                    usuario = JOptionPane.showInputDialog(null," Digite o seu usuário", "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                    senha   = JOptionPane.showInputDialog(null," Digite a sua senha", "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                    
                    objEnfermeira.fazerLogin(usuario, senha);
                    
                    break;
             case 3:
                    JOptionPane.showMessageDialog(null, "Bem-vindo(a) Paciente! \n Faça login para continuar.", "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                    usuario = JOptionPane.showInputDialog(null," Digite o seu usuário", "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                    senha   = JOptionPane.showInputDialog(null," Digite a sua senha", "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                    
                    objPaciente.fazerLogin(usuario, senha);
                    
                    break;
            default:
                    JOptionPane.showInputDialog(null, "Opção inválida! \n Faça login para continuar.", "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
        }
      
        //if (objVacina.getNome().equals("vacina sarampo")){
            JOptionPane.showMessageDialog(null, "vacina: " + objVacina.getNome() , "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
            /*
            if (objPaciente.getIdade() >= 0 && objPaciente.getIdade() < 3){
                objVacina.setDose(0.40);
            }
            if (objPaciente.getIdade() >= 3 && objPaciente.getIdade() < 10){
                objVacina.setDose(0.60);
            }
            if (objPaciente.getIdade() >= 10 && objPaciente.getIdade() < 19){
                objVacina.setDose(0.80);
            }else{
                objVacina.setDose(1.0);
            }*/
        }
        //JOptionPane.showMessageDialog(null, "A vacina a ser tomada é a "+ objVacina.getNome() + " e a dose é de " + objVacina.getDose(), "Vacina", JOptionPane.INFORMATION_MESSAGE);
    }
    

 //objMedico.getNomeVacina().equalsIgnoreCase("vacina h1n1") || objMedico.getNomeVacina().equalsIgnoreCase("vacina meningite") || objMedico.getNomeVacina().equalsIgnoreCase("vacina malária") || objMedico.getNomeVacina().equalsIgnoreCase("vacina covid19")