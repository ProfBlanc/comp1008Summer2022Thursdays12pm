package ca.georgiancollege.copr.comp1008.week5;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Week5 {

    public static void main(String[] args) {
        //regex4();
        //filemanipulation();
        //userCreateFileAndFolder();
        //getAllFilesAndFolders();
        //writingToFile();
        //readFile();
        finalTask();
    }
    static void regex1(){
        /*
            regex
                Regular Expressions
                    advanced searching
                        more complicated searches in text
                            either or
                            in a range
                            a group X values
                            text that starts with
                                    ends in
                            starts with has this many characters and ends in

                    normal search: determine if a string in found entirely in a text
                    ctr+f: ben => ben exists in text

            Special Characters that have special meanings

            []      any character b/t the brackets

                    [abcd]      either a, b, c, or d
                    [h-l]       either h, i, j, k, l

            |       either or
                    cat|dog|mouse


            single character special meanings

            .       any character
            +       repeated one or many times
            ?       repeated zero or one times
            *       repeated zero or many times

            c.?t
                search for a string that starts with c, has any character (after the c) zero or one time, has t

                    ct
                    cat
                    cbt
                    cct
                    c(t

            c.+t

                    cat
                    cbt
                    cct
                    c(t
                    caaaaaaaat
                    cabdefgt


        positional special means

        ^       located at the start of the text

                "Hello There world!"
                "hello There world!"

                  ^[H]ello

                    ^[Hh]ello
                    ^There
        $       located at the end of the text


                "Hello There world!"

                world!$

                world$

        repeatition part 2

        {exactly N times}
        {Between N, and Y times}
        {At Least X times,}

            be{3}n
                beeen
            be{2,4}n
                been
                beeen
                beeeen

                not beeeeen
                not ben

            be{1,}n

            ben
            beeen
            beeeeeeeeeen
            beeeeeeeeeeeeeeeeeeeeeeeen

        shortcut captures

        \d      all digits      0-9
                [0-9]

        \s      whitespace

        \S      non-whitespace
                a-z0-9 + special characters

        \D      non-digit characters

        */

    }
    static void regex2(){
        String regex, text;

        text = "Hello World! Do you love working with Java?123.";
        regex = "[HJ].{1,2}";

        /*
            Pattern: state our regular expression search query
            Matcher: take the pattern, pass the pattern to a text, find matches

                    java.util.regex
         */
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
/*
        boolean nextResultFound1 = matcher.find(); //boolean result if found
        String resultHit1 = matcher.group();
        System.out.println(resultHit1);

        boolean nextResultFound2 = matcher.find(); //boolean result if found
        String resultHit2 = matcher.group();
        System.out.println(resultHit2);
        */
        while(matcher.find()){
            System.out.println(matcher.group());
        }



    }

    static void regex3(){
        /*
                Create a text with value.
                    My number 1 restaurant is located at 234 98th avenue.
                Capture all digits of the text above
                Output all hits AND the string index of the hits

                \d
                [0-9]
         */

        String regex1, regex2, text;
        text = "My number 1 restaurant is located at 234 98th avenue.";
        regex1 = "\\d";
        regex2 = "[0-9]";

        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(text);
        /*
        matches() and find()

            matches only return hits if found at START of text

            find searches entire text
         */
        while (matcher.find()){

            //System.out.println(matcher.group());
            String textFound = matcher.group();
            System.out.printf("The number %s was found at index %d of the string '%s'%n",
                        textFound, text.indexOf(textFound), text
                    );
        }
    }
    static void regex4(){

        String text = "I like eating pizza and wings every day";
        String regex = "pizza|wings";
        String replace = "salad";
/*
        if(text.contains("pizza")){
        text.replace("pizza", "hamburger");
        }
        */
        String newText = text.replaceAll(regex,replace);
        System.out.println(newText);

    }

    static void filemanipulation(){

        /*
                Make a change to your File System

                java.io
                java.nio

                    Path
                        point to a working environment

                    Files
                        prep/management duties

                    File
                        do the work
                *******************************
                    Path
                        sets the folder or file location to be processed
                    Files
                        CRUD
                            create, read, update and delete
                                takes a Path as an argument
                    File
                        convert a Path to a File to process a request

         */

        //CREATE a directory
        //choose a location
        Path cwd = Path.of("src/ca/georgiancollege/copr/comp1008/week5");
        //System.out.println(Files.exists(cwd));
        //cwd: current working directory
        //Path dir = cwd.resolve("myDir");
        Path file = cwd.resolve("first.txt");

        try {
            //Files.createDirectory(dir);
            Files.createFile(file);
        }
        catch (Exception e){}
    }
    /*
        ask the user for a filename and a directory name
        create the file and directory
            (all files & dirs shold be created in this week's package)
     */
    static Path path = Path.of("src/ca/georgiancollege/copr/comp1008/week5");
    static void userCreateFileAndFolder(){

        Scanner input = new Scanner(System.in);
        String textFile, textFolder;
        Path pathFile, pathFolder;
        System.out.println("Enter a file name");
        textFile = input.nextLine();  //should confirm that file has an extension
        System.out.println("Enter a folder name");
        textFolder = input.nextLine();

        pathFile = path.resolve(textFile);
        try{
            Files.createFile(pathFile);
        }
        catch (Exception e){}

        pathFolder = path.resolve(textFolder);
        try{
            Files.createDirectory(pathFolder);
        }
        catch (Exception e){}
    }

    static void getAllFilesAndFolders(){

        File file = path.toFile();
        Path backToPath = file.toPath();
        File[] listOfFiles = file.listFiles();

        for(File current : listOfFiles){

            String fileOrFolder = current.isFile() ? "file" : "folder";
            System.out.printf("Name is '%s', size is %d and this is a %s%n",
                    current.getName(), current.length(), fileOrFolder
                    );
        }

    }
    static void writingToFile(){

        /*
            R   read
            A   append (add to the end of the file)
            W   write. overwrite

         */


        //choose first.txt and write content to it
        Path toWrite = path.resolve("first.txt");
        try {
            //Files.write(toWrite, "Cool beans\n".getBytes());
            Files.writeString(toWrite, "Hello World\n", StandardOpenOption.APPEND);
        }
        catch (Exception e){}

    }
    static void readFile(){
        Path toRead = path.resolve("first.txt");
        try{
            /*
            String content = Files.readString(toRead);
            System.out.println(content);

             */
            List<String> lines = Files.readAllLines(toRead);
            lines.add(1, "New Second line");
            String newContent = "";
            for(String line : lines){
                System.out.println(line);
                newContent += line + '\n';
            }
            Files.writeString(toRead, newContent);
        }
        catch (Exception e){}
    }

    /*
        Ask the user for a file or folder
            Determine if the file or folder contains a vowel using regex
                Output a message stating yes or no
            Determine if the file or folder exists in this week's package
                If it does, output the filename and size
                If it does not, ask the user if they would like to create it (Y|N)
                    if yes,
                        create it and output message stating file or folder created
                    if no
                        output thank you message


     */
    //just setting up the task
    static void finalTask(){
        Scanner input = new Scanner(System.in);
        String textUserInput, textUserAnswer, regEx, fileOrFolder;
        Path pathUserInput;
        boolean isDirectory;
        long fileSize;
        Pattern pattern;
        Matcher matcher;
        System.out.println("Welcome to the final task!");
        System.out.println("Please enter a file or directory name");
        textUserInput = input.nextLine();

        regEx = "[aieou]";
        pattern = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(textUserInput);
        if(matcher.find()){
            System.out.println("The file does contain a vowel");
        }
        else{
            System.out.println("The file does NOT contain a vowel");
        }

        pathUserInput = path.resolve(textUserInput);

        if(Files.exists(pathUserInput)){
                isDirectory = pathUserInput.toFile().isDirectory();
                fileOrFolder = isDirectory ? "directory": "file";
            System.out.printf("%s with name of %s was found and is %d bytes%n",
                    fileOrFolder, textUserInput, pathUserInput.toFile().length()
                    );
        }
        else{
            System.out.println(textUserInput + " was not found. Do you want to create it? Y|N");
            textUserAnswer = input.nextLine();
            if(textUserAnswer.toLowerCase().charAt(0)  == 'y') {
                isDirectory = !textUserInput.contains(".");
                try{
                if (isDirectory) {
                    Files.createDirectory(pathUserInput);
                } else {
                    Files.createFile(pathUserInput);
                }
            }
            catch(Exception e){}
                System.out.println(textUserInput + " was successfully created!");
            }
            else{
                System.out.println("Thank you for using this program");
            }
        }

    }
}
