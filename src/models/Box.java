package models;

public class Box<T> {

	private T t;

	public Box() {
	}

	public Box(T t) {
		this.t = t;
	}

	public T getT() {
		return this.t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
