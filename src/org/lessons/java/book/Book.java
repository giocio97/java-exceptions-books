package org.lessons.java.book;

public class Book {

	public String titolo;
	public int nPagine;
	public String autore;
	public String editore;

	public Book(String titolo, int nPagine, String autore, String editore) throws Exception {
		super();
		this.titolo = titolo;
		validateTitolo(titolo);
		this.nPagine = nPagine;
		validatePage(nPagine);
		this.autore = autore;
		validateAutore(autore);
		this.editore = editore;
		validateEditore(editore);

	}

	public void validatePage(int n) throws PageException {
		if (n < 0)
			throw new PageException();
	}

	public void validateTitolo(String titolo) throws Exception {
		if (titolo.length() <= 0) {
			throw new Exception();

		}
	}

	public void validateAutore(String autore) throws Exception {
		if (autore.length() <= 0) {
			throw new Exception();

		}
	}

	public void validateEditore(String editore) throws Exception {
		if (editore.length() <= 0) {
			throw new Exception();

		}
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
