
public class LongestPalindromicSubstring 
{ 

	static int LPS(String str) { 
		int n = str.length(); 

		boolean dp[][] = new boolean[n][n]; 

		int max = 1; 
		for (int i = 0; i < n; ++i) 
			dp[i][i] = true; 

		int start = 0; 
		for (int i = 0; i < n - 1; ++i) { 
			if (str.charAt(i) == str.charAt(i + 1)) { 
				dp[i][i + 1] = true; 
				start = i; 
				max = 2; 
			} 
		} 
		
		for (int k = 3; k <= n; ++k) { 
			
			for (int i = 0; i < n - k + 1; ++i) 
			{ 
				int j = i + k - 1; 

				if (dp[i + 1][j - 1] && str.charAt(i) == str.charAt(j)) { 
					dp[i][j] = true; 

					if (k > max) { 
						start = i; 
						max = k; 
					} 
				} 
			} 
		} 
		System.out.println(str.substring(start, start + max)); 
		
		return max; 
	} 

	public static void main(String[] args) { 

		String str = "abcdba"; 
		System.out.println(LPS(str)); 
	} 
} 
