import java.lang.*;

public class PigLatinTranslator
{
  public static Book translate(Book input)
  {
    Book translatedBook = new Book();
// Add code here
    return translatedBook;
  }

  public static String translate(String input)
  {
    String result = input;
    int start = 0;
    String final_string = "";
    for(int i =0; i< result.length(); i++){
      if(result.substring(i, i+1).equals(" ")|| result.substring(i, i+1).equals("-")){
        String sub = translateWord(result.substring(start, i));
        System.out.println(sub);
        final_string += sub + result.substring(i, i+1);
        start = i+1;
      }
      
    }
    final_string += translateWord(result.substring(start, result.length()));
  
    return final_string;
  }

  private static String translateWord(String input)
  {
    String result = input;
    if(result.length()>0){
      for(int i=0;i<result.length(); i++){
        if((result.charAt(i)== 'a'|| result.charAt(i)== 'e'|| result.charAt(i)== 'i'|| result.charAt(i)== 'o'|| result.charAt(i)== 'u')|| (result.charAt(i)== 'A'|| result.charAt(i)== 'E'|| result.charAt(i)== 'I'|| result.charAt(i)== 'O'|| result.charAt(i)== 'U')){
          result = result.substring(i) + result.substring(0, i);
          return (result+="ay");
           }
        }
      
      if(input.substring(0, 1).equals(input.substring(0, 1).toUpperCase())){
        return result.substring(0,1).toUpperCase() + result.substring(1).toLowerCase();
      }
    }
    return result;
  }
}