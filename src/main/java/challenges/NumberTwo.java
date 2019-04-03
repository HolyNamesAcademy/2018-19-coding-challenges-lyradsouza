package challenges;

public class NumberTwo {

    /**
     * Given three numbers, a, b, and c, one is small, one is medium, and one is large. Return
     * true if the three values are evenly spaced, meaning the difference between the small and
     * the medium is the same as the difference between the medium and the large.
     * <p>
     * Example:
     * Given a = 2, b = 4, c = 6
     * Return true
     * <p>
     * Example:
     * Given a = 4, b = 6, c = 2
     * Return true
     * <p>
     * Example:
     * Given a = 5, b = 6, c = 3
     * Return false
     *
     * @return true if the numbers are evenly spaced, otherwise false
     */
    public boolean evenlySpaced(int a, int b, int c) {

        //put them in order then test

        



        if (Math.abs(b-a) == Math.abs(b-c)){
                return true;

        }

        else if (Math.abs(a-b)==Math.abs(a-c)){
                return true;


        } else if (Math.abs(c-b) == Math.abs(c-a)) {
                return true;
            }

        return false;

    }

}

