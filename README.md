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
    - Totale iniziale  :  100€    
    - Sconto quantità  :  10%
    - Sconto stagione  :  1%
    - Prezzo finale    :	89€
	
L'applicazione, quando non trova il nome del prodotto nel db o la quantità selezionata è superiore al quantità presente nel magazzina di tutti fornitori, segnala all'utente un messagio 'nessuna offerta trovata'.

Invece, quando trova delle offerte, il sistema elenca in base all'importo che si deve pagare dopo l'applicazione dei vari sconti le diverse offerte.
il sistema presenta le offerte indicando il nome del fornitore, importo complessivo da pagare e i giorni di spedizione.

- Ad esempio : 
    - Fornitore        : trony  
    - Prezzo           : 2100 
    - Giorni Spedizione : 2 

Se un prodotto di un certo fornitore risulta essere più conveniente senza sconti viene preso in considerazione il prodotto senza sconti:

- Ad esempio : 
    - Fornitore1 con lo sconto  presenta un prezzo uguale al 100€
    - Fornitore2 non presenta sconti ma presenta un prezzo uguale al 90€
- Ad esempio : 
    - Fornitore2 | Prezzo |Giorni_di_Spedizione
    - Fornitore1 | Prezzo |Giorni_di_Spedizione
	

Nel caso non arrivi a 3 offerte i campi dei vengono lasciati vuoti.


L'applicazione inoltre consente l'inserimento di un offerta nella base di dati compilando un modulo apposta, per l'inserimento sarà richiesto:
- Fornitore, che è concesso di iniziare con un carattere alfabetico e contiene solo caratteri alfanumerici.
- Prodotto, che è concesso di iniziare con un carattere alfabetico e contiene solo   caratteri alfanumerici.
- Prezzo che consente inserimento di un valore numerico con la virgola.
- Magazzino che consente inserimento di una valore numerico intero.
- Tipologia di sconto da spuntare:
    - Sconto quantita, nel momento che lo selezioni viene disativatto le due tipologie 		di scontistica e viene attivato il campo quantità.
    - sconto importo, nel momento che lo selezioni viene disativatto le due tipologie di s		contistica e viene attivato il campo importo
    - sconto stagione, nel momento che lo selezioni viene disativatto le due tipologie 		di scontistica e viene attivato il campo di selezione per selezionare quale 		delle 4 stagioni indica.

nel momento che si è terminato la compilazione, si deve schiacciare il bottone "Inserisce Offerta" per eseguire il caricamento nella base di dati.





