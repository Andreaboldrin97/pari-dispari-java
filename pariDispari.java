package org.booleancareer.java2;

import java.util.Random;
import java.util.Scanner;

public class pariDispari {
	
	public static void main(String[] args) {
		
		// CREO LO SCANNER PER L'INPUT
		Scanner sc = new Scanner(System.in);
		
		// FACCIO LA DOMANDA
		System.out.println("Pari o Dispari ? ");
		
		// ASSEGNO LA RISPOSTA E LA RIPORTO IN LOWERCASE
		String pOd = sc.nextLine();
		pOd = pOd.toLowerCase();		
		
		System.out.println("Scegli un valore tra 0 e 10 ?");
		int value = sc.nextInt();
		
		// CHIUDO L'ESEGUZIONE DELLO SCANNER TANTO HO FINITO LE DOMANDE
		sc.close();
		
		
		// VERIFICHIAMO SE LA SCELTA DELL'USER E' VALIDA
		if( !pOd.equals("pari") && !pOd.equals("dispari")) {
			System.out.println("Non hai scelto un valore valido");
			// SE L'USER NON HA SCELTO UN VALORE VALIDO LA CONDIZIONE GRAZIE AL RETURN E' BLOCCANTE
			return;
		}
		
		// VERIFICHIAMO SE LA SCELTA DELL'USER E' VALIDA
		if(value < 0 || value > 10) {
			System.out.println("il numero scelto non è valido");
			// SE L'USER NON HA SCELTO UN VALORE VALIDO LA CONDIZIONE GRAZIE AL RETURN E' BLOCCANTE
			return;
		}
		
		// CALCOLIAMO UN VALORE RANDOM fino a 10
		Random rand = new Random();
		int randValue = rand.nextInt(11);
		
		//* controllo nel test se il risultato è corretto
				System.out.println(randValue);
		
		// VEDO IL RISULTATO DELLA SOMMA PER VEDERE IL RISULTATO
		int sum = value + randValue;
		
		// CREIAMO GIA' UNA CONDIZIONE DI PARI 
		boolean pair = sum % 2 == 0;
		
		//* controllo nel test se il risultato è corretto
		System.out.println(pair);
		
		// CONTROLLO LE POSSIBILI VITTORIE DELL'USER
		if(( pOd.equals("pari") && pair == true ) || ( pOd.equals("dispari") && pair == false )){
			System.out.println("Hai vinto");
		}else {
			System.out.println("Hai perso, mi dispiace");
		}
		
	}
}
