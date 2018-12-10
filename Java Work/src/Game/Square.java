package Game;


import java.awt.Image;
import java.awt.Toolkit;

public class Square {

	private int xCoord = 0;
	private int yCoord = 0;
	private int width = 5;
	private int height = 5;
	private Image img;
	
	public Square() {
		setxCoord(10);
		setyCoord(10);
		setWidth(5);
		setHeight(5);
		setImg("../files/sqaure.jpg");
	}
	
	public Square(int x, int y, int w, int h, String imgpath) {
		setxCoord(x);
		setyCoord(y);
		setWidth(w);
		setHeight(h);
		setImg(imgpath);
	}
	
	public void moveIt(int direction) {
		
		int speed = 10;
		int x = getxCoord();
		int y = getyCoord();
		if (direction == 39 && x < 1440) {
			x = x + speed;
			setxCoord(x);
			setImg("files/square.jpg");
		} 
		if (direction == 37 && x > 5) {
			x = x - speed;
			setxCoord(x);
			setImg("files/square.jpg");
		}
		if (direction == 38 && y > 5) { 
			y = y - speed;
			setyCoord(y);
			setImg("files/square.jpg");
		}
		if (direction == 40 && y < 815) {
			y = y + speed;
			setyCoord(y);
			setImg("files/square.jpg");
		}
	}

	public void setImg(String imgpath) {
		this.img = Toolkit.getDefaultToolkit().getImage(imgpath);
	}

	public Image getImg1() {
		return img;
	}
	public int getxCoord() {
		return xCoord;
	}

	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	public int getyCoord() {
		return yCoord;
	}

	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}	
}