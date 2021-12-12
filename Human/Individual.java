package Human;

public class Individual {
    private final int len = 6;
    private char[] genes;
    private double fitness;

    public Individual() {
        genes = new char[len];
        for (int i = 0; i < len; i++) {
            genes[i] = new DNA<Character>((char) ((int) (Math.random() * (122 - 97 + 1)) + 97)).getGene();

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
    }

    public char[] getGenes() {
        return genes;
    }

    public double getFitness() {
        return fitness;
    }

    @Override
    public String toString() {
        return new String(genes);
    }

}
