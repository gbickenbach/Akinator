import java.util.ArrayList;
import java.util.*;

public class Teacher2 
//creating a class called Teacher2
{

    boolean STEM;
    boolean Humanities;
    boolean Age35;
    boolean Age45;
    boolean Homework;
    boolean Male;
    boolean Escuelero;
    boolean Experiencia;
    boolean LivesNextToSchool;
    //creating boolean variables
    String Name;
    //creating a string called Name

    public Teacher2(boolean pSTEM, boolean pHumanities, boolean pAge35, boolean pAge45, boolean pHomework, boolean pMale, boolean pEscuelero, boolean pExperiencia, boolean PLivesNextToSchool, String pName)
    {
        STEM = pSTEM;
        Humanities = pHumanities;
        Age35 = pAge35;
        Age45 = pAge45;
        Homework = pHomework;
        Male = pMale;
        Escuelero = pEscuelero;
        Experiencia = pExperiencia;
        LivesNextToSchool = PLivesNextToSchool;
        Name = pName;
        //initializing instance variables to parameters
    }

    public boolean getq(int i)
    {
        if (i == 0)
        {return STEM;
        }
        else if (i == 1)
        {return Humanities;
        }
        else if (i == 2)
        {return Age35;
        }
        else if (i == 3)
        {return Age45;
        }
        else if (i == 4)
        {return Homework;
        }
        else if (i == 5)
        {return Male;
        }
        else if (i == 6)
        {return Escuelero;
        }
        else if (i == 7)
        {return Experiencia;
        }
        else 
        {return LivesNextToSchool;
        }
        //if statements to return the corresponding variable depending on the index. A general getter is being used
    }

    public String getName()
    {
        return Name;
        //a getter is used to return the string 'Name'. 
    }

    public static void main()

    {
        System.out.println("Welcome to Akinator CLN. Think of one of these ten teachers: Clau, Bash, Fercho, Alex, Tammy, Jota, JP, Laura, Mireia, Alda, Jason, Margarette, DruchoGo, Mechas, and Jairito. Answer the following questions");

        boolean right = true;

        int count = 0;

        while (right == true)
        // a while loop is created with the purpose of repeating until the correct teacher is guessed
        {

            String p1 = "Does the teacher teach a STEM subject?";
            String p2 = "Does the teacher teach a humanities subject?";
            String p3 = "Is the teacher less than or equal to 35 years old?";
            String p4 = "Is the teacher between 35 and 45 years old?";
            String p5 = "Does the teacher assign a lot of homework?";
            String p6 = "Is the teacher a male?";
            String p7 = "Is the teacher escuelero?";
            String p8 = "Has the teacher spent more than 10 years teaching at CLN?";
            String p9 = "Does the teacher live adjacent to Nogales?";
            //the question bank is being created— a question per string.
            Scanner scan = new Scanner(System.in);

            Teacher2 Clau = new Teacher2(true, false, false, false, true, false, true, true, false, "Clau");
            Teacher2 Bash = new Teacher2 (true, false, true, false, false, true, false, false, false, "Bash");
            Teacher2 Fercho = new Teacher2 (true, false, false, false, false, true, false, true, false, "Fercho");
            Teacher2 Alex = new Teacher2 (true, false, false, false, true, true, false, true, true, "Alex alias Alex María");
            Teacher2 Tammy =new Teacher2 (false, true, false, true, false, false, false, true, false, "Tammy");
            Teacher2 Jota =new Teacher2 (false, false, false, true, false, true, false, true, false, "Jota alias el DT");
            Teacher2 JP =new Teacher2 (false, true, true, false, true, true, false, false, false, "JP alias Scrotty");
            Teacher2 Laura =new Teacher2 (true, false, true, false, true, false, false, false, false, "Laura alias la mejor docente");
            Teacher2 Mireia =new Teacher2 (false, true, false, false, false, false, false, true, false, "Mireia");
            Teacher2 Alda =new Teacher2 (false, true, true, false, true, false, false, false, false, "Alda alias la consejera de momer");
            Teacher2 Jason =new Teacher2 (false, true, false, true, false, true, false, false, false, "Jason alias Jeison");
            Teacher2 Mechas =new Teacher2 (false, false, false, false, false, false, false, true, false, "Mechas, CEO de FINES");
            Teacher2 Andres =new Teacher2 (false, false, false, true, false, true, false, false, false, "Andres Gomez alias DruchoGo");
            Teacher2 Margarita =new Teacher2 (true, false, false, true, false, false, false, false, false, "Margarita, CEO de Zasqua");
            Teacher2 Jairito =new Teacher2 (false, false, false, false, false, true, false, true, false, "Jairito");;
            //each teacher is an object and has attributes. The first nine attributes are the evaluation of the boolean condition for the particular teacher.
            //the last attribute of each teacher is the name and the only string attribute.
            List<Teacher2> docentes = new ArrayList<Teacher2>();
            docentes.add(Clau);
            docentes.add(Bash);
            docentes.add(Fercho);
            docentes.add(Alex);
            docentes.add(Tammy);
            docentes.add(Jota);
            docentes.add(JP);
            docentes.add(Laura);
            docentes.add(Mireia);
            docentes.add(Alda);
            docentes.add(Jason);
            docentes.add(Mechas);
            docentes.add(Andres);
            docentes.add(Margarita);
            docentes.add(Jairito);
            //an array list is being created with a variety of teachers

            String[] preguntas = {p1, p2, p3, p4, p5, p6, p7, p8, p9};
            //an array is being created. each index corresponds to a question.

            for (int i = 0; i < preguntas.length; i++)
            {
                int shuffleindex = (int) (Math.random()*9);
                String newIndex = preguntas[shuffleindex];
                preguntas[shuffleindex] = preguntas[i];
                preguntas[i] = newIndex;
                //the questions are being organized randomly 
            }

            for (int i = 0; i < 9; i++)
            {
                System.out.println(preguntas[i]);
                //the question is being printed
                count++;
                //the number of questions is being counted
                String response = scan.nextLine();
                boolean value = Teacher2.answer(response);
                //whether the boolean value of the variable value is true or false depends on the user's 'response'

                int qindex = 0; 
                if(preguntas[i] == p1)
                {

                    qindex = 0;
                }
                else if (preguntas[i] == p2)
                {
                    qindex = 1;
                }
                else if (preguntas[i] == p3)
                {
                    qindex = 2;
                }
                else if (preguntas[i] == p4)
                {
                    qindex = 3;
                }
                else if (preguntas[i] == p5)
                {
                    qindex = 4;
                }
                else if (preguntas[i] == p6)
                {
                    qindex = 5;
                }
                else if (preguntas[i] == p7)
                {
                    qindex = 6;
                }
                else if (preguntas[i] == p8)
                {
                    qindex = 7;
                }
                else if (preguntas[i] == p9)
                {
                    qindex = 8;
                }
                //the if statements match the random index to a particular question number and then assigns the value of the index to the variable qindex
                for (int j = 0; j< docentes.size(); j++)
                //for loop that goes through each teacher
                {
                    if (value == docentes.get(j).getq(qindex))
                    {

                    }
                    else
                    {
                        docentes.remove(j);
                        j--;
                    }
                    //if the value of the boolean does not correspond to the teacher's value, then it will be eliminated from the arraylist of teachers 
                    if (docentes.size() == 1)
                    {
                        break;
                    }

                }
                if (docentes.size() == 2)
                {
                    System.out.println("I'm almost there!");
                }
                //if the number of teahcers is pinned to two, then the program will let the user know that it's 'almost there'
                if (docentes.size() == 1)
                {
                    break;
                }
                //if the number of teachers is pinned to one, then the loop will break

            }

            System.out.println("Is your teacher " + docentes.get(0).getName() + "?");
            //the program asks the user if it guessed the teacher correctly 
            String condition = scan.nextLine();
            boolean k = Teacher2.answer(condition);

            if (k == true)
            //if the user indicates that the program answered correctly, then the number of questions asked is printed
            {
                System.out.println("Got it. Number of attempts: " + count);
                right = false;
                //right is redefined to false to break the major while loop
            }
            if (k == false)
            {
                System.out.println("Gotta try again");
                //if the user indicates that the program did not answer correctly, then the whole loop repeates
            }

        }
    }

    public static boolean answer (String response)
    //this method is created to give a true value to the word yes and Yes, and a false value to the word no and No. 
    {

        if (response.equals("Yes") || response.equals("yes")|| response.equals("True")|| response.equals("true"))
        {

            return true;
        }
        else if (response.equals("No") || response.equals("no")|| response.equals("False")|| response.equals("false"))
        {

            return false;

        }
        else
        {
            System.out.println ("You didn't enter a valid response. The program will assume that the answer is No");

        }

        return false;
    }
}

