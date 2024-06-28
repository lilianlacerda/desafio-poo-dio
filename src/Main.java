import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso GitHub");
        curso2.setDescricao("Descrição curso GitHub");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLilian = new Dev();
        devLilian.setNome("Lilian");
        devLilian.increverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos "+devLilian.getConteudosInscritos());
        devLilian.progredir();
        devLilian.progredir();
        System.out.println("-");
        System.out.println("Conteudos Incritos "+devLilian.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos "+devLilian.getConteudosConcluidos());
        System.out.println("XP: "+devLilian.calcularTotalXp());

        System.out.println("-------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.increverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos "+devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos "+devCamila.getConteudosInscritos());
        System.out.println("Conteúdos COncluídos "+devCamila.getConteudosConcluidos());
        System.out.println("XP: "+devCamila.calcularTotalXp());


    }
}