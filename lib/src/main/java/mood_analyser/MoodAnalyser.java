package mood_analyser;

public class MoodAnalyser {
	public static String message;

    // Constructor
    public MoodAnalyser(String message) {
        MoodAnalyser.message = message;
        analyseMood();
    }

    //Getter
    public String getMessage() {
        return message;
    }

    //Setter
    public void setMessage(String message) {
        MoodAnalyser.message = message;
    }

    public static String analyseMood() {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        } catch (NullPointerException e) {
            return "Happy";
        }
    }
}
