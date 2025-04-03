//Lee Zoe Randriatahina 
// 03/20/2025
// The piece name is Dabbaba 
// the piece  move to jump  two squares horizontally left and right or two squares vertically  left and right.
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.imageio.ImageIO;

//you will need to implement two functions in this file.
public class Dabbaba extends Piece {

    
    public Dabbaba(boolean isWhite, String img_file) 
    {
      super(isWhite, img_file);
    }

    public String toString()
    {
      if (color)
			return " A white Dabbaba ";
		else
			return "A black Dabbaba ";
    }
    
    

    
   
    
    // TO BE IMPLEMENTED!
    //return a list of every square that is "controlled" by this piece. A square is controlled
    //if the piece capture into it legally
    //Pre condition : start piece must not be null 
    //Post condition : the piece shoudl be able to move two squares horizontally left or right
    // or two squares vertically  left or right.
    // It highlights in green  the squares that the piece have control on 
    public ArrayList<Square> getControlledSquares(Square[][] board, Square start) 
    {
      ArrayList<Square> control = new ArrayList<Square>();

      
      if( start.getCol()-2>0 && (board[start.getRow()][start.getCol()-2].getOccupyingPiece()==null || color != board[start.getRow()][start.getCol()-2].getOccupyingPiece().getColor())){
        control.add(board[start.getRow()][start.getCol()-2]);
      }
      if((start.getRow()+2<8  && (board[start.getRow()+2][start.getCol()].getOccupyingPiece()==null || color != board[start.getRow()+2][start.getCol()].getOccupyingPiece().getColor()))){
        control.add(board[start.getRow()+2][start.getCol()]);
      }
      if((start.getRow()-2>=0 && (board[start.getRow()-2][start.getCol()].getOccupyingPiece()==null || color != board[start.getRow()-2][start.getCol()].getOccupyingPiece().getColor()) )){
        control.add(board[start.getRow()-2][start.getCol()]);
      }
     if  (  start.getCol()+2<8 && (board[start.getRow()][start.getCol()+2].getOccupyingPiece()==null || color != board[start.getRow()][start.getCol()+2].getOccupyingPiece().getColor()))
     {
      control.add(board[start.getRow()][start.getCol()+2]); 
     }

      

    	return control;

      
      
     
    }
    

    //TO BE IMPLEMENTED!
    //implement the move function here
    //it's up to you how the piece moves, but at the very least the rules should be logical and it should never move off the board!
    //returns an arraylist of squares which are legal to move to
    //please note that your piece must have some sort of logic. Just being able to move to every square on the board is not
    //going to score any points.
     // the name of my piece is Dabbaba 
    //Pre condition : start piece must not be null 
    //Post condition : the piece shoudl be able to move two squares horizontally left or right
    // or two squares vertically  left or right depending on the validity of the locations, it can go it onto opposite piece
    // It highlights  in red the possible location the piece can go 
    public ArrayList<Square> getLegalMoves(Board b, Square start)
    {
      
      ArrayList<Square> moves = new ArrayList<Square>();

      
      if( start.getCol()-2>0 && (b.getSquareArray()[start.getRow()][start.getCol()-2].getOccupyingPiece()==null || color != b.getSquareArray()[start.getRow()][start.getCol()-2].getOccupyingPiece().getColor())){
        moves.add(b.getSquareArray()[start.getRow()][start.getCol()-2]);
      }
      if((start.getRow()+2<8  && (b.getSquareArray()[start.getRow()+2][start.getCol()].getOccupyingPiece()==null || color != b.getSquareArray()[start.getRow()+2][start.getCol()].getOccupyingPiece().getColor()))){
        moves.add(b.getSquareArray()[start.getRow()+2][start.getCol()]);
      }
      if((start.getRow()-2>=0 && (b.getSquareArray()[start.getRow()-2][start.getCol()].getOccupyingPiece()==null || color != b.getSquareArray()[start.getRow()-2][start.getCol()].getOccupyingPiece().getColor()) )){
        moves.add(b.getSquareArray()[start.getRow()-2][start.getCol()]);
      }
     if  (  start.getCol()+2<8 && (b.getSquareArray()[start.getRow()][start.getCol()+2].getOccupyingPiece()==null || color != b.getSquareArray()[start.getRow()][start.getCol()+2].getOccupyingPiece().getColor()))
     {
      moves.add(b.getSquareArray()[start.getRow()][start.getCol()+2]); 
     }

      

    	return moves;
    }
}