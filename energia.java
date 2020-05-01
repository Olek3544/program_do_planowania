import java.io.*;  // do plików to też służy 
import java.util.*; // tu jest skaner tablice i listy 
import java.lang.*;
/* rzeczy do paczki czas i java */
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;  
import java.time.temporal.ChronoUnit; 
import java.text.SimpleDateFormat;
import java.text.ParseException;
/*CO TA FUNKCJA ZAWIERA ??
1. tworzy nowy plik w folderze wskazanym przez użytkownika: - wyzwanie jak otwierać foldery badz je tworzyć*
2. zapisuje dane do pliku dodajca nowa linie 
3. odczytuje dane z pliku w formie dwuwymiarowej tablicy */
public class energia {
	public String filePath = odczytSciezki();  String techPath; /* =  "E:\\Java\\archiwum\\klik.txt";*/ /*  = "E:\\Java\\archiwum\\klik.txt"; */ public String nowSc; // = "E:\\Java\\archiwum\\nowyPlik.txt";
	public  File fw = new File(filePath);  public File fTech ;// = new File(nowSc);
	public int liczbaLinii;  public int liczbaKolumn=3; public String[][] daneZpliku;  Date[] tableDates; int[] wynikiPomiaru; /*któreś z tego usun*/ int[] suroweOdczyty;
	static int ch; 
	 Scanner wybor = new Scanner(System.in);
	 SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM-dd");
	 
	 energia(){
		 System.out.println("Witamy w ramce energia "); 
		 
	// privateCaller(); 
		try{
			System.out.println("No:)!!!!");
			liczbaLinii = licznikLini(); 
			daneZpliku = new String[liczbaLinii][liczbaKolumn];
			daneZpliku = odczytPliku(); 
			
		}
		catch(IOException ee1){
			System.out.println(ee1); 
			
		}	  
		 
	 } // koniec konstruktor s
	 
	 
	public static void main(String[] args){
//		int optionBasee = 0; 
energia eng  = new energia();
		boolean decyzja = czyPlikIstnieje(); 
		
	 	if(decyzja==true){
			System.out.println("Te same sciezki grozi utrata danych ");
			
		}
		else{
		System.out.println("Ok ))");	
			
		}
		System.out.println(decyzja);
	 //eng.utworzPlik("Call_me_ok");
	// eng.odczytSciezki(); 
	 //eng.utworzPlik(); 
//0 tworzenie i zapis ścieżki 
	 
		//1 tworzenie pliku ok 
		//zAeng.utworzPlik(); 
		// 2 dopisek do pliku :)
		// eng.nadpiszPlik("Date_hour_value");
		// 3 odczyt danych z pliku 
		// 4 gotowa obróbka 
		//eng.obrobkaDanych(); // to nie to :)
		
			 
			
		
	}
	//1 FUNKCJA B DLA SPRAWDZENIA SCIEZKI DO PLIKU CZY JUZ TAKI PLIK NIE ISTNIEJE I STWORZENIE JEGO ZAGRAZA UTRACIE DANYCH 
	public static boolean czyPlikIstnieje(){
		//boolean liczbaPoz; 
		String sciezkaZpliku = odczytSciezki();
System.out.println("Z :::pilk "+sciezkaZpliku);	
		String sciezkaUzytkownika = sciezkaDoPliku(); 
		System.out.println("Z user:::: "+sciezkaUzytkownika);
		return sciezkaZpliku.equals(sciezkaUzytkownika); 
		
	}
	public static String sciezkaDoPliku1(){
		
		
		
		return "o";
		
	}
	public static String sciezkaDoPliku(){
		Scanner readFileName =  new Scanner(System.in);
	
		String[] dyskPlik =  {"E:\\Java\\archiwum\\",  " ",".txt" }; String sumTab = ""; 
		System.out.println("Wprowadz nazwe pliku: "); 
		dyskPlik[1] =  readFileName.nextLine(); 
        	
		
for(int i = 0 ; i<dyskPlik.length; i++)
{
	sumTab = sumTab + dyskPlik[i];
}
		
	
	
			return sumTab; 
	}
	
