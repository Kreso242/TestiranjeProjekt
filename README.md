
#Projekt za metode i tehnike testiranja programske podrške 2019./2020.

Opis aplikacije:
	 projekt testira mobilnu aplikaciju (Android)
	 aplikacija je osobno izrađena za jednu zajednicu
	 u aplikaciji se testira rad kalendara s obavijestima
	 korisnik nema puno mogućnosti osim postavljanja alarma jer se obavijesti
	  dohvaćaju iz baze podataka (FireBase) kojoj on nema pristup

Opis testiranja aplikacije:
	 koristi se:
		 IntelliJ IDE, ver: 2019.3.1.
		 Appium automation tool, ver: 1.15.1
		 json server, ver:1.0-SNAPSHOT
		 testNG, ver: 7.0.0
		 maven, ver: 2.19
		 emulator Android Studia

	 Page Object Model

	 testiraju se 4 Test Case-a:
		1.) Prohodnost kroz aplikaciju
		2.) Postavljanje alarma
		3.) Testiranje baze podataka (RealM)
			- testira se ostaju li podatci o spremljenom alarmu
			  u lokalnoj bazi
		4.) Brisanje alarma izbaze

Testiraju se samo 4 Test Case-a jer je aplikacija osobno izrađena i još je u
izradi te ima mali broj mogućnosti gdje korisnik može nešto kliknuti ili 
napraviti jer je svrha kalendara samo da šalje obavijesti ako to korisnik želi.
Najbitniji dio za aplikaciju je Firebase baza podataka iz koje se dohvaćaju
događaji (event), ali to nisam uspio testirati, to jest spojiti sa IntelliJ-om
koliko god sam pokušavao.


Upute za korištenje GitHub repository-a:




