package Oct14;

import java.util.Vector;

public class Shop {
	   private int INITIAL_CAPACITY = 5;
	   private String[] _data;
	   private int _usedIndexes;
	   private boolean _removed;
	   private Integer _cursor;
	  
	   public Shop() {
	       _data = new String[INITIAL_CAPACITY];
	       _usedIndexes = -1;
	       _removed = false;
	   }
	   /*
	   * adds the new thing and its count, after the last used index in the array
	   */
	   public boolean add(String thing , Integer count) {
	       if(!checkSpace())
	           increaseCapacity();
	       _data[++_usedIndexes] = thing;
	       _data[++_usedIndexes] = count.toString();  
	  
	       return false;
	   }
	   /*
	   * checks if there is enough free space in array to add new item
	   */
	   private boolean checkSpace() {
	       return (_usedIndexes <_data.length -1);
	   }

	   private void increaseCapacity() {
	      
	           String[] tmp = new String[2* _data.length +1 ];
	           for (int i = 0 ; i < _data.length ; i++) {
	               tmp[i] = _data[i];
	           }
	           _data = tmp;
	      
	   }
	  
	   public void start() {
	       _cursor = 0;
	       _removed = false;
	   }
	  
	   public boolean isCurrent() {
	       return (_cursor < _usedIndexes && (!_removed));
	   }

	   public void advance() {
	       if (_cursor < _usedIndexes && _removed == false) {
	           _cursor ++;
	           _cursor ++;
	       }
	       _removed = false;
	   }
	  
	   /*
	   * @return the type of item cursor is pointing to
	   */
	   public String getType() {
	       if (! isCurrent()) throw new IllegalStateException ("getType is called while isCurrent returns false");
	       return _data[_cursor];
	   }
	  
	   /*
	   * @return the quantity of item cursor is pointing to in the shop
	   */
	   public int getQuantity() {
	       if (! isCurrent()) throw new IllegalStateException ("getQuantity is called while isCurrent returns false");
	       return Integer.parseInt(_data[_cursor + 1]);
	   }  
	  
	   public int totalTypes() {
	       return (_usedIndexes+1)/2;
	   }
	   /*
	   * @return total number of all items (sum of all items quantity)
	   */
	   public int totalItems() {
	       int tmp = 0;
	       for (int i = 1 ; i <= _usedIndexes ; i = i +2) {
	           tmp += Integer.parseInt(_data[i]);
	       }
	       return tmp;
	   }
	  
	   /*
	   * remove whole stack of the item cursor is pointing to
	   */
	   public void removeCurrent() {
	       if (! isCurrent()) throw new IllegalStateException("removeCurrent is called while isCurrent returns false");
	       Integer tmp = _cursor;
	       if(_cursor +1 == _data.length-1) {
	           _data[_cursor] = null;
	       }
	       else
	           while (tmp + 2 < _data.length && _data[tmp ] != null) {
	               _data[tmp++] = _data[tmp + 1];
	               _data[tmp++] = _data[tmp + 1];
	           }
	       _usedIndexes = _usedIndexes - 2;
	       _removed = true;
	   }
	}
