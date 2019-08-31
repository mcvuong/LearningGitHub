# LearningGitHub

## 1. Project Notes

In this project, you will be able to:

1. Use _GitHub_
2. Contemplate elements needed to make a project
3. Understand version control
4. Create a version of **Conway Game of Life** (<https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life>)

## 2. Conway's Game Of Life Notes

Needs to be able to:

### 1. Let user choose/create a board file

1. Files should allow for boards between **10-100**, which the user chooses
2. 0s are **empty** spaces and 1s are a **cell**
3. Each row is its own line
4. Get a **user input** to "randomly" fill in the board (like a seed) **IF** it is a _new_ board. The seed and size should create the _same_ board every time.
5. Allow the user to save the board.

### 2. Display the fundamentals of the game of life

1. Each cell with one or no neighbors dies (solitude).
2. Each cell with four or more neighbors dies (overpopulation).
3. Each cell with two or thee neighbors survives
4. Each empty cell with three neighbors becomes populated.
5. Showcase game in the terminal.

## 3. Plan

### Board

Will serve the purpose of providing user with context of the project. Will give short information about the game (will repeat if desired), plus prompt user for a response (**Scanner scnr**), which will call the class they want.

For the purpose of saving/loading a game, **FileOutputStream out** and **FileInputStream in** will be used, respectively. A user given **String response** will save (and quit) the game, as well as do other things.

Variables:

* scnr: Scanner
* response: String
* in: FileInputStream
* out: FileOutputStream

Methods:

* main ()
* instructions ()
* save ()

Functions:

* Repeating instructions/story

```Java
System.out.println("Would you like to repeat the instructions (y/n)?");
response = scnr.nextLine();

if (response.equals("y") || response.equals("Y")) {
     instructions ();
}
```

* Moving user to correct class

```Java

System.out.println("Would you like to start a new game?");
response = scnr.nextLine();

if (response.equals("y") || response.equals("Y")) {
     newBoard newBoard = new newBoard ();
     newBoard();
}

else {
     oldBoard oldBoard = new oldBoard ();
     oldBoard();
}
```

* Saving game

```Java
System.out.println("Remember: to save the game, you must enter: \"save\".
     To save and quit a game, remember to type, \"quit\".");

response = scnr.nextLine(); //not sure if this will work
//maybe use a method in case it gets called?
... //use FileInputStream to transfer file temp to the new file.

System.out.println("Game has been saved.");

if (response.equals("quit") || response.equals("Quit")) {
     System.exit(); //possibly works?
}

System.out.println("Remember: to save the game, you must enter: \"save\".
     To save and quit a game, remember to type, \"quit\".");
```

#### NewBoard

This will serve the purpose of creating a board.

If the user decides to create a new board, then they will be directed to **class new** and a new file will be created (**file newFile**). The user will input a size for the board (**int size**). Next, the user will provide a string to randomize the board (**String str**).

This classes will also redirect user back to the previous class to save (and leave). It will also refer to **class seed** to finalize generating the new board.

Variables (new):

* newFile: file
* str: String
* size: int

Methods:

* NewBoard ()

Functions:

* Creating a new file to store a new board
* Prompting user for String for seed and int size
* Sending user to **class seed** for the board

#### OldBoard

This will serve the purpose of loading a board.

If the user decides to load an old array, then they will be directed to **class old** and an old file will be loaded (**file oldFile**)and **array row** will be adjusted using **FileOutputSteam out**.

Variables:

* oldFile: file
* strRow: String
* row: array

Methods:

* OldBoard ()

Functions:

* Loading a file using oldFile (prompt user to provide string of file to load it)
* Taking previous file and gathering information (**int size** is dependent on the amount of rows, Strings are set based on each line)
* Calling **class game**

#### seed

This will help "randomly" generate the board. It will take two inputs (**int size** and **String str**) and use a formula to generate the board that would be made with that particular String.

To obtain a usable number (1-100 (depends on max size of the board)), **String str** will transform into the sum of the letters/numbers that was used `(ex: sam will be 33)` and use that to set **double num**. Then, it will be divided by how many characters were used (**int chara**) and then by the size of the board multipled by 10. If this will result in a _fraction_, then a third of what will first make it a fraction will be added `(ex: the seed "sam" with a board size of 10 will generate a board where the first populated cells are at every 44th cell (44 and 88))`. If the resultant is still too large, then the number will keep being divided by the size of the board until it's less than or equal to the size of the board.

Outline:
    - Sum of letters + numbers (double num)
    - double num/int chara used OR double num + (characters/3)
    - double num/(int size * 10) OR double num + (int size * 10)

**Int populate** will use this to populate specific cells. This will fill in **array row**, which will be made of multiple strings that are dependent on **int size**. 

Variables:

* size: int
* chara: int
* str: String
* num: double //initialize as 0
* populate: int
* row: array

Methods:

* seed (int size, String str)
* doubleToInt ()
* setArrayRow ()
* extraLarge ()

Functions:

* Turning a String into a double based on bytes (gotta go Google this again)
* Turning a double into an int (forgot, so Google this, too)
* Using charValue() to add character values
* If/else for dividing/adding
* Using a while-loop to use **int populate** while considering **int size**
* Using a while-loop while **int populate** is larger than **int size**
* Adding new Strings to **array row**
* Calling **class game**

#### game

This will hold the fundamentals of the game of life. **Timer timer** will be used to change the game every few seconds (haven't decided on a time yet).

The arrays will start to be used! The program will be looking to compare a point in an String with its neighbors. It will first examine its neighboring numbers and then the following String. The part to the most left will hold precident. Thus, if the String was like this:

`001100`

Then the one that will first be examined would be this one:

`001<--100`

After each String is examined, then the past game board will be cleared (newline will be spammed by **int size**). A temporary file (**file temp**) will be created and store the current data. Then, the current game board will be printed out in the terminal.

Variables:

* temp: file
* timer: Timer
* size: int
* string1: String

Methods:

* clear ()
* print ()
* change ()

Functions:

* Changing **file temp** after each iteration
* Using **Timer timer** to change the board after x seconds
* Examining how many 1s are in a String in an array and changing the String
    1. If/else to delete, leave alone, or add 1s


## Additional notes

For markdown referencing: <https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet>

Tips with git: <https://rogerdudler.github.io/git-guide/>

Tips with github: <https://guides.github.com/activities/hello-world/>

To view: cmd + shift + v
