import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



public class WorldMap extends JFrame{
	

	



	/**
	 * Create the frame.
	 */
	WorldMap(){
	 
		        this.setSize(630,600);  
		        this.setTitle("生命游戏[LifeGame]DEMO");  
		        this.add(new WorldMap());  
		        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		        this.setLocationRelativeTo(null);  
		        this.setResizable(false);  
		      
	};
	private final int width = 22;  
	  
    private final int height = 22;  
  
    final char WORLD_MAP_NONE = 'N';  
  
    final char WORLD_MAP_ALIVE = 'A';  
  
     final char[][] world = {  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'A', 'A', 'N', 'N', 'N', 'A', 'A', 'N', 'N', 'N', 'A',  
                    'A', 'N', 'N', 'N', 'A', 'A', 'N', 'N', 'N', 'A', 'A', 'N',  
                    'N' },  
            { 'N', 'N', 'A', 'A', 'N', 'N', 'N', 'A', 'A', 'N', 'N', 'N', 'A',  
                    'A', 'N', 'N', 'N', 'A', 'A', 'N', 'N', 'N', 'A', 'A', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'A', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'A', 'A', 'A', 'N', 'A', 'A', 'A', 'N', 'A', 'N', 'N', 'N',  
                    'A', 'A', 'N', 'N', 'N', 'A', 'N', 'A', 'A', 'A', 'A', 'A',  
                    'N' },  
            { 'N', 'N', 'A', 'N', 'N', 'N', 'A', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'A', 'N', 'N', 'N', 'A', 'N', 'N', 'N', 'A', 'N', 'A',  
                    'N', 'N', 'A', 'N', 'A', 'N', 'N', 'N', 'N', 'N', 'A', 'N',  
                    'N' },  
            { 'N', 'N', 'A', 'N', 'N', 'N', 'A', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'A', 'N', 'N', 'N', 'A', 'N', 'N', 'N', 'N', 'A', 'N',  
                    'N', 'N', 'N', 'A', 'N', 'N', 'N', 'N', 'N', 'A', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'A', 'N', 'N', 'N', 'A', 'N', 'N', 'N', 'N', 'A', 'N',  
                    'N', 'N', 'N', 'A', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'A', 'N', 'N', 'N', 'A', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'A', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'A', 'N', 'N', 'N', 'A', 'N', 'N', 'N', 'A', 'N', 'A',  
                    'N', 'N', 'A', 'N', 'A', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'A', 'N', 'N', 'N', 'A', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'A', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'A', 'A', 'A', 'N', 'N', 'A', 'N', 'N', 'A', 'N', 'N', 'N',  
                    'A', 'A', 'N', 'N', 'N', 'A', 'N', 'A', 'A', 'A', 'A', 'A',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'A', 'A', 'N', 'N', 'N', 'A', 'A', 'N', 'N', 'N', 'A',  
                    'A', 'N', 'N', 'N', 'A', 'A', 'N', 'N', 'N', 'A', 'A', 'N',  
                    'N' },  
            { 'N', 'N', 'A', 'A', 'N', 'N', 'N', 'A', 'A', 'N', 'N', 'N', 'A',  
                    'A', 'N', 'N', 'N', 'A', 'A', 'N', 'N', 'N', 'A', 'A', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
  
    };  
  
     final char[][] world2 = {  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },  
            { 'N', 'N', 'A', 'N', 'N', 'N', 'N', 'N' },  
            { 'N', 'A', 'A', 'A', 'N', 'N', 'N', 'N' },  
            { 'N', 'N', 'A', 'N', 'N', 'N', 'N', 'N' },  
            { 'N', 'N', 'A', 'N', 'N', 'N', 'N', 'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' }  
  
    };  
  
   // private Image none = LifeGameImages.NONE.getImage();  
  // private Image alive = LifeGameImages.ALIVE.getImage();  
  
    /** 
     * 当前细胞下一状态 
     */  
     char[][] nextStatus = new char[world.length][world[0].length];  
  
     char[][] tempStatus = new char[world.length][world[0].length];  

    
	
	
    

    /** 
     * 画图形界面 
     *  
     */  
    
    protected void paintComponent( Graphics g) 
    {  
        this.paintComponent(g);  
        for (int i = 0; i < nextStatus.length; i++) {  
            for (int j = 0; j < nextStatus[i].length; j++) {  
                if (nextStatus[i][j] == WORLD_MAP_ALIVE) {  
                    g.fillRect( j * width, i * height, width, height);  
                   
                } else {  
                	 g.drawRect( j * width, i * height, width, height); 
                }  
            }  
        }  
    }  
    
    
     
} 
    





