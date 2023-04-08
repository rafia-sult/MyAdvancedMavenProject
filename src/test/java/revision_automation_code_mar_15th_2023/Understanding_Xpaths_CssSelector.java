package revision_automation_code_mar_15th_2023;

public class Understanding_Xpaths_CssSelector {

	public static void main(String[] args) {

		/*
		 * XPATH
		 * //html[@attribute = 'value'] //html[@attribute1 = 'value' or @attribute2 =
		 * 'value'] 
		 * //html[@attribute1 = 'value' and @attribute2 = 'value']
		 * //html[text()='value'] 
		 * //html[contains(text(), 'value')]
		 * //html[contains(@attribute, 'value')] //html[start-with(@attribute, 'value')]
		 * //html[ends-with(@attribute, 'value')]
		 */

		/*
		 * Dynamic/Customized/Relative Xpath
		 * 
		 * - following 
		 * - preceding 
		 * - following-sibling 
		 * - preceding-sibling 
		 * - parent 
		 * - child 
		 * - ancestor
		 * - descendant
		 * 
		 * 
		 * to understand these xpath you have to know about html family, how to traverse
		 * within the DOM
		 * top to bottom or bottom to top 
		 * 
		 * why we do traversing? 
		 * how to select the root node? 
		 * how many web elements can we consider during traverse 
		 */
		
		
		/*
		 * CSSSELECTOR
		 * html[attribute = value] 
		 * html.className
		 * .className 
		 * html.className1.className2.className3
		 */

	}

}
