import java.util.Scanner;
public class MadLibs 
{
    public static void main(String[] args)
    {
        String madLib = "The <noun> ate the <noun2> and felt <adjetive> so it started to <verb> "; 
        //incomplete MadLib
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("give me a noun");
        String userInputNoun1 = keyboardInput.nextLine();
        //second noun the user inputs
        System.out.println("give me another noun");
        String userInputNoun2 = keyboardInput.nextLine();
        System.out.println("give me an adjetive");
        String userInputAdjetive = keyboardInput.nextLine();
        //adjetive the user inputs
        System.out.println("give me a verb");
        String userInputVerb = keyboardInput.nextLine();
        //verb the user inputs

        int nounLocation = madLib.indexOf("<noun>");
        int noun2Location = madLib.indexOf("<noun2>");
        int adjetiveLocation = madLib.indexOf("<adjetive>");
        int verbLocation = madLib.indexOf("<verb>");

        String completedMadLib = madLib.substring(0, nounLocation) + userInputNoun1;
        completedMadLib += madLib.substring(nounLocation+"<noun>".length(), noun2Location) + userInputNoun2; 
        completedMadLib += madLib.substring(noun2Location+"<noun2>".length(), adjetiveLocation) + userInputAdjetive;
        completedMadLib += madLib.substring(adjetiveLocation+"<adjetive>".length(), verbLocation) + userInputVerb;
        //complete MadLib printed
        System.out.print(completedMadLib);
    }
    
}
