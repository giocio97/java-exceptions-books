package org.lessons.java.book;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String titolo, autore, editore;
		int nPagine;
		int n = 0;
		do {
			try {
				System.out.print("Quanti libri vuoi inserire?  ");
				n = Integer.parseInt(s.nextLine());
				if (n < 1 || n > 100)
					System.out.println("Numero non valido, intervallo accettato da 1 a 100 ");
			} catch (Exception error) {
				System.out.println("Input non valido. Inserire solo un numero intero!");
			}

		} while (n < 1 || n > 100);

		Book[] catalogoLibri = new Book[n];

		for (int i = 0; i < n; i++) {

			System.out.print("inserisci il titolo del libro: ");

			try {
				titolo = s.nextLine().toLowerCase().trim();

			} catch (Exception e) {
				System.out.println("Titolo non validato. inserire nuovamente");
			}

			System.out.print("inserisci il numero di pagine del libro: ");
			try {

				nPagine = Integer.parseInt(s.nextLine());

			} catch (Exception e) {
				System.out.println("Il formato del numero non è valido: ");

			}

			System.out.print("inserisci l'autore del libro: ");
			try {
				autore = s.nextLine();
			} catch (Exception e) {
				System.out.println("Autore non validato. inserire nuovamente");
			}

			System.out.print("inserisci l'editore del libro: ");

			try {
				editore = s.nextLine();

			} catch (Exception e) {
				System.out.println("editore non validato. inserire nuovamente");
			}

			Book libro = new Book(titolo, nPagine, autore, editore);

			catalogoLibri[i] = libro;
			libro.validateTitolo(titolo);
			libro.validatePage(n);
			libro.validateAutore(autore);
			libro.validateEditore(editore);

			System.out.println("Inserito il libro: " + libro.toString());
		}

		s.close();

	}

}
