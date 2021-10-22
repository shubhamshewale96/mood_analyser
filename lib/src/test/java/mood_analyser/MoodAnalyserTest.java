package mood_analyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	// Test case to analyze sad mood of the user
    @Test
    public void givenMessageWhenProperShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String actualResult = MoodAnalyser.analyseMood("i am in sad mood");
        Assert.assertEquals("Sad", actualResult);
    }
}
