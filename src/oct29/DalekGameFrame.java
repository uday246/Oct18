package oct29;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DalekGameFrame extends JFrame {

public static final int WIDTH = 800;

public static final int HEIGHT = 200;

private int playerMoves;

DalekGame dg = new DalekGame();

private JButton right, left, teleport;

JPanel buttonPanel, gamePanel;

JLabel gameBoard;

public DalekGameFrame() {

playerMoves = 0;

setSize(WIDTH,HEIGHT);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

setLayout(new FlowLayout());

JPanel buttonPanel = new JPanel();

JPanel gamePanel = new JPanel();

gameBoard = new JLabel(dg.getWorld());

right = new JButton("Right");

right.addActionListener(new RightMoveListener());

left = new JButton("Left");

left.addActionListener(new LeftMoveListener());

teleport = new JButton("Teleport");

teleport.addActionListener(new TeleportMoveListener());

buttonPanel.setBorder(BorderFactory.createTitledBorder("Controls"));

gamePanel.setBorder(BorderFactory.createTitledBorder("Game World"));

buttonPanel.add(left);

buttonPanel.add(right);

buttonPanel.add(teleport);

gamePanel.add(gameBoard);

add(buttonPanel);

add(gamePanel);

}

private class RightMoveListener implements ActionListener {

// move doctor right if space available, if not button will not work,

// if there is a Daalek there, doctor is caught

// add's to player moves so when doctor is caught, it prints a move count message

@Override

public void actionPerformed(ActionEvent arg0) {

if (right.isSelected()) {

dg.moveDoctor(1);

// update gameWorld

gameBoard = new JLabel(" " + dg.getWorld());

playerMoves ++;

}

}

}

private class LeftMoveListener implements ActionListener {

@Override

// check for doctor being caught,

//move the doctor left

// update game string

public void actionPerformed(ActionEvent arg0) {

if (left.isSelected()) {

playerMoves ++;

dg.moveDoctor(-1);

dg.doctorCaught();

}

}

}

private class TeleportMoveListener implements ActionListener {

// adds to playerMoves

// add a Dalek if the doctor teleports

//

@Override

public void actionPerformed(ActionEvent arg0) {

if(teleport.isSelected()) {

dg.moveDoctorByTel();

playerMoves ++;

}

}

}

// main

public static void main(String[] args) {

// new DalekGameFrame();

DalekGameFrame dgf = new DalekGameFrame();

dgf.setVisible(true);

}

}
