package week3;


public class ArrayBagDemo
{
	public static void main(String[] args) 
	{
		// two (2) empty ArrayBag objects of the type array for a list of strings, 
      // named bag1 and bag2.
      ArrayBag<String> bag1 = new ArrayBag<String>();
		ArrayBag<String> bag2 = new ArrayBag<String>();
      
      String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
      String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};

      // filling an initially empty bag, bag1 ad bag2 with a list of strings using the method
      // testAdd
      System.out.println("bag1: ");
      testAdd(bag1, contentsOfBag1);
      System.out.println("\nbag2: ");
      testAdd(bag2, contentsOfBag2);

      // test union method of bag 3 between bag1 and bag2
      BagInterface<String> bag3 = bag1.union(bag2);
      System.out.println("\nbag3: test the method union of bag1 and bag2");
      displayBag(bag3);

      // test intersection method of bag 4 between bag1 and bag2
      BagInterface<String> bag4 = bag1.intersection(bag2);
      System.out.println("\nbag4: test the method intersection of bag1 and bag2");
      displayBag(bag4);

      // test difference method of bag 5 between bag1 and bag2
      BagInterface<String> bag5 = bag1.difference(bag2);
      System.out.println("\nbag5: test the method difference of bag1 and bag2");
      displayBag(bag5);

	} // end main
	
   // Tests the method add.
	private static void testAdd(BagInterface<String> aBag, String[] content)
	{
		System.out.print("Adding ");
		for (int index = 0; index < content.length; index++)
		{
			aBag.add(content[index]);
         System.out.print(content[index] + " ");
		} // end for
      System.out.println();
      
		displayBag(aBag);
	} // end testAdd

   // Tests the method toArray while displaying the bag.
	private static void displayBag(BagInterface<String> aBag)
	{
		System.out.println("The bag contains " + aBag.getCurrentSize() +
		                   " string(s), as follows:");		
		Object[] bagArray = aBag.toArray();
		for (int index = 0; index < bagArray.length; index++)
		{
			System.out.print(bagArray[index] + " ");
		} // end for
		
		System.out.println();
	} // end displayBag
} // end ArrayBagDemo

// Path: src\week3\ArrayBag.java
