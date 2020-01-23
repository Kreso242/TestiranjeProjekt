 #  Projekt za metode i tehnike testiranja programske podrške 2019./2020. :sunglasses:
## Opis aplikacije:
* projekt testira mobilnu aplikaciju (Android)
* aplikacija je osobno izrađena za jednu zajednicu
* u aplikaciji se testira rad kalendara s obavijestima
* korisnik nema puno mogućnosti osim postavljanja alarma jer se obavijesti dohvaćaju iz baze podataka (FireBase) kojoj on nema pristup

## Opis testiranja aplikacije:
### Koristi se:
* IntelliJ IDE, ver: 2019.3.1.
* Appium automation tool, ver: 1.15.1
* json server, ver:1.0-SNAPSHOT
* testNG, ver: 7.0.0
* maven, ver: 2.19
* emulator Android Studia
* Node.js

### Page Object Model

### Testiraju se 4 Test Case-a:
* Prohodnost kroz aplikaciju
* Postavljanje alarma
* Testiranje baze podataka (RealM) 
  * testira se ostaju li podatci o spremljenom alarmu u lokalnoj bazi
* Brisanje alarma izbaze

###  Napomena:
Testiraju se samo 4 Test Case-a jer je aplikacija osobno izrađena i još je u
izradi te ima mali broj mogućnosti gdje korisnik može nešto kliknuti ili 
napraviti jer je svrha kalendara samo da šalje obavijesti ako to korisnik želi.
Najbitniji dio za aplikaciju je Firebase baza podataka iz koje se dohvaćaju
događaji (event), ali to nisam uspio testirati, to jest spojiti sa IntelliJ-om
koliko god sam pokušavao.

#### Video testiranja je priložen u repozitoriju

## Instalacija i pokretanje:

1. Instalacija IntelliJ okruženja
* [IntelliJ download link](https://www.jetbrains.com/idea/download/#section=windows)
2. Instalacija Appium-a
* [Appium download link](http://appium.io/)
3. Instalacija Android Studia (zbog potreba emulatora)
* [Android Studio download link](https://developer.android.com/studio)
4. Java Development Kit
* [JDK download link](https://www.oracle.com/technetwork/java/javase/downloads/index.html)
5. TestNG dependency
* [TestNG dependency](https://mvnrepository.com/artifact/org.testng/testng/7.0.0)
6. Node.js
* [Node.js download link](https://nodejs.org/en/download/)
7. Upute za pokretanje projekta
* [Link za upute](https://drive.google.com/open?id=1dJX9cYHiPAs-K3DrkYfgPi1khmX0xHns)




