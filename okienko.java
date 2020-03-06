package database;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/*klasa do utworzenia GUI dla milszgo ko¿ystania przez innych u¿ytkowników */
public class okienko extends JFrame implements ActionListener{
// deklarcje zmiennych etykiet 
	JLabel lmieszkanie, lprad, lmiesiac, lgaz, lnetTV, ldziecko, lwydatkidodatkowe, lwydatkibiezace, lpaliwo, lwydatkinieprzewidziane, lratakredyt, lpozostalo , lpolesql; 
	JTextField tmieszkanie, tprad ,  tmiesiac, tgaz, tnetTV, tdziecko, twydatkidodatkowe, twydatkibiezace, tpaliwo, twydatkinieprzewidziane, tratakredyt, tpozostalo;
	JTextArea danesql; 
	JScrollPane przewin; // = new JScrollPane(danesql); 
	JButton dodaj, bwysun; 
	JComboBox cbmiesiac;
	String mieszkanie, prad;   final String nowLinia =  "\n";  String txt = ""; 
	public okienko() {
		//String mysue  = jakis; 
		//System.out.println(mysue); 
		setSize(800,700); 
		setLayout(null);
		setTitle("Planowanie przyszlego roku");
		setLocationRelativeTo(null); // powoduje wyœweitlenie okienka na œrodku 
	//	getContentPane().setBackground(Color.gray); 
		//  przywo³anie etykiety nad polem tekstowwym 
		/*lpolesql  = new JLabel("Ponizej wyswietlam parametry z array list");
		lpolesql.setBounds(280, 30, 250, 50);
		lpolesql.setOpaque(true);
		add(lpolesql); */ 
		// inicjujemy  Jtexr 
		danesql= new JTextArea(25,30);
		danesql.setOpaque(true);
		danesql.setBounds(30, 350, 250, 300);
	przewin	= new JScrollPane(danesql);
	przewin.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	przewin.setBounds(30, 350, 250, 300);
	przewin.getViewport().setBackground(Color.WHITE);
	przewin.getViewport().add(danesql); 
	//add(przewin,BorderLayout.CENTER); 
		//danesql.append(Arrays.toString(pokazTabeli) +nowLinia);
		/*for(int i = 0; i<pokazTabeli.length;i++)
		{
			txt = txt+ pokazTabeli[i]+nowLinia;
			danesql.setText(txt);
		} */
		/*for(int i = 0; i<pokazTabeli.length;i++)
		{
			for(int j =0; j <pokazTabeli[i].length;j++) {
				txt = txt+ pokazTabeli[i][j]+" ";
				
			}
			txt = txt+"\n";
			danesql.setText(txt);
		}*/
		
		add(przewin);
		// etykieta dla miesica (zrobiæ tu listê roziwjan¹) tymczsowo marka pojazdu 
		lmiesiac = new JLabel("Miesiac"); 
		lmiesiac.setBounds(30,30,80,50);
		lmiesiac.setForeground(Color.black);
		lmiesiac.setOpaque(true); // resetuje domyslny kolor etykiety 
		lmiesiac.setBackground(Color.white); 
		 add(lmiesiac); 
		// ETYkieta na mieszkanie tymczsowo model pojazdu :) 
		 lmieszkanie = new JLabel("Mieszkanie"); 
		 lmieszkanie.setBounds(30,110,80,50);
		 lmieszkanie.setForeground(Color.black);
		 lmieszkanie.setOpaque(true);
		 lmieszkanie.setBackground(Color.white); 
			 add(lmieszkanie);
			 // etykieta prad 
			 lprad = new JLabel("Prad"); 
			 lprad.setBounds(30,190,80,50);
			 lprad.setForeground(Color.black);
			 lprad.setOpaque(true);
			 lprad.setBackground(Color.white); 
				 add(lprad);
				 lgaz = new JLabel("Gaz"); 
				 lgaz.setBounds(30,270,80,50);
				 lgaz.setForeground(Color.black);
				 lgaz.setOpaque(true);
				 lgaz.setBackground(Color.white); 
					 add(lgaz);
					 // etykieta internet tv
			 lnetTV = new JLabel("InternetTV"); 
			 lnetTV.setBounds(270,30,80,50);
			 lnetTV.setForeground(Color.black);
			 lnetTV.setOpaque(true);
			 lnetTV.setBackground(Color.white); 
				 add(lnetTV);
				 // etykieta dzieci 
				 ldziecko = new JLabel("Dziecko"); 
				 ldziecko.setBounds(270,110,80,50);
				 ldziecko.setForeground(Color.black);
				 ldziecko.setOpaque(true);
				 ldziecko.setBackground(Color.white); 
					 add(ldziecko);
					 // etykieta wydatki dodatkowe 
	 lwydatkidodatkowe = new JLabel("Wydatkidodatkowe"); 
	 lwydatkidodatkowe.setBounds(270,190,80,50);
	 lwydatkidodatkowe.setForeground(Color.black);
	 lwydatkidodatkowe.setOpaque(true);
	 lwydatkidodatkowe.setBackground(Color.white); 
			 add(lwydatkidodatkowe);	
			 // wyda
			 lwydatkibiezace = new JLabel("Wydatkibiezace"); 
			 lwydatkibiezace.setBounds(270,270,80,50);
			 lwydatkibiezace.setForeground(Color.black);
			 lwydatkibiezace.setOpaque(true);
			 lwydatkibiezace.setBackground(Color.white); 
					 add(lwydatkibiezace);	
					 lpaliwo = new JLabel("Paliwo"); 
					 lpaliwo.setBounds(510,30,80,50);
					 lpaliwo.setForeground(Color.black);
					 lpaliwo.setOpaque(true);
					 lpaliwo.setBackground(Color.white); 
							 add(lpaliwo);	//lwydatkinieprzewidziane
							 lwydatkinieprzewidziane = new JLabel("Wydatkinieprzewidziane"); 
							 lwydatkinieprzewidziane.setBounds(510,110,80,50);
							 lwydatkinieprzewidziane.setForeground(Color.black);
							 lwydatkinieprzewidziane.setOpaque(true);
							 lwydatkinieprzewidziane.setBackground(Color.white); 
									 add(lwydatkinieprzewidziane);				
	//lratakre
									 lratakredyt = new JLabel("Rata kredytu"); 
									 lratakredyt.setBounds(510,190,80,50);
									 lratakredyt.setForeground(Color.black);
									 lratakredyt.setOpaque(true);
									 lratakredyt.setBackground(Color.white); 
											 add(lratakredyt);
			// pole tekstowe na miesiac (zrobiæ tu listê rowijan¹ ) 
/* POLA TEKSTOWE ZACZYNAJ¥ SIÊ TU !!!!!!!!*/
			 cbmiesiac = new JComboBox();
			 cbmiesiac.setBounds(140,30,100,50); 
			 cbmiesiac.addItem("styczen");
			 cbmiesiac.addItem("luty");
			 cbmiesiac.addItem("marzec");
			 cbmiesiac.addItem("kwiecien");
			 cbmiesiac.addItem("maj");
			 cbmiesiac.addItem("czerwiec");
			 cbmiesiac.addItem("lipiec");
			 cbmiesiac.addItem("sierpien");
			 cbmiesiac.addItem("wrzesien");
			 cbmiesiac.addItem("pazdziernik");
			 cbmiesiac.addItem("listopad");
			 cbmiesiac.addItem("grudzien");
			 add(cbmiesiac);
			 // pole na mieszkanie  
			 tmieszkanie = new JTextField("");
			 tmieszkanie.setBounds(140,110,100,50); 
			 add(tmieszkanie);
			 // pole pradu 
			 tprad = new JTextField("");
			 tprad.setBounds(140,190,100,50); 
			 add(tprad);
			 
			 // pole gazu 
			 tgaz = new JTextField("");
			 tgaz.setBounds(140,270,100,50); 
			 add(tgaz);
			 // pole neta i tv 
			 tnetTV = new JTextField("");
			 tnetTV.setBounds(380,30,100,50); 
			 add(tnetTV);
			  // na dziecko
			 tdziecko = new JTextField("");
			 tdziecko.setBounds(380,110,100,50); 
			 add(tdziecko);
			 // na wydatki dodatkowe 
			 twydatkidodatkowe = new JTextField("");
			 twydatkidodatkowe.setBounds(380,190,100,50); 
			 add(twydatkidodatkowe);
			 //  na wydatki biezace 
			 twydatkibiezace = new JTextField("");
			 twydatkibiezace.setBounds(380,270,100,50); 
			 add(twydatkibiezace);
			 // na paliwo 
			 tpaliwo = new JTextField("");
			 tpaliwo.setBounds(620,30,100,50); 
			 add(tpaliwo);
			 // twydatkinieprzewidziane
			 twydatkinieprzewidziane = new JTextField("");
			 twydatkinieprzewidziane.setBounds(620,110,100,50); 
			 add(twydatkinieprzewidziane);
			 tratakredyt = new JTextField("");
			 tratakredyt.setBounds(620,190,100,50); 
			add(tratakredyt); /*
			 tpozostalo = new JTextField("");
			 tpozostalo.setBounds(140,110,100,50); 
			 add( tpozostalo);*/
			 
			 
/* PRZYCISK NA RAZIE TYLKO JEDEN */ 
			 dodaj  = new JButton("dodaj");
			 dodaj.setBounds(510,270,100,50); 
			 
				add(dodaj); 
			
				dodaj.addActionListener(this);

				 bwysun = new JButton("pobierz");
				bwysun.setBounds(620,270,100,50); 
				 	
					add(bwysun); 
				
					bwysun.addActionListener(this);
	} // koniec konstruktora 
/*public void fillArea  (String[] sumyZapytan)
{
	
	
	//return "nothing_special"; 
	/*for(int i = 0; i<pokazTabeli.length;i++)
	{
		for(int j =0; j <pokazTabeli[i].length;j++) {
			txt = txt+ pokazTabeli[i][j]+" ";
			
		}
		txt = txt+"\n";
		danesql.setText(txt);
	}
	for(int i = 0; i<sumyZapytan.length;i++)
	{
		System.out.println("A z okienka "	+ sumyZapytan[i]);
		//danesql.setText(txt);
	} 
	System.out.println("Funkcja fillarea czy dziala ??????");
	for(int i = 0; i<sumyZapytan.length;i++)
	{
		txt = txt+ sumyZapytan[i]+nowLinia;
		System.out.println(txt);
		danesql.setText(txt);
		
	} 
}*/
	public void actionPerformed(ActionEvent ee) {
		String[] wartosciTabeli ;  String sumaWprowadzen = ""; String wysun = ""; // tylko incicja
		String[] przecinek = {", ","'","'"};  double sumaKolumny;/* String[] sumyZapytan;*/
		wartosciTabeli = new String[11];
		Object sygnalGdzie = ee.getSource();
		if(sygnalGdzie==dodaj) {
		try {
			System.out.println("Wcisnoles przycisk :) ");
			wartosciTabeli[0] =  (String)cbmiesiac.getSelectedItem();
			wartosciTabeli[1]  =  tmieszkanie.getText();
			wartosciTabeli[2] =  tprad.getText();
			wartosciTabeli[3] =  tgaz.getText();
			wartosciTabeli[4] =  tnetTV.getText();
			wartosciTabeli[5] =  tdziecko.getText();
			wartosciTabeli[6] =  twydatkidodatkowe.getText();
			wartosciTabeli[7] =  twydatkibiezace.getText();
			wartosciTabeli[8] =  tpaliwo.getText();
			wartosciTabeli[9] =  twydatkinieprzewidziane.getText();
			wartosciTabeli[10] =  tratakredyt.getText();
			sumaWprowadzen =  przecinek[1]+wartosciTabeli[0]+przecinek[1]+przecinek[0]+wartosciTabeli[1]+przecinek[0]+wartosciTabeli[2]+przecinek[0]+wartosciTabeli[3]+przecinek[0]+wartosciTabeli[4]+przecinek[0]+wartosciTabeli[5]+przecinek[0]+wartosciTabeli[6]
					+przecinek[0]+wartosciTabeli[7]+przecinek[0]+wartosciTabeli[8]+przecinek[0]+wartosciTabeli[9]+przecinek[0]+wartosciTabeli[10];
			
			System.out.println("SUma zapytania:");
			System.out.println(sumaWprowadzen);
		polacz pz = new polacz();
		//pz.createTable(mieszkanie, prad);  // za³adowac argumenty 
		
		pz.generatorPytan(10, 1,sumaWprowadzen);  // insert some data 
		}
		catch(Exception e) {System.out.println(e);}
		} // koniec pierwszego ifa 
		
		else if(sygnalGdzie==bwysun) {
			try {
				
				//sumaKolumny = 
				
				polacz gz = new polacz(); 
				sumaWprowadzen = "null";
				String[] sumyZapytan =  gz.getsomedata (); 
				String[] nazwyNazw = gz.nazwyWartosci();
				/*for(int i = 0; i<sumyZapytan.length;i++)
				{
					System.out.println("Okienko okienko " + sumyZapytan[i]);
				}*/
				for(int i = 0; i<sumyZapytan.length;i++)
				{
					txt = txt+ nazwyNazw[i]+ sumyZapytan[i]+nowLinia;
					//System.out.println(txt);
					danesql.setText(txt);
					
				}
				/*wysun = Double.toString(sumaKolumny);
				System.out.println("Suma mieszaknie z okna  " + wysun);
				danesql.setText(wysun);*/
			}
			catch(Exception e) {System.out.println(e);}
		} // koniec pierwszego ifa 
			
			
		
		else {System.out.println("NIc nie wybrano to zle ");}
	}
}
