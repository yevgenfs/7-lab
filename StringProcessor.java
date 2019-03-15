package ua.iot.lviv;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {

  public  int readInputWordLenght() throws IOException {
    Scanner sc = new Scanner(new InputStreamReader(System.in));
    System.out.print("Enter word lenght");
    return sc.nextInt();

  }
  public static String readInputText() throws IOException {
    Scanner sc = new Scanner(new InputStreamReader(System.in));
    System.out.print("Enter String");
    return sc.nextLine();

  }
  public String showResults(String st, int lenght) {

    Pattern patern = Pattern.compile("([A-Za-z]{1,}\\s)+([\\?])");
    Pattern paternSecond = Pattern.compile("\\b[A-Za-z]{" + lenght + "}\\b");
    Matcher matcher = patern.matcher(st);
    while (matcher.find()) {
      String result = matcher.group();

      Matcher matcherFinal = paternSecond.matcher(result);
      while (matcherFinal.find()) {
        String resultFinal = matcherFinal.group();
        System.out.println(resultFinal);
      }

    }
    return null;
  }

  public static void main(String[] args) throws IOException {
    StringProcessor sp = new StringProcessor();
    int lenght = sp.readInputWordLenght();
    String st = new String();
    st = sp.readInputText();
    sp.showResults(st,lenght);

  }

}
