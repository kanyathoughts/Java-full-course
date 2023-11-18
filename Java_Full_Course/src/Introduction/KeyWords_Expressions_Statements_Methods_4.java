package Introduction;

public class KeyWords_Expressions_Statements_Methods_4 {

    public static void main(String[] args) {
        //Keywords are the reserved words, and they marked in blue colour, and we can not use them.
		/*
		Expression contains variable, values, operators
		In side double quotes will be expression
		 */
        int value = 50; //value is variable, = is assignment operator, 50 is value, so it is called as expression
        //if we include datatype and semicolon also then it will become statement.
        if (value == 50)  //inside if block also called expression as "value == 50" has all expression needs.
        {
            System.out.println("This is expression"); //Inside double quotes also called expression
        }

        System.out.println("\t This is\n" +
                "\t also a\t\n" +
                "\t statement\t"); //statement can be in any number of lines.

        //indentation is the spaces that is going to help you to understand logical flow of the code.

        //If then else control statements
        int score = 4000;
        if (score < 5000 && score > 1000) {
            System.out.println("Score is less than 5000 and greater than 1000");
        } else if(score < 1000) {
            System.out.println("Score is less than 1000");
        } else {
            System.out.println("got here");
        }

        //challenge
        boolean gameOver = true;
        int scoreValue = 800;
        int levelCompleted = 5;
        int bonus = 100;
        if (gameOver) {
            int finalScoreValue = scoreValue + (levelCompleted * bonus);
            //finalScoreValue is local variable and we cn not use local variables out-side of the block as java will remove them once block closes.
            //This is called scope of the variable.
            System.out.println("finalScoreValue: " + finalScoreValue);
        }

        scoreValue = 10000; //we can update values of variables.
        levelCompleted = 8;
        bonus = 200;
        //Here we are again copying the same code, so it's duplicate, and we can handle it through methods.
        if (gameOver) {
            int finalScoreValue = scoreValue + (levelCompleted * bonus); //As finalScoreValue is removed so we can create with same name.
            System.out.println("finalScoreValue: " + finalScoreValue);
        }

        int getValue = calculateScore(true, 2000, 10, 800);//These are called as arguments, and we are calling method here.
        System.out.println("getValue: " + getValue);
        //Calling challenge methods
        displayHighScorePosition("Kanya", calculateHighScorePosition(1000));
        displayHighScorePosition("Jashu", calculateHighScorePosition(900));
        displayHighScorePosition("Buddi", calculateHighScorePosition(400));
        displayHighScorePosition("tim", calculateHighScorePosition(50));



    }

    public static int calculateScore(boolean gameOver, int scoreValue, int levelCompleted, int bonus) //Inside the brackets we call them as parameters.
    {
        //We don't need to create the variables java will automatically create them and remove once method finishes.
        //We have to pass the arguments to those parameters while calling method.
        if (gameOver) {
            int finalScoreValue = scoreValue + (levelCompleted * bonus); //As finalScoreValue is removed, so we can create with same name.
            return finalScoreValue; //It will return finalScoreValue if the gameOver is true and if gameOver is false then directly it will return -1.
            //We can change -1 to any value it's our wish.
        }
        return -1;
    }

    //Methods Challenge
    public static int calculateHighScorePosition(int playerScore) {
//        if(playerScore >= 1000) {
//            return 1;
//        } else if(playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;

        //we can ignore multiple return statements sometimes multiple return statements may confuse.
        int position = 4;
        if(playerScore >= 1000) {
            position =  1;
        } else if(playerScore >= 500) {
            position =  2;
        } else if (playerScore >= 100) {
            position =  3;
        }
        return position;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }

}
