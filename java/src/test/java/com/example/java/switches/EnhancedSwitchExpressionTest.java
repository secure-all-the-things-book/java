package com.example.java.switches;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EnhancedSwitchExpressionTest {

	@Test
	void switchExpression() {
		Assertions.assertEquals("that's wonderful.", respondToEmotionalState(Emotion.HAPPY));
		Assertions.assertEquals("I'm so sorry to hear that.", respondToEmotionalState(Emotion.SAD));
	}

	private String respondToEmotionalState(Emotion emotion) { // <1>
		return switch (emotion) {
			case HAPPY -> "that's wonderful.";
			case SAD -> "I'm so sorry to hear that.";
		};
	}

	enum Emotion {

		HAPPY, SAD;

	}

}
