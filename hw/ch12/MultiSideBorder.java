package hw.ch12;

public class MultiSideBorder extends Border {
    private char borderChar;
    private int num;

    public MultiSideBorder(Display display, char ch, int num) {
        super(display);
        this.borderChar = ch;
        this.num = num;
    }

    @Override
    public int getColumns() {
        return display.getColumns() + num * 2;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        String sideChar = "";
        
        for (int i = 0; i < num; i++) {
            sideChar += borderChar;
        }

        return sideChar + display.getRowText(row) + sideChar;
    }
    
}
