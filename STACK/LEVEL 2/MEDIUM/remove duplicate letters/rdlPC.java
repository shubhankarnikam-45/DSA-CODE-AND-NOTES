class Solution {
    public String removeDuplicateLetters(String s) {
        
        //creting stack to do operation.
        Stack<Character>st=new Stack<>();

        //frequency array to store the frequency.
        int freq[]=new int[26];

        //finding frequency.
        for(int i=0;i<s.length();i++)
        {
            //current char
            char ch=s.charAt(i);

            freq[ch-'a']++;
        }

        //creating boolena array which holds the this extis or not.
        //by defaulut it contains 'false'
        boolean exists[]=new boolean[26];

        //traverse
        for(int i=0;i<s.length();i++)
        {
            //current char 
            char ch=s.charAt(i);

            //first we decrase the count of character.
            freq[ch-'a']--;

            //if this exits in boolean array then we just continue.
            if(exists[ch-'a'])
            {
                continue;
            }

            while(st.size()>0 && ch<st.peek() && freq[st.peek()-'a']>0)
            {
                //first condition ==> for stack contains element or not.
                //2nd condition ==> we check that current char is less than the peek() element or not.
                //3rd condition ==> herer we check the stack element is present is later or not.


                //and mark it as flase in the 'exists' array.
                exists[st.peek()-'a']=false;
                //if all this condition is meet we just pop() the element.
                st.pop();

               
            }


            //after all this we just push the element.

            //this we push when the before this element is not present.
            
                st.push(ch);
                exists[ch-'a']=true;
            
        
        }


        //now we want to answer in the form of the string hence we pop() the element from the stack.

        //creaing char array of size stack.
        char ans[]=new char[st.size()];

        //treaverse;
        for(int i=ans.length-1;i>=0;i--)
        {
            ans[i]=st.pop();
        }


        //return in the form of the stack.
        return new String(ans);


    }
}