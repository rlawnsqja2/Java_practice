import java.util.Random;
import java.util.Scanner;

public class SoccerGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user = 0, com = 0; 				//사용자 입력 값
		int userWin = 0, comWin = 0;
		int bonus = 0;
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		for(int i=1; i<=5; i++) {
			//내가 공을 차는 프로그램
			System.out.println("=== " + (i+bonus) + "번째 승부차기 입니다. ===");
			System.out.println("내가 공을 찹니다. 어느 쪽으로 차겠습니까?");
			System.out.println("왼쪽:1, 가운데:2, 오른쪽:3, 게임끝:4");

			user = sc.nextInt();
			if(user==1) System.out.println("내가 왼쪽으로 공을 찼습니다.");
			else if(user==2) System.out.println("내가 가운데로 공을 찼습니다.");
			else if(user==3) System.out.println("내가 오른쪽으로 공을 찼습니다.");	
			else if(user == 4) {
				System.out.println("게임을 종료합니다.");
				break;
			}

			com = r.nextInt(3)+1;
			if(com==1)System.out.println("컴퓨터가 왼쪽으로 움직입니다.");
			else if(com==2) System.out.println("컴퓨터가 가운데로 움직입니다.");
			else if(com==3) System.out.println("컴퓨터가 오른쪽으로 움직입니다.");
			
			if(user == com) {
				System.out.println("컴퓨터가 골을 막았습니다.컴퓨터가 이겼습니다.");
			}else {
				System.out.println("골인입니다. 내가 이겼습니다.");	
				userWin++;
			}

			System.out.println();

			
			//내가 공을 막는 프로그램
			System.out.println("내가 공을 막을 차례입니다.어느 쪽으로 막겠습니까?");
			System.out.println("왼쪽:1, 가운데:2, 오른쪽:3, 게임끝:4");
			
			user = sc.nextInt();
			if(user==1) System.out.println("내가 왼쪽으로 움직입니다.");
			else if(user==2) System.out.println("내가 가운데로 움직입니다.");
			else if(user==3) System.out.println("내가 오른쪽으로 움직입니다.");	
			else if(user == 4) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			
			com = r.nextInt(3)+1;			
			if(com==1)System.out.println("컴퓨터가 왼쪽으로 공을 찼습니다.");
			else if(com==2) System.out.println("컴퓨터가 가운데로 공을 찼습니다.");
			else if(com==3) System.out.println("컴퓨터가 오른쪽으로 공을 찼습니다.");
			
			if(user == com) {
				System.out.println("내가 막았습니다. 내가 이겼습니다.");
			}else {
				System.out.println("골인입니다. 컴퓨터가 이겼습니다.");		
				comWin++;
			}
			System.out.println();
			
			if(i==5) {
				//userWin=3;
				//comWin=3;
				System.out.println("===================================================");
				System.out.print("나는 "+userWin+"골, 컴퓨터는 "+comWin+"골을 넣었습니다. ");	
				if(userWin == comWin) {
						System.out.println("동점입니다. 1번씩 더 공을 차서 승부를 결정합니다.");
						bonus++;
						i--;
				}else {
					if(userWin > comWin) {
						System.out.println("내가 이겼습니다.");	
					}else {
						System.out.println("컴퓨터가 이겼습니다.");	
					}
					System.out.println("게임을 종료합니다.");
					break;
				}
			}
		}
	}

}
