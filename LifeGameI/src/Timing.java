import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Timing {
	private Timer timer;  
	  
    // ����֮֡�����ʱ��ÿ��60֡  
    private final int DELAY_TIME = 1200;  
  
    void startAnimation(WorldMap worldmap) {  
        for (int row = 0; row < worldmap.world.length; row++) {  
            for (int col = 0; col < worldmap.world[0].length; col++) {  
            	worldmap.nextStatus[row][col] = worldmap.world[row][col];  
            	worldmap. tempStatus[row][col] = worldmap.world[row][col];  
            }  
        }  
        // ������ʱ��  
        timer = new Timer(DELAY_TIME, new ActionListener() {  
  
                Logic logic=new Logic();
                public void actionPerformed(ActionEvent e) {  
                    logic.changeCellStatus(worldmap);  
                    worldmap.repaint();  
                }  
        });
          
        // ������ʱ��  
        timer.start();  
    }  


}
