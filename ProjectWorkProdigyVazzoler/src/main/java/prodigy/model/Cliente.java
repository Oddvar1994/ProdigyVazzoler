package prodigy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cliente")
	private Integer idCliente;
	
	@NotBlank(message="nome obbligatorio")
    @Column(name="nome")
    private String nome;
	
	@NotBlank(message="cognome obbligatorio")
    @Column(name="cognome")
    private String cognome;
    
	@NotBlank(message="indirizzo email obbligatorio")
    @Column(name="email")
    private String email;

	@NotNull(message="numero di telefono obbligatorio")
	@Column(name="numero_telefono")
	private Integer numeroTelefono;
	
	@NotNull(message="offerta obbligatoria")
	@Column(name="id_offerta")
	private Integer idOfferta;

	public Cliente() {
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

	@Override
	public String toString() {
		return "Cliente=" + idCliente + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email
				+ ", numeroTelefono=" + numeroTelefono + ", idOfferta=" + idOfferta;
	}
	
	
    
}
