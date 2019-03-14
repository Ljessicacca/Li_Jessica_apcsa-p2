//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.ArrayList;
import java.util.Arrays;

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int numerator; 
	private int denominator; 

	//write two constructors
	public Rational()
	{
		this.setRational(0,1);
	}
	
	public Rational(int x, int y)
	{
		this.setRational(x, y);
	}

	//write a setRational method
	public void setRational(int one, int two)
	{
		setNum(one);
		setDen(two);
	}

	//write  a set method for numerator and denominator :( 
	private void setNum(int one)
	{
		numerator= one;
	}
	
	private void setDen(int one)
	{
		denominator = one; 
	}
	
	public void add(Rational  other) //second fraction
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		numerator = numerator * other.getDenominator() + other.getDenominator() * denominator; 
		denominator = denominator * other.getDenominator();

		reduce();
	}

	private void reduce()
	{
		int gcd = gcd(numerator, denominator);
		numerator /= gcd;
		denominator /= gcd;

	}

	private int gcd(int numOne, int numTwo)
	{
		int maximum = 0;
		for (int i = 1; i < numOne; i++)
		{
			if (numOne%i == 0 && numTwo%i == 0)
			{
				maximum = i;
			}
		}

		return maximum;
	}

	public Object clone () //clones object that is referred to 
	{
		return this;
	}

	//ACCESSORS

	//write get methods for numerator and denominator
	
	public int getNumerator()
	{
		return numerator;
	}
	
	public int getDenominator()
	{
		return denominator;
	}
	
	
	public boolean equals(Object obj)
	{
		if (numerator == ((Rational)obj).getNumerator() && denominator == ((Rational)obj).getDenominator())
		//object must be cast as type Rational 
		//compares two fractions: current class vs second object within class Rational 
		{
			return true;
		}
		return false;
	}

	public int compareTo(Rational other)
	{
		double one = (double)numerator/denominator; 
		double two = (double)other.getNumerator()/other.getDenominator();
		if (one > two)
		{
			return 1;
		}
		return -1;
	}



	
	//write  toString() method
	
	public String toString()
	
	{
		return numerator + "/" + denominator;
	}
}