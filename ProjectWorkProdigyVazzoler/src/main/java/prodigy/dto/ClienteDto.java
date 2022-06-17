package prodigy.dto;

public class ClienteDto {

	
	private Integer idCliente;
	
    private String nome;

    private String cognome;

    private String email;

	private Integer numeroTelefono;
	
	private Integer idOfferta;
	
	private String descrizione;

	public ClienteDto() {
		super();
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(Integer numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public Integer getIdOfferta() {
		return idOfferta;
	}

	public void setIdOfferta(Integer idOfferta) {
		this.idOfferta = idOfferta;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	@Override
	public String toString() {
		return "ClienteDto=" + idCliente + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email
				+ ", numeroTelefono=" + numeroTelefono + ", idOfferta=" + idOfferta + ", descrizione=" + descrizione;
	}
	
	
}
