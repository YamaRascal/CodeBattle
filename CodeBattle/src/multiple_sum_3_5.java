/*codebattleの問題の一つ
 * 
 * 10未満の自然数のうち, 3 もしくは 5 の倍数になっているものは 3, 5, 6, 9 の4つがあり, これらの合計は 23 になる。
 *同じようにして, 1000 未満の 3 か 5 の倍数になっている数字の合計を求る。
 * 
 */
public class multiple_sum_3_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int sum=0;						//合計値を入れる変数
		for(int num=0;num<1000;num++){	//1000までのループ分
			if(num%3==0||num%5==0){		//3、または5の倍数かの判定
				sum +=num;				//合計値に足す
			}
		}
		System.out.println("合計は"+sum);	//合計値の出力
	}
}
