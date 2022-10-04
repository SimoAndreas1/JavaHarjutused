package simo_harjutused;

public class SimoKT_8 {

	public static void main(String[] args) {
        String str = "Tervist Mario! ulesanne tootab vist.";
        String rev = tagurpidi(str);
        System.out.println(rev);
  }

    public static String tagurpidi(String s) {
    int x = s.indexOf(" ");
    
    if(x == -1)
      return s;
      
    return tagurpidi(s.substring(x+1)) +" "+ s.substring(0, x);
     }
}
