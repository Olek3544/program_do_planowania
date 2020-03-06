package database;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
public class polacz {
	// 1. funkcja do nawi¹zania po³¹czenia z db sql 
	public /*static*/ Connection getConnection() throws Exception{
		try {
			String driver ="com.mysql.cj.jdbc.Driver";
			String url  = "";
			String username = "";
			String password  =  "";
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, username, password); 
			
			System.out.println("Connected");
			//conn.close();
			System.out.println("DisConnected");
			
			return conn; 
			
			
		}
		catch(Exception e) {System.out.println(e);}
		return null; 
		
		
	}
	public /*static*/ void createTable(String w1) throws Exception { // jeden ³añcuchc znaów jako zapytanie sql 
		try {
			Connection con = getConnection();
			//PreparedStatement create =  con.prepareStatement("	CREATE TABLE IF NOT EXISTS carsdb1(id int AUTO_INCREMENT, marka varchar(20), model varchar(20), PRIMARY KEY (id))");
			String zapytanie ="	INSERT INTO carsdb values(null, '" ; //Citroen', 'C3')";
			String l1 = "', '";  String l2 = "')";
			String zapytanie1 = zapytanie+w1+l1+l2;
			System.out.println(zapytanie1);
			System.out.println(w1);
			PreparedStatement create =  con.prepareStatement(w1);
			create.executeUpdate(); 
			con.close();
			
		}
		catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("Function completed");
		};
	}
	public void insertIntoTable (String zapytanieIns) throws Exception{
		/*funckja do wsuswania danych do sql 
		 * po staremu wywow³uje funkjce tworz¹ca zapytanie 
		 * wywo³aj insert stat
		 * nie po staremu */
		
		Connection  con1  = getConnection(); 
		PreparedStatement insertTodb  = con1.prepareStatement(zapytanieIns); 
		insertTodb.executeUpdate();
		con1.close();
	}
	public String[] getsomedata () throws Exception  
	{ Double mieszk = 1.88; String zapytanie =  generatorPytan(11,0,"null");
	String miesiac ="";  String[]  sumyLitery; 
	Double BudzetP , MieszkanieP, PradP, GazP, InternetTVP, DzieckoP,
	 WydatkiDodatkoweP, WydatkiBiezaceP, PaliwoP, WydatkiNieprzewidzianeP, RataKredytP ;//,
	Double  Budzet , Mieszkanie, Prad, Gaz, InternetTV, Dziecko, WydatkiDodatkowe, WydatkiBiezace, Paliwo, WydatkiNieprzewidziane, RataKredyt;
	Budzet =0.11; Mieszkanie = 0.11; Prad= 0.11; Gaz = 0.11; InternetTV=0.11; Dziecko=0.11; WydatkiDodatkowe=0.11; WydatkiBiezace=0.11; Paliwo=0.11; WydatkiNieprzewidziane=0.11; RataKredyt = 0.11;	
	try {
		Connection conn1 = getConnection(); 
		//PreparedStatement getData = conn1.prepareStatement("SELECT Sum(MieszkanieP) As SumaMieszkanie FROM plan_2020 ");
		PreparedStatement getData = conn1.prepareStatement(zapytanie);
		ResultSet result  =  getData.executeQuery();  
		//ArrayList<String> array  = new ArrayList<String>();
		while(result.next())
		{
			//String msc  = result.getString("miesiac");
			 Mieszkanie   = result.getDouble("sm");
			 Prad =   result.getDouble("sp");
					
			 Gaz   = result.getDouble("sg");
			 InternetTV   = result.getDouble("si");
			 Dziecko = result.getDouble("sd");
			 WydatkiDodatkowe   = result.getDouble("swd");
			 WydatkiBiezace   = result.getDouble("swb");
			 Paliwo   = result.getDouble("spal");
			 WydatkiNieprzewidziane =  result.getDouble("swn");
					 RataKredyt = 	result.getDouble("srk");	 
		/*	System.out.println("SumaMieszkanie to:  " +Mieszkanie);
			System.out.println("SumaPrad to:  " +Prad);
			System.out.println("SumaGaz to:  " +Gaz);
			System.out.println("SumaInternetTV to:  " +InternetTV);
			System.out.println("SumaDziecko to:  " +Dziecko);
			System.out.println("SumaWydatkiDodatkowe to:  " +WydatkiDodatkowe);
			System.out.println("Suma WydatkiBiezace to:  " + WydatkiBiezace);
			System.out.println("SumaPaliwo to:  " +Paliwo);
			System.out.println("Suma WydatkiNieprzewidziane to:  " + WydatkiNieprzewidziane);
			System.out.println("SumaRataKredyt to:  " +RataKredyt);*/
			
			//System.out.print(result.getString("last"));
		//	result.
		}
		}
		catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("Loading data completed :)");
		};
		sumyLitery = new String[10];
		sumyLitery[0] = Double.toString(Mieszkanie);
		sumyLitery[1] = Double.toString(Prad);
		sumyLitery[2] = Double.toString(Gaz);
		sumyLitery[3] = Double.toString(InternetTV);
		sumyLitery[4] = Double.toString(Dziecko);
		sumyLitery[5] = Double.toString(WydatkiDodatkowe);
		sumyLitery[6] = Double.toString(WydatkiBiezace);
		sumyLitery[7] = Double.toString(Paliwo);
		sumyLitery[8] = Double.toString(WydatkiNieprzewidziane);
		sumyLitery[9] = Double.toString(RataKredyt);
		//sumyLitery[0] = Double.toString(Mieszkanie);
		/*for(int i = 0; i< sumyLitery.length;i++ )
		{
			System.out.println("Po konwersji to: "+ sumyLitery[i]);
		}*/
		/*try {
			okienko ok = new okienko();
			ok.fillArea(sumyLitery);
		}
		catch(Exception e) {System.out.println(e);}*/
			
			return sumyLitery;	
		
		 
	}
	public double getsomeMonth () throws Exception  
	{ Double mieszk = 1.88; String zapytanie =  generatorPytan(12,0,"null");
	String miesiac = ""; 
		try {
		Connection conn1 = getConnection(); 
		//PreparedStatement getData = conn1.prepareStatement("SELECT Sum(MieszkanieP) As SumaMieszkanie FROM plan_2020 ");
		PreparedStatement getData = conn1.prepareStatement(zapytanie);
		ResultSet result  =  getData.executeQuery();  
		//ArrayList<String> array  = new ArrayList<String>();
		while(result.next())
		{
			//String msc  = result.getString("miesiac");
			 mieszk   = result.getDouble("SumaMieszkanie");
			System.out.println("SumaMieszkanie to:  " +mieszk);
			//System.out.print(result.getString("last"));
		//	result.
		}
		}
		catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("Loading data completed :)");
		};
			
			return mieszk;	
		
		 
	}
