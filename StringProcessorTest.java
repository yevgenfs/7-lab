package ua.iot.lviv;



import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringProcessorTest {
  StringProcessor sp = new StringProcessor();
  String st = new String();
  int lenght;
  
  
  /*@BeforeEach
  void setUp() throws Exception {
    
    
   
    
  }*/

  @Test
  void lenghtTest() throws IOException {
    lenght = sp.readInputWordLenght();
    assertEquals(5,lenght);
  }
  
  @Test
  void stringTest() throws IOException {
    st = sp.readInputText();
    assertEquals("In this article, we would be going through the mostly asked Java Regular expression interview "
    		+ "questions and answers ? "
    		+ "Even if you are not a great fan of interview questions, "
    		+ "this post may offer you some interesting excercises on Regular Expressions.",st);
  }
  


}
