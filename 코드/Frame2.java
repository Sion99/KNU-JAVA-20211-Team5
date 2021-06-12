//이클립스 사용할 경우
//import 패키지명 (default package라면 이름 바꿀 것)
//import recommend1

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame2 extends JFrame {
    private JLabel stringText; // 제일 위에 텍스트
    private JPanel buttonJPanel; // 버튼 4개 있는 격자
    private JButton[][] buttons; // array of buttons
//    private ButtonHandler handler;
    private String[] ButtonBox;
    private Frame3[][] nextPanel;

    // no-argument constructor
    public Frame2() {

        super("Panel Demo"); // window title set
        buttons = new JButton[2][2];
        buttonJPanel = new JPanel();
//        handler = new ButtonHandler();
        stringText = new JLabel("Choose Type or user"); // JLabel text set
        stringText.setHorizontalAlignment(SwingConstants.CENTER); // 가운데 정렬
        //여기에 JLabel 폰트 추가

        ButtonBox = new String[4];
        ButtonBox[0] = "권오민";
        ButtonBox[1] = "노현호";
        ButtonBox[2] = "신시온";
        ButtonBox[3] = "조동현";

        nextPanel = new Frame3[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                nextPanel[i][j] = new Frame3(this, ButtonBox[i], nextPanel[i], j);
        }

        setSize(400, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buttonJPanel.setLayout(null);

        // Button 4개 추가하는 부분 + ActionListenter 추가
        buttons[0][0] = new JButton(new ImageIcon("./1.png"));
        buttons[0][1] = new JButton(new ImageIcon("./2.png"));
        buttons[1][0] = new JButton(new ImageIcon("./3.png"));
        buttons[1][1] = new JButton(new ImageIcon("./4.png"));
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
//                buttons[row][col] = new JButton(ButtonBox[row + col * 2]);
                buttons[row][col].setContentAreaFilled(false);
                buttons[row][col].setBorderPainted(false);
                buttons[row][col].setBounds(180 * row + 30, 200 * col + 100, 150, 150);
                add(buttons[row][col]);
//                buttons[row][col].addActionListener( handler );
            }
        }
        buttons[0][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nextPanel[0][0].setLocation(getLocation());
                nextPanel[0][0].setVisible(true);
                setVisible(false);
            }
        });
        buttons[0][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nextPanel[1][0].setLocation(getLocation());
                nextPanel[1][0].setVisible(true);
                setVisible(false);
            }
        });
        buttons[1][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nextPanel[2][0].setLocation(getLocation());
                nextPanel[2][0].setVisible(true);
                setVisible(false);
            }
        });
        buttons[1][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nextPanel[3][0].setLocation(getLocation());
                nextPanel[3][0].setVisible(true);
                setVisible(false);
            }
        });

        add(stringText, BorderLayout.NORTH);
        add(buttonJPanel, BorderLayout.CENTER); // add panel to JFrame

    } // end PanelFrame constructor
}
//    private class ButtonHandler implements ActionListener
//    {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            String cmd = e.getSource();
//
//            if (cmd.equals(ButtonBox[0]))
//            {
//                nextPanel[0][0].setLocation(getLocation());
//                nextPanel[0][0].setVisible(true);
//                setVisible(false);
//            }
//            else if (cmd.equals(ButtonBox[1]))
//            {
//                nextPanel[1][0].setLocation(getLocation());
//                nextPanel[1][0].setVisible(true);
//                setVisible(false);
//            }
//            else if (cmd.equals(ButtonBox[2]))
//            {
//                nextPanel[2][0].setLocation(getLocation());
//                nextPanel[2][0].setVisible(true);
//                setVisible(false);
//            }
//            else if (cmd.equals(ButtonBox[3]))
//            {
//                nextPanel[3][0].setLocation(getLocation());
//                nextPanel[3][0].setVisible(true);
//                setVisible(false);
//            }
//
//        }
//    }
//} // end class PanelFrame

