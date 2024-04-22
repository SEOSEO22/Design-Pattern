package hw.ch12;

public class Main {
    public static void main(String[] args) {
        System.out.println("20220732 차서연");
        System.out.println();

        MultiStringDisplay md = new MultiStringDisplay(); // 차서연 : 연습문제 2번의 multistringDisplay 사용
        md.add("학번 : 20220732"); // 차서연 : 문자열 추가
        md.add("이름 : 차서연");

        Display sb = new SideBorder(md, '%'); // 차서연 : 문자열 양 옆에 '%' 문자 추가
        Display fb = new FullBorder(sb); // 차서연 : sb 문자열에 FullBorder 추가
        Display ub = new UpDownBorder(fb, '='); // 차서연 : fb 문자열 상하에 '=' 문자 추가
        Display mb = new MultiSideBorder(ub, '*', 3); // 차서연 : ub 문자열 좌우에 '*' 문자 3열씩 추가

        mb.show();
    }
}
