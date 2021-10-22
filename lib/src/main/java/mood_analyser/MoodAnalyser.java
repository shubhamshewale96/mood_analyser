package mood_analyser;

public class MoodAnalyser {
	public static String message;

	public MoodAnalyser() {
	}

	// Constructor
	public MoodAnalyser(String message) throws MoodAnalysisException {
		MoodAnalyser.message = message;
		analyseMood();
	}

	// Getter
	public String getMessage() {
		return message;
	}

	// Setter
	public void setMessage(String message) {
		MoodAnalyser.message = message;
	}

	public static String analyseMood() throws MoodAnalysisException {
		try {
			if (message.toLowerCase().contains("sad")) {
				return "Sad";
			} else {
				return "Happy";
			}
		} catch (NullPointerException e) {
			throw new MoodAnalysisException("Entered Invalid mood");
		}
	}
}
