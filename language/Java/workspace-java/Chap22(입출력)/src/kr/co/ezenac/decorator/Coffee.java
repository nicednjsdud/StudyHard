package kr.co.ezenac.decorator;

/*
 *	아메리카노 
 *	카페 라떼 = 아메리카노 + 우유
 *	모카 커피 = 아메리카노 + 우유 + 모카시럽
 *	크림 올라간 모카 커피 = 아메리카노 + 우유 + 모카시럽 + whipping cream
 *
 *  => 커피 : 컴포넌트
 *     우유, 모카시럽, whipping cream : 데코레이터 
 */

public abstract class Coffee {
	
	public abstract void brewing();
}
