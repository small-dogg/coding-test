package codingtest.leetcode;

public class GoalParserInterpretation {
    public String interpret(String command) {
        return  command.replaceAll("\\(\\)", "o").replaceAll("\\(al\\)", "al");
    }
}
