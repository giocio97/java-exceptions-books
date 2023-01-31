package org.lessons.java.book;

public class Book {

	public String titolo;
	public int nPagine;
	public String autore;
	public String editore;

	public Book(String titolo, int nPagine, String autore, String editore) {
		super();
		this.titolo = titolo;
		this.nPagine = nPagine;
		this.autore = autore;
		this.editore = editore;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getnPagine() {
		return nPagine;
	}

	public void setnPagine(int nPagine) {
		this.nPagine = nPagine;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}

	@Override
	public String toString() {
		return "Book [titolo=" + titolo + ", nPagine=" + nPagine + ", autore=" + autore + ", editore=" + editore + "]";
	}

}
