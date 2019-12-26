package br.com.kennedy.backlog.model;

public class Demandas {
	int id;
	String descricao, status, urgencia, responsavel, aprovador; 
	boolean aprovada;
	
	public Demandas(String descricao, String status, String urgencia,
					String responsavel, String aprovador, boolean aprovada) {
		this.descricao = descricao;
		this.status = status;
		this.urgencia = urgencia;
		this.responsavel = responsavel;
		this.aprovador = aprovador;
		this.aprovada = aprovada;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUrgencia() {
		return urgencia;
	}
	public void setUrgencia(String urgencia) {
		this.urgencia = urgencia;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public String getAprovador() {
		return aprovador;
	}
	public void setAprovador(String aprovador) {
		this.aprovador = aprovador;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

}
