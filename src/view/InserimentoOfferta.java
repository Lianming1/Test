package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.CaricaOfferte;
import model.OffertaSingola;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class InserimentoOfferta extends JFrame {

	private JPanel contentPane;
	private JTextField nomeFornitore;
	private JTextField prezzoSingolo;
	private JTextField Magazzino;
	private JTextField quantita;
	private JTextField Importo;
	private JTextField Percentuale;
	private JTextField Spedizione;
	private JTextField Prodotto; 
	private CaricaOfferte control;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public InserimentoOfferta() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(800,400);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeFornitore = new JLabel("Fornitore   :");
		lblNomeFornitore.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNomeFornitore.setBounds(22, 10, 123, 22);
		contentPane.add(lblNomeFornitore);
		
		nomeFornitore = new JTextField();
		nomeFornitore.setBounds(155, 10, 126, 22);
		contentPane.add(nomeFornitore);
		nomeFornitore.setColumns(10);
		
		JLabel lblPrezzoSingolo = new JLabel("Prezzo      :");
		lblPrezzoSingolo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrezzoSingolo.setBounds(22, 86, 123, 28);
		contentPane.add(lblPrezzoSingolo);
		
		prezzoSingolo = new JTextField();
		prezzoSingolo.setBounds(155, 94, 126, 22);
		contentPane.add(prezzoSingolo);
		prezzoSingolo.setColumns(10);
		
		JLabel lblQuantitaMagazzino = new JLabel("Magazzino :");
		lblQuantitaMagazzino.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblQuantitaMagazzino.setBounds(22, 124, 123, 30);
		contentPane.add(lblQuantitaMagazzino);
		
		Magazzino = new JTextField();
		Magazzino.setBounds(155, 132, 126, 22);
		contentPane.add(Magazzino);
		Magazzino.setColumns(10);
		
		JCheckBox chckbxScontoQuantita = new JCheckBox("Sconto Quantita");
		chckbxScontoQuantita.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxScontoQuantita.setBounds(22, 172, 163, 22);
		contentPane.add(chckbxScontoQuantita);
		if(chckbxScontoQuantita.isSelected()) {
			
		}
		JCheckBox chckbxScontoImporto = new JCheckBox("Sconto Importo");
		chckbxScontoImporto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxScontoImporto.setBounds(22, 212, 151, 21);
		contentPane.add(chckbxScontoImporto);
		
		JCheckBox chckbxScontoStagione = new JCheckBox("Sconto Stagione");
		chckbxScontoStagione.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxScontoStagione.setBounds(22, 246, 163, 21);
		contentPane.add(chckbxScontoStagione);
		
		JLabel lblQuantita = new JLabel("Quantita : ");
		lblQuantita.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblQuantita.setBounds(220, 175, 108, 17);
		contentPane.add(lblQuantita);
		
		quantita = new JTextField();
		quantita.setEditable(false);
		quantita.setBounds(327, 177, 96, 19);
		contentPane.add(quantita);
		quantita.setColumns(10);
		
		JLabel lblImporto = new JLabel("Importo :");
		lblImporto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblImporto.setBounds(220, 212, 78, 20);
		contentPane.add(lblImporto);
		
		Importo = new JTextField();
		Importo.setEditable(false);
		Importo.setBounds(327, 216, 96, 19);
		contentPane.add(Importo);
		Importo.setColumns(10);
		
		JLabel lblStagione = new JLabel("Stagione :");
		lblStagione.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStagione.setBounds(218, 246, 99, 20);
		contentPane.add(lblStagione);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"primavera", "estate", "autunno", "inverno"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setBounds(327, 246, 129, 21);
		contentPane.add(comboBox);
		
		JLabel lblpercentuale = new JLabel("Percentuale Sconto :");
		lblpercentuale.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblpercentuale.setBounds(31, 281, 177, 22);
		contentPane.add(lblpercentuale);
		
		Percentuale = new JTextField();
		Percentuale.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Percentuale.setBounds(218, 281, 99, 21);
		contentPane.add(Percentuale);
		Percentuale.setColumns(10);
		
		JLabel lblSpedizione = new JLabel("Spedizione :");
		lblSpedizione.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSpedizione.setBounds(341, 282, 108, 21);
		contentPane.add(lblSpedizione);
		
		Spedizione = new JTextField();
		Spedizione.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Spedizione.setBounds(459, 282, 96, 19);
		contentPane.add(Spedizione);
		Spedizione.setColumns(10);
		JLabel lblProdotto = new JLabel("Prodotto   :");
		lblProdotto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProdotto.setBounds(22, 48, 115, 28);
		contentPane.add(lblProdotto);
		
		Prodotto = new JTextField();
		Prodotto.setBounds(155, 55, 123, 22);
		contentPane.add(Prodotto);
		Prodotto.setColumns(10);
		JButton btnNewButton = new JButton("Inserisci Offerta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				OffertaSingola nuova= new OffertaSingola();
				if(nomeFornitore.getText().matches("^[a-zA-Z0-9]*$") && !nomeFornitore.getText().isEmpty()) {
				nuova.setFornitore(nomeFornitore.getText());
				}else {
					JOptionPane.showInternalMessageDialog(null, "Attenzione il nome del fornitore non è scritto in modo corretto");
				}
				if(Prodotto.getText().matches("^[a-zA-Z0-9]*$") && !Prodotto.getText().isEmpty()) {
				nuova.setProdotto(Prodotto.getText());
				}else {
					JOptionPane.showInternalMessageDialog(null, "Attenzione il nome del prodotto non è scritto in modo corretto");
				}
				if(prezzoSingolo.getText().matches("^[[0-9]*\\\\.?[0-9]+]*") && !prezzoSingolo.getText().isEmpty()) {
				nuova.setPrezzo(Float.valueOf(prezzoSingolo.getText()));
				}else {
					JOptionPane.showInternalMessageDialog(null, "Attenzione inserire un numero come ad esempio 21.0");
				}
				if(Magazzino.getText().matches("^[0-9]*") && !Magazzino.getText().isEmpty()) {
					float magazzinot=Float.valueOf(Magazzino.getText());
					nuova.setMagazzino(magazzinot);
					}else {
						JOptionPane.showInternalMessageDialog(null, "Attenzione inserire il numero di scorte disponibili in magazzino");
					}
				if(Percentuale.getText().matches("^[0-9]*") && !Percentuale.getText().isEmpty()) {
				nuova.setPercentuale(Float.valueOf(Percentuale.getText()));
				}else {
					JOptionPane.showInternalMessageDialog(null, "inserire la percentuale in modo corretto");
				
				}
				if(Spedizione.getText().matches("^[0-9]*") && !Spedizione.getText().isEmpty()) {
					nuova.setSpedizione(Integer.valueOf(Spedizione.getText()));
				}
				if(chckbxScontoImporto.isSelected() || chckbxScontoQuantita.isSelected() || chckbxScontoStagione.isSelected()) {
				if(chckbxScontoQuantita.isSelected()) {
					nuova.setScontoQuantità(true);
					nuova.setQuantita(Integer.valueOf(quantita.getText()));
					
				}
				if(chckbxScontoImporto.isSelected()) {
					nuova.setScontoImporto(true);
					nuova.setImporto(Float.valueOf(Importo.getText()));
					
				}
				if(chckbxScontoStagione.isSelected()) {
					nuova.setScontoStagione(true);
					nuova.setStagione(chckbxScontoStagione.getText());
					
				}
				control=new CaricaOfferte(nuova);
				dispose();
				}else {
					JOptionPane.showInternalMessageDialog(null, "Attenzione deve selezionare una tipologia di scontistica prima");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(263, 313, 193, 28);
		contentPane.add(btnNewButton);
		
	
		chckbxScontoQuantita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxScontoQuantita.isSelected()){
					quantita.setEditable(true);
					chckbxScontoImporto.setEnabled(false);
					chckbxScontoStagione.setEnabled(false);
				}else {
					quantita.setEditable(false);
					
					chckbxScontoImporto.setEnabled(true);
					chckbxScontoStagione.setEnabled(true);
				}
			}
		});
	
		chckbxScontoImporto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxScontoImporto.isSelected()){
					Importo.setEditable(true);
					chckbxScontoQuantita.setEnabled(false);
					chckbxScontoStagione.setEnabled(false);
				}else {
					Importo.setEditable(false);
					chckbxScontoQuantita.setEnabled(true);
					chckbxScontoStagione.setEnabled(true);
				}
			}
		});
		chckbxScontoStagione.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxScontoStagione.isSelected()) {
					comboBox.setEditable(true);
					chckbxScontoQuantita.setEnabled(false);
					chckbxScontoImporto.setEnabled(false);
				}else {
					comboBox.setEditable(false);
					chckbxScontoQuantita.setEnabled(true);
					chckbxScontoImporto.setEnabled(true);
				}
			}
		});
	
	
}
}
