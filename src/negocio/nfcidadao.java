package negocio;
import java.util.Date;
import java.math.BigDecimal;

public class nfcidadao {
	private String municipio;
	private String razaoSoc;
	private Date emissao;
	private Integer numero;
	private String origem;
	private String equipamento;
	private BigDecimal valor;
	private Date registro;
	private String tipoOp;
	private String sitDoc;
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getRazaoSoc() {
		return razaoSoc;
	}
	public void setRazaoSoc(String razaoSoc) {
		this.razaoSoc = razaoSoc;
	}
	public Date getEmissao() {
		return emissao;
	}
	public void setEmissao(Date emissao) {
		this.emissao = emissao;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getEquipamento() {
		return equipamento;
	}
	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Date getRegistro() {
		return registro;
	}
	public void setRegistro(Date registro) {
		this.registro = registro;
	}
	public String getTipoOp() {
		return tipoOp;
	}
	public void setTipoOp(String tipoOp) {
		this.tipoOp = tipoOp;
	}
	public String getSitDoc() {
		return sitDoc;
	}
	public void setSitDoc(String sitDoc) {
		this.sitDoc = sitDoc;
	}
	
}


