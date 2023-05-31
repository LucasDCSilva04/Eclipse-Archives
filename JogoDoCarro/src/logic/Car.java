package logic;

public class Car {
	
	//atributos (privados)
	private String color;
	private int speed;
	private int x;
	private int y;
	private int health;
	
	//construtores
	public Car () {
	}
	
	public Car (String color) {
		this.color=color;
	}
	
	public Car(String color, int x, int y) {
		this.color=color;
		this.x=x;
		this.y=y;
	}
	
	public Car(String color, int speed, int x, int y, int health) {
		this.color=color;
		this.speed=speed;
		this.x=x;
		this.y=y;
		this.health=health;
	}

	//métodos funcionais
	public void accelerate() {
		this.speed+=1;
	}
	
	public void accelerate(int speed) {
		this.speed+=speed;
		if(this.speed<0)
			this.speed = 0;
	}
	
	//métodos de acesso
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", x=" + x + ", y=" + y + ", health=" + health + "]";
	}
	
	//toString
	
}
