package Oct5th;

import java.util.Scanner;

class TestInsertion

{

	public static void main(String[] args)

	{
		int ch=1;
		while(ch==1){
			int n;
			System.out.println("Enter number of elements");
			Scanner sc= new Scanner(System.in);
			n = sc.nextInt();
			int[] myarray = new int[n];

			for (int i = 0; i < myarray.length; i++){
				myarray[i] = (int) (Math.random() * 100);
			}

			System.out.println(myarray.length + " numbers are generated and they are");

			for (int i = 0; i < n; i++)
				System.out.print(myarray[i]+",");

			System.out.println();

			System.out.println();
			long start =  System.currentTimeMillis();

			insertionSort(myarray);
			long end =  System.currentTimeMillis();
			System.out.println("No of sec to sort the array : "+(end-start));
			System.out.println();

			System.out.println(myarray.length + " numbers are sorted and they are");
			for (int i = 0; i < n; i++)

				System.out.print(myarray[i] + ",");
			System.out.println();
			System.out.println("Do you want to continue? 1 -Continue");
			ch=sc.nextInt();
			
		}

	}

	public static void insertionSort(int[] array)

	{

		for (int i = 1; i < array.length; i++)

		{

			int itemToInsert = array[i];

			int j = i - 1;

			while (j >= 0)

			{

				if (itemToInsert < array[j])

				{

					array[j + 1] = array[j];

					j--;

				}

				else
					break;

			}

			array[j + 1] = itemToInsert;

		}

	}

}