package br.edu.ifrs.canoas.trabalhoJPA;

import java.sql.Date;

import javax.persistence.Entity;

@Entity
public class PessoaFisica extends Pessoa {
	private String cpf;
	private String rg;
	private Date dataNascimento;
}
