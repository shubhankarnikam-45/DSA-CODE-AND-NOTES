

//here focus on menu diven fn
//i include the main() function because of i first time solving arraylist in recursion.
//this is for learning quetion.
//i don't use my approach i only learn how to approach from PEPCODING.

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    ArrayList< String> res = gss(str);
    System.out.println(res);
  }

  //bc ->  [ --,-c ,b-, bc ]
  //abc->  [ ---,--c, -b-, -bc, a--,ab-,abc]

  public static ArrayList< String> gss(String str) {
    if (str.length() == 0) {
      ArrayList< String> bres = new ArrayList< >();           //1
      bres.add("");
      return base;
    }
    char ch = str.charAt(0);                                      //2
    String ros = str.substring(1);                                //3

    ArrayList< String> rres = gss(ros);                            //4
    ArrayList< String> mres = new ArrayList< >();                   //5
    for (String val : rres) {
      mres.add("" + val);                                       //6
    }
    for (String val : rres) {
      mres.add(ch + val);                                       //7
    }

    return mres;                                                  //8
  }

}