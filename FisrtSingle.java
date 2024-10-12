class FirstSingle{
    char ch;
  public void Count( String str)
  {
   
    int Arr[]=new int[26];
    for(int i=0; i<26; i++)
    {
        Arr[i]=0;
    }
    for(int j=0; j<str.length(); j++)
    {      ch=str.charAt(j);
           int a=(int)(ch)-(int)('a');
           Arr[a]++;
    }
      for(int k=0; k<str.length(); k++)
    {     ch=str.charAt(k);
        if(Arr[(int)(ch)-(int)('a')]==1)
        {
            System.out.println("The found  element is "+ch);
            break;
        }
           if(k==str.length()-1)
        {
            System.out.println("Element does not found who is repeating once  ");
        }     
    }
  } public static void main(String[] args) {
        String str="adobaaa";
        FirstSingle F=new FirstSingle();
        F.Count(str);    }
}