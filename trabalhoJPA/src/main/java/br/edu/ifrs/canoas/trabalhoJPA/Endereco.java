package br.edu.ifrs.canoas.trabalhoJPA;

import javax.persistence.OneToOne;

public class Endereco {
	private String logradouro;
	private int numero;
	private String complemento;
	private String cep;
	private String bairro;
	private String uf;
	
	@OneToOne (mappedBy = "localidade")
	private Pessoa pessoa;
}
