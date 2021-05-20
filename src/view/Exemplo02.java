package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Classe para demonstrar a utiliza��o de janela, bot�es, r�tulo e campo de
 * texto
 * 
 * @author Diego Munhoz
 * @since 01/03/2021
 */
public class Exemplo02 {

	// m�todo respons�vel por criar a tela e adicionar seus componentes
	public void iniciaGui() {

		/*
		 * definindo a tela e suas configura��es
		 */
		JFrame janela = new JFrame();
		// configurando o titulo da tela
		janela.setTitle("Exemplo de campo de texto");
		// configurando o tamanho da tela
		janela.setSize(300, 200);
		// definir o layout como nulo da janela
		janela.getContentPane().setLayout(null);
		// configurando a centraliza��o do objeto janela
		janela.setLocationRelativeTo(null);

		/*
		 * definindo o r�tulo e suas configura��es JLabel
		 */
		JLabel lbNome = new JLabel();
		// configurando o texto a ser exibido na label
		lbNome.setText("Nome:");
		// configurando o tamanho e local da label
		// primeiro argumento - posicao x - do ponto zero para direita
		// segundo argumento - posicao y - do ponto zero para baixo
		// terceiro argumento - largura
		// quarto argumento - altura
		lbNome.setBounds(10, 10, 40, 20);

		/*
		 * definindo o campo de texto (digita��o para o usu�rio)
		 */
		JTextField tfNome = new JTextField();
		// configurando o tamanho e local do campo de texto
		// primeiro argumento - posicao x - do ponto zero para direita
		// segundo argumento - posicao y - do ponto zero para baixo
		// terceiro argumento - largura
		// quarto argumento - altura
		tfNome.setBounds(60, 10, 150, 20);

		/*
		 * definindo o bot�o e suas configura��es
		 */
		JButton botao = new JButton();
		// configurando o texto do bot�o
		botao.setText("Clique aqui");
		// configurando o tamanho e local do bot�o
		// primeiro argumento - posicao x - do ponto zero para direita
		// segundo argumento - posicao y - do ponto zero para baixo
		// terceiro argumento - largura
		// quarto argumento - altura
		botao.setBounds(10, 60, 100, 20);
		
		/*
		 * adicionando os componente na tela
		 */
		janela.getContentPane().add(lbNome);
		janela.getContentPane().add(tfNome);
		janela.getContentPane().add(botao);
		
		/*
		 * configurando a o paramentro de visualiza��o da tela 
		 */
		janela.setVisible(true);

	}// fim do m�todo
	
	// m�todo principal para executar a classe
	public static void main(String[] args) {
		new Exemplo02().iniciaGui();
	}
	
	
	
	
	

}// fim da classe
