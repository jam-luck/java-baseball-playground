package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }
    
    @Test
    void test1() {
    	String inputString1 = "1,2";
    	String[] result1 = inputString1.split(",");
    	assertThat(result1).contains("1","2");
    	
    	String inputString2 = "1";
    	String[] result2 = inputString2.split(",");
    	assertThat(result2).containsExactly("1");
    }
    
    @Test
    void test2() {
    	String inputString = "(1,2)";
    	assertThat(inputString.substring(1, 4)).contains("1,2");
    }

    @Test
    void test3() {
    	String inputString = "abc";
    }	
}
