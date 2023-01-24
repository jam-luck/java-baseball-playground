package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InputValidationTest {
	@Test
	@DisplayName("숫자검증")
	void 숫자검증() {
		
		assertThat(InputValidation.validNum(9)).isTrue();
		assertThat(InputValidation.validNum(1)).isTrue();
		assertThat(InputValidation.validNum(0)).isFalse();
		assertThat(InputValidation.validNum(10)).isFalse();
	}
}
