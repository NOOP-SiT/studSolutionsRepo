# Druga grupa zadataka ![simple](https://img.shields.io/badge/complexity-**-green)
---

<div style = "text-align:justify">
	
> Ova grupa zadataka sastoji se od dva zadatka. Kako je riječ o jednostavnim zadacima potrebno je riješiti oba za ostvarivanje prolaznog bodovnog praga. 

&nbsp;

![materijaliPVJ](https://img.shields.io/badge/see%40merlin-materijali--predavanja--vje%C5%BEbe-blue) &rarr; `proučite materijale s predavanja i vježbi`
	
## Zadatak 1.1.
---

U ovom zadatku trebate primjeniti predložak strategija kako bi realizirali tri strategije za pogon svemirskih brodova. Strategije su redom:

- IonPropulsion
- WarpPropulsion
- TransWarpPropulsion

Sve navedne strategije za osnovu imaju ISpacePropulsion koja je u biti sučelje samo s jednom metodom `public void engagePropulsion()`. Konkretne propulzije konkretiziraju metodu iz tog sučelja na način da ispišu poruku o tipu pogona koji predstavljaju. Nakon što ste riješili dio sa strategijama napravite dvije klase koje predstavljaju klase brodova:

- EnterpriseClassSpaceShip
- DiscoveryClassSpaceShip

Obje klase proširuju apstraktnu klasu AbsSpaceShipClass:

```java 

public abstract class AbsSpaceShipClass {
	
	protected int id;
	protected ISpacePropulsion propulsion;
	protected String captain;
	
	protected void setPropulsion(ISpacePropulsion propulsion) {
		
		this.propulsion = propulsion;
		
	}
	
	protected abstract void  performFlyingWithPropulsion();

}

```

U glavnom dijelu programa kreirajte niz (npr. ArrayList) koji se puni s kreiranim konkretnim svemirskim brodovima. Za test je dovoljno napraviti jedan brod klase `EnterpriseClassSpaceShip` i jedan klase `DiscoveryClassSpaceShip`. U prvom slučaju `EnterpriseClassSpaceShip` primjerak ima `IonPropulsion`, a `DiscoveryClassSpaceShip` primjerak `WarpPropulsion`. Nakon što načinite ispis &rarr; korištenjem nadjačane `toString` metode, promijenite pogon `DiscoveryClassSpaceShip` primjerku u `TransWarpPropulsion`. Konačni ispis bi trebao biti sličan konzolnom prikazu na slici 1:

<p align="center">
	
<img width=77% src= "https://ag7gwq.db.files.1drv.com/y4mEl7H1-UkKgtIrGYkHE98nKezmSKTJDSGMdJHjThq8Ros0XlAytg-6RFIa5WHnZVeqwsviVTbjRJXMnJC2tVLQ9gAnDiWmtI9EHd3rJ9VMivXl6rw0J5akE5M6VWjm6XAwQR2kFJMrYliVfy8M5iA7vxN0vzuvMPvzAGrBnLQ8EoftcDVxqLCH4ZEKeVdoy9djNk6gdEAX2eueo-enBWxXg?width=719&height=189&cropmode=none">
	
 <p align="center"> <b>Slika 1</b> Primjer konzolnog izlaza uz zadatak s klasama svemirskih brodova </p>
  
  </p>
  
 ## Zadatak 1.2.
 ---
Primjenom predloška dekorator kreirajte jednostavnu aplikaciju koja će moći dinamički mijenjati svojstva sljedećih GUI elemenata:
 
 - ButtonGUIElm
 - FrameGUIElm
 - PanelGUIElm
 
Sučelje `BasicGUIElm` ima sljedeće metode:
 
 ```java 
public void description();
public void setDefaultParameters(boolean state);
 ```
Apstraktna klasa `AbsGUIElement` definirana je na sljedeći način:

```java 
protected abstract void setGuiElementSize(int sz);
protected abstract void createElement();
protected abstract void showGuiElement(boolean show);
```
Sučelje `GUIElemenDecorator` definirano je na sljedeći način:

```java
public void setGUIElement2Decorate(BasicGUIElm guiElement);
public void setParam();
```


. Konkretni dekoratori su redom:

- `ColorGUIElementDecorator` &rarr; koji mijenja boju slučajnim odabirom iz pobrojanog (Enumerated - oznaka Enu) tipa boja &rarr; samostalno odredite 4 tipa boja uz osnovnu - polaznu metodu (default)
	- Ukoliko se dekoracija određuje pri kreiranju ovog objekta tada se boja definira u samom konstruktoru 
- `TransparencyGUIElementDecoratot` &rarr; koji mijenja transparentnost slučajnim odabirom iz pobrojanog (Enumerated - oznaka Enu) tipa transparentnosti &rarr; npr. PERC100TRANSP, PERC80TRANSP, PERC50TRANSP, NOTRANSP
	- Ukoliko se dekoracija određuje pri kreiranju ovog objekta, tada se transparentnost zadaje u samom konstruktoru
- `RoundGUIElementDecorator` &rarr; koji samo zaobli rubove svakom elementu &rarr; tekstualna poruka - default &rarr; "NOT Rounded!"
	- Ova klasa zahtjeva primjenu `setParam` metode koja će postaviti zaobljene rubove &rarr; definirajte pripadnom porukom

U glavnom dijelu programa kreirajte po jedan element sučelja i potom mu promijenite dekoraciju, ali na način da za dva elementa koristite dekoraciju primjenom odgovarajućih `set` metoda, a jednom kaskadnim principom omatanja (`wrapping`) kako smo radili na predavanjima i vježbama. Primjer mogućeg konzolnog izlaza za jedan GUI element prikazan je na slici 2:

<p align="center">
	
<img width=77% src= "https://aq7gwq.db.files.1drv.com/y4mVWkW5xXjpicIEmb6pADXpWZz_uCRUH2yDhqmJC_EgcIp-By2-_HQsPvSynbTxd7OVpP7YKDwI_ixFW38RGn4UftaT6P7e5Cs1hftaWy737MDia1G6tqKUCqpe_wBWQZwWBhbPbjrd5ovIWFoZ2N38m_CsdlciIyrr0JJbJ9MWXJbzBD7pWacqdp9S4MLCYkh4v5oBzZ0y5sxTnImFDeIvg?width=770&height=767&cropmode=none">
	
 <p align="center"> <b>Slika 2</b> Primjer konzolnog izlaza uz zadatak s dekoracijom GUI elemenata </p>
  
  </p>


&nbsp;

![time](https://img.shields.io/badge/time-for%20finish-red?style=for-the-badge)

>**Vremenski okvir**
>
> Vremenski okvir za ovu grupu zadataka je do 30.12.2019. do 23.00h



&nbsp;
  
 </div>
 ---
 
