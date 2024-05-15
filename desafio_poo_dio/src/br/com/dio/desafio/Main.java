package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;

public class Main {

	public static void main(String[] args) {
		
		Conteudo curso1 = new Curso("Curso 1", "Descrição curso 1", 10);
		Conteudo curso2 = new Curso("Curso 2", "Descrição curso 2", 12);
		Conteudo curso3 = new Curso("Curso 3", "Descrição curso 3", 16);
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(curso3);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("conteudos Incritos Camila" + devCamila.getConteudoIncritos());
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("conteudos Concluidos Camila" + devCamila.getConteudoConcluidos());
		System.out.println("conteudos Incritos Camila" + devCamila.getConteudoIncritos());
		System.out.println("XP = " + devCamila.calcularTotalXP());
		
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("conteudos Incritos João" + devJoao.getConteudoIncritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("conteudos Concluidos João" + devJoao.getConteudoConcluidos());
		System.out.println("conteudos Incritos João" + devJoao.getConteudoIncritos());
		System.out.println("XP = " + devJoao.calcularTotalXP());

	}

}
