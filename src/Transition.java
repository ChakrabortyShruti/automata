import java.util.HashMap;

public class Transition {
    private HashMap<String, HashMap<String, String>> transitionTable = new HashMap<>();

    public void set(String startState, String alphabet, String goalState) {
        transitionTable.putIfAbsent(startState, new HashMap<>());
        transitionTable.get(startState).put(alphabet, goalState);
    }

    public HashMap getTransitons() {
        return transitionTable;
    }

    @Override
    public String toString() {
        return "Transition{" +
                "transitionTable=" + transitionTable +
                '}';
    }
}
