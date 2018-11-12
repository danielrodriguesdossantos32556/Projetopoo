import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Liga {

	private String moderada;

	private String privada;

	private String publica;

	private String nome;
	@Id
	private String descricao;

	private ArrayList<Liga> ligas;

	public String getModerada() {
		return moderada;
	}

	public void setModerada(String moderada) {
		this.moderada = moderada;
	}

	public String getPrivada() {
		return privada;
	}

	public void setPrivada(String privada) {
		this.privada = privada;
	}

	public String getPublica() {
		return publica;
	}

	public void setPublica(String publica) {
		this.publica = publica;
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

	public ArrayList<Liga> getLigas() {
		return ligas;
	}

	public void setLigas(ArrayList<Liga> ligas) {
		this.ligas = ligas;
	}

	@Override
	public String toString() {
		return "Liga [moderada=" + moderada + ", privada=" + privada + ", publica=" + publica + ", nome=" + nome
				+ ", descricao=" + descricao + ", ligas=" + ligas + "]";
	}

	public Liga(String moderada, String privada, String publica, String nome, String descricao, ArrayList<Liga> ligas) {
		super();
		this.moderada = moderada;
		this.privada = privada;
		this.publica = publica;
		this.nome = nome;
		this.descricao = descricao;
		this.ligas = ligas;
	}

}
