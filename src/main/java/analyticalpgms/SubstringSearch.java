package analyticalpgms;

//Problem name haystack and needle
//Find the index of the first occurrence of `needle` inside `haystack`, and return that index, or -1 if `needle` does not appear anywhere.
//If needle is empty, return 0, since an empty string is considered to occur at position 0.
public class SubstringSearch {
    public int findSubstring(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int range_to_check = haystack.length() - needle.length();
        for(int i = 0; i <= range_to_check; i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        SubstringSearch ss = new SubstringSearch();
        int index_no_1=ss.findSubstring("sadassad","sad");
        System.out.println("STring sad is found in haystack sadassad in the index " + index_no_1);
        int index_no_2=ss.findSubstring("leetcode","leeto");
        System.out.println("STring leet is found in haystack leetocode in the index " + index_no_2);
        int index_no_3=ss.findSubstring("sadassad","xyz");
        System.out.println("STring xyz is found in haystack sadassad in the index " + index_no_3);
        int index_no_4=ss.findSubstring("xyzasdsad","sad");
        System.out.println("STring sad is found in haystack xyzasdsad in the index " + index_no_4);
    }
}