	public static String odczytSciezki(){
		String  dostep  =  "0" ; //sciezkaDoPliku();
		//this.filePath = filePath;
		try{
		File oTech  = new File("E:\\Java\\archiwum\\techniczne.txt");
		
		Scanner reTech  =  new Scanner(oTech);
		while(reTech.hasNextLine()){
			dostep= reTech.nextLine(); 
			System.out.println(dostep); 
			
			
		}
		}
		catch(FileNotFoundException ffe){
			System.out.println(ffe);
			
		}
		return dostep ; // ?? 
	}
	public void utworzPlik(String coss/*to nie wpływa na nic */)
	{  // funkcja tworzy plik technicnzy z sciezka dostepu 
	
		String techPath = "E:\\Java\\archiwum\\techniczne.txt";  // wgrana ścieżką do programu 
		File fTech = new File(techPath); //String  filePath  = sciezkaDoPliku();  // jest wywołana 
		
			this.techPath = techPath; 
			this.fTech = fTech; 
			this.filePath = filePath; 
			//fTech ; 
			try{
	BufferedWriter wyjTech = new BufferedWriter(new FileWriter(fTech)); 
			wyjTech.write(filePath); 			
			wyjTech.close();
			System.out.println(" Tech File creted in: "); 
			String scz  =  fTech.getPath(); 
			System.out.println(scz); 
			}
		catch(IOException e) {
			System.out.println("Warning !! Error here !");
			System.out.println("From funkcjon: utworzPlik(int*) ");
		}		
		
	}
	public  void utworzPlik () {
		utworzPlik("Techniczny");
		
		try { //jesli styczen to nie rob nowej lini!!!
			BufferedWriter wyj = new BufferedWriter(new FileWriter(fw)); 
						
			wyj.close();
			System.out.println("File creted in: "); 
			System.out.println("Paths is:  ");
			String scz  =  fw.getPath(); 
			System.out.println(scz); 
		}
		catch(IOException e) {
			System.out.println("Warning !! Error here !");
			System.out.println("From funkcjon: utworzPlik() ");
		}	
	}
	public  void nadpiszPlik(String wynikWprowadzenia){
	try { 
			if(fw.exists()&&fw.canRead()){
			BufferedWriter wyj = new BufferedWriter(new FileWriter(fw, true));
			if(liczbaLinii==0){
			wyj.write(wynikWprowadzenia);
			wyj.close(); 
			}
			else{
			 
			wyj.newLine();
			wyj.write(wynikWprowadzenia);
			wyj.close();	
				
			}
			System.out.println("Entered the values: ");
			System.out.println(wynikWprowadzenia); 
			}
			else{
				System.out.println("Error: Cannot find a file in this path: "); 
				System.out.println(filePath);
			}
		}
		catch(IOException e) {
			System.out.println("Warning !! Error here !");
			System.out.println("From funkcjon: nadpiszPlik() ");
		}		
		
	}
	public int licznikLini () throws IOException
	{
		//filePath = odczytSciezki(); 
		//fw = new File(filePath);
		
      int iloscLini=0;            
      FileReader fr=new FileReader(fw);  
      BufferedReader br = new BufferedReader(fr);    
      String s;              
      while((s=br.readLine())!=null)    
      {
         iloscLini++;               
            
      }
      fr.close();
	  
	  
      System.out.println("Ilosc lini w pliku :"+iloscLini); //Print the line count
	  return  iloscLini; 
		
	}
	
