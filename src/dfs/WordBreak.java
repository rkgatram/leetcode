package dfs;

import java.util.Set;

/**
Given a string s and a dictionary of words dict, 
determine if s can be segmented into a space-separated sequence of one or more dictionary words.

For example, given
s = "leetcode",
dict = ["leet", "code"].

Return true because "leetcode" can be segmented as "leet code". 
 */
public class WordBreak
{
    public boolean wordBreak( String s, Set<String> wordDict )
    {
    	boolean[] canBreak = new boolean[s.length( )];
    	for ( int i = 0; i < s.length( ); i++ )
    	{
    		for ( int j = 0; j < i; j++ )
    		{
    			if ( canBreak[j] 
    					&& wordDict.contains( s.substring( j+1, i+1 ) ))
    			{
    				canBreak[i] = true;
    			}
    		}
    	}
    	
    	return canBreak[s.length( )-1];
    }
}