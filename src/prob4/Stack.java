package prob4;

public interface Stack<E> {
	public void push(E item);
	public E pop();
	public boolean isEmpty();
	public int size();
}