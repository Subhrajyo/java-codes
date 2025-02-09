
public class pelindrome {
    public void str_pelindrome() {
        String str = "hkhjh";
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        String s1 = sb.toString();
        if (str.equals(s1)) {
            System.out.println("yes");
        }
    }

    public static void main(String[] args) {
        pelindrome p1 = new pelindrome();
        p1.str_pelindrome();
        int num = 121;
        int temp, r;
        int rev = 0;
        temp = num;
        while (num > 0) {
            r = num % 10;
            rev = (rev * 10) + r;
            num = num / 10;

        }
        if (temp == rev) {
            System.out.println("pelindrome");
        } else {
            System.out.println(" not pelindrome");
        }

    }

}
