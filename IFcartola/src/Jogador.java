import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Jogador {
	@Id
	private int numero;

	private String nome;

	private String valorizado;

	private String maiscaro;

	private String maisbarato;

	private ArrayList<Jogador> jogadores;

	private ArrayList<Jogador> time;

	private ArrayList<Jogador> campeonato;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getValorizado() {
		return valorizado;
	}

	public void setValorizado(String valorizado) {
		this.valorizado = valorizado;
	}

	public String getMaiscaro() {
		return maiscaro;
	}

	public void setMaiscaro(String maiscaro) {
		this.maiscaro = maiscaro;
	}

	public String getMaisbarato() {
		return maisbarato;
	}

	public void setMaisbarato(String maisbarato) {
		this.maisbarato = maisbarato;
	}

	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public ArrayList<Jogador> getTime() {
		return time;
	}

	public void setTime(ArrayList<Jogador> time) {
		this.time = time;
	}

	public ArrayList<Jogador> getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(ArrayList<Jogador> campeonato) {
		this.campeonato = campeonato;
	}

	@Override
	public String toString() {
		return "Jogador [numero=" + numero + ", nome=" + nome + ", valorizado=" + valorizado + ", maiscaro=" + maiscaro
				+ ", maisbarato=" + maisbarato + ", jogadores=" + jogadores + ", time=" + time + ", campeonato="
				+ campeonato + "]";
	}

	public Jogador(int numero, String nome, String valorizado, String maiscaro, String maisbarato,
			ArrayList<Jogador> jogadores, ArrayList<Jogador> time, ArrayList<Jogador> campeonato) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.valorizado = valorizado;
		this.maiscaro = maiscaro;
		this.maisbarato = maisbarato;
		this.jogadores = jogadores;
		this.time = time;
		this.campeonato = campeonato;
	}

}
