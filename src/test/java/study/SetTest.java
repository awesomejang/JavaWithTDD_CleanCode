package study;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SetTest {
	private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }
    
    @Test
    void size() {
    	//given
    	int size = 3;
    	
    	//when & then
    	assertThat(numbers.size()).isEqualTo(size);
    }
    
    @ParameterizedTest
    @ValueSource(ints = {1,2,3}) // 매개변수에 순차적으로 주입
    //@Test
    void contains(int target) {
    	assertThat(numbers.contains(target)).isTrue();
    }
    
    @ParameterizedTest
    @CsvSource(value = {"1:True", "2:True", "3:True", "4:False", "5:False"}, delimiter = ':') // 입력값과 예상값을 동시에 테스트할때에 사용 
    void contains2(int index, boolean expected) { // 자동 형변환
    	assertEquals(numbers.contains(index), expected);
    }
    
    
    
}
