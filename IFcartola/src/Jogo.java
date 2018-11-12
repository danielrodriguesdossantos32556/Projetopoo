import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Jogo {
	@Id
	private String nome_jogo;

	private String modo_pro;

	private String versao_free;

	private ArrayList<Jogo> jogos;

	private ArrayList<Jogo> liga;

	public String getNome_jogo() {
		return nome_jogo;
	}

	public void setNome_jogo(String nome_jogo) {
		this.nome_jogo = nome_jogo;
	}

	public String getModo_pro() {
		return modo_pro;
	}

	public void setModo_pro(String modo_pro) {
		this.modo_pro = modo_pro;
	}

	public String getVersao_free() {
		return versao_free;
	}

	public void setVersao_free(String versao_free) {
		this.versao_free = versao_free;
	}

	public ArrayList<Jogo> getJogos() {
		return jogos;
	}

	public void setJogos(ArrayList<Jogo> jogos) {
		this.jogos = jogos;
	}

	public ArrayList<Jogo> getLiga() {
		return liga;
	}

	public void setLiga(ArrayList<Jogo> liga) {
		this.liga = liga;
	}

	@Override
	public String toString() {
		return "Jogo [nome_jogo=" + nome_jogo + ", modo_pro=" + modo_pro + ", versao_free=" + versao_free + ", jogos="
				+ jogos + ", liga=" + liga + "]";
	}

	public Jogo(String nome_jogo, String modo_pro, String versao_free, ArrayList<Jogo> jogos, ArrayList<Jogo> liga) {
		super();
		this.nome_jogo = nome_jogo;
		this.modo_pro = modo_pro;
		this.versao_free = versao_free;
		this.jogos = jogos;
		this.liga = liga;
	}

}
