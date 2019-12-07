# Prvi zadatak ![simple](https://img.shields.io/badge/complexity-**-green)
---

Vaš prvi zadatak je vrlo jednostavan, a sastoji se u tome da putem Eclipse-a ili Git-a direktno u ovaj repozitorij postavite rješenje 
bilo kojeg zadatka iz vježbi (**ne primjere s predavanja**) predmeta NOOP. U konačnici taj Java projekt treba biti unutar zadane mape `SOLUTIONS` u novoj grani naziva `prviZadatak` što znači da se ovaj zadatak sastoji od sljedećih koraka:

![materialsGit](https://img.shields.io/badge/see%40merlin-git--materials-brightgreen) &rarr; `Pogledajte dodatne materijale za rad s gitom na sustavu Merlin`

1. Nakon što ste napravili klon ovog repozitorija na vašem računalu trebate kreirati novu granu 

```git
$ git checkout -b 'prviZadatak'
# napraviti txt datoteku infoPrvi.txt u mapi SOLUTIONS
$ cd SOLUTIONS
$ vim infoPrvi.txt
# zapisati 'Ovo je info datoteka uz prvi zadatak.'
# spremiti promjene i izaći iz vim editora
# :wq
# dodati tu datoteku u staging area
$ add infoPrvi.txt
# napraviti commit 
$ git commit -m "init commit for infoPrvi.txt file"
# push grane i novog commita u udaljeni repo
$ git push -u origin prviZadatak

```
  
2. Dalje se radi u Eclipse-u kako smo pokazali na vježbama. 

> Ukoliko niste sigurni što radite napravite probni repozitorij na vašem GitHub računu i u njemu eksperimentirajte s ovim zadatkom. Kada ste sigurni u ono što radite, traženo rješenje napravite na ovom repozitoriju. 
  
&nbsp;

 - Povežite JAVA projekt s rješenjem bilo kojeg zadatka iz vježbi s mapom **SOLUTIONS**
 - Napraviti **commit** s pripadajućom porukom 'prvi zadatak java -  inicijalni commit' &Rarr; u granu **prviZadatak**
 - Provjeriti na GitHubu da je sve sinkronizirano kako treba

&nbsp;

> <i class="fa fa-balance-scale" style="font-size:24px"> Vremenski okvir</i>
>
> Ovaj zadatak je potrebno izvršiti do srijede, 11/12/2019. do 23.00h

Sljedeće zadatke možete očekivati od četvrtka, 12/12/2019. pa sve do kraja semestra :)
