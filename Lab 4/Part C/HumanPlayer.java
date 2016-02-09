import java.io.*;
import java.text.*;

/**
 * ENSF 409 - Lab 3 - Winter 2016
 * @author  Harry Han, Yida Xu
 * @version 1.0
 * @since February 2, 2015
 */
 
 	/**
	 * A class constructor that inherits Players private members for human players
	 */ 
public class HumanPlayer extends Player{
		public HumanPlayer(){
		}
	
		public HumanPlayer(String name, char mark, Board board) {
			super(name, mark, board);
		}
	}
