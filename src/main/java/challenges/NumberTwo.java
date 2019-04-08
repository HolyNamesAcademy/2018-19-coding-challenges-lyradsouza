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

        int small, med, large;
        if(a>=b && a>=c) {
            large = a;
            if(b>c) {
                med = b;
                small = c;
            }
            else{
                med=c;
                small=b;
            }
        }
        else  if(b>=a && b>=c) {
            large = b;
            if (a > c) {
                med = a;
                small = c;
            } else {
                med = a;
                small = b;
            }
        }
        else{
            large=c;
            if(a>b) {
                med = a;
                small = b;
            }
            else{
                med=b;
                small=a;
            }
        }

        if(large-med==med-small) {
            return true;
        }
        return false;

    }

}

