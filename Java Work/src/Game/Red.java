package Game;


import java.awt.Image;
import java.awt.Toolkit;

public class Red {

	private int xCoord = 0;
	private int yCoord = 0;
	private int width = 5;
	private int height = 5;
	private Image img;
	
	public Red() {
		setxCoord(10);
		setyCoord(10);
		setWidth(5);
		setHeight(5);
		setImg("../files/Red.png");
	}
	
	public Red(int x, int y, int w, int h, String imgpath) {
		setxCoord(x);
		setyCoord(y);
		setWidth(w);
		setHeight(h);
		setImg(imgpath);
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



