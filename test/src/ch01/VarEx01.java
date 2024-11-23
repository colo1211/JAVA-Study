package ch01;

// 패키지 : 자바 파일이 모여있는 폴더
public class VarEx01 {

	public static void main(String[] args) {
		// 자바 자료형
		// 메모리 RAM
		// RAM 1칸 메모리 
		// => 8개의 비트 (bit), 영어 하나의 문자를 표기할 때 8bit 가 필요
		// => 8bit 를 항상 부르기 어려우니, 1Byte로 명명
		// 1Byte = 8bit
		
		// boolean 1bit 
		boolean b1 = true; // 박스 = 1
		boolean b2 = false; // 박스 = 0 

		// char 16bit (홑따옴표)
		// 나 메모리에 2Byte  필요해
		char c1 = '가'; 
		
		// int 32bit
		// 나 메모리에 4Byte 필요해
		int n1 = 1000; 
		
		// double 64bit
		// 나 메모리에 8Byte 필요해
		double d1 = 1000.1; 
		
		System.out.println(c1);
		
	}

}
