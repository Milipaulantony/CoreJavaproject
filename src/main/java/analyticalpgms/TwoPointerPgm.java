package analyticalpgms;

public class TwoPointerPgm {
    public boolean isSubSequence(String sub_string, String fullstring) {
        int i=0;

        for(char ch : fullstring.toCharArray()) {
            if(i < sub_string.length() && sub_string.charAt(i) == ch) {
                i++;
            }
        }
        //if(i == sub_string.length()) {return true;}
        //else return false;
        return i == sub_string.length();
    }

    public static void main(String[] args) {
        TwoPointerPgm tp = new TwoPointerPgm();
        System.out.println(tp.isSubSequence("adf", "abcdef"));
    }
}
