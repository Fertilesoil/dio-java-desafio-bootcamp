import br.com.dio.bootcamp.*;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Bootcamp boot = new Bootcamp("Aprenda Java", "Bootcamp maneiro onde se aprende muito");

        Curso curso1 = new Curso("Java para iniciante", "Curso java para iniciantes", 15);
        Curso curso2 = new Curso("Java intermediário", "Curso java intermediário", 7);
        Mentoria mentoria1 = new Mentoria("Entendendo Java", "Aprofundando seus conhecimentos", LocalDate.now());

        Dev fernando = new Dev("Fernando");
        System.out.println(fernando.getNome());
        
        boot.getConteudos().addAll(Arrays.asList(curso1, curso2, mentoria1));
        fernando.inscreverBotcamp(boot);
        fernando.progredir();
        fernando.progredir();
        // fernando.progredir();

        System.out.println(boot.getConteudos());
        System.out.println(boot.getDevsInscritos());
        
        fernando.progredir();
        fernando.progredir();
        System.out.println(boot.getDevsInscritos());
    }
}