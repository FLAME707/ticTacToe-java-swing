import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class Main implements ActionListener {
    
    private static JButton button1;
    private static JButton button2;
    private static JButton button3;
    private static JButton button4;
    private static JButton button5;
    private static JButton button6;
    private static JButton button7;
    private static JButton button8;
    private static JButton button9;
    private static JButton button10;
    private static JLabel label;
    private static JFrame f;
    private static draw dc;
    private static boolean run = true;
    private static String player = "1";
    
    public static void main(String[] args) {
        
        f = new JFrame();
        
        dc = new draw(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setLocationRelativeTo(null);
        
        label = new JLabel("Player 1 turn");
        label.setFont(new Font("Verdana", Font.PLAIN, 20));
        label.setBounds(180,15,400,20);
        f.add(label);
        
        button1 = new JButton();
        button1.setFont(new Font("Verdana", Font.PLAIN, 100));
        button1.setBounds(80,80,100,100);
        button1.setBackground(Color.GRAY);
        button1.addActionListener(new Main());
        f.add(button1);
        
        button2 = new JButton();
        button2.setFont(new Font("Verdana", Font.PLAIN, 100));
        button2.setBounds(200,80,100,100);
        button2.setBackground(Color.GRAY);
        button2.addActionListener(new Main());
        f.add(button2);
        
        button3 = new JButton();
        button3.setFont(new Font("Verdana", Font.PLAIN, 100));
        button3.setBounds(320,80,100,100);
        button3.setBackground(Color.GRAY);
        button3.addActionListener(new Main());
        f.add(button3);
        
        button4 = new JButton();
        button4.setFont(new Font("Verdana", Font.PLAIN, 100));
        button4.setBounds(80,200,100,100);
        button4.setBackground(Color.GRAY);
        button4.addActionListener(new Main());
        f.add(button4);
        
        button5 = new JButton();
        button5.setFont(new Font("Verdana", Font.PLAIN, 100));
        button5.setBounds(200,200,100,100);
        button5.setBackground(Color.GRAY);
        button5.addActionListener(new Main());
        f.add(button5);
        
        button6 = new JButton();
        button6.setFont(new Font("Verdana", Font.PLAIN, 100));
        button6.setBounds(320,200,100,100);
        button6.setBackground(Color.GRAY);
        button6.addActionListener(new Main());
        f.add(button6);
        
        button7 = new JButton();
        button7.setFont(new Font("Verdana", Font.PLAIN, 100));
        button7.setBounds(80,320,100,100);
        button7.setBackground(Color.GRAY);
        button7.addActionListener(new Main());
        f.add(button7);
        
        button8 = new JButton();
        button8.setFont(new Font("Verdana", Font.PLAIN, 100));
        button8.setBounds(200,320,100,100);
        button8.setBackground(Color.GRAY);
        button8.addActionListener(new Main());
        f.add(button8);
        
        button9 = new JButton();
        button9.setFont(new Font("Verdana", Font.PLAIN, 100));
        button9.setBounds(320,320,100,100);
        button9.setBackground(Color.GRAY);
        button9.addActionListener(new Main());
        f.add(button9);
        
        button10 = new JButton("reset");
        button10.setFont(new Font("Verdana", Font.PLAIN, 20));
        button10.setBounds(50,10,100,30);
        button10.setBackground(Color.RED);
        button10.addActionListener(new Main());
        f.add(button10);
        
        f.add(dc);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1) {
            if (run) {
                if (button1.getText()=="") {
                    if (player=="1") {
                        label.setText("Player 2 turn");
                        player = "2";
                        button1.setText("x");
                        check();
                    } else if (player=="2") {
                        label.setText("Player 1 turn");
                        player = "1";
                        button1.setText("o");
                        check();
                    }
                }
            }
        } else if(e.getSource()==button2) {
            if (run) {
                if (button2.getText()=="") {
                    if (player=="1") {
                        label.setText("Player 2 turn");
                        player = "2";
                        button2.setText("x");
                        check();
                    } else if (player=="2") {
                        label.setText("Player 1 turn");
                        player = "1";
                        button2.setText("o");
                        check();
                    }
                }
            }
        } else if(e.getSource()==button3) {
            if (run) {
                if (button3.getText()=="") {
                    if (player=="1") {
                        label.setText("Player 2 turn");
                        player = "2";
                        button3.setText("x");
                        check();
                    } else if (player=="2") {
                        label.setText("Player 1 turn");
                        player = "1";
                        button3.setText("o");
                        check();
                    }
                }
            }
        } else if(e.getSource()==button4) {
            if (run) {
                if (button4.getText()=="") {
                    if (player=="1") {
                        label.setText("Player 2 turn");
                        player = "2";
                        button4.setText("x");
                        check();
                    } else if (player=="2") {
                        label.setText("Player 1 turn");
                        player = "1";
                        button4.setText("o");
                        check();
                    }
                }
            }
        } else if(e.getSource()==button5) {
            if (run) {
                if (button5.getText()=="") {
                    if (player=="1") {
                        label.setText("Player 2 turn");
                        player = "2";
                        button5.setText("x");
                        check();
                    } else if (player=="2") {
                        label.setText("Player 1 turn");
                        player = "1";
                        button5.setText("o");
                        check();
                    }
                }
            }
        } else if(e.getSource()==button6) {
            if (run) {
                if (button6.getText()=="") {
                    if (player=="1") {
                        label.setText("Player 2 turn");
                        player = "2";
                        button6.setText("x");
                        check();
                    } else if (player=="2") {
                        label.setText("Player 1 turn");
                        player = "1";
                        button6.setText("o");
                        check();
                    }
                }
            }
        } else if(e.getSource()==button7) {
            if (run) {
                if (button7.getText()=="") {
                    if (player=="1") {
                        label.setText("Player 2 turn");
                        player = "2";
                        button7.setText("x");
                        check();
                    } else if (player=="2") {
                        label.setText("Player 1 turn");
                        player = "1";
                        button7.setText("o");
                        check();
                    }
                }
            }
        } else if(e.getSource()==button8) {
            if (run) {
                if (button8.getText()=="") {
                    if (player=="1") {
                        label.setText("Player 2 turn");
                        player = "2";
                        button8.setText("x");
                        check();
                    } else if (player=="2") {
                        label.setText("Player 1 turn");
                        player = "1";
                        button8.setText("o");
                        check();
                    }
                }
            }
        } else if(e.getSource()==button9) {
            if (run) {
                if (button9.getText()=="") {
                    if (player=="1") {
                        label.setText("Player 2 turn");
                        player = "2";
                        button9.setText("x");
                        check();
                    } else if (player=="2") {
                        label.setText("Player 1 turn");
                        player = "1";
                        button9.setText("o");
                        check();
                    }
                }
            }
        } else if(e.getSource()==button10) {
            button1.setBackground(Color.GRAY);
            button2.setBackground(Color.GRAY);
            button3.setBackground(Color.GRAY);
            button4.setBackground(Color.GRAY);
            button5.setBackground(Color.GRAY);
            button6.setBackground(Color.GRAY);
            button7.setBackground(Color.GRAY);
            button8.setBackground(Color.GRAY);
            button9.setBackground(Color.GRAY);
            button1.setText("");
            button2.setText("");
            button3.setText("");
            button4.setText("");
            button5.setText("");
            button6.setText("");
            button7.setText("");
            button8.setText("");
            button9.setText("");
            run = true;
            player = "1";
            label.setText("Player 1 turn");
        }
    }
    void check() {
        if (button1.getText()=="x" && button2.getText()=="x" && button3.getText()=="x") {
            run = false;
            button1.setBackground(Color.GREEN);
            button2.setBackground(Color.GREEN);
            button3.setBackground(Color.GREEN);
            label.setText("Player 1 wins!");
        }
        if (button4.getText()=="x" && button5.getText()=="x" && button6.getText()=="x") {
            run = false;
            button4.setBackground(Color.GREEN);
            button5.setBackground(Color.GREEN);
            button6.setBackground(Color.GREEN);
            label.setText("Player 1 wins!");
        }
        if (button7.getText()=="x" && button8.getText()=="x" && button9.getText()=="x") {
            run = false;
            button7.setBackground(Color.GREEN);
            button8.setBackground(Color.GREEN);
            button9.setBackground(Color.GREEN);
            label.setText("Player 1 wins!");
        }
        if (button1.getText()=="x" && button4.getText()=="x" && button7.getText()=="x") {
            run = false;
            button1.setBackground(Color.GREEN);
            button4.setBackground(Color.GREEN);
            button7.setBackground(Color.GREEN);
            label.setText("Player 1 wins!");
        }
        if (button2.getText()=="x" && button5.getText()=="x" && button8.getText()=="x") {
            run = false;
            button2.setBackground(Color.GREEN);
            button5.setBackground(Color.GREEN);
            button8.setBackground(Color.GREEN);
            label.setText("Player 1 wins!");
        }
        if (button3.getText()=="x" && button6.getText()=="x" && button9.getText()=="x") {
            run = false;
            button3.setBackground(Color.GREEN);
            button6.setBackground(Color.GREEN);
            button9.setBackground(Color.GREEN);
            label.setText("Player 1 wins!");
        }
        if (button1.getText()=="x" && button5.getText()=="x" && button9.getText()=="x") {
            run = false;
            button1.setBackground(Color.GREEN);
            button5.setBackground(Color.GREEN);
            button9.setBackground(Color.GREEN);
            label.setText("Player 1 wins!");
        }
        if (button3.getText()=="x" && button5.getText()=="x" && button7.getText()=="x") {
            run = false;
            button3.setBackground(Color.GREEN);
            button5.setBackground(Color.GREEN);
            button7.setBackground(Color.GREEN);
            label.setText("Player 1 wins!");
        }
        if (button1.getText()=="o" && button2.getText()=="o" && button3.getText()=="o") {
            run = false;
            button1.setBackground(Color.GREEN);
            button2.setBackground(Color.GREEN);
            button3.setBackground(Color.GREEN);
            label.setText("Player 2 wins!");
        }
        if (button4.getText()=="o" && button5.getText()=="o" && button6.getText()=="o") {
            run = false;
            button4.setBackground(Color.GREEN);
            button5.setBackground(Color.GREEN);
            button6.setBackground(Color.GREEN);
            label.setText("Player 2 wins!");
        }
        if (button7.getText()=="o" && button8.getText()=="o" && button9.getText()=="o") {
            run = false;
            button7.setBackground(Color.GREEN);
            button8.setBackground(Color.GREEN);
            button9.setBackground(Color.GREEN);
            label.setText("Player 2 wins!");
        }
        if (button1.getText()=="o" && button4.getText()=="o" && button7.getText()=="o") {
            run = false;
            button1.setBackground(Color.GREEN);
            button4.setBackground(Color.GREEN);
            button7.setBackground(Color.GREEN);
            label.setText("Player 2 wins!");
        }
        if (button2.getText()=="o" && button5.getText()=="o" && button8.getText()=="o") {
            run = false;
            button2.setBackground(Color.GREEN);
            button5.setBackground(Color.GREEN);
            button8.setBackground(Color.GREEN);
            label.setText("Player 2 wins!");
        }
        if (button3.getText()=="o" && button6.getText()=="o" && button9.getText()=="o") {
            run = false;
            button3.setBackground(Color.GREEN);
            button6.setBackground(Color.GREEN);
            button9.setBackground(Color.GREEN);
            label.setText("Player 2 wins!");
        }
        if (button1.getText()=="o" && button5.getText()=="o" && button9.getText()=="o") {
            run = false;
            button1.setBackground(Color.GREEN);
            button5.setBackground(Color.GREEN);
            button9.setBackground(Color.GREEN);
            label.setText("Player 2 wins!");
        }
        if (button3.getText()=="o" && button5.getText()=="o" && button7.getText()=="o") {
            run = false;
            button3.setBackground(Color.GREEN);
            button5.setBackground(Color.GREEN);
            button7.setBackground(Color.GREEN);
            label.setText("Player 2 wins!");
        }
        if (run) {
            if (button1.getText()!= "" && button2.getText()!= "" && button3.getText()!= "" && button4.getText()!= "" && button5.getText()!= "" && button6.getText()!= "" && button7.getText()!= "" && button8.getText()!= "" && button9.getText()!= "") {
                label.setText("Tie, click reset");
                button1.setBackground(Color.ORANGE);
                button2.setBackground(Color.PINK);
                button3.setBackground(Color.RED);
                button4.setBackground(Color.PINK);
                button5.setBackground(Color.RED);
                button6.setBackground(Color.WHITE);
                button7.setBackground(Color.RED);
                button8.setBackground(Color.WHITE);
                button9.setBackground(Color.BLUE);
            }
        }
    }
}
