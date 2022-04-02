package practice;

public class ReverseAString {
	
	
	public static void reverse(String s) {
		int i = s.length()-1;
		String ans = "";
		
		
		while(i>=0) {
			
			while(i>=0 && s.charAt(i)==' ') {
				i--;
			}	
			
			int j = i;
			
			if(i<0) break;
			
			while(i>=0 && s.charAt(i)!=' ' ) {
				i--;
			}	
			 
			if(ans.isEmpty()) {
				ans=ans.concat(s.substring(i+1,j+1));
			}else {
				ans = ans.concat(" "+s.substring(i+1,j+1));
			}
			
			
			
		}
		System.out.println(ans);
		
	}

	public static void main(String[] args) {
		
		String a = "The sky is blue";
		reverse("fsfsd fsfsf fsfsf  ");		

	}

}
