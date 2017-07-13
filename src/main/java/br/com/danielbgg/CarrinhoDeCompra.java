package br.com.danielbgg;

import java.io.Serializable;
import java.math.BigDecimal;

public class CarrinhoDeCompra implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String cidade;
	private BigDecimal valorDaCompra;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public BigDecimal getValorDaCompra() {
		return valorDaCompra;
	}

	public void setValorDaCompra(BigDecimal valorDaCompra) {
		this.valorDaCompra = valorDaCompra;
	}

	@Override
	public String toString() {
		return "CarrinhoDeCompra [nome=" + nome + ", cidade=" + cidade + ", valorDaCompra=" + valorDaCompra + "]";
	}

}