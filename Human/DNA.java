package Human;

public class DNA {
    public final int len = 6;
    public char[] genes = new char[len];
    public double fitness;

    public DNA() {
        for (int i = 0; i < len; i++) {
            genes[i] = (char) ((int) (Math.random() * (122 - 97 + 1)) + 97);
        }
    }

    public void calculateFitness(String target) {
        int score = 0;

        for (int i = 0; i < genes.length; i++) {
            if (genes[i] == target.charAt(i)) {
                score++;
            }
        }

        fitness = (double) score / target.length();
        // System.out.println(fitness);
    }

    public String getWord() {
        return new String(genes);
    }

}
