package paint;

public class Point implements Drawable {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {}

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
	
	public void show(boolean visible) {
		if (visible) {
			show(); // 오버라이드해서 color의 show가 실행.
		}else{
			System.out.println("[x = " + x + ", y = " + y + "] 에 점을 지웠습니다.");
		}
	}
	
	public void show() {
		System.out.println("[x = " + x + ", y = " + y + "] 에 점을 그렸습니다.");
	}

	@Override
	public void draw() {
		show();
	}
}