package Game;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;



public class MyCanvas extends Canvas implements KeyListener {
	
	int mazex = 0;
	int mazey = 0;
	//Maze maze = new Maze(0,0, 1440,796, "files/mymaze.png");
	Square square = new Square(5, 5, 10, 10, "files/square.jpg");
	Red circle = new Red(30, 80, 10, 10, "files/Red.png");
	Red circle2 = new Red(533, 160, 10,10, "files/Red.png");
	Red circle3 = new Red(732, 510, 10,10, "files/Red.png");
	Red circle4 = new Red(1140, 80, 10,10, "files/Red.png");
	Red circle5 = new Red(815, 45, 10,10, "files/Red.png");

	public MyCanvas() {

		//this.setSize(480, 398);
		this.setSize(1440,815);
		this.addKeyListener(this);

	}

	/*
	public void playIt("files/storm.wav") {
	try {
	InputStream in = new FileInputStream(filename);
	AudioStream as = new AudioStream(in);
	AudioPlayer.player.start(as);
	} catch (IOException e) {
		e.printStackTrace();
	}
	*/

	@Override
	public void paint(Graphics g) { 
		g.drawImage(Toolkit.getDefaultToolkit().getImage("files/mymaze.png"), mazex, mazey, 1440, 795, this);
		//g.drawImage(maze.getImg(), maze.getxCoord(), maze.getyCoord(), maze.getWidth(), maze.getHeight(), this);	    
		g.drawImage(square.getImg(), square.getxCoord(), square.getyCoord(), square.getWidth(), square.getHeight(), this);	    
		g.drawImage(circle.getImg(),circle.getxCoord(), circle.getyCoord(), circle.getWidth(), circle.getHeight(), this);
		g.drawImage(circle2.getImg(),circle2.getxCoord(), circle2.getyCoord(), circle2.getWidth(), circle2.getHeight(), this);
		g.drawImage(circle3.getImg(),circle3.getxCoord(), circle3.getyCoord(), circle3.getWidth(), circle3.getHeight(), this);
		g.drawImage(circle4.getImg(),circle4.getxCoord(), circle4.getyCoord(), circle4.getWidth(), circle4.getHeight(), this);
		g.drawImage(circle5.getImg(),circle5.getxCoord(), circle5.getyCoord(), circle5.getWidth(), circle5.getHeight(), this);
		g.drawImage(Toolkit.getDefaultToolkit().getImage("files/portal.gif"), 440, 115, 10, 20, this);
		g.drawImage(Toolkit.getDefaultToolkit().getImage("files/portal.gif"), 745, 775, 10, 20, this);
		g.drawImage(Toolkit.getDefaultToolkit().getImage("files/portal.gif"), 0, 420, 20, 10, this);
		g.drawImage(Toolkit.getDefaultToolkit().getImage("files/portal.gif"), 1422, 208, 20, 10, this);
		g.drawImage(Toolkit.getDefaultToolkit().getImage("files/portal.gif"), 0, 730, 20, 10, this);
		g.drawImage(Toolkit.getDefaultToolkit().getImage("files/portal.gif"), 608, 595, 20, 10, this);
		g.drawImage(Toolkit.getDefaultToolkit().getImage("files/portal.gif"), 825, 0, 10, 20, this);
		g.drawImage(Toolkit.getDefaultToolkit().getImage("files/portal.gif"), 1215, 700, 10, 20, this);
		
		Rectangle p1 = new Rectangle(445, 115, 10, 20);
		Rectangle p2 = new Rectangle(745, 775, 10, 20);
		Rectangle p3 = new Rectangle(0, 425, 20, 10);
		Rectangle p4 = new Rectangle(1422, 205, 20, 10);
		Rectangle p5 = new Rectangle(0, 730, 20, 10);
		Rectangle p6 = new Rectangle(608, 595, 20, 10);
		Rectangle p7 = new Rectangle(825, 0, 10, 20);
		Rectangle p8 = new Rectangle(1215, 700, 10, 20);
		Rectangle c1 = new Rectangle(circle.getxCoord(), circle.getyCoord(), 10, 10);
		Rectangle c2 = new Rectangle(circle2.getxCoord(), circle2.getyCoord(), 10, 10);
		Rectangle c3 = new Rectangle(circle3.getxCoord(), circle3.getyCoord(), 10, 10);
		Rectangle c4 = new Rectangle(circle4.getxCoord(), circle4.getyCoord(), 10, 10);
		Rectangle c5 = new Rectangle(circle5.getxCoord(), circle5.getyCoord(), 10, 10);
		Rectangle win = new Rectangle(1410, 780, 30, 30);
		if (c1.contains(square.getxCoord()+5, square.getyCoord()+5)) {
			square.setxCoord(5);
			square.setyCoord(5);
		}
		if (c2.contains(square.getxCoord()+5, square.getyCoord()+5)) {
			square.setxCoord(5);
			square.setyCoord(5);
		}
		if (c3.contains(square.getxCoord()+5, square.getyCoord()+5)) {
			square.setxCoord(5);
			square.setyCoord(5);
		}
		if (c4.contains(square.getxCoord()+5, square.getyCoord()+5)) {
			square.setxCoord(5);
			square.setyCoord(5);
		}
		if (c5.contains(square.getxCoord()+5, square.getyCoord()+5)) {
			square.setxCoord(5);
			square.setyCoord(5);
		}
		
		if (p1.contains(square.getxCoord()+5, square.getyCoord()+5)) {
			square.setxCoord(735);
			square.setyCoord(777);
		}
		if (p2.contains(square.getxCoord()+5, square.getyCoord()+5)) {
			square.setxCoord(455);
			square.setyCoord(117);
		}
		if (p3.contains(square.getxCoord()+5, square.getyCoord()+5)) {
			square.setxCoord(1422);
			square.setyCoord(195);
		}
		if (p4.contains(square.getxCoord()+5, square.getyCoord()+5)) {
			square.setxCoord(0);
			square.setyCoord(435);
		}
		if (p5.contains(square.getxCoord()+5, square.getyCoord()+5)) {
			square.setxCoord(612);
			square.setyCoord(585);
		}
		if (p6.contains(square.getxCoord()+5, square.getyCoord()+5)) {
			square.setxCoord(5);
			square.setyCoord(745);
		}
		if (p7.contains(square.getxCoord()+5, square.getyCoord()+5)) {
			square.setxCoord(1225);
			square.setyCoord(705);
		}
		if (p8.contains(square.getxCoord()+5, square.getyCoord()+5)) {
			square.setxCoord(815);
			square.setyCoord(5);
		}
		if (win.contains(square.getxCoord()+5, square.getyCoord()+5)) {
			g.drawImage(Toolkit.getDefaultToolkit().getImage("files/finished.png"), 200, 50, 1040, 696, this);
		}
		//g.drawImage(maze.getImg(),maze.getxCoord(), maze.getyCoord(), maze.getWidth(), maze.getHeight(), this);
		
		for (int x = 0; x < 100; x++) {
			if (x%50 == 0) {
				if (circle.getxCoord() < 170) {
					circle.setxCoord(circle.getxCoord() + 2);
					repaint();
				} else if (circle.getyCoord() < 160 && circle.getxCoord() < 200) {
					circle.setyCoord(circle.getyCoord() + 2);
					repaint();
				} else if (circle.getxCoord() < 210) {
					circle.setxCoord(circle.getxCoord() + 2);
					repaint();
				} else if (circle.getyCoord() > 122 && circle.getxCoord() < 249) {
					circle.setyCoord(circle.getyCoord() - 2);
					repaint();
				} else if (circle.getxCoord() < 250) {
					circle.setxCoord(circle.getxCoord() + 2);
					repaint();
				} else if (circle.getyCoord() < 210 && circle.getxCoord() > 249) {
					circle.setyCoord(circle.getyCoord() + 2);
					repaint();
				} else {
					circle.setxCoord(0);
					circle.setyCoord(80);
				}
			}
		}
		for (int y = 0; y < 100; y++) {
			if (y%50 == 0) {
				if (circle2.getyCoord() < 395) {
					circle2.setyCoord(circle2.getyCoord() + 2);
					repaint();
				} else if (circle2.getxCoord() > 450) {
					circle2.setxCoord(circle2.getxCoord() - 2);
					repaint();
				} else if (circle2.getyCoord() < 430 && circle2.getxCoord() < 530) {
					circle2.setyCoord(circle2.getyCoord() + 2);
					repaint();
				} else if (circle2.getxCoord() > 410 && circle2.getyCoord() > 400) {
					circle2.setxCoord(circle2.getxCoord() - 2);
					repaint();
				} else if (circle2.getyCoord() < 585 && circle2.getxCoord() < 420) {
					circle2.setyCoord(circle2.getyCoord() + 2);
					repaint();
				} else {
					circle2.setxCoord(533);
					circle2.setyCoord(160);
				}
			}
		}
		for (int y = 0; y < 100; y++) {
			if (y%50 == 0) {
				if (circle3.getxCoord() < 855) {
					circle3.setxCoord(circle3.getxCoord() + 2);
					repaint();
				} else if (circle3.getyCoord() < 550) {
					circle3.setyCoord(circle3.getyCoord() + 2);
					repaint();
				} else if (circle3.getxCoord() < 900) {
					circle3.setxCoord(circle3.getxCoord() + 2);
					repaint();
				} else if (circle3.getyCoord() < 660) {
					circle3.setyCoord(circle3.getyCoord() + 2);
					repaint();
				} else if (circle3.getxCoord() < 980) {
					circle3.setxCoord(circle3.getxCoord() + 2);
					repaint();
				} else if (circle3.getyCoord() < 796) {
					circle3.setyCoord(circle3.getyCoord() + 2);
					repaint();
				} else {
					circle3.setxCoord(732);
					circle3.setyCoord(510);
				}
			}
		}
		for (int y = 0; y < 100; y++) {
			if (y%50 == 0) {
				if (circle4.getyCoord() < 315) {
					circle4.setyCoord(circle4.getyCoord() + 2);
					repaint();
				} else if (circle4.getxCoord() < 1260) {
					circle4.setxCoord(circle4.getxCoord() + 2);
					repaint();
				} else if (circle4.getyCoord() < 350) {
					circle4.setyCoord(circle4.getyCoord() + 2);
					repaint();
				} else if (circle4.getxCoord() < 1315) {
					circle4.setxCoord(circle4.getxCoord() + 2);
					repaint();
				} else {
					circle4.setxCoord(1140);
					circle4.setyCoord(80);
				}
			}
		}
		for (int y = 0; y < 100; y++) {
			if (y%50 == 0) {
				if (circle5.getyCoord() < 200) {
					circle5.setyCoord(circle5.getyCoord() + 2);
					repaint();
				} else if (circle5.getxCoord() > 775) {
					circle5.setxCoord(circle5.getxCoord() - 2);
					repaint();
				} else if (circle5.getyCoord() < 235) {
					circle5.setyCoord(circle5.getyCoord() + 2);
					repaint();
				} else if (circle5.getxCoord() > 738) {
					circle5.setxCoord(circle5.getxCoord() - 2);
					repaint();
				} else if (circle5.getyCoord() < 320) {
					circle5.setyCoord(circle5.getyCoord() + 2);
					repaint();
				} else {
					circle5.setxCoord(815);
					circle5.setyCoord(45);
				}
			}
		}
		int[] rgbarray = {0,0,0,0};
		int[] rgbarrayeast = {0,0,0,0};
		int[] rgbarraysouth = {0,0,0,0};
		int[] rgbarraynorth = {0,0,0,0};
		int[] rgbarraywest = {0,0,0,0};
		try {
		
			 File img = new File("files/mymaze.png");
			    BufferedImage image = ImageIO.read(img);
			    
				image.getRaster().getPixel(square.getxCoord()+5,square.getyCoord()+5,rgbarray);
				System.out.println("Square: " + rgbarray[0]);
				image.getRaster().getPixel(circle.getxCoord() + 15,circle.getyCoord(),rgbarrayeast);
				System.out.println("East: " + rgbarrayeast[0]);
				image.getRaster().getPixel(circle.getxCoord(),circle.getyCoord() + 15,rgbarraysouth);
				System.out.println("South: " + rgbarraysouth[0]);
				image.getRaster().getPixel(circle.getxCoord(),circle.getyCoord() - 15,rgbarraynorth);
				System.out.println("North: " + rgbarraynorth[0]);
				if (circle.getxCoord() > 15) {
				image.getRaster().getPixel(circle.getxCoord() - 15,circle.getyCoord(),rgbarraywest);
				System.out.println("West: " + rgbarraywest[0]);
				
				}
			
				/*
				if (square.getxCoord() > 480) {
					mazex = mazex  - 480;
					square.setxCoord(5);
				}
				if (square.getyCoord() > 375) {
					mazey = mazey - 375;
					square.setyCoord(5);
				}
				if (square.getxCoord() < 0) {
					mazex = mazex + 480;
					square.setxCoord(475);
				}
				if (square.getyCoord() < 0) {
					mazey = mazey + 375;
					square.setyCoord(370);
				} 
				
					
				if (rgbarrayeast[0] > 100) {
					while (rgbarrayeast[0] > 100) {
					circle.setxCoord(circle.getxCoord() + 5);
					repaint();
					}
				} else if (rgbarraysouth[0] > 100) {
					while (rgbarraysouth[0] > 100) {
					circle.setyCoord(circle.getyCoord() + 5);
					repaint();	
					}
				} else if (rgbarraynorth[0] > 100) {
					while (rgbarraynorth[0] > 100) {
					circle.setyCoord(circle.getyCoord() - 5);
					repaint();
					}
				} else if (rgbarraywest[0] > 100) {	
					while (rgbarraywest[0] > 100) {	
					circle.setxCoord(circle.getxCoord() - 5);
					repaint();	
					}	
				}					
				
				Random rand = new Random();
				int low = 0;
				int high = 4;
				int result = rand.nextInt(high-low);
				System.out.println(result);
				if (result == 0 && rgbarrayeast[0] > 100) {
					circle.setxCoord(circle.getxCoord() + 10);
				}
				if (result == 1 && rgbarraywest[0] > 100) {
					circle.setxCoord(circle.getxCoord() - 10);
				}
				if (result == 2 && rgbarraysouth[0] > 100) {
					circle.setyCoord(circle.getyCoord() + 10);
				}
				if (result == 3 && rgbarraynorth[0] > 100) {
					circle.setyCoord(circle.getyCoord() - 10);
				}
				*/
				
				int black = rgbarray[0];
				if (black < 200) {
					square.setxCoord(5);
					square.setyCoord(5);
				}		
		}catch(
	IOException e) {
		e.printStackTrace();
	}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void keyPressed(KeyEvent e) {
		//if (square.getxCoord() < 200 && square.getyCoord() < 200) {
		System.out.println(e);		
		square.moveIt(e.getKeyCode());		
		//} else {
		//maze.moveIt(e.getKeyCode());
		//}
		repaint();
		
	}
}