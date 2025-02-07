package br.com.dio.bootcamp;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_INICIAL + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria: {" + "titulo: " + getTitulo() + ", descricao: " + getDescricao() + ", data: " + this.data + '}';

    }
}
