package Controller;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Comparatore;
import model.Proposta;

public class Controller
{
	
	public Controller() {
		
	}
	public List<Proposta>listaProposte(String nomeProdotto,int Quantita){
		Comparatore comp= new Comparatore(nomeProdotto, Quantita);
		List <Proposta> temp= comp.cercaProposte();
		if(!temp.isEmpty())
		{
			Collections.sort(temp, Comparator.comparing(Proposta::getPrezzo));
		}
		
		return temp;
		
	}
	
	}
