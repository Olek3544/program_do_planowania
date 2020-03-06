package database;
/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement; */
//import javax.swing.JFrame;
import java.util.Scanner;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.JFrame;
public class Main /*extends JFrame  implements ActionListener*/ {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//getConnection(); //
		int selection;
		System.out.println("Hi Eclipse ");
		System.out.println("1 testy programu ");
		System.out.println("2 uruchomienie programu   ");
		System.out.println("Podaj wlasciwa liczbe   ");
		Scanner ent = new Scanner(System.in);
		selection = 	ent.nextInt(); 
		ent.close();
		//WYLACZONE POLACZENIE Z BAZA DANYCH TYMCZASOWO 
		/*polacz pz = new polacz();
		pz.createTable(); */
		if(selection==2) { 
			// wygenerujesz okienko z programem 
			
			okienko ok  = new okienko(); 
			ok.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ok.setVisible(true);
		String a1 = "BCR ";
		String b1 = "DDDD";
		String tabliczka =  a1+b1; 
		System.out.println(tabliczka);
		}
		else if(selection==1)
		{
			/*czêœæ testowa */
			
			System.out.println("Experimental department   :)  ");
			polacz p1  = new polacz(); 
		//	p1.generatorPytan(10, "SomethingNew");
			p1.generujNazweMiesiaca(); 
			//p1.getsomedata();
			//p1.poletekstowe();
			
		}
//System.out.println("Hi Eclipse "); 
	}
	// zaczoles wczoraj 
	/*public static void createTable() throws Exception {
		try {
			Connection con = getConnection();
			//PreparedStatement create =  con.prepareStatement("	CREATE TABLE IF NOT EXISTS carsdb1(id int AUTO_INCREMENT, marka varchar(20), model varchar(20), PRIMARY KEY (id))");
			
			create.executeUpdate(); 
			
		}
		catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("Function completed");
		};
	}
public static Connection getConnection() throws Exception{
	
	
	
} */
}
