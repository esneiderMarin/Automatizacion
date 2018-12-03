package com.viajesexito.certification.purchase.utils;

import net.sourceforge.htmlunit.corejs.javascript.ast.SwitchCase;

public class IgnoreTilde {

	public static String convertTilde(String word) {
		String concatWord = "";
		for (int i = 0; i < word.length(); i++) {
			
			switch (word.charAt(i)) {
			case '�':
				if(i > (word.length()/2))
				{
					return concatWord;
				}
				break;
			case 'á':

				break;
			case 'é':

				break;
			case 'ó':

				break;
			case 'ú':

				break;

			default:
				concatWord = concatWord + String.valueOf(word.charAt(i));
				
			}
		}
		return concatWord;		
	}
}
