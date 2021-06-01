package model;

import javax.swing.*;
import java.awt.*;

public class MCalculator extends JFrame implements Observer{
    private static final String S_TITLE = "CALCULATOR";
    private final int WNDSIZE_W = 300;
    private final int WNDSIZE_H = 100;

    private Container container;
    private JPanel jplCalc;
    private JTextField jtfNum1;
    private JTextField jtfNum2;
    private JTextField jtfResult;
    private JLabel jlblPlusOp;
    private JButton jbtnCalc;


    public MCalculator() {
        initComponents();
        setLayout();
        initWindow();
    }

    private void initWindow() {
        setSize(WNDSIZE_W, WNDSIZE_H);
        setTitle(S_TITLE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void setLayout() {
        container.setLayout(new BorderLayout(5, 5));
        jplCalc.setLayout(new FlowLayout(FlowLayout.CENTER));

        jplCalc.add(jtfNum1);
        jplCalc.add(jlblPlusOp);
        jplCalc.add(jtfNum2);
        jplCalc.add(jbtnCalc);
        jplCalc.add(jtfResult);

        container.add(jplCalc);
    }

    /**
     * 컴포넌트 초기화
     */
    private void initComponents() {
        container = getContentPane();
        jplCalc = new JPanel();
        jtfNum1 = new JTextField(10);
        jtfNum2 = new JTextField(10);
        jtfResult = new JTextField(10);
        jlblPlusOp = new JLabel("+");
        jbtnCalc = new JButton("계산");
    }

    @Override
    public void update(int data) {

    }
}
