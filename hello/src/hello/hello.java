package hello;


import java.util.*;
import java.text.*;
import hello.employe;


public class hello {
	
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reverseTable();
		//displayDoz(firstDoz());
		//displayDozHalf(firstDoz());
		//primeNumber();
		//solPrime();
		
		//dateHandler();
		
		System.out.println("Estoy aqui trabajando para la vida : "+System.currentTimeMillis()/(3600*1000));
		

		employe emp = new employe();
		emp.setNom("Moïse Edner Brutus");
		emp.setNum(110);
		emp.setSalaire(15000);
		emp.setDn(30,2,2004);
		emp.afficheAnneeNaissance();
		emp.afficheDateNaissance();
		
		employe emp_01 = new employe();
		emp_01.setNom(" Edner Brutus");
		emp_01.setNum(110);
		emp_01.setSalaire(15000);
		emp_01.setDn(30,2,1990);
		emp_01.afficheAnneeNaissance();
		emp_01.afficheDateNaissance();
		
	}
	
	/*
	 * 
	 * 
	 * */
	public static void dateHandler() {
		
		// GregorianCalendar gc = new GregorianCalendar();
		// gc.set(1980, 07 -1, 14);
		
		// SimpleDateFormat sdf = new 	SimpleDateFormat("25/11/1984");
		// sdf.format(gc.getTime());
		
		byte b[] = { 'a', 'b', 'c', 'd', 'e' };
		
		String s1 = new String(b);
		String s2 = new String(b, 2, 3);
		
		char c[] = { 'w', 'x', 'y', 'z' };
		String s3 = new String(c);
		String s4 = new String(c, 1, 2);
		String s5 = "Hello";
		
		
		System.out.println(" S1 : "+s1);
		System.out.println(" S2 : "+s2);
		System.out.println(" S3 : "+s3);
		System.out.println(" S4 : "+s4);
		System.out.println(" S5 : "+s5);
		
		
		
	}
	
	/////////////////////////////////////////////////////////////////
	public static void solPrime() {
		
		int cpt = 0, bornesup = 200;
		int crible[] = new int[bornesup + 1];
		for (int i = 2; i*2<crible.length;i++)
		{
		if (crible[i]==0 && i*i < bornesup){
		for (int j = 2 ;j*i < crible.length;j++){
		crible[j*i]=1;
		}
		}
		}
		for ( int i = 2; i<crible.length;i++)
		{
		if(crible[i]==0){
		System.out.print(i + " ");
		cpt++;
		}
		}
		System.out.println("\n soit " + cpt + " nombres premiers entre 2 et " + bornesup);
		
	}
	public static void primeNumber() {
		final int max = 200;
		final int min = 2;
		int countdown = 0;
		
		for ( int i = min; i <= max; i++) {
			
			if (i % 2 != 0 ) {
				if (i % 3 != 0 ) {
					if (i % 5 != 0 ) {
						if (i % 7 != 0 ) {
							if (i % 11 != 0 ) {
								if (i % 13 != 0 ) {
									if (i % 17 != 0 ) {
										countdown++;
										System.out.println(" Prime : "+ i);
									}
								}
							}
						}
					}
				}
					
			}
		}
		countdown+=7;
		System.out.println(" Le nombre recherche est : "+ countdown);
	}
	/*
	 * This function is dealing with a fixed length table
	 * it displays the following letters : a b c d e f as in the alphabet
	 * and thereafter, it prints them out in reverse order
	 * */
	public static void reverseTable() {
		
		char [] vow = new char[] {'a','b','c','d','e','f'};
		
		//System.out.println("I'm alive \n");
		for ( int i=0; i<6;i++) {
			
			System.out.println("Les lettres sont i = " + i + " --> "+ vow[i] );
			System.out.println("Les lettres iversées sont i = " + (int)(5-i) + " --> "+ vow[5-i] );
			
		}
	}
	public static int[] firstDoz() {
		
		int [] multip = new int[12];
		final int val = 5;
		
		for (int i=0; i<12; i++) {			
			multip[i] = val * (int)(i+1); 
		}
		
		return multip;
	}
	
	public static void displayDoz(int[] argv) {
		
		int length = argv.length;
		
		for (int i=0; i<length ; i++) {
			
			System.out.println(" indice i: "+ (int)(i+1) + " = "+ argv[i]);
		}
	}
	
	public static void displayDozHalf(int []  argv) {
		
		int length = argv.length;
		
		for (int i=0; i<length ; i++) {
			
			if ( (int)(i+1)%2 == 0) {
					System.out.println(" indice i: "+ (int)(i+1) + " = "+ argv[i]);
			}
		}
	}

}
