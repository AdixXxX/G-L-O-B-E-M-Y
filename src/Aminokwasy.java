public class Aminokwasy
{
    boolean changePossible(String s1, String s2)
    {
        int counter = 0;

        char[] s2tab = s2.toCharArray();

        String sb1 = s1;
        String sb2 = s2;

        char temp2;

        for (int i = 0; i <sb1.length() ; i++)
        {
            if(sb1.charAt(i) != sb2.charAt(i) && counter< 2)
            {
                for (int j = i; j < sb1.length() ; j++)
                {
                    if(sb1.charAt(i) == sb2.charAt(j) && counter < 2)
                    {

                        temp2 = s2tab[i];
                        s2tab[i] = s2tab[j];
                        s2tab[j] = temp2;
                        counter++;

                        sb2 = String.valueOf(s2tab);
                        System.out.println(counter);
                        System.out.println(sb1);
                        System.out.println(sb2);
                    }
                }
            }
        }


        if(sb1.equals(sb2))
        {
            System.out.println("TRUE");

            return true;
        }
        else
        {
            System.out.println("cos tu nie gra");
            return false;
        }

    }

}
