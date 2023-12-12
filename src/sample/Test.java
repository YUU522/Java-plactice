package sample;

public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int m=0;
		int sum=0;
		 for(int i=1; i<=10; i++) {
			 if(i%2==0) {
				 sum+=i;
				 m++;
			 }
		 }
		 System.out.println("偶数の個数"+m);
		 System.out.println("偶数の合計"+sum);
	}

}
		