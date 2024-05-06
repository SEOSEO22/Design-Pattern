package hw.ch16;

import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class LoginFrame extends Frame implements ActionListener, Mediator {
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueCheckbox checkMember; // 차서연 : 멤버 라디오 버튼 추가
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueTextField textNum; // 차서연 : 주민등록번호 텍스트 필드 추가
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;

    // Colleague를 생성하고 배치한 후에 표시한다
    public LoginFrame(String title) {
        super(title);

        // 배경색을 설정한다
        setBackground(Color.lightGray);

        // 레이아웃 매니저를 사용해 4×2 그리드를 만든다
        setLayout(new GridLayout(5, 3)); // 차서연 : 5x3 그리드로 수정

        // Colleague를 생성한다 
        createColleagues();

        // 배치한다 
        add(checkGuest);
        add(checkLogin);
        add(checkMember); // 차서연 : 멤버 라디오버튼 배치
        add(new Label("Username:"));
        add(textUser);
        add(new Label()); // 차서연 : 빈 문자열 추가
        add(new Label("Password:"));
        add(textPass);
        add(new Label()); // 차서연 : 빈 문자열 추가
        add(new Label("주민등록번호:")); // 차서연 : 주민등록번호 필드 배치
        add(textNum);
        add(new Label()); // 차서연 : 빈 문자열 추가
        add(buttonOk);
        add(buttonCancel);

        // 활성/비활성 초기 설정을 한다
        colleagueChanged();

        // 표시한다 
        pack();
        setVisible(true);
    }

    // Colleague를 생성한다
    @Override
    public void createColleagues() {
        // CheckBox
        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", g, true);
        checkLogin = new ColleagueCheckbox("Login", g, false);
        checkMember = new ColleagueCheckbox("Member", g, false); // 차서연 : 멤버 라디오 버튼 생성

        // TextField
        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("", 10);
        textPass.setEchoChar('*');
        textNum = new ColleagueTextField("", 10); // 차서연 : 주민등록번호 텍스트 필드 생성

        // Button
        buttonOk = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");

        // Mediator를 설정한다 
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        checkMember.setMediator(this); // 차서연 : 멤버 중재자 설정
        textUser.setMediator(this);
        textPass.setMediator(this);
        textNum.setMediator(this); // 차서연 : 주민등록번호 중재자 설정
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);

        // Listener 설정
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        checkMember.addItemListener(checkMember); // 차서연 : 리스너 설정
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        textNum.addTextListener(textNum); // 차서연 : 리스너 설정
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    // Colleage의 상태가 바뀌면 호출된다
    @Override
    public void colleagueChanged() {
        if (checkGuest.getState()) {
            // 게스트 로그인 
            textUser.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
            textNum.setColleagueEnabled(false); // 차서연 : 초기 주민등록번호 필드 비활성화
            buttonOk.setColleagueEnabled(false); // 차서연 : 초기 Ok 버튼 비활성화 상태로 변경
        } 
        else {
            // 사용자, 멤버 로그인 
            textUser.setColleagueEnabled(true);
            userpassChanged();
        }
    }

    // textUser 또는 textPass의 변경이 있다 
    // 각 Colleage의 활성/비활성을 판정한다
    private void userpassChanged() {
        if (textUser.getText().length() > 0) {
            textPass.setColleagueEnabled(true);
            if (textPass.getText().length() > 0) {
                usernumChanged();
            } else {
                buttonOk.setColleagueEnabled(false);
                textNum.setColleagueEnabled(false);
            }
        } else {
            textPass.setColleagueEnabled(false);
            textNum.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }
    }

    // 차서연 : 주민등록번호 필드 활성/비활성 판단
    private void usernumChanged() {
        if (checkMember.getState()) {
            textNum.setColleagueEnabled(true);
            buttonOk.setColleagueEnabled(false);
            String stringNum = textNum.getText();
            
            if (textNum.getText().length() > 0 && !Character.isDigit(stringNum.charAt(stringNum.length()-1))) {
                JOptionPane.showMessageDialog(this, "숫자만 입력하세요.", "경고", JOptionPane.WARNING_MESSAGE);

                stringNum = stringNum.substring(0, stringNum.length()-1);
                textNum.setText(stringNum);

                textNum.setCaretPosition(textNum.getText().length());
            }

            if (textNum.getText().length() == 13) {
                buttonOk.setColleagueEnabled(true);
            }
        }
        else {
            textNum.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}
