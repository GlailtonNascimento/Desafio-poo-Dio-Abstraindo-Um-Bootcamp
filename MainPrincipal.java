import java.time.LocalDate;

import br.com.dio.programa.Desafio.dominio.Bootcamp;
import br.com.dio.programa.Desafio.dominio.Conteudo;
import br.com.dio.programa.Desafio.dominio.Curso;
import br.com.dio.programa.Desafio.dominio.Dev;
import br.com.dio.programa.Desafio.dominio.Mentoria;

public class MainPrincipal {

    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java Básico");
        curso1.setDescricao("Descrição: Curso Java Básico.");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java Avançado");
        curso2.setDescricao("Descrição: Curso Java Avançado.");
        curso2.setCargaHoraria(12);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria em Java");
        mentoria.setDescricao("Descrição: Mentoria Java");
        mentoria.setData(LocalDate.now());
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição: Bootcamp Java Developer");
        
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devGlailton = new Dev();
        devGlailton.setNome("Glailton");
        devGlailton.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de " + devGlailton.getNome() + ": " + devGlailton.getConteudoInscritos());
        devGlailton.progredir();
        devGlailton.progredir();
        devGlailton.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Glailton: " + devGlailton.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos de Glailton: " + devGlailton.getConteudoConcluidos());
        System.out.println("XP: " + devGlailton.calcularTotalXp());

        System.out.println("-----------");
        
        Dev devGeovanna = new Dev();
        devGeovanna.setNome("Geovanna");
        devGeovanna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de " + devGeovanna.getNome() + ": " + devGeovanna.getConteudoInscritos());
        devGeovanna.progredir();
        devGeovanna.progredir();
        devGeovanna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Geovanna: " + devGeovanna.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos de Geovanna: " + devGeovanna.getConteudoConcluidos());
        System.out.println("XP: " + devGeovanna.calcularTotalXp());
    }
}

