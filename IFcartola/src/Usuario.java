import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {

	private String nome_time;

	private String nome_usuario;
	@Id
	private String cadastro;

	private ArrayList<Usuario> usuarios;

	private ArrayList<Usuario> time;

	public String getNome_time() {
		return nome_time;
	}

	public void setNome_time(String nome_time) {
		this.nome_time = nome_time;
	}

	public String getNome_usuario() {
		return nome_usuario;
	}

	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	public String getCadastro() {
		return cadastro;
	}

	public void setCadastro(String cadastro) {
		this.cadastro = cadastro;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public ArrayList<Usuario> getTime() {
		return time;
	}

	public void setTime(ArrayList<Usuario> time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Usuario [nome_time=" + nome_time + ", nome_usuario=" + nome_usuario + ", cadastro=" + cadastro + "]";
	}

	public Usuario(String nome_time, String nome_usuario, String cadastro, ArrayList<Usuario> usuarios,
			ArrayList<Usuario> time) {
		super();
		this.nome_time = nome_time;
		this.nome_usuario = nome_usuario;
		this.cadastro = cadastro;
		this.usuarios = usuarios;
		this.time = time;
	}

}
