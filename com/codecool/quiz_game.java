package com.codecool;

import com.codecool.termlib.Terminal;
import com.codecool.termlib.Color;
import com.codecool.termlib.Direction;
import com.codecool.game.*;
import com.codecool.data_manager.*;
import java.util.*;



public class quiz_game {
    public static void main(String[] args) {

        Terminal term = new Terminal();
        quiz_game game = new quiz_game();
        Menu HomeScreen = new Menu();
        HomeScreen.handleMainMenu();
        /*
        WriteFile write = new WriteFile();
        write.saveScore("naba", 852);;
        */

        /*        
        Printer print = new Printer();
        print.displayTopScore(15);
        */
        
        /*
        ReadFile read = new ReadFile();
        ArrayList<HashMap<String, String>> questions = read.questions();
        System.out.println(questions.get(0));
        */
    }

}