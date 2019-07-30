package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import utils.Strings;

public abstract class Usuario {

	protected int id;

	protected TipoDeUsuario tipo;

	protected String nome = "";

	protected String email = "";

	protected String senha = "";

	protected String documento = "";

	protected Date multaAte = new Date();

	public Usuario(TipoDeUsuario tipo) {
		this.tipo = tipo;
	}

	private String formatEntries(String str) {
		if (str == null)
			return "";
		else
			return str;
	}

	public TipoDeUsuario getTipo() {
		return this.tipo;
	}

	public String getNome() {
		return formatEntries(nome);
	}

	public void setNome(String nome) {
		this.nome = formatEntries(nome);
	}

	public String getEmail() {
		return formatEntries(email);
	}

	public void setEmail(String email) {
		this.email = formatEntries(email);
	}

	public String getSenha() {
		return formatEntries(senha);
	}

	public void setSenha(String senha) {
		this.senha = (senha);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getMultaAte() {
		return multaAte;
	}

	public void setMultaAte(Date multaAte) {
		this.multaAte = multaAte;
	}

	public void setMultaAte(String multaAte) throws ParseException {
		System.out.println(multaAte);
		this.multaAte = Strings.FORMATO_DATA_GENERICO.parse(multaAte);;
	}

	public String getDocumento() {
		return formatEntries(documento);
	}

	public void setDocumento(String documento) {
		this.documento = formatEntries(documento);
	}
}
