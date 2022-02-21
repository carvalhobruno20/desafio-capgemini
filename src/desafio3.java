public class desafio3 {
    public static void main(String[] args) {
        String str = "ovo";

        countSubString(str);
    }
    static void countSubString(String s)
    {

        int res = 0;

        for (int i = 0; i < s.length(); i++)
        {
            int x = 0;
            for (int j = i; j < s.length(); j++)
            {
                int temp = 1 << s.charAt(j) - 'a';

                x ^= temp;
                if ((x & (x - 1)) == 0)
                    res++;
            }
        }
        System.out.print(res);
    }
}
