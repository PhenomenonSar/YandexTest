import java.util.Scanner;
public class Run {

    public String addSymbolsToString(){
        String result = new String();
        Scanner scan=new Scanner(System.in);
        result+="к";
        result+="о";
        result+="ш";
        result+="к";
        result+="а";
        return result;

    }
    public String addSymbolsToStringFailedTest(){
        String result = new String();
        Scanner scan=new Scanner(System.in);
        result+="п";
        result+="р";
        result+="а";
        result+="в";
        result+="и";
        result+="л";
        result+="ь";
        result+="н";
        result+="а";
        result+="я";
        result+=" ";
        result+="к";
        result+="о";
        result+="ш";
        result+="к";
        result+="а";
        return result;

    }
}
