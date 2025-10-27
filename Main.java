import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    printNums();
  }

  public static void printNTimes(String word, int N)
  {
    for (int i = 0; i < word.length(); i++)
    {
      String letter = word.substring(i, i+1);
      for (int j = 0; j < N; j++)
      {
        System.out.print(letter);
      }
      System.out.println();
    }
  }

  public static void printNums()
  {
    for (int i = 10; i >= 0; i--)
    {
       for (int j = i; j >= 0; j--)
        System.out.print(j);
    } // code solution here
    System.out.println();
  }

  public static void uprightNumberTriangle(int N)
  {
   
  }

  public static void starTree()
  {
    // code solution here
  }

  public static void multTable()
  {
    // code solution here
  }
}
