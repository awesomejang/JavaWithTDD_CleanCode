package study;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
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
    
    @Test
    void substring() {
    	//given 
    	String str = "(1,2)";
    	
    	//when
    	String answer = str.substring(str.indexOf("(") + 1, str.indexOf(")"));
    	
    	//then 
    	Assertions.assertThat(answer).isEqualTo("1,2");
    }
    
    @Test
    @DisplayName("charAt Correct Test")
    void charAt() {
    	// given
    	String str = "abc";
    	int index = 2;
    	
    	// when
    	char target = str.charAt(index);
    	
    	// then
    	Assertions.assertThat(target).isEqualTo('c');
    }
    
    @Test
    @DisplayName("charAt() 사용 시 전체 index를 초과하는 호출 시 StringIndexOutOfBoundsException 발생")
    void charAtException() { 
    	// given
    	String str = "abc";
    	int index = 3;
    	
    	// when & then
    	Assertions.assertThatThrownBy(() -> {str.charAt(index);}).isInstanceOf(IndexOutOfBoundsException.class)
    															 .hasMessageContaining("String index out of range: 3");
    }
    
    @Test
    @DisplayName("charAt() 사용 시 전체 index를 초과하는 호출 시 StringIndexOutOfBoundsException 발생2")
    void charAtException2() {
    	// given
    	String str = "abc";
    	int index = 3;
    	
    	// when & then
    	Assertions.assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(() -> {str.charAt(index);})
    																		 .withMessageMatching("String index out of range: \\d+");
    }
    
}
