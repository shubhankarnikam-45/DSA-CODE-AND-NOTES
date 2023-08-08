
//before this quetion i solving using BRUTE FORCE STYLE but this optizied version.
//so to learn dry run.

public static int multiply(int n, int m) {
    //if(n<m) then SWAP
    //here due to swaping first number always BIGGER and SECOND number is always SMALL.
    //due to this our SPACE COMPLEXITY Enhance.
    if (n < m)
      return multiply(m, n);
    else if (m != 0)
      return (n + multiply(n, m - 1));
    else
      return 0;
  }