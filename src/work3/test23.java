package work3;

public class test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
			for(int i=2;i<=10000;i++) {
				sum=0;
				for(int j=1;j<i;j++) {
					if(i%j==0)
						sum+=j;
				}
				if(sum==i)
					System.out.println(i);
			}
	}

}
