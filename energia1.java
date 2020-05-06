import java.io.*;  // do plików to też służy 
import java.util.*; // tu jest skaner tablice i listy 
import java.lang.*;
public class energia1 extends energiaa {
	
	
	public static void main(String[] args){
		
		//createFile(); 
		//simpleDateFormatt();  // co to tu tobi ???
	}
	public void wprowadzDanePlan() {
		String doZapisu = "";  double xsuma = 0.999; 
		double Mpozostalo; double[] TRwartosci;  String[] KonWartosci; String KonPozost;// = new double[10];
	String[]  TRnazwy = {"Mieszkanie: ", "Prad: ", "Gaz: ", "IneternetTV: ", "Dziecko: ",
		"Wydatki dodatkowe: ", "Wydatki biezace: ", "Paliwo: ", "Wydatki nieprzewidziane: " , "Pozostalo: "};
		TRwartosci = new double[10]; 
		KonWartosci = new String[11];
		char yeno;  char konty = 't';  // first yes init 
		int licz = 0; 
		
		String miesiacN; 
		Scanner scan = new Scanner(System.in);
		
		
		while(konty=='t') {
			
			try {
			licz =  licznikLini();	
				//licz = rf.getLineNum ();
				}
		catch (IOException e)
		{
			
		}
		if(licz >12)
		{
			System.out.println("Nie mozna wpisac wiecej rekordow - za duzo miesiecy");
		}
		else 
		{
			//miesiacN = nazwaMsc (licz+1); // zawolaj funckcje 
			
			//System.out.println("Zaplanuj wydatki na " + miesiacN); 
		for(int i = 0; i < TRnazwy.length; i++ )
            {
         System.out.println("Wprowadz wartosc " + TRnazwy[i]+ ": "); 
		 TRwartosci[i] =  scan.nextDouble(); 
		 KonWartosci[i]  = Double.toString(TRwartosci[i]);
		 doZapisu = doZapisu + " " +KonWartosci[i]; 
		 xsuma = xsuma + TRwartosci[i];
            } 
			// roboczo do sprawdzenia poprawnosci wczytania danych 
		/*for(int i = 0; i < 10; i++ )
            {
         System.out.println( TRnazwy[i]+ ": " + TRwartosci[i]); 
		 //KonWartosci[i]  = Double.toString(TRwartosci[i]); 
		// TRwartosci[i] =  scan.nextDouble(); 
            } */
			System.out.println("Suma wprowadzonych wydatkow to "+ xsuma);
			saveSingleData(doZapisu); 
	/*Mpozostalo = liczPozost();  // na razie bez potrzeby tego nie 
	KonWartosci[10]  = Double.toString(Mpozostalo); // ładujemy jescze to ile zaostało  
	*/
	//System.out.println("A Pozostalo: " + Mpozostalo); 
	// tutaj wywołać funkcje zapis
	/*zapis 	rekord  = new zapis(); 
	rekord.addLine (KonWartosci); // dodano argument  w postaci tablicy :) chyba dobrze ?? ! 
	System.out.println("Czy chcesz zaplanowac nastepny miesiac t/n"); */ 
	konty = scan.next().charAt(0);
		}
	/* TUTAJ KONCZY SIE DODANIE REKORDU   PONIZEJ WYWOLUJEMY FUNKCJE URUCHOM */
		} // koniec while 
	
	
	
	
	
	
	}
	public void wprowadzDaneRachunki()
	{  char konty = 't';
		Scanner rach = new Scanner(System.in);
		String dataZakupow = ""; String nazwaSklepu=""; double wartoscZakupow = 0.99;  String wartoscZakupowS = ""; String rachunekS = "";   
		
		while(konty=='t') {
			System.out.println("Wprowadz  date zakupow w formacie yyyy-mm-dd: ");
			dataZakupow = rach.nextLine();
			System.out.println("Wprowadz  nazwe sklepu: ");
			nazwaSklepu = rach.nextLine();
			System.out.println("Wprowadz  wartosc zakupow ");
			wartoscZakupow = rach.nextDouble();
			wartoscZakupowS  = Double.toString(wartoscZakupow);
			
				rachunekS = dataZakupow+" "+nazwaSklepu+" "+wartoscZakupowS; 
				
			
			
			saveSingleData(rachunekS); 
			
			
			konty = rach.next().charAt(0);
		}
		
	}
	
} // koniec klasy 
