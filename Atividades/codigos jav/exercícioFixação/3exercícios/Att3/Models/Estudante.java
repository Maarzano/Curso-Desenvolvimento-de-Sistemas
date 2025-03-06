package Models;

public class Estudante {
    private String nome;
    private double nota1Trimestres;
    private double nota2Trimestres;
    private double nota3Trimestres;
    private EstudandoStatus Status;

    public Estudante(String nome, double nota1, double nota2, double nota3){
        this.nome = nome;
        nota1Trimestres = nota1;
        nota2Trimestres = nota2;
        nota3Trimestres = nota3;

        if (NotaTotalAno() >= 60){
            Status = EstudandoStatus.PASSOU;
        } else {
            Status = EstudandoStatus.BOMBOU;
        }
    }

    public double NotaTotalAno(){
        double resultadoFinale = nota1Trimestres + nota2Trimestres + nota3Trimestres;
        return resultadoFinale;
    }

    public double QuantoFaltaPraPassar(){
        double retornar;
        if (Status == EstudandoStatus.BOMBOU){
            retornar = Math.max(0, 60 - NotaTotalAno());
        } else {
            retornar = 0;
        }

        return retornar;
    }

    @Override
    public String toString() {
        return "Estudante: " + nome +
               "\nNota 1º Trimestre: " + nota1Trimestres +
               "\nNota 2º Trimestre: " + nota2Trimestres +
               "\nNota 3º Trimestre: " + nota3Trimestres +
               "\nNota Total: " + NotaTotalAno() +
               "\nStatus: " + Status +
               "\nFalta para Passar: " + QuantoFaltaPraPassar();
    }

}
