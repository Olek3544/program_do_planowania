import java.io.*;  // do plików to też służy 
import java.util.*; // tu jest skaner tablice i listy 
import java.lang.*;
/* rzeczy do paczki czas i java */
import java.time.*; 
/*import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;  
import java.time.temporal.ChronoUnit;  */
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.DateFormat;
 class energiaa {
	 /*Nie definiuj żądnych zmiennych globalnych tutuaj przynajmniej na z razie*/
public static void main(String[] args){
	
	System.out.println("Do not give up and use experience :) ");
	/*1 zajmiemy się plikami:
	- utworzenie ściezki do plku  nazwie użytkownika
- sprawdzenie czy taki już nie istnieje 
 - jak istnieje poproś o ina nazwa	
 -- utworzenie pliku o nazwi domyślnej nie będzie w tedy błeu ale funkcja do sp[rawdzania ściezki niech będzie */
	
	
}

public /*static*/ String simpleDateFormatt()
{
	SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM-dd");
	 
/*
2 wygeneruj liczbę miesiaca
3  wygeneruj date w simpleDateFormatt na podstawie biezacej daty
*/
LocalDate lld =  LocalDate.now();
int msc = 0; 
//int msc =  LocalDate.getMonthValue(); 
 //String numMonth = dateFormat.format(lld);
 String numMonth = ""; 
System.out.println("Teraz mamy: "+ lld); 
System.out.println("A miesiac: "+ msc);
System.out.println("A po konwersji : "+ numMonth);
//numMonth = 
return numMonth; 
}
/*---------------------------------------------------*/
/*FUNKCJA DO WYGENEROWANIA NAZWY MIESIACA PO POLSKU */	
public static String monthName ()
{  
//String numerM  = simpleDateFormatt(); 
int numerM = 5; // = Integer.parseInt(); 
String nazwa_msc = ""; // init string 
	
	switch (numerM) // to musi pójść do funkcji kreującej ściżkli do folderów
	{
	case 1:
		nazwa_msc = "styczen";
		break;
	case 2:
		nazwa_msc = "luty";
		break;
	case 3:
		nazwa_msc = "marzec";
		break;
	case 4:
		nazwa_msc = "kwiecien";
		break;
	case 5:
		nazwa_msc = "maj";
		break;
	case 6:
		nazwa_msc = "czerwiec";
		break;
	case 7:
		nazwa_msc = "lipiec";
		break;
	case 8:
		nazwa_msc = "sierpien";
		break;
	case 9:
		nazwa_msc = "wrzesien";
		break;
	case 10:
		nazwa_msc = "pazdziernik";
		break;
	case 11:
		nazwa_msc = "listopad";
		break;
	case 12:
		nazwa_msc = "grudzien";
		break;
	default:
		System.out.println("Nie ma takiego miesiaca ");
		break;
	}
/* select case 
zebrać z  poprzednich projektow*/
return nazwa_msc; 

}
/*-----------------------------------------*/
/*NA FUNKCJA WYZNACZA ILOSC LINI  W PLIKU */
public int licznikLini () throws IOException
	{
		//filePath = odczytSciezki(); 
		//fw = new File(filePath);
		int iloscLini=0;
		String sciezkaPliku = readFilePath(); 
		boolean bb1 = checkIfFileExist(sciezkaPliku);  // troche bez sensu bo ładujesz jakiś plik 
		File fw = new File(sciezkaPliku);
		if(bb1==true)
		{
                  
      FileReader fr=new FileReader(fw);   // a tu ładujesz go znowu 
      BufferedReader br = new BufferedReader(fr);    
      String s;              
      while((s=br.readLine())!=null)    
      {
         iloscLini++;               
            
      }
      fr.close();
	  
	  
      System.out.println("Ilosc lini w pliku :"+iloscLini); //Print the line count
		}
		else // jesli falsz czyli nie ma pliku 
		{
			System.out.println("Error form funkcjon licznikLini(), can not find file");
			
		}
	  return  iloscLini; 
		
	}
public static String createPath(){
Scanner readFileName =  new Scanner(System.in);
	
		String[] dyskPlik =  {"E:\\Java\\archiwum\\",  " ",".txt" }; String sumTab = ""; 
		System.out.println("Wprowadz nazwe pliku: "); 
		dyskPlik[1] =  readFileName.nextLine(); 
        	
		
for(int i = 0 ; i<dyskPlik.length; i++)
{
	sumTab = sumTab + dyskPlik[i];
}
		
	
	
			return sumTab;	
	
	//return "Olek"; 
}
public static String createPath ( int c) {
String xpath;
String[] tableFileName={/*pliki z cpp nazwy itp*/}; // plus końcówka txt
String folderDocelowy = ""; // początku folderu
// wszystkie 4 przypadki jakie folery nazwy mają być
if (c==0)
{
//for // zrobi petle sumjaca  może nie koniecznie
}
else if (c==1)
{

}
else if(c==2)
{

}
return "sth";
}
public static  boolean checkIfFileExist(String bfilePath){
	File fcheck  =  new File(bfilePath); // chce sprawdzic ta odczytana  
	if(fcheck.exists()&&fcheck.canRead()) {
		// jak jest 
		return true; 
	}
	else // jak nie ma 
	{
		
		return false; 
	}
	
	
	
}
public static String readFilePath(){
	String  dostep  =  "0" ;
		
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
	
	
	return dostep; 
} 
public static boolean  compTwoPath(String sk1,  String sk2){
	
	return sk1.equals(sk2);

}
public static void createFile () {
	String s1 = createPath(); 
	String s2 = readFilePath();
	boolean compF1  =  checkIfFileExist(s2); // sprawdzamy czy ta sciezke co "odczytano da się odcz"
	boolean compP1 =  compTwoPath(s1,s2) ;
	  if((compP1==false)&&(compP1==false)) {
		  System.out.println("Ok >>>>");
	File fw = new File(s1); 
	try { //jesli styczen to nie rob nowej lini!!!
			BufferedWriter wyj = new BufferedWriter(new FileWriter(fw)); 
						
			wyj.close();
			System.out.println("File creted in: "); 
			System.out.println("Paths is:  ");
			String scz  =  fw.getPath(); 
			System.out.println(scz); 
			createFile(s1); //  zapis techniczny scieżki 
		}
		catch(IOException e) {
			System.out.println("Warning !! Error here !");
			System.out.println("From funkcjon: utworzPlik() ");
		}
	
	  }
	  else /*jesli prawda*/{System.out.println("Podana nazwa pliku juz istnieje, wprowadz inna nazwe pliku ");
	  createFile(); // czy to nie rekurencja ??
}	  
}
public static void createFile(String ffilePath)	{
	String techPath = "E:\\Java\\archiwum\\techniczne.txt"; 
		File fTech = new File(techPath); 
		
			
			try{
	BufferedWriter wyjTech = new BufferedWriter(new FileWriter(fTech)); 
			wyjTech.write(ffilePath); 			
			wyjTech.close();
			System.out.println(" Tech File creted in: "); 
			String scz  =  fTech.getPath(); 
			System.out.println(scz); 
			}
		catch(IOException e) {
			System.out.println("Warning !! Error here !");
			System.out.println("From funkcjon: createFile(String*) ");
		}
	
	
	
}
public  void saveSingleData  (String wynikWprowadzenia){
	String sciezkaPliku = readFilePath();  int liczbaLinii = 0; 
		boolean bb1 = checkIfFileExist(sciezkaPliku);  // troche bez sensu bo ładujesz jakiś plik 
		File fw = new File(sciezkaPliku);
		try {
		 liczbaLinii = licznikLini(); 
		}
		catch(IOException plk){
			
			System.out.println(plk); 
			
		}
		if(bb1==true){
	try { 
			/*if(fw.exists()&&fw.canRead()){*/
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
			//}
			/*else{
				System.out.println("Error: Cannot find a file in this path: "); 
				System.out.println(filePath);*/
		}
		
		catch(IOException e) {
			System.out.println("Warning !! Error here !");
			System.out.println("From funkcjon: nadpiszPlik() ");
		}
		}
else { // jesli falsz to nie mapliku
	System.out.println("Can not find a file, please createFile; From funkcjon saveSingleData()");
	
}		
		
	} 
	 
 }
