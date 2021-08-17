import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class file {
    public static void main(String[] args) throws IOException {

        // Creating a new file

        File myFile=new File("firstly.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("file cannot be created");
            e.printStackTrace();
        }



        //Writing in a file
        try {
            FileWriter fileWriter =new FileWriter("firstly.txt");
            fileWriter.write("Hello \nWelcome to this file");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Reading a file
        File myFile= new File("firstly.txt");
        try {
            Scanner sc= new Scanner(myFile);
            while(sc.hasNextLine()){
                String line= sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



        Path temp;
            temp = Files.move(Paths.get("C:\\Users\\Hp\\IdeaProjects\\firstjavaprogram\\out\\production\\firstjavaprogram\\firstly.txt"),
                    Paths.get("C:\\Users\\Hp\\Desktop\\fna811\\firstly.txt"));
            if(temp !=null)
            {
                System.out.println("File renamed and moved successfully");
            }else {
                System.out.println("Failed to move file");
            }


        //Opening a file
        File file= new File("firstly.txt");
        if(!Desktop.isDesktopSupported()){
            System.out.println("not Supported");
            return;
        }
        Desktop desktop= Desktop.getDesktop();
        if(file.exists())
            desktop.open(file);


        //Closing a file
        FileInputStream fis= null;
        int i=0;
        char c;


        try {
            fis =new FileInputStream("firstly.txt");
            i= fis.read();
            c=(char)i;
            System.out.println(c);
            fis.close();
            System.out.println("close function invoked");

            i=fis.read();
            c = (char)i;
            System.out.println(c);
        } catch (Exception ex){
            System.out.println("IOException: close called before read()");
        }finally {
            if(fis!=null){
                fis.close();
            }
        }

        }
        }





