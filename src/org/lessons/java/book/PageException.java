package org.lessons.java.book;

public class PageException extends Exception {

	private int page;

	public PageException(int page) {
		super("numero di pagine non valido!");
		this.page = page;
	}

	public int getPage() {
		return page;
	}

}
