public class TryCatchExa
    {
        public static void main(String[] args)
        {
            System.out.println("111");
            try
            {
                System.out.println("222");
                int y = 1/0;
            }
            catch(ArithmeticException e)
            {
                try
                {
                    System.out.println("Hello");
                    int x = 20/0;
                }
                catch(NullPointerException np)
                {
                    System.out.println("333");
                }
            }
            System.out.println("444");
        }
    }

//Output is-
//        111
//        222
//        Hello
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at TryCatchExa.main(TryCatchExa.java:16)
