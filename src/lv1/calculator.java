package lv1;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 새로운 스캐너 생성

        while (true) {  // 사용자가 종료할 때까지 반복하기
            int result = 0;  // 반복마다 result 초기화

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt(); // 첫 번째 숫자 입력 받기

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt(); // 두 번째 숫자 입력 받기

            System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
            String str = scanner.next();  // 사칙연산 입력 받기

            if (str.equals("+")) { // 만약에 str이 +라면~
                result = num1 + num2;
            } else if (str.equals("-")) { // 아니라 str이 -라면~
                result = num1 - num2;
            } else if (str.equals("*")) { // 아니라 str이 *라면~
                result = num1 * num2;
            } else if (str.equals("/")) { // 아니라 str이 /라면~
                if (num2 != 0) { // 0이라면 나눌 수 없음.
                    result = num1 / num2;
                } else {
                    System.out.println("오류: 0으로 나눌 수 없습니다!");
                    continue;  // 나누기에서 0으로 입력했으면 다시
                }
            } else {
                System.out.println("오류: 잘못된 사칙연산입니다!");
                continue;  // 사칙연산을 잘못 적으면 다시
            }

            System.out.println("결과: " + result);

            // 계속할지 물어보기
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            str = scanner.next();

            if (str.equalsIgnoreCase("exit")) {  // exit 입력하면 종료
                System.out.println("계산기를 종료합니다.");
                break; // 반복문 종료하기
            }
        }
    }
}