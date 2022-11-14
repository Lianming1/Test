package view;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.OffertaSingola;
import model.Proposta;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import java.util.Iterator;
import java.util.List;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Proposte extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 * @param list 
	 * @param frame 
	 */
	public Proposte(List<Proposta> list) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(800,400);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel labelNomeFornitore;
		JLabel labelTotalePrezzo;
		JLabel labelNumeroGiorni;
		JLabel labelNomeFornitore1;
		JLabel labeTotalePrezzo1;
		JLabel labelNumeroGiorni1;
		JLabel labelNomeFornitore2;
		JLabel labelTotalePrezzo2;
		JLabel labelNumeroGiorni2;
		Iterator<Proposta> iter= list.iterator();
		if(iter.hasNext()) {
			Proposta temp=iter.next();
			labelNomeFornitore = new JLabel(temp.getNomeFornitore());
			labelTotalePrezzo = new JLabel(String.format("%.2f", temp.getPrezzo()));
			labelNumeroGiorni = new JLabel(String.format("%d", temp.getGiorniSpedizione()));
		}else {
			labelNomeFornitore = new JLabel("");
			labelTotalePrezzo= new JLabel("");
			labelNumeroGiorni= new JLabel("");
		}
		if(iter.hasNext()) {
			Proposta temp=iter.next();
			labelNomeFornitore1 = new JLabel(temp.getNomeFornitore());
			labeTotalePrezzo1 = new JLabel(String.format("%.2f", temp.getPrezzo()));
			labelNumeroGiorni1 = new JLabel(String.format("%d", temp.getGiorniSpedizione()));
		}else {
			labelNomeFornitore1= new JLabel("");
			labeTotalePrezzo1= new JLabel("");
			labelNumeroGiorni1= new JLabel("");
		}
		if(iter.hasNext()) {
			Proposta temp=iter.next();
			labelNomeFornitore2 = new JLabel(temp.getNomeFornitore());
			labelTotalePrezzo2 = new JLabel(String.format("%.2f", temp.getPrezzo()));
			labelNumeroGiorni2 = new JLabel(String.format("%d", temp.getGiorniSpedizione()));
		}else {
			labelNomeFornitore2= new JLabel("");
			labelTotalePrezzo2= new JLabel("");
			labelNumeroGiorni2= new JLabel("");
		}
		
		
		
		
		JLabel labelFornitore = new JLabel("Fornitore :");
		labelFornitore.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelFornitore.setHorizontalAlignment(SwingConstants.RIGHT);
		labelFornitore.setBounds(10, 10, 108, 32);
		contentPane.add(labelFornitore);
		
		
		labelNomeFornitore.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelNomeFornitore.setHorizontalAlignment(SwingConstants.CENTER);
		labelNomeFornitore.setBounds(162, 19, 118, 17);
		contentPane.add(labelNomeFornitore);
		
		JLabel labelPrezzo = new JLabel("Prezzo :");
		labelPrezzo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelPrezzo.setHorizontalAlignment(SwingConstants.RIGHT);
		labelPrezzo.setBounds(10, 31, 108, 23);
		contentPane.add(labelPrezzo);
		
		
		labelTotalePrezzo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTotalePrezzo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelTotalePrezzo.setBounds(162, 37, 118, 17);
		contentPane.add(labelTotalePrezzo);
		
		JLabel lblGiorniSpedizione = new JLabel("Giorni Spedizione :");
		lblGiorniSpedizione.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGiorniSpedizione.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGiorniSpedizione.setBounds(10, 52, 118, 23);
		contentPane.add(lblGiorniSpedizione);
		
	
		labelNumeroGiorni.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumeroGiorni.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelNumeroGiorni.setBounds(162, 58, 118, 17);
		contentPane.add(labelNumeroGiorni);
		
		JLabel labelFornitore1 = new JLabel("Fornitore :");
		labelFornitore1.setHorizontalAlignment(SwingConstants.RIGHT);
		labelFornitore1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelFornitore1.setBounds(10, 108, 108, 17);
		contentPane.add(labelFornitore1);
		
		
		labelNomeFornitore1.setHorizontalAlignment(SwingConstants.CENTER);
		labelNomeFornitore1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelNomeFornitore1.setBounds(162, 108, 118, 17);
		contentPane.add(labelNomeFornitore1);
		
		JLabel labelPrezzo1 = new JLabel("Prezzo :");
		labelPrezzo1.setHorizontalAlignment(SwingConstants.RIGHT);
		labelPrezzo1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelPrezzo1.setBounds(10, 122, 108, 17);
		contentPane.add(labelPrezzo1);
		
		labeTotalePrezzo1.setHorizontalAlignment(SwingConstants.CENTER);
		labeTotalePrezzo1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labeTotalePrezzo1.setBounds(162, 122, 118, 17);
		contentPane.add(labeTotalePrezzo1);
		
		JLabel lblGiorniSpedizione1 = new JLabel("Giorni Spedizione :");
		lblGiorniSpedizione1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGiorniSpedizione1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGiorniSpedizione1.setBounds(0, 135, 128, 23);
		contentPane.add(lblGiorniSpedizione1);
		
		
		labelNumeroGiorni1.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumeroGiorni1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelNumeroGiorni1.setBounds(162, 141, 118, 17);
		contentPane.add(labelNumeroGiorni1);
		
		JLabel labelFornitore2 = new JLabel("Fornitore :");
		labelFornitore2.setHorizontalAlignment(SwingConstants.RIGHT);
		labelFornitore2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelFornitore2.setBounds(10, 202, 108, 23);
		contentPane.add(labelFornitore2);
		
		
		labelNomeFornitore2.setHorizontalAlignment(SwingConstants.CENTER);
		labelNomeFornitore2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelNomeFornitore2.setBounds(143, 209, 118, 17);
		contentPane.add(labelNomeFornitore2);
		
		JLabel labelPrezzo2 = new JLabel("Prezzo :");
		labelPrezzo2.setHorizontalAlignment(SwingConstants.RIGHT);
		labelPrezzo2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelPrezzo2.setBounds(10, 226, 108, 17);
		contentPane.add(labelPrezzo2);
		
		
		labelTotalePrezzo2.setHorizontalAlignment(SwingConstants.CENTER);
		labelTotalePrezzo2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelTotalePrezzo2.setBounds(143, 230, 118, 17);
		contentPane.add(labelTotalePrezzo2);
		
		JLabel lblGiorniSpedizione2 = new JLabel("Giorni Spedizione :");
		lblGiorniSpedizione2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGiorniSpedizione2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGiorniSpedizione2.setBounds(0, 248, 128, 23);
		contentPane.add(lblGiorniSpedizione2);
		
	
		
		labelNumeroGiorni2.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumeroGiorni2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelNumeroGiorni2.setBounds(143, 255, 118, 17);
		contentPane.add(labelNumeroGiorni2);
		
		JButton btnRitorna = new JButton("OK");
		btnRitorna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		btnRitorna.setBounds(150, 321, 128, 32);
		contentPane.add(btnRitorna);
		
		
	}
}
