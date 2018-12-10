package Game;


import java.awt.Image;
import java.awt.Toolkit;

public class Maze {

	private int xCoord = 0;
	private int yCoord = 0;
	private int width = 5;
	private int height = 5;
	private Image img;
	
	public Maze() {
		setxCoord(10);
		setyCoord(10);
		setWidth(5);
		setHeight(5);
		setImg("../files/mymaze.png");
	}

	public Maze(int x, int y, int w, int h, String imgpath) {
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
		if (direction == 39 && x > 1240) {
			x = x - speed;
			setxCoord(x);
			setImg("files/mymaze.png");
		} else if (direction == 37 && x < 200) {
			x = x + speed;
			setxCoord(x);
			setImg("files/mymaze.png");
		}
		if (direction == 38 && y < 200) { 
			y = y + speed;
			setyCoord(y);
			setImg("files/mymaze.png");
		}
		else if (direction == 40 && y > 596) {
			y = y - speed;
			setyCoord(y);
			setImg("files/mymaze.png");
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
