/**
 * 
 */
package edu.csbsju.cs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author atseefeldt
 *
 */
public class SimplePrint implements ActionListener {
	
	private String name;
	private int age;

	/**
	 * 
	 */
	public SimplePrint() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param age
	 */
	public SimplePrint(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hey it's Alex Seefeldt");
		for(int i=0; i<args.length;i++){
			System.out.println("args[" + i + "] = " + args[i] );
		}
	}

}
