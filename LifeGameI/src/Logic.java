
public class Logic {

    /** 
     * 改变细胞状态 
     *  
        */  
    
	void changeCellStatus(WorldMap status) {  
        
    	for (int row = 0; row < status.nextStatus.length; row++) {  
            for (int col = 0; col < status.nextStatus[row].length; col++) {  
  
                switch (this.neighborsCount(status,row, col)) {  
                case 0:  
                case 1:  
                case 4:  
                case 5:  
                case 6:  
                case 7:  
                case 8:  
                	status.nextStatus[row][col] = status.WORLD_MAP_NONE;  
                    break;  
                case 2:  
                	status.nextStatus[row][col] = status.tempStatus[row][col];  
                    break;  
                case 3:  
                	status.nextStatus[row][col] = status.WORLD_MAP_ALIVE;  
                    break;  
                }  
            }  
        }  
        this.copyWorldMap(status);  
    }  

    /** 
     * 获取当前坐标点临近细胞个数 
     *  
         */  
     int neighborsCount(WorldMap status,int row, int col) 
     {  
        int count = 0, r = 0, c = 0;  
  
        for (r = row - 1; r <= row + 1; r++) 
        {  
            for (c = col - 1; c <= col + 1; c++) {  
                if (r < 0 || r >= status.tempStatus.length || c < 0  
                        || c >= status.tempStatus[0].length) {  
                    continue;  
                }  
                if (status.tempStatus[r][c] == status.WORLD_MAP_ALIVE) {  
                    count++;  
                }  
            }  
        }  
        if (status.tempStatus[row][col] == status.WORLD_MAP_ALIVE) {  
            count--;  
        }  
        return count;
     }

     /** 
      * 复制地图 
      *  
  
      */  
     
     void copyWorldMap(WorldMap status) {  
         for (int row = 0; row <status.nextStatus.length; row++) {  
             for (int col = 0; col < status.nextStatus[row].length; col++) {  
            	 status.tempStatus[row][col] =status. nextStatus[row][col];  
             }  
         }  
     }  









}
    
    
    
    

