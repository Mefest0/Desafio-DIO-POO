import br.com.desafio.dio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso Js");
        curso1.setDescricao("Descrição do curso Js");
        curso1.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDescricao("Desc Bootcamp Java Dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAmbrosio = new Dev();
        devAmbrosio.setNome("Ambrosio");
        devAmbrosio.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos inscritos Ambrosio: " +devAmbrosio.getConteudosInscritos());
        devAmbrosio.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Ambrosio: " +devAmbrosio.getConteudosInscritos());
        System.out.println("Conteudos concluidos Ambrosio: " +devAmbrosio.getConteudosConcluidos());
        System.out.println("XP:" +devAmbrosio.calcularTotalXp());

        System.out.println("--------");

        Dev devTomas = new Dev();
        devTomas.setNome("Tomas");
        devTomas.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos inscritos Tomas: " +devTomas.getConteudosInscritos());
        devTomas.progredir();
        devTomas.progredir();
        devTomas.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Tomas: " +devTomas.getConteudosInscritos());
        System.out.println("Conteudos concluidos Tomas: " +devTomas.getConteudosConcluidos());
        System.out.println("XP:" +devTomas.calcularTotalXp());
    }
}