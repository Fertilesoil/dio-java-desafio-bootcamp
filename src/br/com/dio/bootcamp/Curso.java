package br.com.dio.bootcamp;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        if (this.cargaHoraria <= 4) {
            return XP_INICIAL * 4;
        } else if (this.cargaHoraria >= 8 && this.cargaHoraria <= 10) {
            return (XP_INICIAL * 4) + 40d;
        }
        return (XP_INICIAL * this.cargaHoraria) + 20d;
    }

    @Override
    public String toString() {
        return "Curso: {" + "titulo: " + getTitulo() + ", descricao: " + getDescricao() + ", cargaHoraria: "
                + this.cargaHoraria + '}';
    }
}
