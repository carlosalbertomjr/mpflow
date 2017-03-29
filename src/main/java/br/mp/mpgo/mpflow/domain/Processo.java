package br.mp.mpgo.mpflow.domain;

public class Processo {
	
    protected String nome;
    protected String descricao;
    
    public Processo(String nome, String descricao) {
    	this.nome = nome;
    	this.descricao = descricao;
    }
        
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
