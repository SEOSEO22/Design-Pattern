package hw.ch11;

public abstract class Entry {
    // 이름을 얻는다
    public abstract String getName();

    // 크기를 얻는다 
    public abstract int getSize();

    public abstract int getCount(); // 차서연 : 추상메소드 추가

    public abstract String getDate(); // 차서연 : 추상메소드 추가

    public abstract String getAuthor(); // 차서연 : 추상메소드 추가

    // 목록을 표시한다
    public void printList() {
        printList("");
    }


    // prefix를 앞에 붙여서 목록을 표시한다 
    protected abstract void printList(String prefix);

    // 문자열 표시 
    @Override
    public String toString() { // 차서연 : 출력 형식 수정
        return getName() + " (" + getSize() + ")" + " [" + getDate() + "]" 
        + " [" + getCount() + "개]" + " [" + getAuthor() + "]";
    }
}
