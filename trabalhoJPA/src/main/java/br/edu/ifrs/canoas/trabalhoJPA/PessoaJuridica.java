package br.edu.ifrs.canoas.trabalhoJPA;

import javax.persistence.Entity;

@Entity
public class PessoaJuridica extends Pessoa{
	private String razaoSocial;
	private String cnpj;
	private String inscricaoEstadual;
	private String inscricaoMunicipal;
	
}
