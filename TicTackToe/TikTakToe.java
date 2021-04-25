package TicTackToe;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;

class TicTacToe implements ActionListener {
    Random random = new Random();
    JFrame fr = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textField = new JLabel();
    JButton[] btn = new JButton[9];
    boolean player1;

    TicTacToe() {

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(800, 800);
        fr.getContentPane().setBackground(new Color(50, 50, 50));
        fr.setLayout(new BorderLayout());
        fr.setVisible(true);

        textField.setBackground(new Color(25, 25, 25));
        textField.setForeground(new Color(25, 255, 0));
        textField.setFont(new Font("Ink Free", Font.BOLD, 75));
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setText("Tik-Tak-Toe");

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 800, 100);
        title_panel.setBackground(new Color(0x123456));

        button_panel.setLayout(new GridLayout(3, 3));
        button_panel.setBackground(new Color(150, 150, 150));

        for (int i = 0; i < 9; i++) {
            btn[i] = new JButton();
            button_panel.add(btn[i]);
            btn[i].setFont(new Font("MV Boli", Font.BOLD, 120));
            btn[i].setFocusable(false);
            btn[i].addActionListener(this);
        }

        title_panel.add(textField);
        fr.add(title_panel, BorderLayout.NORTH);
        fr.add(button_panel);
        firstTurn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == btn[i]) {
                if (player1) {
                    if (btn[i].getText() == "") {
                        btn[i].setForeground(Color.red);
                        btn[i].setText("X");
                        player1 = false;
                        textField.setText("O Turn");
                        check();
                    }
                } else {
                    if (btn[i].getText() == "") {
                        btn[i].setForeground(Color.blue);
                        btn[i].setText("O");
                        player1 = true;
                        textField.setText("X Turn");
                        check();
                    }
                }
            }
        }

    }

    public void firstTurn() {
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            // TODO: handle exception
        }

        if (random.nextInt(2) == 0) {
            player1 = true;
            textField.setText("X turn");
        } else {
            player1 = false;
            textField.setText("0 turn");
        }
    }

    public void check() {
        if ((btn[0].getText() == "X") && (btn[1].getText() == "X") && (btn[2].getText() == "X")) {
            xWin(0, 1, 2);
        }
        if ((btn[3].getText() == "X") && (btn[4].getText() == "X") && (btn[5].getText() == "X")) {
            xWin(3, 4, 5);
        }
        if ((btn[6].getText() == "X") && (btn[7].getText() == "X") && (btn[8].getText() == "X")) {
            xWin(6, 7, 8);
        }
        if ((btn[0].getText() == "X") && (btn[4].getText() == "X") && (btn[8].getText() == "X")) {
            xWin(0, 4, 8);
        }
        if ((btn[0].getText() == "X") && (btn[3].getText() == "X") && (btn[6].getText() == "X")) {
            xWin(0, 1, 2);
        }
        if ((btn[1].getText() == "X") && (btn[4].getText() == "X") && (btn[7].getText() == "X")) {
            xWin(1, 4, 7);
        }
        if ((btn[2].getText() == "X") && (btn[5].getText() == "X") && (btn[8].getText() == "X")) {
            xWin(2, 5, 8);
        }
        if ((btn[2].getText() == "X") && (btn[4].getText() == "X") && (btn[6].getText() == "X")) {
            xWin(2, 4, 6);
        }
        // For checking the Y wins or not

        if ((btn[0].getText() == "  Y") && (btn[1].getText() == "Y") && (btn[2].getText() == "Y")) {
            oWin(0, 1, 2);
        }
        if ((btn[3].getText() == "Y") && (btn[4].getText() == "Y") && (btn[5].getText() == "Y")) {
            oWin(3, 4, 5);
        }
        if ((btn[6].getText() == "Y") && (btn[7].getText() == "Y") && (btn[8].getText() == "Y")) {
            oWin(6, 7, 8);
        }
        if ((btn[0].getText() == "Y") && (btn[4].getText() == "Y") && (btn[8].getText() == "Y")) {
            oWin(0, 4, 8);
        }
        if ((btn[0].getText() == "Y") && (btn[3].getText() == "Y") && (btn[6].getText() == "Y")) {
            oWin(0, 3, 6);
        }
        if ((btn[1].getText() == "Y") && (btn[4].getText() == "Y") && (btn[7].getText() == "Y")) {
            oWin(1, 4, 7);
        }
        if ((btn[2].getText() == "Y") && (btn[5].getText() == "Y") && (btn[8].getText() == "Y")) {
            oWin(2, 5, 8);
        }
        if ((btn[2].getText() == "Y") && (btn[4].getText() == "Y") && (btn[6].getText() == "Y")) {
            oWin(2, 4, 6);
        }
    }

    public void xWin(int a, int b, int c) {
        btn[a].setBackground(Color.green);
        btn[b].setBackground(Color.green);
        btn[c].setBackground(Color.green);

        for (int i = 0; i < 9; i++) {
            btn[i].setEnabled(false);
        }
        textField.setText("X Wins");
    }

    public void oWin(int a, int b, int c) {
        btn[a].setBackground(Color.green);
        btn[b].setBackground(Color.green);
        btn[c].setBackground(Color.green);

        for (int i = 0; i < 9; i++) {
            btn[i].setEnabled(false);
        }
        textField.setText("OWins");
    }

}