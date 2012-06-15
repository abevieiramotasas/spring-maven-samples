package com.abe;

import java.util.List;
import java.util.Map;

public class Exemplo {
	
	// tipos simples
	/**
	 * Preenchido por property
	 */
	private String nome;
	/**
	 * Preenchido por constructor
	 */
	private Integer idade;
	
	// tipos complexos
	/**
	 * Preenchido por property
	 */
	private ExemploProperty exemplo;
	
	/**
	 * Preenchido com list
	 */
	private List<ExemploProperty> lista;
	
	/**
	 * Preenchido com map
	 */
	private Map<String, String> map;
	
	public Exemplo() {
		
	}
	
	public Exemplo(ExemploProperty exemploProperty) {
		this.exemplo = exemploProperty;
	}
	
	public Exemplo(Integer idade) {
		this.idade = idade;
	}

	public ExemploProperty getExemplo() {
		return exemplo;
	}

	public void setExemplo(ExemploProperty exemplo) {
		this.exemplo = exemplo;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<ExemploProperty> getLista() {
		return lista;
	}

	public void setLista(List<ExemploProperty> lista) {
		this.lista = lista;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Exemplo [nome=" + nome + ", idade=" + idade + ", exemplo="
				+ exemplo + ", lista=" + lista + ", map=" + map + "]";
	}

}
