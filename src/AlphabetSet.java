public class AlphabetSet {
    private String alphabets;

    //TODO:enum
    public AlphabetSet(String alphabets) {
        this.alphabets = alphabets;
    }

    public boolean isValidAlphabet(String[] machineString) {
        boolean isValid = false;
        for (String s : machineString) {
            isValid = alphabets.contains(s);
        }
        return isValid;
    }
}
