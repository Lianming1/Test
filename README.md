# Test
## Requisiti
- IDE Ecplipse (Ambiente di sviluppo si consiglia di usare ecplipse poiche tutto il progetto è svolto interamente su Eclipse)

- MySQL (DB utilizzato)

- JDK installato

- SWING( è stato usato java swing per la grafica)
## Architettura
 non avendo una conoscenza completa  delle tecnologie web si è scelto di usare un architettura stand-alone. 
## Istruzioni
 Si consiglia l'utilizzo dell'ambiente di sviluppo ecplipse per importare l'applicazione sviluppata, Inoltre è richiesto l'utilizzo della base di dati mySql.
 
 All'interno della base di dati deve essere istanziata un database chiamato 'offerte', si deve eseguire import dalla cartella dbdump della tabella di riferimento, inoltre si deve impostare accesso del db 'offerte' sulla porta 3305.
 
## Funzione

L'applicazione sviluppata consente di inserire il nome di un prodotto e la quantità che si desidera acquistare, una volta compilato i campi schiacciando sul bottone cerca avvia la ricerca delle prime tre offerte più convezienti  nella base di dati e li rappresenta all'utente.
Sono presenti tre tipologie di scontistica:
- per quantità
- per totale importo
- per stagione(il sistema determina la stagione in base alla data corrente)

Può essere applicato tutte e tre le tipologie di scontistica a un prodotto.

- Ad esempio :
	+ totale iniziale : 100€ scontoQuantità: 10% sconto stagione : 1%  prezzo finale : 89€



	
L'applicazione, quando non trova il nome del prodotto nel db o la quantità selezionata è superiore al quantità presente nel magazzina di tutti fornitori, segnala all'utente un messagio 'nessuna offerta trovata'.

Invece, quando trova delle offerte, il sistema elenca in base all'importo che si deve pagare dopo l'applicazione dei vari sconti le diverse offerte.
il sistema presenta le offerte indicando il nome del fornitore, importo complessivo da pagare e i giorni di spedizione.

- Ad esempio : 
	+  fornitore        : trony 
	 
	+  Prezzo           : 2100 
	 
	+  Giorni Spedizione: 2

Se un prodotto di un certo fornitore risulta essere più conveniente senza sconti viene preso in considerazione il prodotto senza sconti:

- Ad esempio :
	+ fornitore1 con lo sconto  presenta un prezzo uguale al 100€
	+ fornitore2 non presenta sconti ma presenta un prezzo uguale al 90€
- Output :
	+ fornitore2 Prezzo Giorni_di_Spedizione
	+ fornitore1 Prezzo Giorni_di_Spedizione
	

Nel caso non arrivi a 3 offerte i campi dei vengono lasciati vuoti.

 
