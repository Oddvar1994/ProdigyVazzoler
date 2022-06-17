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
@Table(name="preventivo")
public class Preventivo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_preventivo")
	private Integer idPreventivo;
	
	@NotBlank(message="descrizione obbligatoria")
    @Column(name="descrizione")
	private String descrizione;
	
	@NotNull(message="prezzo obbligatorio")
	@Column(name="prezzo")
	private Double prezzo; 
	
	@NotNull(message="id cliente obbligatorio")
    @Column(name="id_cliente")
	private Integer idCliente;

	public Preventivo() {
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

	@Override
	public String toString() {
		return "Preventivo=" + idPreventivo + ", descrizione=" + descrizione + ", prezzo=" + prezzo
				+ ", idCliente=" + idCliente;
	}
	
	

}
