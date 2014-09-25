public class IntList {
	// properties
	public int[] list;
	public int numElements = 0;

	// constructor
	IntList(int size) {
		list = new int[size];
	}

	// methods
	public void add(int value) {
		if(numElements == list.length) {
			System.out.println("List is full!");
		} else {
			list[numElements] = value;
			numElements += 1;
		}
	}

	public String toString() {
		// for(int i = 0; i < list.length; i += 1) {
		// 	return list[i];
		// }
		return "" + list + "";
	}
}
