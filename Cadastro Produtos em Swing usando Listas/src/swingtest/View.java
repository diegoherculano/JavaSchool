package swingtest;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JList;

public class View {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
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
	public View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		List<String> nomes = new ArrayList<String>();
		List<Integer> valores = new ArrayList<Integer>();
		List<Integer> total = new ArrayList<Integer>();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome Produto");
		lblNome.setBounds(160, 85, 171, 16);
		frame.getContentPane().add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(160, 113, 136, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCaixa = new JLabel("Caixa:");
		lblCaixa.setBounds(239, 19, 42, 16);
		frame.getContentPane().add(lblCaixa);
		
		JLabel lblValorTotal = new JLabel("Valor total:");
		lblValorTotal.setBounds(222, 57, 74, 16);
		frame.getContentPane().add(lblValorTotal);
		
		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setBounds(309, 57, 66, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(12, 12, 136, 31);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(299, 15, 125, 25);
		frame.getContentPane().add(comboBox_1);
		
		JButton btnMostrar = new JButton("Adicionar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nomes.add(textField.getText());
				int jml = Integer.parseInt(textField_1.getText()); //To Integer
				valores.add(jml);
				JOptionPane.showMessageDialog(null, textField.getText() + " adicionado! Com o valor " + jml);
				comboBox.addItem(textField.getText());
				textField.setText(null);
				textField_1.setText(null);
			}
		});
		btnMostrar.setBounds(160, 217, 110, 26);
		frame.getContentPane().add(btnMostrar);
		
		JButton btnMostrar_1 = new JButton("Histórico");
		btnMostrar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel lblNewLabel2 = new JLabel("Não implementado.");
				JOptionPane.showMessageDialog(null, lblNewLabel2);
			}
		});
		btnMostrar_1.setBounds(295, 217, 110, 26);
		frame.getContentPane().add(btnMostrar_1);
		
		JButton btnEditar = new JButton("Remover");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, comboBox.getSelectedItem() + " de valor " + valores.get(comboBox.getSelectedIndex()) + " removido.");
				comboBox.removeItem(comboBox.getSelectedItem());
				try {
					valores.remove(comboBox.getSelectedIndex());
				} catch (Exception e2) {
					valores.removeAll(valores);
				}
				
			}
		});
		btnEditar.setBounds(12, 51, 110, 26);
		frame.getContentPane().add(btnEditar);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(160, 145, 66, 16);
		frame.getContentPane().add(lblValor);
		
		textField_1 = new JTextField();
		textField_1.setBounds(160, 173, 114, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnValor = new JButton("Valor");
		btnValor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nm = new Integer(valores.get(comboBox.getSelectedIndex())).toString();
				JOptionPane.showMessageDialog(null, "O valor de " + comboBox.getSelectedItem() + " é R$" + nm);
			}
		});
		btnValor.setBounds(12, 93, 110, 26);
		frame.getContentPane().add(btnValor);
		
		JButton btnAdicionar = new JButton("Adicionar ");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_1.addItem(comboBox.getSelectedItem());
				Integer valor = valores.get(comboBox.getSelectedIndex());
				total.add(valor);
				int ta = valores.get(comboBox.getSelectedIndex());
				int ta2 = Integer.parseInt(lblNewLabel.getText());
				Integer total2 = ta + ta2;
				String tt = new Integer(total2).toString();
				lblNewLabel.setText(tt);				
			}
		});
		btnAdicionar.setBounds(12, 131, 110, 26);
		frame.getContentPane().add(btnAdicionar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				int ta = total.get(comboBox_1.getSelectedIndex());
				int ta2 = Integer.parseInt(lblNewLabel.getText());
				Integer total2 = ta2 - ta;
				String tt = new Integer(total2).toString();
				lblNewLabel.setText(tt);				
				comboBox_1.removeItem(comboBox_1.getSelectedItem());
				try {
					total.remove(comboBox_1.getSelectedIndex());
				} catch (Exception e2) {
					total.removeAll(total);
					lblNewLabel.setText("0");	
					JOptionPane.showMessageDialog(null, "Você removeu todos os itens.");					
				}
				
			}
		});
		btnRemover.setBounds(319, 80, 110, 26);
		frame.getContentPane().add(btnRemover);
		
		JButton btnZerar = new JButton("Zerar");
		btnZerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_1.removeAllItems();
				total.removeAll(total);
				lblNewLabel.setText("0");	
				JOptionPane.showMessageDialog(null, "Você removeu todos os itens.");				
			}
		});
		btnZerar.setBounds(338, 110, 86, 26);
		frame.getContentPane().add(btnZerar);


		
		
		
	}
}
