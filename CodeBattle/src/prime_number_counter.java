/*	codebattleの問題の一つ
 * 	素数を数えるプログラムを作りたまえ。 
 *	プログラムは1から100までの素数を数え出力する
 * 
 */
import java.util.ArrayList;
public class prime_number_counter {
	public static void main(String[] args) {
		
		ArrayList<Integer> p_num = new ArrayList<Integer>();
													//リスト作成
		p_num.add(2);
		for(int num=2;num<=100;num++){				//100までのループ　　　　　　　
			for(int arr=0;arr<p_num.size();arr++){	//リストの中身を参照する為のループ
				if(num%p_num.get(arr)==0){			//リストの中身で割り切れたら素数でないためbreak
					break;
				}
				if(arr==p_num.size()-1){			//リスト内全てで割れなければ素数
					p_num.add(num);					//リストへの追加
				}
			}
		}
		for(int arr:p_num){							//リストを表示させるループ
			System.out.println(arr);
		}
	}
}
