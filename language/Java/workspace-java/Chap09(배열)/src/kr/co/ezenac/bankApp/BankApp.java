package kr.co.ezenac.bankApp;

import java.util.Scanner;

public class BankApp {
	
	//배열 100개 정적멤버
	private static Account[] accountArray = new Account[100];
	private static Scanner scan = new Scanner(System.in);	
	
	public static void main(String[] args) {
		
		boolean run =true;
		while(run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.계좌생성  |  2.계좌목록  |  3.예금하기  |  4.출금하기  |  5.종료하기 ");
			System.out.println("--------------------------------------------------------------");
			System.out.print("선택> ");
			
			int choice =scan.nextInt();
			if(choice==1) {
				createAccount();		//
			}
			else if(choice ==2) {
				accountList();			//
			}
			else if(choice ==3) {
				deposite();				//
			}
			else if(choice ==4) {
				withdraw();
			}
			else if(choice ==5) {
				System.out.println("계좌관리 프로그램 종료합니다.");
				run =false;
			}
			else {
				System.out.println("잘못 입력했습니다.");
			}
		}
	}

	public static void withdraw() {
		System.out.print("얼마를 출금하시겠습니까?");
		int balance=scan.nextInt();
		System.out.print("계좌번호를 입력해주세요.");
		String ano=scan.next();
		for(int i=0;i<accountArray.length;i++) {
			if((accountArray[i].getAno()).equals(ano)) {
				accountArray[i].setBalance(-balance);
				if(accountArray[i].getBalance()<0) {
					System.out.println("잔액이 부족합니다.");
					accountArray[i].setBalance(balance);
					break;
				}
				System.out.println("출금이 완료되었습니다.");
				System.out.println("총 금액은 : "+accountArray[i].getBalance());
				break;
			}
		}
		
	}

	public static void deposite() {
		System.out.print("얼마를 예금하시겠습니까?");
		int balance=scan.nextInt();
		System.out.print("계좌번호를 입력해주세요.");
		String ano=scan.next();
		for(int i=0;i<accountArray.length;i++) {
			if((accountArray[i].getAno()).equals(ano)) {
				accountArray[i].setBalance(balance);
				System.out.println("입금이 완료되었습니다.");
				System.out.println("총 금액은 : "+accountArray[i].getBalance());
				break;
			}
		}
	}
	//계좌목록 출력하기
	public static void accountList() {
		System.out.println("------------------");
		System.out.println("   계좌 목록   ");
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				System.out.println(accountArray[i].getAno()+", "+accountArray[i].getOwner()+", "+accountArray[i].getBalance());
			}
			else {
				System.out.println("------------------");
				break;
				
			}
		}
	}
	
	//계좌생성
	public static void createAccount() {
		System.out.println("------------------");
		System.out.println("계좌를 생성합니다.");
		System.out.println("------------------");
		
		System.out.print("계좌 번호 : ");
		/*
		 *  next()		: 한 단어를 입력받았을 때 용이한 메서드 (공백을 발견하면 그 앞까지만 String리턴)
		 *  nextLine()  : 한 문장이나 한줄을 입력받을 때 용이한 메서드
		 */
		String ano =scan.next();
		System.out.print("계좌주 : ");
		String owner = scan.next();
		System.out.print("초기 입금액 : ");
		int balance =scan.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				accountArray[i]=newAccount;
				System.out.println("결과 : 계좌 생성 완료되었습니다.");
				System.out.println(accountArray[i].getAno() +
							", "+accountArray[i].getOwner()+", "+accountArray[i].getBalance());
				break;
			}
			
		}
	}

}
