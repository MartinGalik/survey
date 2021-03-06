package survey.backend.entities;

import java.util.HashMap;
import java.util.Set;

/**
 * Class Question represents question of survey
 * @author Peter Petkanic
 */
public class Question {
        
    private int qid;
    private String description;
    private QuestionType questionType;
    private HashMap<Integer, String> answers = new HashMap<>();
    
    public Question(int qid, String description, QuestionType qt) {
        this.qid = qid;
        this.description = description;
        this.questionType = qt;
    }
    
    public int getAnswerSize(){
        return answers.size();
    }
    
    /**
     * Adds or updates answer
     * @param aid ID of answer
     * @param text answer string
     */
    public void addAnswer(int aid, String text) {
        answers.put(aid, text);
    }
     
    /**
     * Returns Set of answer IDs of question
     * @return set of answer IDs
     */
    public Set<Integer> getAnswerIDs() {
        return answers.keySet();
    }

    public String getAnswer(int aid) {
        return answers.get(aid);
    }

    public int getQid() {
        return qid;
    }

    public String getDescription() {
        return description;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public HashMap<Integer, String> getAnswers() {
        return answers;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public void setAnswers(HashMap<Integer, String> answers) {
        this.answers = answers;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }
    
    
    
}

 