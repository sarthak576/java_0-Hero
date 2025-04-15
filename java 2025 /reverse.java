class reverse{
  
  public static String rev(String s){
    String reversed ="";
    for (int i=s.length()-1;i>=0;i--){
        reversed +=s.charAt(i);
    }
    return reversed;
  }

    public static void main(String [] args){
System.out.println(rev(("gupta...")));
    }
}