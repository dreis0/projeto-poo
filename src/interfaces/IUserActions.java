package interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.text.ParseException;

import exceptions.LimiteDeLivrosAtingidosException;
import exceptions.NaoPodeAlugarException;
import exceptions.NotFoundException;
import model.Emprestimo;
import model.ExemplarDeLivro;
import model.Usuario;

public interface IUserActions extends AutoCloseable {

	public Emprestimo alugar(Usuario usuario, ExemplarDeLivro exemplar) throws NaoPodeAlugarException,
			LimiteDeLivrosAtingidosException, FileNotFoundException, IOException, ParseException;

	public void Devolver(Emprestimo emprestimo)
			throws NotFoundException, FileNotFoundException, IOException, ParseException;

	public ArrayList<Emprestimo> getLivrosEmprestados(int usuarioId)
			throws FileNotFoundException, IOException, ParseException;

	public ArrayList<Emprestimo> consultaHistorico(int usuarioId)
			throws FileNotFoundException, IOException, ParseException, java.text.ParseException;

	public Usuario getByEmail(String email)
			throws FileNotFoundException, IOException, ParseException, java.text.ParseException, NotFoundException;
}
