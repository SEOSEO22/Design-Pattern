package Practice.ch22;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

import Practice.ch22.command.*;
import Practice.ch22.drawer.*;

public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {
// public class Main extends JFrame implements MouseMotionListener, WindowListener {
    //버튼
    private JButton clearButton = new JButton("clear");
    // 그리기 이력
    private MacroCommand history = new MacroCommand();
    // 도화지
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);

    public static void main(String[] args) {
        new Main("command pattern sample");
    }

    // 생성자
    public Main(String title) {
        super(title);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);

        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);

        getContentPane().add(mainBox);

        //pack을 사용하면 setSize가 적용되지 않는다. pack이 컴포넌트의 크기에 맞게 배치하는 역할을 하기 때문.
        //setSize(500, 500);

        // 리스너 등록
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);
        /* clear.addActionListener(e -> { // 람다함수 사용
            history.clear();
            canvas.repaint();
        }
        */
        this.addWindowListener(this);

        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 도화지를 지움
        history.clear();
        canvas.repaint(); // 화면을 지우고 paint() 호출
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // 콘솔에 좌표 출력
        System.out.println(e.getX() + ", " + e.getY());

        // DrawCommand 객체를 생성해서 history에 추가
        Command cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);

        // 그리기(명령어 객체를 실행)
        cmd.execute();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("종료됩니다.");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}
