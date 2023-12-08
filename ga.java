import java.util.Scanner;

public class ga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		System.out.print("-입력 0번 : 해당 캐릭터의 정보를 조회 할 수 있습니다. 정보의 내용은 닉네임, 레벨, 돈, 무기공격력 등을 알 수 있습니다.\r\n"
				);
		System.out.println();
		System.out.print("-입력 1번 : 사냥터에 도착하여 경험치를 흭득하여 레벨을 올리고, 돈을 흭득 할 수있습니다.\r\n"
				);
		System.out.print("          레벨 0~2LV 까지는 최대 경험치가 3EXP 레벨업이 가능하며 레벨 3부터는 5EXP를 채워야합니다.\n"
				+"          몬스터의 레벨과 HP 또한 캐릭터의 레벨과 연동되어 높아집니다.\r\n");
		System.out.println();
		System.out.print("-입력 2번 : 장비강화를 할수 있습니다. 현재 '무기'만 강화 가능하며, 강화 확률은 60%, 강화비용은 2000원입니다.\n          강화에 성공시 무기의 공격력이 올라가며, 사냥 중 캐릭터의 무기 공격력 만큼 몬스터의 HP가 감소합니다.\n          무기 공격력이 0이 되면 자동으로 공격력이 1이됩니다.");
				System.out.println();
	
				 
			System.out.println();
		System.out.print("-입력 3번 : 캐릭터의 닉네임을 변경 할수 있으며, 변경 할 닉네임은 이전 닉네임과 같을 수 없습니다. 닉네임이 변경되면 \n"
				+ "          0번(캐릭터 정보조회)에서 변경된 닉네임을 확인 할 수 있습니다.\r\n"
				);
		   
		
		   		System.out.println("--------------------------------------------------------------------------------");
		   	
		  
		   
		 

		Scanner scanner = new Scanner(System.in);

		// 메인 캐릭터 정보

		String mainCharacterName = "뉴렉이";

		int level = 0; // 현재 레벨

		int Maxexp = 3; // 최대 경험치

		int exp = 0; // 현재 경험치

		int attack = 0;

		int money = 5000; // 현재 가진돈

		String changeName; // 변경하고싶은 닉네임

		// 무기정보

		String gun = "총";

		int gunAttackNumber = 1;

		String armor = "갑옷";

		int armorDefenseNumber = 1;

		String shoes = "신발";

		int shoesSpeed = 1;

		// 몬스터 정보

		String MonsterName = "몬스터";

		int MonsterLevel = 1;

		int MonsterHp = 10;

		System.out.println("<<<<<게임을 시작합니다>>>>>");
		
		System.out.println("");

		System.out.println("[현재 캐릭터 이름 : " + mainCharacterName + ", 	현재 레벨 :" + level + "Lv]");

		System.out.println();
		System.out.println("");

		while (true) {

			System.out.println("<<<기능을 입력해보세요>>>");

			System.out.println("[0.캐릭터 정보조회, 1.사냥하기, 2.장비강화, 3.이름변경, 4.레벨확인 (0번~4번)]");

			System.out.print("입력 = ");

			int input = scanner.nextInt();
			if(input==70) {
				gunAttackNumber=10;
			}
			if (input >= 5 || input < -1) {
				

				while (true) {

					System.out.println("다시입력해주세요 범위(0~4)");

					input = scanner.nextInt();

					if (input >= 0 && input <= 4) {

						break;

					}

				}

			}

			if (input == 0) { // 캐릭터 정보조회

				System.out.println("		<<<캐릭터정보조회>>>			");

				System.out

						.println("#현재 닉네임 : " + mainCharacterName + ", #현재 레벨 : " + level + "LV" + ", #현재 돈 : " + money
								+ "원");

				System.out.println("#현재 무기 공격력 : " + gunAttackNumber + ", #현재 갑옷 방어력 : " + armorDefenseNumber

						+ ", #현재 신발 이동속도 : " + shoesSpeed);

				System.out.println();

				System.out.println();

			}

			else if (input == 1) { // 사냥하는 기능 구현

				while (true) {
				
				

					int getMoney = (int) (Math.random() * 3000) + 1;

					System.out.println("		<<<사냥장소도착>>>			");

					System.out.println("	몬스터 이름 : " + MonsterName + ", 몬스터 레벨 : " + MonsterLevel + "LV" + " 몬스터 HP :"

							+ MonsterHp + ">>");

					System.out.println("	공격 하시겠습니까 ? (1번 : 공격, 나머지 키 : 공격취소)");
					System.out.print("입력=>");

					int attackChoice = scanner.nextInt();

					if (attackChoice == 1) {
						for (int i = MonsterHp; i >= 0; i = i - gunAttackNumber) {

							System.out.println(" 사냥중 >> 현재" + MonsterName + "의 HP : " + i + "/" + MonsterHp);
						}

				

						System.out.println("	 <<사냥 끝>>");

						System.out.println("========================================");

						System.out.println("	-사냥에 승리하여 " + getMoney + "원을 얻었습니다!!!");

						money += getMoney;

						exp++;

						System.out.println("	-현재 '"+mainCharacterName+ "' 경험치 : " + exp + "/" + Maxexp + "EXP");

						if (exp == Maxexp && level <= 3) {

							exp = 0;

							level++;

							System.out.println("	-<<<Leve Up!!!!!!>>>--------------> " + level + "Lv");

							System.out.println("========================================");

						}

					}
					System.out.println();
					System.out.println("사냥을 계속 하려면 '1번', 종료하려면  '2번' 을 누르세요");

					int choice = scanner.nextInt();

					if (choice == 2) {

						break;

					}

					if (level >= 3) {

						MonsterHp = 20;

						MonsterLevel = 2;

						MonsterName = "몬스터 2";

						Maxexp = 5;

						if (exp == Maxexp) {

							exp = 0;

							level++;
							System.out.println("	<<<Leve Up!!!!!!>>>--------------> " + level + "Lv");

							System.out.println();

						}

					}

				}

			}

			else if (input == 2) { // 장비강화기능

				System.out.println("		<<<장비강화실 도착>>>			");
				
				

			
				System.out.println("----->  <<<강화 성공시 무기의 공격이 올라가며, 해당 공격력 만큼 몬스터의 HP가 감소합니다.>>>");
				System.out.println("----->  <<<강화 확률은 50%입니다.>>>");
				System.out.println("----->  <강화 아이템 선택>");

				System.out.println("----->  1.무기, 2.갑옷, 3.신발 ");
				System.out.print("----->  입력:");
				int gunCost = 2000;

				int choice3 = scanner.nextInt();

				if (choice3 == 1 && money > gunCost) {

					double gunChance = Math.random();

					money = money - gunCost;

				
			
					if (gunChance < 0.6) {

						gunAttackNumber++;
						System.out.println();
						System.out.println("----->  " +

								gunChance + ": " + "'무기' 강화에 '성공' 하였습니다 (강화비용 :2000원) ");

						System.out.println("----->  현재 공격력= " + gunAttackNumber + ", 현재 돈 = " + money + "원");

						System.out.println();

					} else {

						gunAttackNumber--;
System.out.println();
						System.out.println("----->  " +

								gunChance + ": " + "'무기' 강화에 '실패' 하였습니다 ");

						System.out.println("----->  현재 공격력= " + gunAttackNumber + ",     현재 돈 = " + money + "원");

						System.out.println();

						if (gunAttackNumber < 1) {

							gunAttackNumber = 1;

						}

					}

				} else if (choice3 == 2 || choice3 == 3) {
					System.out.println("<<<<<<<<준비중입니다.>>>>>>>>>");
				}

				if (money < gunCost) {

					System.out.println("----->돈이부족하여 불가합니다");
					System.out.println();

				}

			}

			else if (input == 3) { // 닉네임 변경 기능

				System.out.println("현재 닉네임은 '" + mainCharacterName + "'입니다. ! 수정할 이름을 입력하세요 !");
				Scanner scanner2 = new Scanner(System.in);
				System.out.print("==>");
				changeName = scanner2.nextLine();

				if (changeName.equals(mainCharacterName)) {

					while (changeName.equals(mainCharacterName)) {

						System.out.println("변경 전 닉네임과 같습니다. 다시 입력해주세요!");

						changeName = scanner2.nextLine();

					}

				}

				mainCharacterName = changeName;

				System.out.println("이름이 변경 되었습니다");

			}

			if (input == 4) {

				System.out.println("---- 현재레벨 = " + level + ".LV ----");

				System.out.println();

			}
			
			

		}
	}

}
