package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Classe respons�vel por demonstrar a utiliza��o de paineis - JPanel
 * @author Diego Munhoz
 * @since 03/03/2021
 */
public class Exemplo09 {
	
	// declarando o atributo da tela
	private JFrame janela;
	// label auxiliar para demonstrar componentes dentro de pain�is
	private JLabel lbAux1;
	private JLabel lbAux2;
	private JLabel lbAux3;
	private JLabel lbAux4;
	// paineis para organiza��o dos componentes
	private JPanel painel1;
	private JPanel painel2;
	private JPanel painel3;
	private JPanel painel4;
	// painel principal para armazenar os outros paineis
	private JPanel painelPrincipal;
	
	/*
	 * m�todo para criar a tela
	 */
	public void iniciaGui() {
		
		/*
		 * configura��es do JFrame - tela
		 */
		janela = new JFrame();
		// configurando o titulo da tela
		janela.setTitle("Exemplo de JPanel");
		// configurando o tamanho da tela - largura/altura
		janela.setSize(422, 246);
		// configurando a posi��o inicial da tela - centralizada
		janela.setLocationRelativeTo(null);
		
		/*
		 * configura��es da primeira label
		 */
		lbAux1 = new JLabel();
		// configurando o texto incial
		lbAux1.setText("Painel 1");
		
		/*
		 * configura��es da segunda label
		 */
		lbAux2 = new JLabel();
		// configurando o texto incial
		lbAux2.setText("Painel 2");
		
		/*
		 * configura��es da terceira label
		 */
		lbAux3 = new JLabel();
		// configurando o texto incial
		lbAux3.setText("Painel 3");
		
		/*
		 * configura��es da quarta label
		 */
		lbAux4 = new JLabel();
		// configurando o texto incial
		lbAux4.setText("Painel 4");
		
		/*
		 * configura��es do primeiro painel
		 */
		painel1 = new JPanel();
		// configurar a posi��o e o tamanho
		painel1.setBounds(4, 6, 200, 100);
		// configurar o layout do painel
		painel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		// configurar a borda do painel
		painel1.setBorder(BorderFactory.createEtchedBorder());
		painel1.add(lbAux1);
		
		/*
		 * configura��es do segundo painel
		 */
		painel2 = new JPanel();
		// configurar a posi��o e o tamanho
		painel2.setBounds(208, 6, 200, 100);
		// configurar o layout do painel
		painel2.setLayout(new BorderLayout(0, 0));
		// configurar a borda do painel
		painel2.setBorder(BorderFactory.createLoweredBevelBorder());
		painel2.add(lbAux2);
		
		/*
		 * configura��es do terceiro painel
		 */
		painel3 = new JPanel();
		// configurar a posi��o e tamanho
		painel3.setBounds(3, 109, 200, 100);
		// configurar o layout do painel
		painel3.setLayout(new BoxLayout(painel3, BoxLayout.X_AXIS));
		// configurar a borda do painel
		painel3.setBorder(BorderFactory.createRaisedBevelBorder());
		painel3.add(lbAux3);
		
		/*
		 * configura��es do quarto painel
		 */
		painel4 = new JPanel();
		// configurar a posi��o e tamanho
		painel4.setBounds(208, 110, 200, 100);
		// configurar o layout do painel
		painel4.setLayout(new GridLayout(1, 1, 0, 0));
		// configurar a borda do layout
		painel4.setBorder(new TitledBorder("Titulo"));
		painel4.add(lbAux4);
		
		/*
		 * configura��es do painel principal da tela
		 */
		painelPrincipal = (JPanel) janela.getContentPane();
		// configurar o layout inicial
		painelPrincipal.setLayout(null);
		painelPrincipal.add(painel1);
		painelPrincipal.add(painel2);
		painelPrincipal.add(painel3);
		painelPrincipal.add(painel4);
		
		// configurando a visibilidade da tela
		janela.setVisible(true);
		
	} // fim do m�todo
	
	/*
	 * m�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		new Exemplo09().iniciaGui();
	}

}// fim da classe
