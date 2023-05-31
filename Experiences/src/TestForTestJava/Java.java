package TestForTestJava;

public class Java {
	public static void main(String[] args) {
		//new AssignmentOperatorsDemo();
		
		/*
		int x = 22, y = 10;
		double p = Math.sqrt( ( x + y ) /2);
		System.out.println(p);
		
		///////////////////////////////
		
		String s="\\\\";
			for(int i=0;i<5;i++)
			s+="\\";
			System.out.println(s);
		
		///////////////////////////////
		
		String s="";
			String[] mountains =
				{"Chimborazo", "Matterhorn", "Olympus", "Everest", "Kinabalu",
				 "Adeiondack", "Blue Ridge", "Zugspitze",};
			for(int i=0;i<mountains.length;i++)
				s+=mountains[i].charAt(i);
			System.out.println(s.substring(2,4));
						
		///////////////////////////////		
		int num = 7;
		while(num >= 0)
		{
		   num -= 3;
		}
		System.out.println(num);
		
		int array[][] = {{6,4,3},{4,3,2}};
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(2*array[1][1]);
			}
		}
		*/
		
		int array[][]= {{3,2,1},{1,2,3}};
		for(int i=0;i<2;i++)
			for(int j=0;j<3;j++)
				System.out.println(2*array[i][j]);
		
	}
}
