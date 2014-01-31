public class Probability {
    private double probability;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Probability)) return false;

        Probability that = (Probability) o;

        if (Double.compare(that.probability, probability) != 0) return false;

        return true;
    }

    public Probability(double probability) {
        if (probability > 1 || probability < 0) throw new IllegalArgumentException("Probability is not valid");
        this.probability = probability;
    }

    public Probability(double a, double b) {
        this(a / b);
    }

    public double getProbabilityValue() {
        return this.probability;
    }

    public Probability getInverseProbability() {
        return new Probability(1 - this.probability);
    }

    public Probability getAndProbability(Probability second) {
        return new Probability(this.probability * second.probability);
    }

    public Probability getOrProbability(Probability second) {
       return new Probability((this.probability + second.probability)-(this.getAndProbability(second).getProbabilityValue()));
    }

    public Probability getXORProbability(Probability second) {
        return new Probability((this.getOrProbability(second).getProbabilityValue()) - (this.getAndProbability(second).getProbabilityValue()));
    }
}