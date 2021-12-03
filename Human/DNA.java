package Human;

public class DNA {
    public final int len = 5;
    public char[] genes = new char[len];
    public double fitness;

    public DNA() {
        for (int i = 0; i < len; i++) {
            genes[i] = (char) ((int) (Math.random() * (122 - 97 + 1)) + 97);
        }
    }

    public void calculateFitness(String target) {
        int score = 0;
        for (int i = 0; i < target.length(); i++) {
            char ch = target.charAt(i);
            for (int j = 0; j < genes.length; j++) {
                if (genes[j] == ch) {
                    score++;
                }
            }
        }
        fitness = (double) score / target.length();
    }

}
