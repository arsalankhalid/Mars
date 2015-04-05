package simpleslickgame;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;

public abstract class TVShape {

	TVBlock[][] blocks;
	GameContainer gc;
	Color colour;
	
	public TVShape(GameContainer gc, int[][] blocks, Color colour){
		// Set necessary fields
		this.blocks = new TVBlock[blocks.length][blocks[0].length];
		this.gc = gc;
		this.colour = colour;
		
		// Initialize the blocks array based on the int array sent in
		for(int row = 0; row < blocks.length; row++){
			for(int col = 0; col < blocks[row].length; col++){
				if(blocks[row][col] == 1){
					this.blocks[row][col] = new TVBlock(gc);
				}
			}
		}
	}
	
	public void rotateLeft(){
		
	}
	
	public void rotateRight(){
		
	}
	
	public void moveDown(){
		// Move each block in blocks down
		for(int row = 0; row < blocks.length; row++){
			for(int col = 0; col < blocks[row].length; col++){
				if(blocks[row][col] != null){
					blocks[row][col].moveDown();
				}
			}
		}
	}
	
	public void moveLeft(){
		// Move each block in blocks left
		for(int row = 0; row < blocks.length; row++){
			for(int col = 0; col < blocks[row].length; col++){
				if(blocks[row][col] != null){
					blocks[row][col].moveLeft();
				}
			}
		}
	}
	
	public void moveRight(){
		// Move each block in blocks right
		for(int row = 0; row < blocks.length; row++){
			for(int col = 0; col < blocks[row].length; col++){
				if(blocks[row][col] != null){
					blocks[row][col].moveRight();
				}
			}
		}
	}
	
	public TVBlock[][] getBlocks(){
		return blocks;
	}
}