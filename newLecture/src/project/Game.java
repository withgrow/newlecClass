package project;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 메인 캐릭터 정보

		String mainCharacterName = "뉴렉처";

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

		System.out.println("-현재 메인 캐릭터 이름 : " + mainCharacterName + ", 	현재 레벨 :" + level + "Lv");

		System.out.println();

		while (true) {

			System.out.println("[기능을 입력해보세요]");

			System.out.println("[0.캐릭터 정보조회, 1.사냥하기, 2.장비강화, 3.이름변경, 4.레벨확인 (1번~4번)]");

			System.out.println("입력 = ");

			int input = scanner.nextInt();

			if (input >= 5 || input < -1) {

				while (true) {

					System.out.println("다시입력해주세요 범위(1~5)");

					input = scanner.nextInt();

					if (input >= 1 && input <= 5) {

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

			if (input == 1) { // 사냥하는 기능 구현

				while (true) {

					int getMoney = (int) (Math.random() * 3000) + 1;

					System.out.println("		<<<사냥장소도착>>>			");

					System.out.println("	몬스터 이름 : " + MonsterName + ", 몬스터 레벨 : " + MonsterLevel + "LV" + " 몬스터 HP :"

							+ MonsterHp + ">>");

					System.out.println("	공격 하시겠습니까 ? (1번 : 공격)");

					int attackChoice = scanner.nextInt();

					if (attackChoice == 1) {
						for (int i = MonsterHp; i >= 0; i = i - gunAttackNumber) {

							System.out.println(" 전투중 >> 현재" + MonsterName + "의 HP : " + i + "/" + MonsterHp);
						}

						System.out.println();

						System.out.println("<전투 끝>");

						System.out.println("========================================");

						System.out.println("	-전투에 승리하여 " + getMoney + "원을 얻었습니다!!!");

						money += getMoney;

						exp++;

						System.out.println("	-현재 뉴렉처 경험치 : " + exp + "/" + Maxexp + "EXP");

						if (exp == Maxexp && level <= 3) {

							exp = 0;

							level++;

							System.out.println("	-<<<Leve Up!!!!!!>>>--------------> " + level + "Lv");

							System.out.println("========================================");

						}

					}

					System.out.println("전루를 계속 하려면 '1번', 종료하려면  '2번' 을 누르세요");

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

			if (input == 2) { // 장비강화기능

				System.out.println("		<<<장비강화실 도착>>>			");

				System.out.println("<어떤것을 강화 하시겠습니까??");

				System.out.println("<1.무기, 2.옷, 3.악세사리> ");

				int gunCost = 2000;

				int choice3 = scanner.nextInt();

				if (choice3 == 1 && money > gunCost) {

					double gunChance = Math.random();

					money = money - gunCost;

					System.out.println("강화 확률은 40%입니다.");

					if (gunChance < 0.4) {

						gunAttackNumber++;

						System.out.println(

								gunChance + ": " + "'무기' 강화에 '성공' 하였습니다 ");

						System.out.println("현재 공격력= " + gunAttackNumber + ", 현재 돈 = " + money + "원");

						System.out.println();

					}  {

						gunAttackNumber--;

						System.out.println(

								gunChance + ": " + "'무기' 강화에 '실패' 하였습니다 ");

						System.out.println("현재 공격력= " + gunAttackNumber + ", 현재 돈 = " + money + "원");

						System.out.println();

						if (gunAttackNumber < 1) {

							gunAttackNumber = 1;

						}

					}

				}  if (money < gunCost) {

					System.out.println("돈이부족하여 불가합니다");

				}

			}

			if (input == 3) { // 닉네임 변경 기능

				System.out.println("현재 닉네임은 '" + mainCharacterName + "'입니다. ! 수정할 이름을 입력하세요 !");
				Scanner scanner2 = new Scanner(System.in);

				changeName = scanner2.next();

				if (changeName.equals(mainCharacterName)) {

					while (changeName.equals(mainCharacterName)) {

						System.out.println("변경 전 닉네임과 같습니다. 다시 입력해주세요!");

						changeName = scanner2.next();

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
