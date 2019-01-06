package murat.obj.piramit;

public class piramit {

	public static void main(String[] args) {
		int k=41,i=0;
		int count=1, count2;
		while(count<=k)
		{
			count2=k/2-i;
			/*for(int j=0;j<count2;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<count;j++)
			{
				System.out.print("x");
			}*/
			
			for(int j=0;j<(count2+count);j++)
			{
				if(j<count2)
					System.out.print(" ");
				else
					System.out.print("x");
			}
			
			count = count+2;
			i = i+1;
			System.out.println();
		}
		
		//agac
		for(int j=0;j<10;j++)
		{
			for(int m=0;m<(k/2);m++)
			{
				System.out.print(" ");
			}
			System.out.print("x");
			System.out.println();
		}

		for(int m=0;m<(k/2)-3;m++)
		{
			System.out.print(" ");
		}
		for(int m=0;m<7;m++)
		{
			System.out.print("x");
		}

		
	}

}
