package gui;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class A22
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        Integer x = 5;
        System.out.println(x);
        arr.add(3);
        arr.add(2);
        NewArrayList<Integer> n = new NewArrayList<Integer>(arr);

        System.out.println(n.size());




        System.out.println(n.size());

        System.out.println(n);

        n.add(1, 4);
        System.out.println(n);

        n.add(1, 3);
        System.out.println(n);

        n.set(1, 10);
        System.out.println(n);

        NewArrayList<String> s = new NewArrayList<String>();
        s.add("s");
        s.add("t");
        s.add("am");
        System.out.println(s);
        s.add(1,"the");
        System.out.println(s);

    }
}

class NewArrayList<AnyType extends Comparable<? super AnyType>> extends AbstractCollection<AnyType> implements List<AnyType>
{
    private static final int DEFAULT_CAPACITY = 10;

    private static final int NOT_FOUND = -1;

    //internal array declaration, set to null by default.
    private AnyType [ ] theItems;

    private int theSize;

    private int modCount = 0;

    public NewArrayList( )
    {
        clear();

    }
    public NewArrayList(int size)
    {
        clear();
        theSize = size;
    }

    //takes a collection and adds them to the, theItems array (not ascending).
    public NewArrayList(Collection<? extends AnyType> other)
    {
        clear();

        theSize = other.size();

        for (AnyType obj : other)
        {
            add(obj);
        }
        sort(theItems);
        //generates null pointer exception.
    }

    //Sort implementation provided. But this doesn't sort the internal array; thus, doesn't sort at end of
    //every method call.
    public static <AnyType extends Comparable<? super AnyType>> void sort(AnyType [] arr)
    {
        for( int p = 1; p < arr.length; p++ )
        {
            AnyType tmp = arr[p];
            if(tmp==null)
            	continue;
            System.out.println(tmp);
            int j = p;

            for( ;   j > 0 && arr[j-1]!=null && tmp.compareTo( arr[j-1] ) < 0; j-- )

                arr[j] = arr[j-1];

            arr[j] = tmp;
        }
    }

    //gets the element associated with a particular index.
    public AnyType get(int index)
    {
        if(index < 0 || index >= size())
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        return theItems[index];
    }

    //sets an element at a particular index (reassignment).
    //returns the old value just in case we want it for some reason.
    public AnyType set(int index, AnyType setVal)
    {
        if(index < 0 || index >= size())
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        theItems[index] = setVal;

        return theItems[index];
    }

    public void clear()
    {
        theSize = 0;

        theItems = (AnyType[]) new Comparable[DEFAULT_CAPACITY];

        modCount++;
    }

    //adds item to a specified index. Shifts array.
    //Now, I need to check if the place the item is inserted follows sorting requirement.
    //if it doesn't, we need to insert it in its specific place.
    public void add(int idx, AnyType element)
    {
        if(idx < 0 || idx >= size())
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        AnyType tmp = theItems[idx];

        theItems[idx] = element;

        int j = size();

        for(; j > idx; j--)
        {
            theItems[j] = theItems[j-1];
        }
        theSize++;

        theItems[idx] = element;

        theItems[idx+1] = tmp;

        for(int i = 0; i < size(); i++)
        {
            if(theItems[i] == null)
            {
                remove(i);
            }
        }


    }

    //adds an element to the end of the Array, does dynamic array expansion if necessary
    //MODIFY THIS so that it adds elements in sorted order.
    //ex: {3} and I add 2, it should automatically put the two before the 3. ({2,3}).
    public boolean add(AnyType element)
    {
        if (theItems.length == size()) {

            AnyType[] oldVals = theItems;

            theItems = (AnyType[]) new Comparable[theItems.length * 2];

            for (int i = 0; i < size(); i++)
            {
                theItems[i] = oldVals[i];
            }
        }
        theItems[theSize++] = element;

        //removes null values from list.
        for (int i = 0; i < size(); i++) {

            if (theItems[i] == null)
            {
                remove(i);
            }
        }


        modCount++;

        return true;
    }

    //this cannot be implemented. "inferred type does not conform to upper bound(s)
    //finds the index of a specified element in the array.
    //We don't want any null values in the middle, so will likely need to modify this.
    private int findPos( Object element )
    {
        for( int i = 0; i < size( ); i++ )

            if( element == null )
            {
                if( theItems[ i ] == null )

                    remove(i);
            }
            else if( element.equals( theItems[ i ] ) )

                return i;

        return NOT_FOUND;
    }

    //removes a particular element associated with a particular index.
    //starts at the index of removal and iterates through the rest of the array...
    //assigning the proceeding values to the value at the current index (basically just shifting left one space).
    public AnyType remove(int idx)
    {
        AnyType removedItem = (AnyType) theItems[ idx ];

        for( int i = idx; i < size( ) - 1; i++ )

            theItems[ i ] = theItems[ i + 1 ];

        theSize--;

        modCount++;

        return removedItem;
    }

    //makes sure the element is in the array, if it is, call the method above.
    public boolean remove(Object element)
    {
        int pos = findPos( element );

        if( pos == NOT_FOUND )
        {
            return false;
        }
        else
        {
            remove( pos );

            return true;
        }
    }
	@Override
	public boolean addAll(int aIndex, Collection<? extends AnyType> aC) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int indexOf(Object aO) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int lastIndexOf(Object aO) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ListIterator<AnyType> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ListIterator<AnyType> listIterator(int aIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<AnyType> subList(int aFromIndex, int aToIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Iterator<AnyType> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}