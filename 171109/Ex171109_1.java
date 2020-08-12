package Ex171109;
/* 상속 
 * 하위클래스의 메소드 호출 불가능 */

class Rectangle{
	public int width;
	public int height;
	public Rectangle(int w, int h){
		width = w;
		height =h;
	}
	
	public int ComputerRectangle(){
		return width * height;
	}
}

class Cube extends Rectangle{
	public int depth;
	public Cube(int w, int h, int d){
		super(w, h);
		depth=d;
	}
	public int ComputerCube(){
		return super.ComputerRectangle()*depth;
	}
}
public class Ex171109_1 {

	public static void main(String[] args) {
		Rectangle r = new Cube(10, 20, 30);
		System.out.println("넓이 :"+r.ComputerRectangle());
		//System.out.println("넓이 :"+r.ComputerCube()); 
		//하위클래스의 메소드 호출 불가능

	}

}
