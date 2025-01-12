package rect;

import java.util.Objects;

public class Rectangle {
	
	private int width , height;
	
	public Rectangle(int width , int height) {
		super();
		this.width = Math.max(1,width);
		this.height = Math.max(1,height);
		
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	public int getArea() {
		return this.width*this.height;
	}

	@Override
	public int hashCode() {
		return Objects.hash(height, width);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		return height == other.height && width == other.width;
	}
	public int doubleArea() {
		return this.getArea()*2;
	}
}
