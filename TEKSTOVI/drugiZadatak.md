# Druga grupa zadataka ![simple](https://img.shields.io/badge/complexity-**-green)
---

<div style = "text-align:justify">

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
	
 <p align="center"> **Slika 1** Primjer konzolonog izlaza uz zadatak s klasama svemirskih brodova </p>
  
  </p>
  
 </div>
 ---
 
