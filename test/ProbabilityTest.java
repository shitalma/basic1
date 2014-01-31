import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ProbabilityTest {
    @Test
    public void testForProbability() {
        Probability probability = new Probability(0.5);
        assertEquals(0.5, probability.getProbabilityValue());
    }

    @Test
    public void testForGettingInverseProbability() {
        Probability probability = new Probability(0.75);
        Probability inverseProbability = probability.getInverseProbability();
        assertEquals(0.25, inverseProbability.getProbabilityValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForThrowingExceptionWhileProbabilityIsNotValid() {
        Probability probability = new Probability(75);
        probability.getProbabilityValue();
    }

    @Test
    public void testForReusingConstructure() {
        Probability actual = new Probability(1d, 2d);
        Probability expected = new Probability(0.5);

        assertEquals(expected, actual);
    }

    @Test
    public void testProbabilityForTwoDice() {
        Probability first = new Probability(1d, 6d);

        Probability actual = first.getAndProbability(new Probability(1d, 6d));
        Probability expected = new Probability(1d / 36d);

        assertEquals(expected, actual);
    }

    @Test
    public void testProbabilityForOrOperationOfTwoDice() {
        Probability first = new Probability(1d, 6d);

        Probability actual = first.getOrProbability(new Probability(1d, 6d));
        Probability expected = new Probability(0.3055555555555555);

        assertEquals(expected, actual);
    }

    @Test
    public void testProbabilityForXOROperationOfTwoDice() {
        Probability first = new Probability(1d, 2d);

        Probability actual = first.getXORProbability(new Probability(1d, 2d));
        Probability expected = new Probability(2d/4d);

        assertEquals(expected, actual);
    }
}
