package org.lessons.java.book;

public class PageException extends Exception {

	private int page;

	public PageException() {
		// TODO Auto-generated constructor stub
		super("numero di pagine non valido!");
	}

	public int getPage() {
		return page;
	}

}