public String generatorPytan(int cznak, int kznak,  String wartosciText){
		/* jest to zawo³ane z action listener 
		 * kznak 1 lub 2 wsun lub wysun 
		 * plan ma 1 i robisz 11 12 itp */
		String zapytanieSQL ="";  int znak = cznak;
		String sumWyraz = wartosciText; // to musi byæ z okienka 
		String nazwa_msc = "null";
		String pNazwaTabeli = ""; 
		
		
		if (znak == 10) // SKUPIAMY SIE NA TEJ CZESCI NA RAZIE 17.02.2020 
		{ // zapytanie wsun do bazy  plan 
			/* obecnie generuje:
			  insert into planbud values('styczen', 10);
			  SKUPIAMY SIE NA TEJ CZESCI
			  */
			pNazwaTabeli = genNazwaTabeli(1);
			
			zapytanieSQL = "insert into  " +pNazwaTabeli+"values"+"(null, "+wartosciText+");";
			System.out.println(zapytanieSQL); //(zapytanieSQL)
		}
		else if(znak == 11)
		{  // zapytanie pobierz dane z bazy plan 
			
			pNazwaTabeli  =genNazwaTabeli(1);
			zapytanieSQL = "select Sum(MieszkanieP) as sm, Sum(PradP) as sp, Sum(GazP) as sg, Sum(InternetTVP) as si, Sum(DzieckoP) as sd, Sum(WydatkiDodatkoweP) as swd, Sum(WydatkiBiezaceP) as swb, Sum(PaliwoP) as spal, Sum(WydatkiNieprzewidzianeP) as swn, Sum(RataKredytP) as srk from "+pNazwaTabeli+";";
						System.out.println(zapytanieSQL);
			
		}
		else if (znak == 12)
		{  
			pNazwaTabeli = genNazwaTabeli(1);
			zapytanieSQL  = "select * from "+pNazwaTabeli+"where  miesiac ='marzec';";
			System.out.println(zapytanieSQL);
		}
		else if (znak == 20)
		{  // zapytanie pobierz dane z bazy plan 
			pNazwaTabeli = 	genNazwaTabeli(1);
			
			System.out.println(zapytanieSQL);
		}
		else {System.out.println("Nic nie ma, jak to sie pojawilo to nie dobrze");}
		if(kznak==1) {
		try {
			insertIntoTable(zapytanieSQL);
		}
		catch(Exception e) {System.out.println(e);}
		}
		else if(kznak==2)
		{
			try {
				getsomedata (); 
				
				}
				catch(Exception e) {System.out.println(e);}	
			
		}
		else {System.out.println("Nie odznaczono zle jak widac to ");}
		return zapytanieSQL;  
		
		
		
	}
	public String[] nazwyWartosci () {
String[]   tabWartosci ={"Mieszkanie ", "Prad ", "Gaz ", "InternetTV ", "Dziecko ", "WydatkiDodatkowe ", "WydatkiBiezace ", "Paliwo ", "WydatkiNieprzewidziane ", "RataKredyt "}; 
for(int i = 0; i<tabWartosci.length; i++)
{
System.out.println(tabWartosci[i]+" "+tabWartosci[i].length());


}
//nazwaTabeli = genNazwaTabeli(1);
		return tabWartosci;
		
	}
	public String genNazwaTabeli(int cinznak)
	{
		String pNazwaTabeli = "";  String[] nazwyTabel = { "plan_2020 ","planbud " , "realbud ", "rachunki ", "paliwo " }; // 4 elementy tabeli 
				//m = nazwaMiesiaca();
		if (cinznak == 1)
		{
			pNazwaTabeli =nazwyTabel[0];
			
			
			
		}
		else if (cinznak == 2)
		{
			pNazwaTabeli = nazwyTabel[1];
			
		}
		return pNazwaTabeli;
		 
		
	}
	public void poletekstowe () {
		String[] znaki = { ", ", "'", "'", "* ", " - ", " + ", "=","/", ")", "(", ";" }; // tablica 11 znaków  do sql 
		String[] poleceniaSQL = { "select ", "from ", "insert ", "into ", "values", "set ", "as ", "alter ", "table ",
				" where " , "Cout", "Avg", "Sum",
		   "between", "Update ", "Delete ", "inner join ", "left join ", "right join " }; // tablica znaków 19 polecenia sql 
		//String sumWyraz = wartosciText; // to musi byæ z okienka 
		String nazwa_msc = "null"; /*String[] kolumnySQL = {"raz,", "dwa", "trzy", "cztery"};*/ String strPozost = "10"; 
		String  pNazwaTabeli =  ""; //genNazwaTabeli(1);  // tymczasowo ustawiona na bud¿et no i jest to na rok 
		String[] kolumnySQL = { "miesiac", "BudzetP", "MieszkanieP", "PradP", "GazP", "InternetTVP", "DzieckoP",
				 "WydatkiDodatkoweP", "WydatkiBiezaceP", "PaliwoP", "WydatkiNieprzewidzianeP", "RataKredytP", "PozostaloP" };
		for(int i =0; i < 14;i++ )
		{
			System.out.println(i+" "+kolumnySQL[i]);
		}
		int c = -1 ; int d = 1; 
		String[] favorit = {"zero", "jeden", "dwa", "trzy",  "cztery", "piec" };
		while(c<=4) {
			c = c+d;
			System.out.println(favorit[c]);
			//System.out.println("Nasze c ::" + c ); 
			
			
		}
		
		
	}
	
	public String generujNazweMiesiaca()  // funkcja do utworzenia nazwy miesiaca musi byc jakaœ data co tym steruje 
	{
		Date naszaData  = new Date(); 
		System.out.println(naszaData.toString());
		System.out.println(naszaData.getTime());
		System.out.println(naszaData.getMonth()+1);
		System.out.println(naszaData.getYear()+1900);
		System.out.println(naszaData.getHours());
		SimpleDateFormat sdf  =  new SimpleDateFormat("E yyyy/MM/dd HH-mm-ss");
		System.out.println(sdf.format(naszaData));
		return "generujNazweMiesiaca";
	}
	

	
	
}  // KONIEC KLASY NIE TYKAJ 