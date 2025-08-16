package school.sptech.sprint1_nota1.ex3;

import school.sptech.sprint1_nota1.ex2.ExercicioMedioController;

public class ExercicioDificilResponse {
    private double enesimoTermo = 0.0, soma = 0.0;

    public ExercicioDificilResponse(double enesimoTermo, double soma) {
        this.enesimoTermo = enesimoTermo;
        this.soma = soma;
    }

    public ExercicioDificilResponse() {
    }

    public double getEnesimoTermo() {
        return enesimoTermo;
    }

    public void setEnesimoTermo(double enesimoTermo) {
        this.enesimoTermo = enesimoTermo;
    }

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }
}
