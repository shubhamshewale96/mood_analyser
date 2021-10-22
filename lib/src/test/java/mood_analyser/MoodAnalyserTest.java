package mood_analyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	// Test case to analyze sad mood of the user
    @Test
    public void givenMessageWhenProperShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("i am in sad mood");
        String actualResult = MoodAnalyser.analyseMood();
        Assert.assertEquals("Sad", actualResult);
    }
    @Test
    public void givenMessageContainsAnyInitShouldReturnHappy() {
        MoodAnalyser moodanalyser = new MoodAnalyser("I am in Any Mood");
        String actualResult = MoodAnalyser.analyseMood();
        Assert.assertEquals("Happy", actualResult);
    }
    @Test
    public void givenMessage_Null_ShouldReturnHappy() {
        MoodAnalyser moodanalyser = new MoodAnalyser(null);
        String actualResult = MoodAnalyser.analyseMood();
        Assert.assertEquals("Happy", actualResult);
    }
}

