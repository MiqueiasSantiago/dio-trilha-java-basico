package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Conteudo> conteudoIncritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<Conteudo> getConteudoIncritos() {
		return conteudoIncritos;
	}
	public void setConteudoIncritos(Set<Conteudo> conteudoIncritos) {
		this.conteudoIncritos = conteudoIncritos;
	}
	public Set<Conteudo> getConteudoConcluidos() {
		return conteudoConcluidos;
	}
	public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
		this.conteudoConcluidos = conteudoConcluidos;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(conteudoConcluidos, conteudoIncritos, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudoConcluidos, other.conteudoConcluidos)
				&& Objects.equals(conteudoIncritos, other.conteudoIncritos) && Objects.equals(nome, other.nome);
	}
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudoIncritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
	}
	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudoIncritos.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudoConcluidos.add(conteudo.get());
			this.conteudoIncritos.remove(conteudo.get());
		} else {
			System.err.println("Voce não está matriculado em nenhum conteudo.");
		}
	}
	public double calcularTotalXP() {	
		return this.conteudoConcluidos.stream().mapToDouble(Conteudo::calcularXP).sum();
	}
	@Override
	public String toString() {
		return "Dev [nome=" + nome + ", conteudoIncritos=" + conteudoIncritos + ", conteudoConcluidos="
				+ conteudoConcluidos + "]";
	}
	
	
}
