/**
 * 
 */
package _01_double._2_test_scores;

import javax.swing.JOptionPane;

/**
 * @author league
 *
 */
public class poiuytrewqasdfghjklmnbvcxz {

	/**
	 * 
	 */
	public poiuytrewqasdfghjklmnbvcxz() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pop= JOptionPane.showInputDialog("What was test score of your latest test??????????????????????????????????????????????????????????????????????????//");
	int op= Integer.parseInt(pop);
	double grade=  op;
	if(grade>100) {
		JOptionPane.showMessageDialog(null, "당신은 오랫동안 공부했지만 여전히 자랑스럽지 않습니다");
	}
	if(grade<=100&&grade>=90) {
		JOptionPane.showMessageDialog(null, "you must have got studied hard and understand the wrath of the broom stick");
	}
	if(grade<=89&&grade>=80) {
		JOptionPane.showMessageDialog(null, "Need a brainwork out just a little more effort and you will be the prize star");
	}
	if(grade<=79&&grade>=70) {
		JOptionPane.showMessageDialog(null, "must have been depressed or worry about something else come to think about it if you are sad call this number 619-283-9874");
	}
	if(grade<=69&&grade>=60) {
		JOptionPane.showMessageDialog(null, "Just getting by or youre trying your best  but you can not go further");
	}
	if(grade<=59&&grade>=1) {
		JOptionPane.showMessageDialog(null, "part of a gang or something but how could you go that low???? i mean even if you do all the classwork and no homework and 50% on test you should probaly get a D+ or so you are a disgraced");
	}
	if(grade<=0&&grade>=-999999999) {
		JOptionPane.showMessageDialog(null, "tell you what if you have a zero what did you even did????!!?!??! Not only that if youre percent is in the negative did you killed somebody??? I dont know how you were able to go this low");
	}
	}

}
