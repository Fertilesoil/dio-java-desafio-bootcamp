package br.com.dio.bootcamp;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private final String nome;
    private final Set<Conteudo> inscricoes = new LinkedHashSet<>();
    private final Set<Conteudo> concluidos = new LinkedHashSet<>();

    public Dev(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void inscreverBotcamp(Bootcamp bootcamp) {
        this.inscricoes.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.inscricoes.stream().findFirst();

        if (conteudo.isPresent()) {
            this.concluidos.add(conteudo.get());
            this.inscricoes.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo.");
        }
    }

    public double calcularTotalXp() {
        return this.concluidos.stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(inscricoes, dev.inscricoes)
                && Objects.equals(concluidos, dev.concluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, inscricoes, concluidos);
    }

    @Override
    public String toString() {
        return "Dev: {" + "nome: " + nome + ", inscricoes: " + inscricoes + ", concluidos: " + concluidos + '}';
    }
}
