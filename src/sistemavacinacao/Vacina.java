
package sistemavacinacao;

//import javafx.scene.chart.PieChart.Data;

public class Vacina extends Data {
    private String nome;
    private double dose;
    private String indicacao;
    private Data dataValidade;

    public Vacina() {
    }

    public Vacina(String nome, double dose, String indicacao, Data dataValidade) {
        this.nome = nome;
        this.dose = dose;
        this.indicacao = indicacao;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDose() {
        return dose;
    }

    public void setDose(double dose) {
        this.dose = dose;
    }

    public String getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }
    
    
}
