package Star_Pattern;

public class Demo5 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==3)
				{
					System.out.print("*");
				}
				else if(i==3)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				

			}
			System.out.println();
		}
	}

}
