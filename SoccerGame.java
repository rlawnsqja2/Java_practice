import java.util.Random;
import java.util.Scanner;

public class SoccerGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user = 0, com = 0; 				//����� �Է� ��
		int userWin = 0, comWin = 0;
		int bonus = 0;
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		for(int i=1; i<=5; i++) {
			//���� ���� ���� ���α׷�
			System.out.println("=== " + (i+bonus) + "��° �º����� �Դϴ�. ===");
			System.out.println("���� ���� ���ϴ�. ��� ������ ���ڽ��ϱ�?");
			System.out.println("����:1, ���:2, ������:3, ���ӳ�:4");

			user = sc.nextInt();
			if(user==1) System.out.println("���� �������� ���� á���ϴ�.");
			else if(user==2) System.out.println("���� ����� ���� á���ϴ�.");
			else if(user==3) System.out.println("���� ���������� ���� á���ϴ�.");	
			else if(user == 4) {
				System.out.println("������ �����մϴ�.");
				break;
			}

			com = r.nextInt(3)+1;
			if(com==1)System.out.println("��ǻ�Ͱ� �������� �����Դϴ�.");
			else if(com==2) System.out.println("��ǻ�Ͱ� ����� �����Դϴ�.");
			else if(com==3) System.out.println("��ǻ�Ͱ� ���������� �����Դϴ�.");
			
			if(user == com) {
				System.out.println("��ǻ�Ͱ� ���� ���ҽ��ϴ�.��ǻ�Ͱ� �̰���ϴ�.");
			}else {
				System.out.println("�����Դϴ�. ���� �̰���ϴ�.");	
				userWin++;
			}

			System.out.println();

			
			//���� ���� ���� ���α׷�
			System.out.println("���� ���� ���� �����Դϴ�.��� ������ ���ڽ��ϱ�?");
			System.out.println("����:1, ���:2, ������:3, ���ӳ�:4");
			
			user = sc.nextInt();
			if(user==1) System.out.println("���� �������� �����Դϴ�.");
			else if(user==2) System.out.println("���� ����� �����Դϴ�.");
			else if(user==3) System.out.println("���� ���������� �����Դϴ�.");	
			else if(user == 4) {
				System.out.println("������ �����մϴ�.");
				break;
			}
			
			com = r.nextInt(3)+1;			
			if(com==1)System.out.println("��ǻ�Ͱ� �������� ���� á���ϴ�.");
			else if(com==2) System.out.println("��ǻ�Ͱ� ����� ���� á���ϴ�.");
			else if(com==3) System.out.println("��ǻ�Ͱ� ���������� ���� á���ϴ�.");
			
			if(user == com) {
				System.out.println("���� ���ҽ��ϴ�. ���� �̰���ϴ�.");
			}else {
				System.out.println("�����Դϴ�. ��ǻ�Ͱ� �̰���ϴ�.");		
				comWin++;
			}
			System.out.println();
			
			if(i==5) {
				//userWin=3;
				//comWin=3;
				System.out.println("===================================================");
				System.out.print("���� "+userWin+"��, ��ǻ�ʹ� "+comWin+"���� �־����ϴ�. ");	
				if(userWin == comWin) {
						System.out.println("�����Դϴ�. 1���� �� ���� ���� �ºθ� �����մϴ�.");
						bonus++;
						i--;
				}else {
					if(userWin > comWin) {
						System.out.println("���� �̰���ϴ�.");	
					}else {
						System.out.println("��ǻ�Ͱ� �̰���ϴ�.");	
					}
					System.out.println("������ �����մϴ�.");
					break;
				}
			}
		}
	}

}
