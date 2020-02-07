# Četvrta grupa zadataka ![simple](https://img.shields.io/badge/complexity-**-green)
---
&nbsp;

<div style = "text-align:justify">

> Pred vama je posljednja grupa zadataka koja se sastoji od tri zadatka. Prva dva su vezana uz višenitno programiranje, dok je treći jednostavna MVC aplikacija koja komunicira s bazom podataka.

&nbsp;

Kao i do sada, preporuka je da prvo pogledate i samostalno riješite materijale s vježbi i predavanja vezana uz navedene zadatke.

![materialsGit](https://img.shields.io/badge/see%40merlin-materials-brightgreen) &rarr; `Pogledajte nastavne materijale na sustavu Merlin`

**Zadatak 4.1** 

Vaš zadatak je da napravite jednostavnu klasu `SimpleObject` koja će imati statičko polje koje želite inkrementirati metodom te klase `public void incrementField(int nums)`, gdje `nums` predstavlja željeni broj koraka sukcesivne inkrementacije. U glavnom dijelu programa trebate imati dvije niti `IncrementThread` koje primaju isti objekt klase `SimpleObject` i vrše inkrement njegovog osnovnog polja željeni broj puta. Postavite spavanje svake niti u operaciji inkrementa na 15ms. Konzolni izlaz bi trebao biti sličan onome ne slici 1:

 <p align = center>
 
<img src="https://m2vnzq.db.files.1drv.com/y4m0S4UAdj7LAn364Uu14gZt3LiEQgKz2KIhzWzXAi4HlWO9z3U-gJKbUwbOtVI--ljZ4ns-95kerfzck_3jOU8MccJ49412dX24qrbkTCbrtBkNnUdGZSr2gKFKJ_S7SyNZ1LE5GCOnwZpJ5R3nK9vsRWpaH3HJsDUH7KXTWrFUtXDxrwWJ2Cr6G5MJNiti8h-ZV8iN3v0nrrTHn9Djc8lTw?width=486&height=220&cropmode=none" alt="consoleOK"> 

</p>

<p align= center>
<b>Slika 1</b> Prikaz konzolnog izlaza za dvije nezavisne niti
 
</p>


Željeni broj inkrementa za svaku nit odredite slučajnim odabirom (npr. između 4 i 8). Nikako ne smijete dobiti izlaz sličan konzolnom prikazu na slici 2:

<p align = center>

<img src= "https://ogvnzq.db.files.1drv.com/y4mVb8vyttlp1JudOrrbq-N070WYCw3uXmMU-PmH6PHuOJIrSy7zAeiSJHfJo0jucD-hR89FnAGjdRFSUAZARZ44Ioh0j9WibOGLxVri12aNdso2drYr9VVKW4ip0mMrSVwDt2UkgM0-2XE_7q5ZYzkaMI6Vze9tfVYzy7osb1l9fXT_xsQOPf8OEfPnr4WbjyPixq1Yz7uhPpwMVXtjt6t9g?width=503&height=228&cropmode=none" alt ="notOKIncr">

</p>

<p align = center>
<b> Slika 2 </b> Konzolni izlaz pogrešne primjene višenitnog programiranja pri inkrementu polja ciljanog objekta 
</p>

**Zadatak 4.2.** U drugom zadatku trebate napraviti rezervacijski sustav karata. Osnovna ideja je da se sustavu može istovremeno pristupati različitim klijentima &rarr; primjerice web aplikacija i mobilna aplikacija. Simulirajte situaciju istovremene rezervacije karata s ta dva klijenta &rarr; dvije niti. U simulaciji stavite da je raspoloživi broj karata neki mali broj (recimo 10 - 15) i da su u početnom trenutku sva mjesta slobodna za rezervaciju prvoj niti koja dobije pristup sustavu. Također, svaki klijent će rezervirati željeni broj karata sa slučajno generiranim brojem sjedala iz raspoloživog raspona.   

`TicketSystem` predstavlja sustav rezervacija, dok `TicketReservationClient` predstavlja klijenta koji koristi taj sustav. Obje klase mogu se realizirati na sljedeći način kako je prikazano prototipovima na slikama 3 i 4:

<p align = center>

<img src ="https://nmvnzq.db.files.1drv.com/y4my7-lf0rK4ci055abkmQR2s6rGgmteidPLlbN770TSL4GBB4mRIjU4_79zcS9uNYP0TZYGBXqHRbT4uo7gp0o5LLrNGpLfLatE1ItTc5DomXcKOrBVJtNlXHneWbgQcL4BzKnfpdZJbS-6hCydq39kYzqNchCfH2YtcfOh4R67Wb85_tM91Ln9qmbibJu79EtaWfZcFKrq4E_iPz4D6IXVg?width=370&height=190&cropmode=none" alt ="TicketSystem">
</p>

<p align = center>
<b>Slika 3</b> Prikaz moguće konstrukcije klase sustava za rezervaciju 
</p>


<p align = center>

<img src ="https://n2vnzq.db.files.1drv.com/y4mQ4N9UWJaMlIigiHOeLJQtyGrfd89ZVw__vbE_KQWgymQKLusJBYIjj6LBvo3aF-OxSXm8UBKzpDuxoJFFnAsFdqw-vHhrwwBYSfKVbPHV_Ki8dYB0IOpnBIgxvK7JNIFHeCX6qxrgKZVqiYD5wRXM2qI-aLmj1HNLrI9-xUx6SdTG75ARF9v2fKuy_Gcexit-G_SJwWGcjvu0HWfKdWrHA?width=358&height=125&cropmode=none" alt ="TicketClient">
</p>

<p align = center>
<b>Slika 4</b> Prikaz moguće konstrukcije klase koja predstavlja klijente  
</p>

Vodite računa da u odgovarajućoj metodi stavite nit/klijenta na spavanje od 20ms. Osnovna pretpostavka je da klijenti mogu istovremeno pristupiti sustavu rezervacije karata. Konzolni izlaz za dva klijenta koji naručuju po dvije karte mogao bi biti sličan ovome na slici 5:

<p align = center>

<img src ="https://owvnzq.db.files.1drv.com/y4mTQ7XTe3VLwNM4mUs52nPIYwaK9pliMLb0yYEbf-95vOPRYyxGs3RYANRRzoJcIILRV1qoIHtevKyDyak_4uqZpPOjAYjRmfhqTdha1tQGrOEIfLtkiCHstxf20x6iHiFlOZx9FglGsF7peQkwucCYKAatoCLQHe_5_Np-gwOeMBtktyUu6-BCrQBw_YAgb_PWOYWmQKRekHZWunL8-8GmA?width=552&height=825&cropmode=none" alt ="TicketSystemConsoleOut">
</p>

<p align = center>
<b>Slika 5</b> Konzolni prikaz simulacije rezervacije karata s dva klijenta 
</p>

**Zadatak 3** Ovaj zadatak je vrlo sličan zadatku kojeg smo radili na vježbama s MVC predloškom. Vaš zadatak je da primjenom tog predloška napravite aplikaciju sa sučeljem prema slici 6:

<p align = center>

<img src ="https://lwvnzq.db.files.1drv.com/y4mQV_JceCo5clyBjdKzh6ykejpO0FxMh45vTqT0P76HCLhThJgS_OHL0kSZ9t767yjUyWNKWeVy3pSoITRN3gryT-RWOdkgX3Y9XoQ0YCs4Gf7uMRh6xYAUpQQtxRuHfAeabk2tbRprieI-F_FDr7wGemQogcat3d3R7Cs9cHXyDo0K5PFHISAmuQZCCdnIq66uxdiRuSghSkeHX30KSaNCQ?width=907&height=578&cropmode=none" alt ="GUI_MVC">
</p>

<p align = center>
<b>Slika 6</b> Izgled sučelja aplikacije koja se realizira primjenom MVC predloška
</p>

Zahtjevi za podatke su jednostavni:

1. `Services` &rarr; Enum tip s vrijednostima {`OnlineService1`, `OnlineService2`, `OnlineService3`,`OnlineService4`}
2. `Registration for` &rarr; Enum tip s vrijednostima {3 months, 1/2 year, 1 year}

Dugme `Submit` šalje podatke tek nakon što su popunjeni svi elementi panela s podacima. U suprotnom, dijaloškim okvirom korisniku daje do znanja da nije ispunio sva polja i navodi koja nisu ispunjena / aktivirana. Kada je forma uredno ispunjena podaci se prikazuju u tablici. Izbornici na traci s padajućim izbornicima su prikazani na slici 7:


<p align = center>

<img src ="https://mmvnzq.db.files.1drv.com/y4miaEhW577lLK-18eYXZNSH5jYJ2cpL9oeLCUAT4VfByYTTQXFzkKghWealXtb78kSFnMY7LfJRKQVIbKiK4B_wCCJonCQIaYgfFR7U5gBSJM3iCu2fmf17GqNojgGXSvUOtSgIRqQpPaPxUobafh0vGry4h_r7dQv3tVRBKTIVqu8KmU8y032y06ZtLQC8LXRxhTtyBc7cXIr1utFs2RlNA?width=455&height=398&cropmode=none" alt ="menus">
</p>

<p align = center>
<b>Slika 7</b> Izbornici
</p>

Putem izbornika `File` potrebno je osigurati spremanje podataka svih korisnika u datoteku. Također je potrebno osigurati uvoz podataka iz datoteke i njihov automatski prikaz u tablici. Izbornik `Server` ima iste funkcionalnosti kao i izbornik `Server` u vježbi s MVC predloškom &rarr; spremanje podataka u bazu na serveru, potom učitavanje podataka iz baze i njihov prikaz u tablici, dok po želji možete prekinuti konekciju sa serverom putem predviđene naredbe `Close connection`. Izbornik `View` ima sljedeće funkcionalnosti:

- `Show text panel view...` &rarr; prikazuje sve podatke iz tablice u tekstualnom panelu u zasebnom okviru
- `Reset view...` &rarr; briše prikaz trenutnih podataka u tom panelu 
- `Close view panel` &rarr; zatvara taj okvir

Prikaz izgleda okvira (prozora) s tekstualnim panelom nalazi se na slici 8:

<p align = center>

<img src ="https://ngu4kw.db.files.1drv.com/y4m5cKmnRCWnD89_MU0lqj-QXtqwSpRRILwnH5xGnV1r-HXBVEFv0RLy-paFCJxHF3zKVbT5idHCsUEKEBzimO-PkeV5b3qc2VduVzjIcpsJ8k3pOnncU9kbFGKyJBGcaniDHSisd6c4EV0urBLP6CyxHkOLKz2z21Z5Rw6qQg4lOkNDwobIEUUVz0Rx_ue0Bfh-Y_858odzhvphIopXws8rQ?width=543&height=359&cropmode=none" alt ="txtFrame">
</p>

<p align = center>
<b>Slika 8</b> Izgled prozora s tekstualnim panelom
</p>

Dugmad tog prozora imaju sljedeće zadaće:

- `Next` &rarr; prikazuje podatke o sljedećem korisniku (prijelaz u sljedeći red tablice)
- `First` &rarr; daje podatkeod prvog korisnika
- `Last` &rarr; daje podatke posljednjeg korisnika
- `Previous` &rarr; vraća se na prikaz podataka prethodnog korisnika

Kada se panel učita odmah se prikazuju podaci prvog korisnika. 

> Ne zaboravite uključiti mnemonik za meni `Server` i akceleratore za sve naredbe u tom meniju. Proizvoljno odredite kratice.

&nbsp;

![time](https://img.shields.io/badge/time-for%20finish-red?style=for-the-badge)

>**Vremenski okvir**
>
> Vremenski okvir za ovu grupu zadataka je do 20.02.2020. do 23.00h

</div>
