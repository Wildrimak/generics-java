package teste;

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
	
	public Box<T> getTypedBox(String nome, Class<T> classe){
		return null;
		
	}

}
