package Star_Pattern;

public class Demo4 
{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=1;j--)
			{
				if(j<=3)
				{

					if(j==3)
					{
						System.out.print(" * ");
					}
					else {
						System.out.print(" _ ");
					}
				}
				else
				{
					
					System.out.print(" _ ");
				}
			}
			
//			for(int j=1;j<=5;j++)
//			{
//				if(j==3)
//				{
//						System.out.print("*");
//
//				}
//				else {
//					System.out.print(" ");
//
//				}
//			}
			System.out.println();
		}
	}
}
