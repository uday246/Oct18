package Oct5th;

import java.util.ArrayList;

/**
* The class <code>Lab06Client</code> provides practice with using
* some of the interfaces and classes of the Java Collection Framework.
*
* @author Charley Sheaffer
* @version October 1, 2018
*/
public class Lab06Client
{

    /**
    * The first method typically executed within a Lab06Client object.
    * This method calls helper methods to practice using some of the
    * interfaces (that is, abstract data types) in the Java Collection Framework.
    */
    private void useJCF() 
    {
        useArrayListStringElement();
        useArrayListClassificationElement();
    }

    /** A class to be an element of a collection */
    private class Classification
    {
        /** the genus of the organism */
        private String genus;

        /** the species of the organism */
        private String species;

        /** the constructor */
        public Classification(String genus, String species)
        {
            this.genus = genus;
            this.species = species;
        }

        @Override
        public int hashCode() {
            int hash = 17;
            hash = hash * 29 + genus.hashCode();
            hash = hash * 29 + species.hashCode();
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
          if (this == obj) return true;
          if (obj == null) return false;
          if (getClass() != obj.getClass()) return false;
          Classification c = (Classification) obj;
          return genus.equals(c.genus) && species.equals(c.species);
        }

        @Override
        public String toString()
        {
            return "(" + this.genus + ", " + this.species + ")";
        }
    }

    /** A client for the ArrayList collection interface that has the
    * element in the collection being of type String.
    */
    private void useArrayListStringElement()
    {
        // declare a variable (called list01) of type ArrayList<String>
    	ArrayList<String> list01 =null;
    	list01 = new ArrayList<String>();
        // create an object of class ArrayList and assign its reference
        // to the variable list01
        System.out.println(list01.isEmpty());
        // use the isEmpty method and display the result on the console
        list01.add("red");
        list01.add("blue");
        list01.add("white");
        
        // add "red", "blue", "white" to the end of the list in that sequence
        System.out.println(list01.toString());
        // call the toString method of ArrayList and display the result on the console
        list01.add(1, "Orange");
        // add "orange" to the list at index 1
        list01.add(3, "green");
        // add "green" to the list at index 3
        list01.add(5, "yellow");
        // add "yellow" to the list at index 5
        System.out.println(list01.toString());
        
        // call the toString method of ArrayList and display the result on the console
        System.out.println(list01.get(0));
        // use get to return the first element of the list
        // and display the result on the console
        System.out.println(list01.get(list01.size()-1));
        
        // use get to return the element at the end of the list and dislplay
        // the result on the console (use the size method to obtain the index
        // of the last element)
        System.out.println(list01.isEmpty());
        // use the isEmpty method and display the result on the console
        System.out.println(list01.indexOf("Orange"));
        // use the indexOf method to return the index of the orange
        // element and display the index on the console
        list01.remove("white");
        // use the remove method to remove a "white" element, 
        // then call toString and display the result to the console
        System.out.println(list01.toString());
        
        list01.remove(3);
        // use the remove method to remove the third element, 
        // then call toString and display the result to the console
        System.out.println(list01.toString());
        list01.remove(1);
        System.out.println(list01.toString());
        
        // remove the first element and then call toString and display the 
        // result to the console
        list01.remove(list01.size()-1);
        // remove the last element and then call toString and display the 
        // result to the console
        list01.clear();
        // use the clear method to remove all elements from the list and
        // then call toString to display the result to the console
        System.out.println(list01.isEmpty());
        // use the isEmpty method and display the result on the console
        
    }


    /** A client for the ArrayList collection interface that has the
    * element in the collection being of type Classification.
    */
    private void useArrayListClassificationElement()
    {
    	ArrayList<Classification> list02 = new ArrayList<Classification>();
        // declare and initialize an ArrayList variable (called list02) that holds a 
        // reference to an ArrayList of Classification elements
        list02.add(new Classification("Homo", "sapiens"));
        // add a Classification element with genus "Homo" and species "sapiens"
        list02.add(new Classification("Malus", "domestica"));
        // add a Classification element with genus "Malus" and species "domestica"
        System.out.println(list02.toString());
        // call the toString method of ArrayList and display the result on the console
        list02.remove(new Classification("Malus", "domestica"));
        System.out.println(list02);
        // use the method with signature "boolean remove(Object o)" to remove the
        // "Malus domestica" object and display the result on the console
        
    }

    /** 
     * Provides the entry point for this application.  This method creates
     * a <code>Lab06Client</code> and executes the
     * useJCF() method.
     *
     * @param args Unused.
    */
    public static void main(String[] args) 
    {
        Lab06Client client = new Lab06Client();
        client.useJCF();
    }
}

