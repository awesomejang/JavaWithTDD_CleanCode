package study;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringTest {
	
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        Assertions.assertThat(actual).isEqualTo("adc");
    }
    
    @Test
    void split() {
    	//given
    	String str = "1,2";
    	String str2 = "1";
    	
    	//when
    	String[] strs = str.split(",");
    	String[] strs2 = str.split(",");
    	
    	//then
    	Assertions.assertThat(strs).containsExactly("1", "2");
    	Assertions.assertThat(str2).contains("1");
    	
    }
}
