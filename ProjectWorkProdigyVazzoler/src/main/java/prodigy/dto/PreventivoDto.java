package prodigy.dto;

public class PreventivoDto {

	private Integer idPreventivo;
	
	private String descrizione;
	
	private Double prezzo; 
	
	private Integer idCliente;
	
	private String email;

	public PreventivoDto() {
		super();
	}

	public Integer getIdPreventivo() {
		return idPreventivo;
	}

	public void setIdPreventivo(Integer idPreventivo) {
		this.idPreventivo = idPreventivo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "PreventivoDto=" + idPreventivo + ", descrizione=" + descrizione + ", prezzo=" + prezzo
				+ ", idCliente=" + idCliente + ", email=" + email;
	}
	
	
}
