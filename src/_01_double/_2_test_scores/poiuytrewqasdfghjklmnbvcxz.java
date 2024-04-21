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
	if(grade>=100) {
		JOptionPane.showMessageDialog(null, "당신은 오랫동안 공부했지만 여전히 자랑스럽지 않습니다");
	}
	if(grade<=100&&grade>=90) {
		JOptionPane.showMessageDialog(null, "you must have got studied hard and understand the wrath of the broom stick");
	}
	
	}

}
