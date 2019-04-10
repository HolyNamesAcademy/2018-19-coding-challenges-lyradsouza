package challenges;

public class NumberThree {

    /**
     * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
     *
     * Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
     * Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
     *
     * The method should return a new string representing the input time in 24 hour format.
     *
     * timeConversion has the following parameter(s):
     *
     * Example:
     * s: 07:05:45AM
     * return: 07:05:45
     *
     * Example:
     * s: 07:05:45PM
     * return: 19:05:45
     *
     * @param s a string representing time in 12 hour format
     * @return the string s in 24 hour format
     */
    public String timeConversion(String s) {
        String time="";
        int mil;
        if(s.substring(8)=="PM"){
            if(s.substring(0,2).equals("12")) {
                time =s.substring(0, 8);
            }
            else{
                mil=Integer.parseInt(s.substring(0,2));
                mil+=12;
                time=mil+s.substring(2);
                }
            }
        else
            if(s.substring(0,2).equals("12")){
                time="00"+s.substring(2);
            }
            else {
                time = s.substring(0,8);
            }
      return time;
    }
}
