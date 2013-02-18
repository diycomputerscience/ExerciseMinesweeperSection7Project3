package com.diycomputerscience.minesweeper.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.plaf.ColorUIResource;

import com.diycomputerscience.minesweeper.Board;
import com.diycomputerscience.minesweeper.RandomMineInitializationStrategy;
import com.diycomputerscience.minesweeper.Square;
import com.diycomputerscience.minesweeper.UncoveredMineException;

public class UI extends JFrame {
	
	private Board board;
	private OptionPane optionPane;
	
	public UI(Board board, OptionPane optionPane) {
		// set this.board to the injected Board
		this.board = board;
		this.optionPane = optionPane;
		
		// Set the title to "Minesweeper"
		this.setTitle("Minesweeper");
				
		JPanel panel = new JPanel();
		
		// Set the name of the panel to "MainPanel" 
		panel.setName("MainPanel");
		
		// Set the layout of panel to GridLayout. Be sure to give it correct dimensions
		panel.setLayout(new GridLayout(Board.MAX_ROWS, Board.MAX_COLS));
		
		// add squares to the panel
		this.layoutSquares(panel);
		// add panel to the content pane
		this.getContentPane().add(panel);
		
		// validate components
		//this.validate();
	}
	
	private void layoutSquares(JPanel panel) {	
					
		for(int row=0; row<Board.MAX_ROWS; row++) {
			for(int col=0; col<Board.MAX_COLS; col++) {
				final JButton squareUI = new JButton();
				squareUI.setName(row+","+col);
				final int theRow = row;
				final int theCol = col;
				// Note: Change this code and put what we had in the previous exercise for the skel
				//  Add a mouseListener as an anonymous inner class to squareUI. This				
				squareUI.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent me) {
						// TODO: Add appropriate code to handle left click and right click, as described in the document
						
					}
				});
				panel.add(squareUI);
			}
		}
	}
	
	public static UI build(Board board, OptionPane optionPane) {
		UI ui = new UI(board, optionPane);
		ui.setSize(300, 400);
		ui.setVisible(true);
		ui.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		return ui;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				build(new Board(new RandomMineInitializationStrategy()), new SwingOptionPane());
			}
					
		});		
	}

}
