import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Campeonato {
	@Id
	private String id_camp;

	private int ano;

	private String nome;

	private String clube;

	private ArrayList<Campeonato> campeonatos;

	private ArrayList<Campeonato> jogo;

	public String getId_camp() {
		return id_camp;
	}

	public void setId_camp(String id_camp) {
		this.id_camp = id_camp;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClube() {
		return clube;
	}

	public void setClube(String clube) {
		this.clube = clube;
	}

	public ArrayList<Campeonato> getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(ArrayList<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}

	public ArrayList<Campeonato> getJogo() {
		return jogo;
	}

	public void setJogo(ArrayList<Campeonato> jogo) {
		this.jogo = jogo;
	}

	@Override
	public String toString() {
		return "Campeonato [id_camp=" + id_camp + ", ano=" + ano + ", nome=" + nome + ", clube=" + clube
				+ ", campeonatos=" + campeonatos + ", jogo=" + jogo + "]";
	}

	public Campeonato(String id_camp, int ano, String nome, String clube, ArrayList<Campeonato> campeonatos,
			ArrayList<Campeonato> jogo) {
		super();
		this.id_camp = id_camp;
		this.ano = ano;
		this.nome = nome;
		this.clube = clube;
		this.campeonatos = campeonatos;
		this.jogo = jogo;
	}

}
