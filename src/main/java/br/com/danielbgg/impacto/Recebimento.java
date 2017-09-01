package br.com.danielbgg.impacto;

public class Recebimento implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String origem;
	private double recebimento;

	public Recebimento() {
	}

	public java.lang.String getOrigem() {
		return this.origem;
	}

	public void setOrigem(java.lang.String origem) {
		this.origem = origem;
	}

	public double getRecebimento() {
		return this.recebimento;
	}

	public void setRecebimento(double recebimento) {
		this.recebimento = recebimento;
	}

	public Recebimento(java.lang.String origem, double recebimento) {
		this.origem = origem;
		this.recebimento = recebimento;
	}

	@Override
	public String toString() {
		return "Recebimento [origem=" + origem + ", recebimento=" + recebimento + "]";
	}

}