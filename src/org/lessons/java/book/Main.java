package org.lessons.java.book;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String titolo, autore, editore;
		int nPagine;
		int n = 20;
		Book[] catalogoLibri = new Book[n];

		for (int i = 0; i < n; i++) {

			System.out.print("inserisci il titolo del libro: ");
			titolo = s.nextLine();

			System.out.print("inserisci il numero di pagine del libro: ");
			nPagine = s.nextInt();

			System.out.print("inserisci l'autore del libro: ");
			autore = s.nextLine();

			System.out.print("inserisci l'editore del libro: ");
			editore = s.nextLine();

			Book libro = new Book(titolo, nPagine, autore, editore);

			catalogoLibri[i] = libro;

			System.out.println("Inserito il libro: " + libro.toString());
		}

		s.close();

	}

}
