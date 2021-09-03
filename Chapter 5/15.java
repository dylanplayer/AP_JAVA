import java.util.*;
import javax.swing.*;
import java.math.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Main implements ActionListener{

    public static JFrame WINDOW = new JFrame("Rock Paper Scissors");
    public static JPanel GAME_PANEL = new JPanel();
    public static JLabel INSTRUCTIONS_LABEL = new JLabel("Press an option");
    public static JButton ROCK_BUTTON = new JButton("Rock");
    public static JButton PAPER_BUTTON = new JButton("Paper");
    public static JButton SCISSORS_BUTTON = new JButton("Scissors");
    public static JLabel RESULTS_LABEL = new JLabel();
    public static String RESULTS_STRING = "";
    public static Font RESULT_FONT = new Font("Helvetica", Font.PLAIN, 20);
    



    public static void main(String[] args){

        buidGUI();
        
        

    }
    
    public static void play(int RPS, int CRPS) {
    	
    	if(RPS == 1 && CRPS == 1) {
    		
    		System.out.println("Dave chose rock");
    		RESULTS_STRING = "DRAW";
    		System.out.println(RESULTS_STRING);
    		refresh(2);
    		
    	}else if(RPS == 1 && CRPS == 2) {
    		
    		System.out.println("Dave chose paper");
    		RESULTS_STRING = "DAVE WON";
    		System.out.println(RESULTS_STRING);
    		refresh(3);
    		
    	}else if(RPS == 1 && CRPS == 3) {
    		
    		System.out.println("Dave chose scissors");
    		RESULTS_STRING = "YOU WON";
    		System.out.println(RESULTS_STRING);
    		refresh(1);
    		
    	}else if(RPS == 2 && CRPS == 1) {
    		
    		System.out.println("Dave chose rock");
    		RESULTS_STRING = "YOU WON";
    		System.out.println(RESULTS_STRING);
    		refresh(1);
    		
    	}else if(RPS == 2 && CRPS == 2) {
    		
    		System.out.println("Dave chose paper");
    		RESULTS_STRING = "DRAW";
    		System.out.println(RESULTS_STRING);
    		refresh(2);
    		
    	}else if(RPS == 2 && CRPS == 3) {
    		
    		System.out.println("Dave chose scissors");
    		RESULTS_STRING = "DAVE WON";
    		System.out.println(RESULTS_STRING);
    		refresh(3);
    		
    	}else if(RPS == 3 && CRPS == 1) {
    		
    		System.out.println("Dave chose rock");
    		RESULTS_STRING = "DAVE WON";
    		System.out.println(RESULTS_STRING);
    		refresh(3);
    		
    	}else if(RPS == 3 && CRPS == 2) {
    		
    		System.out.println("Dave chose paper");
    		RESULTS_STRING = "YOU WON";
    		System.out.println(RESULTS_STRING);
    		refresh(1);
    		
    	}else if(RPS == 3 && CRPS == 3) {
    		
    		System.out.println("Dave chose scissors");
    		RESULTS_STRING = "DRAW";
    		System.out.println(RESULTS_STRING);
    		refresh(2);
    		
    	}
    	
    	
    	
    }
    
    public static void refresh(int colorCode) {
    	
    	RESULTS_LABEL.setText(RESULTS_STRING);
    	if(colorCode == 1) {
    		
    		RESULTS_LABEL.setForeground(Color.GREEN);
    		
    	}else if(colorCode == 2) {
    		
    		RESULTS_LABEL.setForeground(Color.GRAY);
    		
    	}else if(colorCode == 3) {
    		
    		RESULTS_LABEL.setForeground(Color.RED);
    		
    	}
    	
    	GAME_PANEL.setVisible(false);
    	GAME_PANEL.setVisible(true);
    	
    }

    public static int generateRandomNumber(int Max, int Min){
    	
    	int result = ((int) (Math.random() * (Max - Min))) + Min;
    	
    	System.out.printf("Dave Chose: %d\n", result);

    	return result;

    }

    public static void buidGUI(){

        WINDOW.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        WINDOW.setSize(500,200);
        GAME_PANEL.setLayout(null);
        
        RESULTS_LABEL.setText(RESULTS_STRING);
        RESULTS_LABEL.setFont(RESULT_FONT);

        INSTRUCTIONS_LABEL.setBounds(10,20,200,30);
        ROCK_BUTTON.setBounds(10,50,100,30);
        PAPER_BUTTON.setBounds(10,80,100,30);
        SCISSORS_BUTTON.setBounds(10,110,100,30);
        RESULTS_LABEL.setBounds(200,50,200,50);
        
        
        ROCK_BUTTON.addActionListener(new Main());
        PAPER_BUTTON.addActionListener(new Main());
        SCISSORS_BUTTON.addActionListener(new Main());
        
        
        GAME_PANEL.add(INSTRUCTIONS_LABEL);
        GAME_PANEL.add(ROCK_BUTTON);
        GAME_PANEL.add(PAPER_BUTTON);
        GAME_PANEL.add(SCISSORS_BUTTON);
        GAME_PANEL.add(RESULTS_LABEL);
        

        WINDOW.add(GAME_PANEL);


        WINDOW.setVisible(true);
        GAME_PANEL.setVisible(true);



    }

	@Override
	public void actionPerformed(ActionEvent buttonPress) {
		
		
		if(buttonPress.getSource() == ROCK_BUTTON) {
			
			play(1,generateRandomNumber(0,3));
			
		}
		
		if(buttonPress.getSource() == PAPER_BUTTON) {
			
			play(2,generateRandomNumber(0,3));
			
		}
		
		if(buttonPress.getSource() == SCISSORS_BUTTON) {
			
			play(3,generateRandomNumber(0,3));
			
		}

		
		
	}



}