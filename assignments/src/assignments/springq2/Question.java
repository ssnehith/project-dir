package assignments;

import java.util.List;
import java.util.Map;
import java.util.Set;
public class Question {
	private  String questionId;
	private String question;
	private String answers;
	private List<String> a1;
	private Set<String> a2;
	private Map<Integer, String> a3;
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswers() {
		return answers;
	}
	public void setAnswers(String answers) {
		this.answers = answers;
	}
	public List<String> getA1() {
		return a1;
	}
	public void setA1(List<String> a1) {
		this.a1 = a1;
	}
	public Set<String> getA2() {
		return a2;
	}
	public void setA2(Set<String> a2) {
		this.a2 = a2;
	}
	public Map<Integer, String> getA3() {
		return a3;
	}
	public void setA3(Map<Integer, String> a3) {
		this.a3 = a3;
	}
	@Override
	public String toString() {
		return "\nquestionId=" + questionId + "\nquestion=" + question + "\nanswers=" + answers+"\nanswer1=" + a1+ "\nanswer2=" + a2 + "\nanswer3=" + a3;
	}
}
