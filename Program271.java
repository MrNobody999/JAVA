import java.util.*;

class Matrix
{
	public int Arr[][];

	public Matrix(int row, int col)
	{
		Arr = new int[row][col];
	}

	public void Accept()
	{
		int i = 0, j = 0; 
		Scanner sobj = new Scanner(System.in);
		System.out.println("Please enter the elements");

		for(i = 0; i < Arr.length; i++)
		{
			for(j = 0; j < Arr[i].length; j++)
			{
				Arr[i][j] = sobj.nextInt();
			}
		}	
	}

	public void Display()
	{
		int i = 0, j = 0;
		System.out.println("Entered elements are : ");

		for(i = 0; i < Arr.length; i++)
		{
			for(j = 0; j < Arr[i].length; j++)
			{
				System.out.print(Arr[i][j]+"\t");
			}
			System.out.println();
		}	
	}

	void TargatedPlot()
	{
		int i = 0,j = 0, iMax = 0, row = 0,col = 0, iSum = 0;

		for(i = 1; i < Arr.length -1; i++)
		{
			for(j = 1; j < Arr[i].length - 1; j++)
			{
				iSum = Arr[i-1][j-1]+Arr[i-1][j]+Arr[i-1][j+1]+Arr[i][j-1]+Arr[i][j+1]+Arr[i+1][j-1]+Arr[i+1][j]+Arr[i+1][j+1];
				if(iSum > iMax)
				{
					iMax = iSum;
					row = i;
					col = j;
				}
				iSum = 0;
			}
		}
		System.out.println("You should purchase the plot with row number : "+row+"Column number: "+col);
		System.out.println("Density of trees around our plot : "+iMax);
		System.out.println("Number of trees on our plot : "+Arr[row][col]);
	}
}

class Program271
{
	public static void main(String str[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number of rows");
		int rows = sobj.nextInt();

		System.out.println("Enter number of columns");
		int columns = sobj.nextInt();

		Matrix mobj = new Matrix(rows,columns);

		mobj.Accept();
		mobj.Display();	

		mobj.TargatedPlot();	
	}
}






