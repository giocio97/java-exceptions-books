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

			titolo = s.nextLine().toLowerCase().trim();

			System.out.print("inserisci il numero di pagine del libro: ");
			try {

				nPagine = Integer.parseInt(s.nextLine());

			} catch (Exception e) {

				nPagine = 0;
			}

			System.out.print("inserisci l'autore del libro: ");

			autore = s.nextLine();

			System.out.print("inserisci l'editore del libro: ");

			editore = s.nextLine();

			Book libro;
			try {

				libro = new Book(titolo, nPagine, autore, editore);
				catalogoLibri[i] = libro;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}

			System.out.println("Inserito il libro: " + catalogoLibri[i].toString());
		}

		s.close();

	}

}