	/*FUNKCJA  DO ODCZYTU DANYCH Z PLIKU */
	public  String[][] odczytPliku() throws IOException {
		//filePath = odczytSciezki(); 
		//fw = new File(filePath);
		int row = liczbaLinii; int col = liczbaKolumn; 
		String[][] odczyty; //  = "";
		
		odczyty   = new String[row][col];
try{		
		Scanner  wej =  new Scanner(fw);
		while(wej.hasNext()){
			for(int i = 0; i <row; i++)
		{
		for(int j = 0; j < col; j++)
		{
			odczyty[i][j] = wej.next(); 			
		}
		}
			 
		}

		
}
catch(IOException e)
{
	System.out.println("Warning !! Error here !");
	System.out.println("From funkcjon: odczytPliku()");
	System.out.println(e);
}
return odczyty; 
	}
	/*FUNKCJA ZWRACAJACA  DANE TYPU INT TABELE z wartości
SUROWE ODCZYTY WARTOSCI Z WYBRNEGO PRZEDZIALU DAT W FORMACIE INT 	*/
public  int[] selekcjaDat(String data1, String data2) throws Exception{
	 // jest produktem tej funkcji dane jako zmiennna globalna czy to zadziała w innej funkcji 
	int row = liczbaLinii; int col = liczbaKolumn; /*String[][] odczytPliku1*/;   /* tabela z datami do porównania */
	
	Date poczatek1 = sdf.parse(data1); 
	Date koniec1 = sdf.parse(data2);
	
		
		
		
		
		System.out.println("Wprowadzona data poczatkowa to:  ");
		System.out.println(poczatek1);
		System.out.println("Wprowadzona data koncowa to: ");
		System.out.println(koniec1);
		
		
	 
// inicjalizacja tablice
	tableDates = new Date[row];
	 
	suroweOdczyty = new int[row];
	              //     Fri Jan 17 00:00:00 CET 2020
	System.out.println("_______________________________________");
	System.out.println("|Data z wybranego przedzialu:  |Odczyt:|");
	System.out.println("---------------------------------------");
	for(int i = 0; i <row; i++)
		{
		for(int j = 0; j < 1; j++) // "odpytujemy pierwszy rząd"
		{
			tableDates[i]=sdf.parse(daneZpliku[i][j]); 
			
				if((tableDates[i].compareTo(poczatek1)>=0)  && (tableDates[i].compareTo(koniec1)<=0)){
					suroweOdczyty[i] = Integer.parseInt(daneZpliku[i][2]);
				//System.out.println("_______________________________________");	
				System.out.println("| "+tableDates[i]+" | " +suroweOdczyty[i] +" |");
				System.out.println("---------------------------------------");
				}
				//else {System.out.println("Pozostale daty " +tableDates[i]);} // tego nie !!!!
			 
		}
		}
	
 
	System.out.println("Udalo sie nie udalo sie  ");
	
	return  suroweOdczyty; 
	
		}
		/*FUNKCJA DO OBRÓBKI DANYCH WYWLICZA SREDNIA DOBOWA I GODZINOWA */
public  int obrobkaDanych(String d1, String d2) {
	/*int[] roznice*/;  long liczbaDni= 0; int sredniaDobowa=0; double sredniaGodzinowa=0;      int liczbaDni1=0;
	int parseLong1 =  0; 
	try{
		selekcjaDat(d1, d2); 
		liczbaDni= roznicaDni(d1, d2); // zmienna typu long 
	}
	catch(Exception ep){
		
		System.out.println(ep);
		
	}
	parseLong1 =  (int)liczbaDni; 
int[] bezZera = Arrays.stream(suroweOdczyty).filter(num -> num != 0).toArray(); 
//roznice = new int[bezZera.length-1]; 
//numbers = list.toArray(new Integer[list.size()]);

liczbaDni1 = bezZera.length-1; 
 	/*for(int k =0; k < bezZera.length; k++){
		System.out.println("obrobione" +bezZera[k] ); 
		
		
		
	}*/
	
	//System.out.println("Dlugosc tablicy to ile jest " + liczbaDni1 );
	//System.out.println("Roznica to jest: " +srednia); 
	
	// czesc oblicza srednia dobowa 
	sredniaDobowa= ((bezZera[liczbaDni1]-bezZera[0])/parseLong1);
	//System.out.println(""); 
	System.out.println("Srednia dobowa " +sredniaDobowa +" kWh"); 
	
	
		// wyznaczam średnią godzinową mozesz przeliczyć 
	//sredniaGodzinowa= ((bezZera[liczbaDni1]-bezZera[0])/(parseLong1*24));	
	//System.out.println("Godzinowa: " +sredniaGodzinowa);
		
	
	
	
	return sredniaDobowa;  // n ic 
}

public  long roznicaDni(String poczatek, String koniec) throws Exception{
	String d1 = poczatek;
	String d2 = koniec;
	LocalDate dd1 = LocalDate.parse(d1);
	LocalDate dd2 = LocalDate.parse(d2);
	long d12 = ChronoUnit.DAYS.between(dd1,dd2);
	if(dd1.compareTo(dd2) > 0) {
         System.out.println("Dzien  1 jest  pod dniu  2");
      } else if(dd1.compareTo(dd2) < 0) {
         System.out.println("Dzien 1 jest przed  dniem   2");
      } else if(dd1.compareTo(dd2) == 0) {
         System.out.println("Oba dni te same ");
      }
	return d12; 
	
}
}