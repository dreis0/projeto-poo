package model;

import java.util.ArrayList;

public class Livro extends Queryable {

	protected String titulo = "";

	protected String autor = "";

	private ArrayList<ExemplarDeLivro> exemplares;

	public Livro() {
		super();
		this.exemplares = new ArrayList<ExemplarDeLivro>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public ArrayList<ExemplarDeLivro> getExemplares() {
		return this.exemplares;
	}

	public void setExemplares(ArrayList<ExemplarDeLivro> exemplares) {
		this.exemplares = exemplares;
	}

	public void addExemplar(ExemplarDeLivro exemplar) {
		exemplares.add(exemplar);
	}

	public String toString() {
		return getId() + " - " + getTitulo() + ", " + getAutor() + " \n";
	}
}
