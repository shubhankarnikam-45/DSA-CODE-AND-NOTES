

//this i solved on leetcode when i see the lecture of 'PEPCODING'.
// but before that i solve this quetion.
//here imp. thing is EXPECTATIN & FAITH.
//after knowing the code is simple by own.


class Solution {

    //declaring array of 'digits to letters.'
    String arrayOfLetters[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
        

        
        //base case.
        //digits.length() is 0 that means our string empty.
        //now we return ArrayList with empty string in it.
        if(digits.length()==0)
        {
            List<String>al=new ArrayList<>();
            al.add("");
            return al;
        }
        //suppose digits--> "567"
        //first digit --> "5"
        char firstDigit=digits.charAt(0);   //1

        //second digit to be pass is "67"
        String secondDigitToBePass=digits.substring(1);       //2

        //recursive call.
        List<String>rresult=letterCombinations(secondDigitToBePass);   //3

        //ArrayList to store the final result.
        ArrayList<String>result=new ArrayList<>();       //4

        //now we got the result from the recursive call.(rresult).
        //now we assing to the 'result'.    
        
            String reqStr=arrayOfLetters[firstDigit-'0'-2];
            for(int i=0;i<reqStr.length();i++)
            {
                for(String val:rresult)
                {
                    result.add(reqStr.charAt(i)+val);
                }
                 
            }
           
        

        //returing the result.
        return result;

    }
}