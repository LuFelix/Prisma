package online.lucianofelix.beans;

import java.sql.Date;
import java.sql.Timestamp;

public class Lancamento {

	private int sequencia;// Sequencial de movimentos.
	private String codiConta;// C�digo chave para a tabela de contas
	private String codiCondPag;// Chave para a tabela de condi��o de pagamento.
	private String codiPedido; // Refer�ncia para a tabela de pedidos.
	private String codiPessoa;// Refer�ncia para a tabela de pessoas.
	private Date dataHoraLancamento; // Data hora do recebimento.
	private float valor;// O valor do movimento
	private String obsLancamento; // Uma observa��o sobre o recebimento.
	private String tipoLancamento; // Movimento de entrada ou de sa�da;
	private String especieLancamento;// Esp�cie de lan�amento
	private Timestamp dataHoraRecebimento;

	public int getSequencia() {
		return sequencia;
	}

	public void setSequencia(int sequencia) {
		this.sequencia = sequencia;
	}

	public String getCodiCondPag() {
		return codiCondPag;
	}

	public void setCodiCondPag(String codiCondPag) {
		this.codiCondPag = codiCondPag;
	}

	public String getCodiPedido() {
		return codiPedido;
	}

	public void setCodiPedido(String codiPedido) {
		this.codiPedido = codiPedido;
	}

	public String getCodiPessoa() {
		return codiPessoa;
	}

	public void setCodiPessoa(String codiPessoa) {
		this.codiPessoa = codiPessoa;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getObsLancamento() {
		return obsLancamento;
	}

	public void setObsLancamento(String obsLancamento) {
		this.obsLancamento = obsLancamento;
	}

	public String getTipoLancamento() {
		return tipoLancamento;
	}

	public void setTipoLancamento(String tipoLancamento) {
		this.tipoLancamento = tipoLancamento;
	}

	public String getEspecieLancamento() {
		return especieLancamento;
	}

	public void setEspecieLancamento(String especieLancamento) {
		this.especieLancamento = especieLancamento;
	}

	public String getCodiConta() {
		return codiConta;
	}

	public void setCodiConta(String codiConta) {
		this.codiConta = codiConta;
	}

	public Date getDataHoraLancamento() {
		return dataHoraLancamento;
	}

	public void setDataHoraLancamento(Date dataHoraLancamento) {
		this.dataHoraLancamento = dataHoraLancamento;
	}

}
