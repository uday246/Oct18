package Oct16;

public class ArrayIntList {
    private int[] elementData; // list of integers
    private int size;          // current # of elements in the list

    public ArrayIntList(int aSize) {
		super();
		elementData = new int[aSize];
		size = aSize;
	}

	public boolean insertAt(int index,int ele){
    	if(index<0 | index>=size)
    		throw new IllegalArgumentException();
    	for(int i=size-1;i>=index;i--)
    		elementData[i+1]=elementData[i];
    	elementData[index]=ele;
    	return true;
    	
    }
}
