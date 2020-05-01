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
public static String readFilePath(){
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
	
	
	return dostep; 
} 
public static boolean  compTwoPath(String sk1,  String sk2){
	/*String s1; String s2; */
	return sk1.equals(sk2);
	//return false; 
}
public static void createFile () {
	String s1 = createPath(); 
	String s2 = readFilePath();
	boolean compP1 =  compTwoPath(s1,s2) ;
	  if(compP1==false) {
		  System.out.println("Ok >>>>");
	File fw = new File(s1); 
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
	  else /*jesli prawda*/{System.out.println("Podana nazwa pliku juz istnieje, wprowadz inna nazwe pliku ");
	  createFile(); // czy to nie rekurencja ??
}	  
}	 
	 
 }