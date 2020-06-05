package twoDArrayPrograms;
public class TwoDArray 
{
 public static void main(String[] args) 
		{
			int x[][];
			x=new int[][]{{3,4,8},{4,8,6,4},{7,9}};
			System.out.println(x[1][0]);
			System.out.println(x[1][x[1].length-1]);

			for(int i=0;i<x.length;i++)
			{
				for(int j=0;j<x[i].length;j++)
				{
					System.out.print(x[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

