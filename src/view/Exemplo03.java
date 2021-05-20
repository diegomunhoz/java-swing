package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Classe demonstrar a utilização de janela, textArea, textField, botões e suas
 * ações
 * 
 * @author Diego Munhoz
 * @since 01/03/2021
 */
public class Exemplo03 {

	/*
	 * declarando os componentes utilizados na tela
	 */
	private JFrame janela;
	private JTextField campo;
	private JTextArea area;
	private JButton botao1;
	private JButton botao2;

	/*
	 * método para criar a instancia dos objetos e componentes da tela e suas
	 * configurações
	 */
	public void iniciaGui() {// inicio do método

		/*
		 * configurando a tela
		 */
		janela = new JFrame();
		// definindo o tamanho da tela
		janela.setSize(300, 300);
		// definindo o titulo da tela
		janela.setTitle("Exemplo de ações");
		// configurando o posicionamento central da tela
		janela.setLocationRelativeTo(null);

		/*
		 * configurando o campo de texto
		 */
		campo = new JTextField();

		/*
		 * configurando a area de texto
		 */
		area = new JTextArea();

		/*
		 * configurando o primeiro botao
		 */
		botao1 = new JButton();
		// configurando o texto a ser exibido
		botao1.setText("Clique aqui");
		// adicionando um evento de clique no componente
		botao1.addActionListener(new AcaoBotao1());

		/*
		 * configurando o segundo botao
		 */
		botao2 = new JButton();
		// configurando o texto a ser exibido
		botao2.setText("Troca cor");
		// adicionando um evento de clique no componente
		botao2.addActionListener(new AcaoBotao2());

		/*
		 * adicionando os componentes na tela passando parametros de localização
		 */
		janela.getContentPane().add(BorderLayout.EAST, botao2);
		janela.getContentPane().add(BorderLayout.SOUTH, botao1);
		janela.getContentPane().add(BorderLayout.CENTER, area);
		janela.getContentPane().add(BorderLayout.NORTH, campo);

		/*
		 * configurando os parametros de exibição da tela
		 */
		janela.setVisible(true);

	}// fim do método

	/*
	 * Classe interna auxiliar para controlar a ação do primeiro botão = botao1
	 */
	public class AcaoBotao1 implements ActionListener {// inicio da classe interna

		@Override
		public void actionPerformed(ActionEvent e) {
			// captura o conteúdo digitado no textfield
			String auxiliar = campo.getText();
			// atribuindo o valor digitado pelo usuario no componente area
			area.append(auxiliar + "\n");
			// apagando o conteúdo digitado pelo usuario
			campo.setText("");

		}
	}// fim da classe interna

	/*
	 * Classe interna auxiliar para controlar a ação do segundo botão = botao2
	 */
	public class AcaoBotao2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// verificando se a cor já foi trocada
			if (area.getBackground().equals(Color.BLACK)) {
				// definindo a cor de fundo como branco
				area.setBackground(Color.WHITE);
				// definindo a cor do texto como preto
				area.setForeground(Color.BLACK);
			} else {
				// definindo a cor de fundo como preto
				area.setBackground(Color.BLACK);
				// definindo a cor do texto como branco
				area.setForeground(Color.WHITE);
			}

		}

	}

	// método principal para executar a classe
	public static void main(String[] args) {
		new Exemplo03().iniciaGui();
	}

}// fim da classe
