# Treća grupa zadataka ![mixed](https://img.shields.io/badge/noop-mixed-yellowgreen)
---

<div style = "text-align:justify">
	
> Ova grupa zadataka sastoji se od četiri zadatka. Među njima prvi zadatak je izuzetno jednostavan i vezan je uz SOLID principe dizajna, u drugom trebate primijeniti observer pattern, u trećem command pattern i konačno u posljednjem abstract factory pattern.

</div>
&nbsp;

![materijaliPVJ](https://img.shields.io/badge/see%40merlin-materijali--predavanja--vje%C5%BEbe-blue) &rarr; `prije rješavanja proučite materijale s predavanja i vježbi`

&nbsp;

## Zadatak 3.1. ![simple](https://img.shields.io/badge/complexity-**-green) 
---
<div style = "text-align:justify">

Razvili ste inteligentu aplikaciju za autonomnu vožnju broda, aviona, helikoptera i automobila. Vaš front end klijent u ovisnosti koji zadatak trebate riješiti dinamički mora kreirati bilo koji tip autonomnog, inteligentnog pilota i zadati mu da vozi pripadajući objekt (avion, brod, helikopter ili automobil) → za postojeću realizaciju to nije slučaj (slika 1). Postojeće rješenje je načelno realizirano kako je prikazano na priloženom dijagramu klasa na slici 1. Vaš zadatak je da primjenom principa **DIP** omogućite bolje rješenje koje će biti fleksibilnije i jednostavnije za održavanje. Omogućite simulaciju bilo kojeg tipa inteligentnog vozača/pilota.

<p align="center">

<img src="https://8pmpxg.db.files.1drv.com/y4mIwm86XG-80Hgs5s2je9Vz4p-UlzZRjurInyRKRDZs1FCQ-XR0S1aRX6DP7D9wpfy-zOj1P-CS5Fv-RwE325bhJxI1Cev74Pd4Z5O9YKN7OCWdyQwRw993N_zZUKPn_IkGY-_r6fbel7ncS3n7oKS2yXY-1BRebRqBIluzKpUMPfUOrOeaRjAx4FLsVP1u7w9ap4h_iQPOBm1ehSUgOdeNw?width=953&height=514&cropmode=none"> </p>
<p align="center"> <b>Slika 1</b> Dijagram klasa za rješenje bez primjene DIP principa</p>


## Zadatak 3.2. ![simple](https://img.shields.io/badge/complexity-**-green) 
---
Dio ste tima koji radi na servisu koji obaviještava sudionike u prometu o stanju na cestama. Stanje na cestama postavite kao Enumerated tip `StateEnu`:

- **GraničniZastoj**
- **PrekidZbogVremena**
- **PrekidGužvaPromet**
- **RadoviNaCesti**
- **UpozorenjeZbogPoledice** 


Korisnici servisa će biti samo iz dvije klase &rarr; `GospodarskaVozila` & `OsobnaVozila`. Napravite po dva objekta svake klase i prijavite ih na servis. U glavnom dijelu programa promjene na servisu simulirate na način da se svakim pozivom metode `changeState()` nasumce izabere jedan od pobrojanih tipova. Ne zaboravite osigurati mogućnost da se svaki prijavljeni korisnik servisa može odjaviti i ponovno prijaviti po želji. Isto tako, osnovni pobrojani tip `StateEnu` ima sljedeće moguće poruke:

- `GraničniZastoj` &rarr; Zastoj na GP Goričan, Zastoj na GP Dvor, Zastoj na GP Bregana, Zastoj na GP Macelj, Zastoj na GP Kamensko
- `PrekidZbogVremena` &rarr; Prekid prometa na dionici AA zbog poledice, Prekid prometa zbog poplave na nn km ceste CC, Prekid prometa zbog orkanske bure na dionici DD autoputa AP1
- `PrekidGužvaPromet` &rarr; Prekid prometa na županijskoj cesti ŽC zbog prometnog čepa..., Prekid prometa na dionici D1 ceste LC1 zbog gužve u prometu, Prekid prometa na cesti C2 zbog kvara na teretnom vozilu, Prekid prometa na cesti C22 zbog prolaska specijalnog tereta - moguće veće gužve 
- `Radovi na cesti` &rarr; Radovi na cesti R1, Radovi na cesti R23, Radovi na cesti C45, Radovi na cesti AC2 - preusmjeravanje prometa ..., Zbog radova na lokalnoj cesti LC8 prometuje se zaobilaznim smjerom ....
- `UpozorenjeZbogPoledice` &rarr; Upozorenje A1, Upozorenje A2, Upozorenje A3, Upozorenje A4, Upozorenje A5

Svaka poruka se po slučajnom pozivu pripadnog tipa također generira slučajnim odabirom. 

Mogući konzolni izlaz prikazan je na slici 2:

<p align="center">
<img src = "https://7qmpxg.db.files.1drv.com/y4mbq9mdb85-Evu4BLUxA-4Ewwj13Ljd4hIQwV6ra64ocHa31M6Bsd6IMIJsjULJ8CBSnUssTk2vXRTTrUyhrZO62RSaeTVRnEQgRoiyHtuuhhkBvaYCfLO5Gc3YAH2VXfrrTRs4kfjrE0F64iB-P4n9kZ9eW1ejO8ObpVLEIVGsUMiHZc_AJ66L2OQf9WJcZ8kPVbjBhMSwDTCS37SA9427w?width=530&height=806&cropmode=none">
</p>

<p align ="center"> <b>Slika 2</b> Konzolni izlaz uz zadatak 3.2.</p>

## Zadatak 3.3. ![simple](https://img.shields.io/badge/complexity-**-green) 
---
Radite na dijelu aplikacije koji predstavlja kontroler za različite vrste entiteta u nekoj igrici. Na početku ste imali zahtjev za kontrolu ponašanja samo dvije grupe entiteta &rarr; `Dog` i `Robot`, a nedugo nakon toga dobili ste novi zahtjev za uključenje dodatnih entiteta &Rarr; `Frog` & `Tiger`. Centralni dio vašeg rješenja je sučelje `OperCommand`:

```java
public interface OperCommand {
	
	public void execute(AbsEntity ent);
	public void undo();
	public void redo();

}
```

Druga razina apstrakcije je apstraktna klasa za entitete koju ste dobili od drugog tima. Ta apstraktna klasa je određena kako je prikazano na slici 3:

<p align="center">

<img src="https://9pmpxg.db.files.1drv.com/y4mupwuGxqE9h3eVqzRviGGcnzxKgLILPLRCQkJ-1Wu7ROjh6XZ7SGfCpTRiC5ZYwpFDyZlbWAmV9pAKNkRMa4Ed9R70PDhZSftBI_G7JlNEqx34P0LdUOYHUfWP1OOLQj_1kIjFpff0iprMU5Wvvp9iB4UXl9QmoJ5zXw8jbSN7srHKsZXWYKeQROSvFsE0j3kXk45_CZY_NaRM_4pY9Y_aw?width=214&height=449&cropmode=none">

</p>

<p align="center"> <b>Slika 3</b> Koncept za apstraktnu klasu AbsEntity </p>


Za konkretne entitete `Dog` i `Robot` realizirajte mogućnost zadavanja naredbe `moving` primjenom kontrolera. Isto tako realizirajte ponašanje `renew` koja kod psa podrazumijeva ispis poruke `Samo ako imaš dobru hranu...`, a kod robota poruku `Spoji me na izvor električne energije`. Isti kontroler dinamički može zadati bilo koje željeno (moguće) ponašanje entiteta. Imajte na umu kako se mogu pojaviti novi entiteti s bitno drugačijim ponašanjem, a koji trebaju biti upravljivi s istim kontrolerom. 

> Kontroler treba imati spremnike za `undo` i `redo` naredbe

Mogući konzolni izlaz za kretanje entiteta klase `Dog` prikazan je na slici 4:

<p align="center">
<img src = "https://9fmpxg.db.files.1drv.com/y4mSGAY63hwzxcap6ooAi30PJutlMjtOnLxEFWWrc3e_EwEoG2eY20BP7AFQnqzzQcO_7uZxfDU1hCyiZKmo0qrikkNhMSFYf39bAWGc3ngzgVaw16aa3b3TC5qAGROazGOiPIGgBjWIrHsTRE3YNOCzzyI9XfaIYlXU6tl7JjimLjZVLccIoHrrTwKauWqqPNNsl17wfatoEQF011iSc6zIg?width=638&height=660&cropmode=none">
</p>
<p align="center"> <b> Slika 4</b> Mogući konzolni izlaz uz realizaciju naredbe moving entiteta Dog</p>


Kod koji se odnosi na glavni dio programa kojim je dobiven konzolni izlaz na slici 4 je:

```java 
public class AppCli {
	
	public static void main(String[] args) {
		Operator oper = new Operator();
		Dog dg = new Dog("Floky");
		dg.printStatus();
		oper.executeCommand(new MoveCommand(), dg);
		oper.undoCommand();
		oper.undoCommand();
		oper.redoCommand();
	}

}
```

Kod naredbe `renew` stavite razinu `energy` koja će biti neka slučajna vrijednost od 20% do 55%. Kada se pokrene ta naredba putem kontrolera razina energije se generira slučajno u rasponu od 60% do 100%. U biti preko vrijednosti `energy` kontrolirat će se ispravnost undo i redo postupka &rarr; slično kao što se u primjeru sa slike 4 to radilo s pozicijom. Slobodno napravite jednu ili više pomoćnih klasa ukoliko vam je to potrebno. 

## Zadatak 3.4. ![gentle](https://img.shields.io/badge/complexity-***-yellowgreen)
---

U materijalima s vježbi u Vježbi 6 (Factory) u drugom zadatku ste izradili simulator koji može simulirati samo jedan brod. Potrebno je napraviti simulator koji će istovremeno moći simulirati veći broj brodova bilo koje klase. Primjerice `CruiserShip`, `TankerShip` i `CargoShip`. 

&nbsp;

![time](https://img.shields.io/badge/time-for%20finish-red?style=for-the-badge)

>**Vremenski okvir**
>
> Vremenski okvir za ovu grupu zadataka je do 20.01.2020. do 23.00h


&nbsp;


</div>
