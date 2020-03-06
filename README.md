# program_do_planowania
Skrócony opis programu do planowania budżetu domowego. 
1.	Cel powstania programu
- stworzenie prostego wygodnego w obsłudze programu do planowania i monitorowania budżetu domowego,
- rozwijanie umiejętności programistycznych w języku Java, 
- możliwość ciągłego użytkowania programu, co za tym idzie weryfikacji przyjętych rozwiązań, wyłapaniu ewentualnych błędów pojawiających podczas użytkowania programu 
- zgromadzenie wszystkich danych w jednym miejscu – bazie danych SQL
2. Zasada działania programu 
Program do planowania budżetu domowego wykonano w środowisku Eclipse Baza danych znajduję się  8.0.19 MySQL Community Server - GPL.  Do połączenia z bazą użyto JDBC connector.  Elementy GUI wykonano w Java Swing. Użytkownik wprowadza dane kolejno w okienka Mieszkanie, Prąd Gaz itp.  Klikając przycisk „dodaj” wartości zostaną dodane do tabeli należącej do  bazy danych SQL  Kliknięcie przycisku „pobierz ” spowoduje pobranie sum wartości wprowadzonych do bazy dla każdego miesiąca.  
3. Do dalszego rozwoju w programie
-  zoptymalizwoać kod, żeby był bardziej czytelny i łatwiejszy w późniejszej edycji
-  dodpracować GUI żeby było prostrze w obłsudze przez użytkownika
- dodać funkjce weryfikującą poprawność danych wprowadznaych przez użytkownika oraz nakazującą użytkownikowi wprowadzenie danych jeśli użytkownik nie wprowadził danych a kliknął przycisk doadaj. 

 

