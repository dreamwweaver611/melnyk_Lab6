package Lab_6;

import java.util.StringJoiner;
public class Lab6 {

    public static void main (String[] args){
        int arr1 = 511;

        System.out.print(intToOctString(arr1));

        System.out.print('\n');

        System.out.print(wordsToUppercase());
    }
    private static String intToOctString(int value) {
        if (value == 0) {
            return "0";
        }

        int absValue = Math.abs(value);
        int octalnum = 0;

        int cnt = 0;
        while (absValue > 0) {
            int remainder = absValue % 8;
            absValue /= 8;
            octalnum = remainder*((int)Math.pow(10, cnt))+octalnum;
            cnt++;
        }

        if (value < 0) {
            octalnum*=-1;
        }
        String result = Integer.toString(octalnum);
        return result;
    }
    private static String wordsToUppercase() {
        String arr = "The user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago";
        String[] ans = arr.split(" ");
        for(int i = 0; i<ans.length; i++)
        {
            boolean check = false;

            for(int j = 0; j<ans[i].length(); j++)
            {
                check = ans[i].matches("[a-zA-Z]+");;
            }

            if(check){
                ans[i] = ans[i].toUpperCase();
            }

        }

        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i<ans.length; i++) {
            sj.add(ans[i]);
        }


        String result  = sj.toString();
        return result;
    }
}


