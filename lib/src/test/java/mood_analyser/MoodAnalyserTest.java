package mood_analyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	// Test case to analyze sad mood of the user
	@Test
    public void givenMessage_WhenProper_ShouldReturnSad() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        //moodAnalyser.setMessage("I am in Sad Mood");
        String actualResult = MoodAnalyser.analyseMood();
        Assert.assertEquals("Sad", actualResult);
    }

    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy Mood");
        String actualResult = MoodAnalyser.analyseMood();
        Assert.assertEquals("Happy", actualResult);
    }

    @Test
    public void givenMessage_Null_ShouldReturnMessage() throws MoodAnalysisException {
        MoodAnalyser moodanalyser = new MoodAnalyser(null);
        try {
            String actualResult = MoodAnalyser.analyseMood();
            Assert.assertEquals("Entered Invalid Mood ", actualResult);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
}

