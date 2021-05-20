package view;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

/**
 * Classe responsável por demonstrar a utilização do componente JRadioButton
 * 
 * @author Diego Munhoz
 * @since 02/03/2021
 */
public class Exemplo04 {

	// declarando os atributos
	private JFrame janela;
	// label auxiliar para exibir o que foi selecionado no radio button
	private JLabel lbAuxiliar;
	// declarando o componente radio button
	private JRadioButton rbSolteiro;
	private JRadioButton rbCasado;
	private JRadioButton rbViuvo;
	private JRadioButton rbDivorciado;
	// componente ButtonGroup responsável por gerenciar os componentes radio button
	private ButtonGroup grpRadio;
	// componente JButton para executar ação de clique
	private JButton btVerificar;
	// componente JPanel para organização
	private JPanel painel;

	/*
	 * método para criar a tela
	 */
	public void iniciaGui() {

		/*
		 * configurações do JFrame - tela
		 */
		janela = new JFrame();
		// configurando o titulo da tela
		janela.setTitle("Exemplo de Radio Button");
		// configurando o tamanho da tela - largura/altura
		janela.setSize(340, 275);
		// configurando a posição inicial da tela - centralizada
		janela.setLocationRelativeTo(null);

		/*
		 * configurações da JLabel - rótulo auxiliar
		 */
		lbAuxiliar = new JLabel();
		// configurando o texto inicial
		lbAuxiliar.setText("Selecione o estado civil:");
		// configurando a posição do texto
		lbAuxiliar.setHorizontalTextPosition(SwingConstants.CENTER);
		// configurando a posição e tamanho
		lbAuxiliar.setBounds(50, 20, 230, 20);

		/*
		 * configurações dos radio button
		 */
		rbSolteiro = new JRadioButton();
		rbCasado = new JRadioButton();
		rbViuvo = new JRadioButton();
		rbDivorciado = new JRadioButton();
		// configurando o texto do componente
		rbSolteiro.setText("Solteiro");
		rbCasado.setText("Casado");
		rbViuvo.setText("Viúvo");
		rbDivorciado.setText("Divorciado");
		// configurando a posição e tamanho
		rbSolteiro.setBounds(80, 50, 100, 25);
		rbCasado.setBounds(80, 75, 100, 25);
		rbViuvo.setBounds(80, 100, 100, 25);
		rbDivorciado.setBounds(80, 125, 100, 25);

		/*
		 * configurações do ButtonGroup
		 */
		grpRadio = new ButtonGroup();
		grpRadio.add(rbSolteiro);
		grpRadio.add(rbCasado);
		grpRadio.add(rbViuvo);
		grpRadio.add(rbDivorciado);

		/*
		 * configurações do JButton
		 */
		btVerificar = new JButton();
		// configurando o texto a ser exibido
		btVerificar.setText("Verificar");
		// configurando a posição e tamanho
		btVerificar.setBounds(126, 176, 84, 28);
		// configurando a ação do botão
		btVerificar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// método auxiliar para verificar o que foi selecionado pelo usuario
				verificaRadioButton();
			}
		});

		/*
		 * configurações do painel da tela - JPanel
		 */
		painel = (JPanel) janela.getContentPane();
		// configurar o layout inicial
		painel.setLayout(null);
		// adicionando os componentes no painel
		painel.add(lbAuxiliar);
		painel.add(rbSolteiro);
		painel.add(rbCasado);
		painel.add(rbViuvo);
		painel.add(rbDivorciado);
		painel.add(btVerificar);

		// configurando visibilidade da tela
		janela.setVisible(true);

	}// fim do método
	
	/*
	 * método auxiliar para verificar escolha do usuario no componente radio button
	 */
	private void verificaRadioButton() {// inicido do método
		
		// variável auxiliar para armazenar o texto da opção que foi selecionado
		String aux = "";
		// verificando se a opção solteiro está selecionado
		if (rbSolteiro.isSelected()) {
			aux = "Selecione o estado civil: " + rbSolteiro.getText();
		}
		// verificando se a opção casado está selecionado
		if (rbCasado.isSelected()) {
			aux = "Selecione o estado civil: " + rbCasado.getText();
		}
		// verificando se a opção viúvo está selecionado
		if (rbViuvo.isSelected()) {
			aux = "Selecione o estado civil: " + rbViuvo.getText();
		}
		// verificando se a opção divorciado está selecionado
		if (rbDivorciado.isSelected()) {
			aux = "Selecione o estado civil: " + rbDivorciado.getText();
		}
		
		// atribuindo a seleção do usuario na label auxiliar
		if (!aux.equals("")) {
			lbAuxiliar.setText(aux);
		}
		
	}// fim do método
	
	
	
	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		new Exemplo04().iniciaGui();
	}
	
	

}// fim da classe
