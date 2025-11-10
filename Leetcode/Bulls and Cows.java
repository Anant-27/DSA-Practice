class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character, Integer> freq=new HashMap<>();
        for(int i=0;i<secret.length();i++)
        {
            freq.put(secret.charAt(i), freq.getOrDefault(secret.charAt(i), 0)+1);
        }
        int bulls=0;
        int cows=0;
        for(int i=0;i<guess.length();i++)
        {
            if(guess.charAt(i)==secret.charAt(i))
            {
                bulls++;
                int curs=freq.get(secret.charAt(i));
                if(curs==1)
                {
                    freq.remove(secret.charAt(i));
                }
                else
                {
                    freq.put(secret.charAt(i), freq.get(secret.charAt(i))-1);
                }
            }
        }
        for(int i=0;i<guess.length();i++)
        {
            
            if(guess.charAt(i)!=secret.charAt(i))
            {
                if(freq.containsKey(guess.charAt(i)))
                {
                    cows++;
                    int curg=freq.get(guess.charAt(i));
                    if(curg==1)
                    {
                        freq.remove(guess.charAt(i));
                    }
                    else
                    {
                        freq.put(guess.charAt(i), freq.get(guess.charAt(i))-1);
                    }
                }
            }
        }
        return bulls+"A"+cows+"B";
    }
}
