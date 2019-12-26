package br.com.kennedy.backlog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuarios {
	
	@Id
	@GeneratedValue
	long id;
	
	@Column
	String nome, sobrenome, cargo, departamento, imediato, login, senha;
	
	@Column
	boolean ativo;
	
	/* Criar um campo de data de cadastro */
	/* Utilizar neste campo o @Temporal(TemporalType.DATE) */
	
	public Usuarios() {
		
	}
	
	public Usuarios(String nome, String sobrenome, String cargo,
					String departamento, String imediato, String login, 
					String senha, boolean ativo) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cargo = cargo;
		this.departamento = departamento;
		this.imediato = imediato;
		this.login = login;
		this.senha = senha;
		this.ativo = ativo;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getImediato() {
		return imediato;
	}
	public void setImediato(String imediato) {
		this.imediato = imediato;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}
