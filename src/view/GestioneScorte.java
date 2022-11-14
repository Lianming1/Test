package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Controller.Controller;
import model.Proposta;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class GestioneScorte {

	private JFrame frame;
	private JTextField inputProdotto;
	private JLabel labelQuantità;
	private JTextField inputQuantita;
	private JButton btnCercaOfferte;
	private Controller control;
	private Proposte Prop;
	private JButton btnNewOffer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestioneScorte window = new GestioneScorte();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GestioneScorte() {
		this.control= new Controller();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel labelProdotto = new JLabel("Prodotto :");
		labelProdotto.setHorizontalAlignment(SwingConstants.CENTER);
		labelProdotto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelProdotto.setBounds(95, 30, 84, 44);
		frame.getContentPane().add(labelProdotto);
		
		inputProdotto = new JTextField();
		inputProdotto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		inputProdotto.setBounds(189, 43, 162, 19);
		frame.getContentPane().add(inputProdotto);
		inputProdotto.setColumns(10);
		
		labelQuantità = new JLabel("Quantità :");
		labelQuantità.setHorizontalAlignment(SwingConstants.CENTER);
		labelQuantità.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelQuantità.setBounds(95, 96, 84, 28);
		frame.getContentPane().add(labelQuantità);
		
		inputQuantita = new JTextField();
		inputQuantita.setText("");
		inputQuantita.setBounds(189, 103, 162, 19);
		frame.getContentPane().add(inputQuantita);
		inputQuantita.setColumns(10);
		
		btnCercaOfferte = new JButton("Cerca");
		btnCercaOfferte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(inputProdotto.getText().equals("") || inputQuantita.getText().equals("")) {
					JOptionPane.showInternalMessageDialog(null, "non è possibile procedere senza inserire i campi");
				}else {
					String nome= inputProdotto.getText();
					int quantita= Integer.parseInt(inputQuantita.getText());
				List<Proposta> lista=control.listaProposte(nome, quantita);	
				if(lista.isEmpty()) {
					JOptionPane.showInternalMessageDialog(null, "nessuna offerta trovata");
				}else {
				 Prop= new Proposte(lista);
				}
			}
			}
		});
		btnCercaOfferte.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCercaOfferte.setBounds(239, 157, 112, 39);
		frame.getContentPane().add(btnCercaOfferte);
		
		btnNewOffer = new JButton("Inserisci offerta");
		btnNewOffer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InserimentoOfferta nuovaOfferta= new InserimentoOfferta();
			}
		});
		btnNewOffer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewOffer.setBounds(50, 157, 148, 39);
		frame.getContentPane().add(btnNewOffer);
	}
}
