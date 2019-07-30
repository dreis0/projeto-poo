package txtRepository;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import interfaces.ITxtRepository;

public abstract class BaseRepository<T> implements ITxtRepository<T>, AutoCloseable {

	protected String fileName;

	protected BufferedWriter writer;
	protected BufferedReader reader;
	
	protected BaseRepository(String fileName) 
			throws FileNotFoundException, IOException {
		this.writer = new BufferedWriter(new FileWriter(fileName));
		this.reader = new BufferedReader(new FileReader(fileName));
	}

	
	@Override
	public void close() throws Exception {
		writer.close();
		reader.close();
	}
}