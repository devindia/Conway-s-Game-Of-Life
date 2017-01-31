/*
* on going project on conway's game of life
* implemented in a very simple manner using java swing and awt
* further modification is going on 
* by Debasish Roy
*
*/







import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;


public class RoyalGameOfLife extends JFrame { 
	int x,y;
	int[][] A = new int[130][130]; 
	int[][] XV = new int[130][130]; 
	int[][] YV = new int[130][130];
    public RoyalGameOfLife(){
    	setTitle("Debasish's Game of Life");
    	setSize(1000,900);
    	setVisible(true); 
    	setResizable(false); 
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	x=30;
    	y=30;
    }
    public void paint(Graphics g){
    	//int px=0,py=0;
    	g.drawString("Debasish's Game of life !!",750,120);
    	g.setColor(Color.blue);
    	
    	for(int i=0;i<130;i++){ 
    		x=30;
    		for(int j=0;j<130;j++){
    			run();
    		    
    			g.drawRect(x, y, 5, 5);  
    			A[i][j]=0;
    			XV[i][j]=x;
	    		YV[i][j]=y;
	    	/*
	    		if((x^y)%2==0){    
    	    		//outstanding performance in 1,3,5,7
    	    		g.fillRect(x, y, 5, 5);
    	    		A[i][j] = 1;
    	    		XV[i][j]=x;
    	    		YV[i][j]=y;
    	    	}
    	    	
    	    	x+=5;
    		}
    		y+=5;
    	}
    	*/
	    	/*	
	    		if(i==10&&j==10){
	    			g.fillRect(x, y, 5, 5);
    	    		A[i][j] = 1;
    	    		XV[i][j]=x;
    	    		YV[i][j]=y;
	    		}
	    		if(i==10&&j==11){
	    			g.fillRect(x, y, 5, 5);
    	    		A[i][j] = 1;
    	    		XV[i][j]=x;
    	    		YV[i][j]=y;
	    		}
	    		if(i==10&&j==12){
	    			g.fillRect(x, y, 5, 5);
    	    		A[i][j] = 1;
    	    		XV[i][j]=x;
    	    		YV[i][j]=y;
	    		}
	    		if(i==9&&j==12){
	    			g.fillRect(x, y, 5, 5);
    	    		A[i][j] = 1;
    	    		XV[i][j]=x;
    	    		YV[i][j]=y;
	    		}
	    		if(i==8&&j==11){
	    			g.fillRect(x, y, 5, 5);
    	    		A[i][j] = 1;
    	    		XV[i][j]=x;
    	    		YV[i][j]=y;
	    		}
	    		*/
	    		
	    	if(j==75&&i==70){
	        		g.fillRect(x, y, 5, 5);
	        		A[i][j] = 1;
	        		XV[i][j]=x;
	        		YV[i][j]=y;	
	        	}
    	if(j==76&&i==70){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(j==77&&i==70){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(j==78&&i==70){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(j==79&&i==70){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(j==80&&i==70){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(j==81&&i==70){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(j==82&&i==70){
    		g.fillRect(x, y, 5, 5); 
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(j==83&&i==70){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(j==84&&i==70){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	
    	//***************************************************
	    //****************************		
	   //Gosper Glider gun generation :
	   //***************************** 		
    	//******************************************************
    	
    	if(i==10&&j==10){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==10&&j==11){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==11&&j==10){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==11&&j==11){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==10&&j==19){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==10&&j==20){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==11&&j==18){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==11&&j==20){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==12&&j==18){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==12&&j==19){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==12&&j==26){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==12&&j==27){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==13&&j==26){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==13&&j==28){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==14&&j==26){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==8&&j==33){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==8&&j==34){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==9&&j==32){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==9&&j==34){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==10&&j==32){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==10&&j==33){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==20&&j==34){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==20&&j==35){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==20&&j==36){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==21&&j==34){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==22&&j==35){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==8&&j==44){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==8&&j==45){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==9&&j==44){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==9&&j==45){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==15&&j==45){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==15&&j==46){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==16&&j==45){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==16&&j==47){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	if(i==17&&j==45){
    		g.fillRect(x, y, 5, 5);
    		A[i][j] = 1;
    		XV[i][j]=x;
    		YV[i][j]=y;	
    	}
    	
    	x+=5;
    		}
    		y+=5;
    	}
    
    
    
    
    	//g.clearRect(px, py, 15, 15);
    	//g.setColor(Color.black);
    	//g.drawRect(px, py, 15, 15); 
    	run();
    	run();
    	run();
    	int lifeCell;
    	int T=0;
    	while(T<20000){
    		run1();
        	 
    		ArrayList<Integer> alXlc = new ArrayList<Integer>();
    		ArrayList<Integer> alYlc = new ArrayList<Integer>();
    		ArrayList<Integer> alXdc = new ArrayList<Integer>();
    		ArrayList<Integer> alYdc = new ArrayList<Integer>();
    		
    		
    		for(int i=0;i<130;i++){
        		//run();
        		//run();
        		for(int j=0;j<130;j++){
        			lifeCell=0;  
        			int life = A[i][j];
        			if(j-1>=0){
        				if(A[i][j-1]==1) lifeCell++; 
        			}
        			if(j+1<130){
        				if(A[i][j+1]==1) lifeCell++;
        			}
        			if(i-1>=0){
        				if(A[i-1][j]==1) lifeCell++;
        			}
        			if(i+1<130){
        				if(A[i+1][j]==1) lifeCell++;
        			}
        			
        			//corner cells 
        			if(j-1>=0&&i-1>=0){
        				if(A[i-1][j-1]==1)lifeCell++;
        			}
        			if(i-1>=0&&j+1<130){
        				if(A[i-1][j+1]==1) lifeCell++;
        			}
        			if(i+1<130&&j-1>=0){
        	 			if(A[i+1][j-1]==1) lifeCell++;
        			}
        			if(i+1<130&&j+1<130){
        				if(A[i+1][j+1]==1) lifeCell++;
        			}
        			 
        			
        			if(lifeCell==3){
        				if(life==0) {
        					g.setColor(Color.black);
        					g.fillRect(XV[i][j],YV[i][j],5,5);
        					alXlc.add(i);
        					alYlc.add(j);
        				}
        			} 
        			if(lifeCell==0||lifeCell==1){
        				if(life==1) {
        					g.clearRect(XV[i][j],YV[i][j],5,5);
        					g.setColor(Color.blue);
        					g.drawRect(XV[i][j],YV[i][j],5,5);
        					alXdc.add(i);
        					alYdc.add(j);
        				}
        			}
        			if(lifeCell>=4){
        				if(life==1) {
        					g.clearRect(XV[i][j],YV[i][j],5,5);
        					g.setColor(Color.blue);
        					g.drawRect(XV[i][j],YV[i][j],5,5);
        					alXdc.add(i);
        					alYdc.add(j);
        				}
        			}
        		}
        	}
    		for(int v=0;v<alXlc.size();v++){
    			A[alXlc.get(v)][alYlc.get(v)]=1;
    			for(int u=0;u<alXdc.size();u++){
        			A[alXdc.get(u)][alYdc.get(u)]=0;
        			
        		}
    			
    		}
    		
    		T++;
    	}
    	int servivor=0;
    	for(int i=0;i<130;i++){
    		for(int j=0;j<130;j++){
    			if(A[i][j]==1) servivor++;
    		}
    	}
    	g.drawString("Living Cells = "+servivor,750,100);
    }
    
    public void run(){
		try{
			
			Thread.sleep(1);
		}catch(Exception e){
			System.out.println("ERROR!!");
		}
	}
    public void run1(){ 
		try{
			
			Thread.sleep(100);
		}catch(Exception e){
			System.out.println("ERROR!!");
		}
	}
	
    public void lifeGame(Graphics g){ 
    	
    }
    		
    	
    	
    	
   
    	
    	
    	
    
	public static void main(String[] args) {
		RoyalGameOfLife pg = new RoyalGameOfLife();
		Thread t1 = new Thread();
		t1.start();
        
	}

}


