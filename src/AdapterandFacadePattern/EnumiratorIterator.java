package AdapterandFacadePattern;

public class EnumiratorIterator implements Iterator
{
	Enumeration enum;
	
	public EnumiratorIterator(Enumeration enum) {
		this.enum = enum;
	}
	
	public boolean hasNext() {
		return enum.hasMoreElements();
	}
	
	public Object next() {
		return enum.nextElement();
	}
	
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
