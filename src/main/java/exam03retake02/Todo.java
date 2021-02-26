package exam03retake02;

public class Todo {

    private String text;
    private State state;
    private int priority;

    public Todo(String text, int priority) {
        this.text = text;
        this.priority = priority;
    }

    public String getText() {
        return text;
    }

    public State getState() {
        return state;
    }

    public int getPriority() {
        return priority;
    }


    public void complete() {
        state = State.COMPLETED;
    }

    public void check() {
        if (getPriority() < 1 || getPriority() > 5) {
            throw new IllegalArgumentException ("Invalid");
        }
    }
}


