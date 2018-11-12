import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Time {
	@Id
	private String personificacao;

	private String nome_time;

	private ArrayList<Time> times;

	private ArrayList<Time> jogo;

	public String getPersonificacao() {
		return personificacao;
	}

	public void setPersonificacao(String personificacao) {
		this.personificacao = personificacao;
	}

	public String getNome_time() {
		return nome_time;
	}

	public void setNome_time(String nome_time) {
		this.nome_time = nome_time;
	}

	public ArrayList<Time> getTimes() {
		return times;
	}

	public void setTimes(ArrayList<Time> times) {
		this.times = times;
	}

	public ArrayList<Time> getJogo() {
		return jogo;
	}

	public void setJogo(ArrayList<Time> jogo) {
		this.jogo = jogo;
	}

	@Override
	public String toString() {
		return "Time [personificacao=" + personificacao + ", nome_time=" + nome_time + ", times=" + times + ", jogo="
				+ jogo + "]";
	}

	public Time(String personificacao, String nome_time, ArrayList<Time> times, ArrayList<Time> jogo) {
		super();
		this.personificacao = personificacao;
		this.nome_time = nome_time;
		this.times = times;
		this.jogo = jogo;
	}

}