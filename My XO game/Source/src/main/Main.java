package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        new TicTacToe_Game();
    }
}
class TicTacToe_Game extends JFrame implements ActionListener {
    JButton button[] = new JButton[9];
    boolean if_x = true;
    boolean if_o = false;

    public TicTacToe_Game(){
        ImageIcon icon= new ImageIcon("tic-tac-toe.png");
        setIconImage(icon.getImage());
        setVisible(true);
        setLocation(450,150);
        setSize(420,420);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,3,2,2));
        getContentPane().setBackground(Color.BLACK);
        for(int i =0; i<9;i++){
            button[i]=new JButton();
            button[i].setFocusable(false);
            button[i].setFont(new Font("MV Boli" , Font.BOLD,25));
            button[i].setForeground(Color.GREEN);
            button[i].setBackground(Color.BLACK);
            button[i].addActionListener(this);
            add(button[i]);
        }
    }
    public void see_who_win(){
        if((button[0].getText()) =="X" && button[4].getText()=="X" && button[8].getText()=="X"){
            button[0].setBackground(Color.GREEN);
            button[4].setBackground(Color.GREEN);
            button[8].setBackground(Color.GREEN);
            for(int i=0;i<9;i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(this,"X win !" ,null,JOptionPane.INFORMATION_MESSAGE);
            String [] que1={"yes" , "no"};
            int result = JOptionPane.showOptionDialog(this,"do you want to play again ? " ,null,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,que1,0);
            if(result==0){
                dispose();
                new TicTacToe_Game();
            }else{
                System.exit(0);
            }
        }
        if((button[0].getText()) =="X" && button[1].getText()=="X" && button[2].getText()=="X"){
            button[0].setBackground(Color.GREEN);
            button[1].setBackground(Color.GREEN);
            button[2].setBackground(Color.GREEN);
            for(int i=0;i<9;i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(this,"X win !" ,null,JOptionPane.INFORMATION_MESSAGE);
            String [] que1={"yes" , "no"};
            int result = JOptionPane.showOptionDialog(this,"do you want to play again ? " ,null,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,que1,0);
            if(result==0){
                dispose();
                new TicTacToe_Game();
            }else{
                System.exit(0);
            }
        }
        if((button[1].getText()) =="X" && button[4].getText()=="X" && button[7].getText()=="X"){
            button[1].setBackground(Color.GREEN);
            button[4].setBackground(Color.GREEN);
            button[7].setBackground(Color.GREEN);
            for(int i=0;i<9;i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(this,"X win !" ,null,JOptionPane.INFORMATION_MESSAGE);
            String [] que1={"yes" , "no"};
            int result = JOptionPane.showOptionDialog(this,"do you want to play again ? " ,null,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,que1,0);
            if(result==0){
                dispose();
                new TicTacToe_Game();
            }else{
                System.exit(0);
            }
        }
        if((button[2].getText()) =="X" && button[5].getText()=="X" && button[8].getText()=="X"){
            button[2].setBackground(Color.GREEN);
            button[5].setBackground(Color.GREEN);
            button[8].setBackground(Color.GREEN);
            for(int i=0;i<9;i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(this,"X win !" ,null,JOptionPane.INFORMATION_MESSAGE);
            String [] que1={"yes" , "no"};
            int result = JOptionPane.showOptionDialog(this,"do you want to play again ? " ,null,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,que1,0);
            if(result==0){
                dispose();
                new TicTacToe_Game();
            }else{
                System.exit(0);
            }
        }
        if((button[0].getText()) =="X" && button[3].getText()=="X" && button[6].getText()=="X"){
            button[0].setBackground(Color.GREEN);
            button[3].setBackground(Color.GREEN);
            button[6].setBackground(Color.GREEN);
            for(int i=0;i<9;i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(this,"X win !" ,null,JOptionPane.INFORMATION_MESSAGE);
            String [] que1={"yes" , "no"};
            int result = JOptionPane.showOptionDialog(this,"do you want to play again ? " ,null,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,que1,0);
            if(result==0){
                dispose();
                new TicTacToe_Game();
            }else{
                System.exit(0);
            }
        }
        if((button[2].getText()) =="X" && button[4].getText()=="X" && button[6].getText()=="X"){
            button[2].setBackground(Color.GREEN);
            button[4].setBackground(Color.GREEN);
            button[6].setBackground(Color.GREEN);
            for(int i=0;i<9;i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(this,"X win !" ,null,JOptionPane.INFORMATION_MESSAGE);
            String [] que1={"yes" , "no"};
            int result = JOptionPane.showOptionDialog(this,"do you want to play again ? " ,null,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,que1,0);
            if(result==0){
                dispose();
                new TicTacToe_Game();
            }else{
                System.exit(0);
            }
        }
        if((button[3].getText()) =="X" && button[4].getText()=="X" && button[5].getText()=="X"){
            button[3].setBackground(Color.GREEN);
            button[4].setBackground(Color.GREEN);
            button[5].setBackground(Color.GREEN);
            for(int i=0;i<9;i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(this,"X win !" ,null,JOptionPane.INFORMATION_MESSAGE);
            String [] que1={"yes" , "no"};
            int result = JOptionPane.showOptionDialog(this,"do you want to play again ? " ,null,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,que1,0);
            if(result==0){
                dispose();
                new TicTacToe_Game();
            }else{
                System.exit(0);
            }
        }
        if((button[6].getText()) =="X" && button[7].getText()=="X" && button[8].getText()=="X"){
            button[6].setBackground(Color.GREEN);
            button[7].setBackground(Color.GREEN);
            button[8].setBackground(Color.GREEN);
            for(int i=0;i<9;i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(this,"X win !" ,null,JOptionPane.INFORMATION_MESSAGE);
            String [] que1={"yes" , "no"};
            int result = JOptionPane.showOptionDialog(this,"do you want to play again ? " ,null,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,que1,0);
            if(result==0){
                dispose();
                new TicTacToe_Game();
            }else{
                System.exit(0);
            }
        }

        /*&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& OOOOO ############################################### */
        if((button[0].getText()) =="O" && button[4].getText()=="O" && button[8].getText()=="O"){
            button[0].setBackground(Color.GREEN);
            button[4].setBackground(Color.GREEN);
            button[8].setBackground(Color.GREEN);
            for(int i=0;i<9;i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(this,"O win !" ,null,JOptionPane.INFORMATION_MESSAGE);
            String [] que1={"yes" , "no"};
            int result = JOptionPane.showOptionDialog(this,"do you want to play again ? " ,null,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,que1,0);
            if(result==0){
                dispose();
                new TicTacToe_Game();
            }else{
                System.exit(0);
            }
        }
        if((button[0].getText()) =="O" && button[1].getText()=="O" && button[2].getText()=="O"){
            button[0].setBackground(Color.GREEN);
            button[1].setBackground(Color.GREEN);
            button[2].setBackground(Color.GREEN);
            for(int i=0;i<9;i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(this,"O win !" ,null,JOptionPane.INFORMATION_MESSAGE);
            String [] que1={"yes" , "no"};
            int result = JOptionPane.showOptionDialog(this,"do you want to play again ? " ,null,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,que1,0);
            if(result==0){
                dispose();
                new TicTacToe_Game();
            }else{
                System.exit(0);
            }
        }
        if((button[1].getText()) =="O" && button[4].getText()=="O" && button[7].getText()=="O"){
            button[1].setBackground(Color.GREEN);
            button[4].setBackground(Color.GREEN);
            button[7].setBackground(Color.GREEN);
            for(int i=0;i<9;i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(this,"O win !" ,null,JOptionPane.INFORMATION_MESSAGE);
            String [] que1={"yes" , "no"};
            int result = JOptionPane.showOptionDialog(this,"do you want to play again ? " ,null,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,que1,0);
            if(result==0){
                dispose();
                new TicTacToe_Game();
            }else{
                System.exit(0);
            }
        }
        if((button[2].getText()) =="O" && button[5].getText()=="O" && button[8].getText()=="O"){
            button[2].setBackground(Color.GREEN);
            button[5].setBackground(Color.GREEN);
            button[8].setBackground(Color.GREEN);
            for(int i=0;i<9;i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(this,"O win !" ,null,JOptionPane.INFORMATION_MESSAGE);
            String [] que1={"yes" , "no"};
            int result = JOptionPane.showOptionDialog(this,"do you want to play again ? " ,null,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,que1,0);
            if(result==0){
                dispose();
                new TicTacToe_Game();
            }else{
                System.exit(0);
            }
        }
        if((button[0].getText()) =="O" && button[3].getText()=="O" && button[6].getText()=="O"){
            button[0].setBackground(Color.GREEN);
            button[3].setBackground(Color.GREEN);
            button[6].setBackground(Color.GREEN);
            for(int i=0;i<9;i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(this,"O win !" ,null,JOptionPane.INFORMATION_MESSAGE);
            String [] que1={"yes" , "no"};
            int result = JOptionPane.showOptionDialog(this,"do you want to play again ? " ,null,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,que1,0);
            if(result==0){
                dispose();
                new TicTacToe_Game();
            }else{
                System.exit(0);
            }
        }
        if((button[2].getText()) =="O" && button[4].getText()=="O" && button[6].getText()=="O"){
            button[2].setBackground(Color.GREEN);
            button[4].setBackground(Color.GREEN);
            button[6].setBackground(Color.GREEN);
            for(int i=0;i<9;i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(this,"O win !" ,null,JOptionPane.INFORMATION_MESSAGE);
            String [] que1={"yes" , "no"};
            int result = JOptionPane.showOptionDialog(this,"do you want to play again ? " ,null,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,que1,0);
            if(result==0){
                dispose();
                new TicTacToe_Game();
            }else{
                System.exit(0);
            }
        }
        if((button[3].getText()) =="O" && button[4].getText()=="O" && button[5].getText()=="O"){
            button[3].setBackground(Color.GREEN);
            button[4].setBackground(Color.GREEN);
            button[5].setBackground(Color.GREEN);
            for(int i=0;i<9;i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(this,"O win !" ,null,JOptionPane.INFORMATION_MESSAGE);
            String [] que1={"yes" , "no"};
            int result = JOptionPane.showOptionDialog(this,"do you want to play again ? " ,null,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,que1,0);
            if(result==0){
                dispose();
                new TicTacToe_Game();
            }else{
                System.exit(0);
            }
        }
        if((button[6].getText()) =="O" && button[7].getText()=="O" && button[8].getText()=="O"){
            button[6].setBackground(Color.GREEN);
            button[7].setBackground(Color.GREEN);
            button[8].setBackground(Color.GREEN);
            for(int i=0;i<9;i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(this,"O win !" ,null,JOptionPane.INFORMATION_MESSAGE);
            String [] que1={"yes" , "no"};
            int result = JOptionPane.showOptionDialog(this,"do you want to play again ? " ,null,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,que1,0);
            if(result==0){
                dispose();
                new TicTacToe_Game();
            }else{
                System.exit(0);
            }
        }

    }
    public void check(){
        boolean que3=false;
        for(int i =0;i<9;i++){
            String u = button[i].getText();
            if(!u.equals("")){
                que3=true;
            }
        }
        if(que3){
            boolean que = true;
            for(int i =0; i<9;i++){
                if(button[i].isEnabled()){
                    que=false;
                }
            }
            if(que){
                JOptionPane.showMessageDialog(this,"no one win" ,null,JOptionPane.INFORMATION_MESSAGE);
                for(int i =0; i<9;i++){
                    button[i]=new JButton();
                    button[i].setFocusable(false);
                    button[i].setFont(new Font("MV Boli" , Font.BOLD,25));
                    button[i].setForeground(Color.GREEN);
                    button[i].setBackground(Color.BLACK);
                    button[i].setText("");
                    button[i].setEnabled(true);
                }
            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button[0]){
            if(if_x){
                button[0].setText("X");
                button[0].setEnabled(false);
                if_x=false;
                if_o=true;
            }
            else if(if_o){
                button[0].setText("O");
                button[0].setEnabled(false);
                if_x=true;
                if_o=false;
            }
        }
        if(e.getSource()==button[1]){
            if(if_x){
                button[1].setText("X");
                button[1].setEnabled(false);
                if_x=false;
                if_o=true;
            }
            else if(if_o){
                button[1].setText("O");
                button[1].setEnabled(false);
                if_x=true;
                if_o=false;
            }
        }
        if(e.getSource()==button[2]){
            if(if_x){
                button[2].setText("X");
                button[2].setEnabled(false);
                if_x=false;
                if_o=true;
            }
            else if(if_o){
                button[2].setText("O");
                button[2].setEnabled(false);
                if_x=true;
                if_o=false;
            }
        }
        if(e.getSource()==button[3]){
            if(if_x){
                button[3].setText("X");
                button[3].setEnabled(false);
                if_x=false;
                if_o=true;
            }
            else if(if_o){
                button[3].setText("O");
                button[3].setEnabled(false);
                if_x=true;
                if_o=false;
            }
        }
        if(e.getSource()==button[4]){
            if(if_x){
                button[4].setText("X");
                button[4].setEnabled(false);
                if_x=false;
                if_o=true;
            }
            else if(if_o){
                button[4].setText("O");
                button[4].setEnabled(false);
                if_x=true;
                if_o=false;
            }
        }
        if(e.getSource()==button[5]){
            if(if_x){
                button[5].setText("X");
                button[5].setEnabled(false);
                if_x=false;
                if_o=true;
            }
            else if(if_o){
                button[5].setText("O");
                button[5].setEnabled(false);
                if_x=true;
                if_o=false;
            }
        }
        if(e.getSource()==button[6]){
            if(if_x){
                button[6].setText("X");
                button[6].setEnabled(false);
                if_x=false;
                if_o=true;
            }
            else if(if_o){
                button[6].setText("O");
                button[6].setEnabled(false);
                if_x=true;
                if_o=false;
            }
        }
        if(e.getSource()==button[7]){
            if(if_x){
                button[7].setText("X");
                button[7].setEnabled(false);
                if_x=false;
                if_o=true;
            }
            else if(if_o){
                button[7].setText("O");
                button[7].setEnabled(false);
                if_x=true;
                if_o=false;
            }
        }
        if(e.getSource()==button[8]){
            if(if_x){
                button[8].setText("X");
                button[8].setEnabled(false);
                if_x=false;
                if_o=true;
            }
            else if(if_o){
                button[8].setText("O");
                button[8].setEnabled(false);
                if_x=true;
                if_o=false;
            }
        }
        see_who_win();
        check();
    }
}
