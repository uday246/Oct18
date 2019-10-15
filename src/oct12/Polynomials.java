package oct12;

import java.util.ArrayList;
import java.util.List;

public class Polynomials
{
private List<Polynomial> P;
// Creates an empty list of polynomials
public Polynomials ( )
{
	P = new ArrayList<>();
}
// Retrieves the polynomial stored at position i-1 in the list
public Polynomial Retrieve (int i)
{
	return P.get(i);
}
// Inserts polynomial p into the list of polynomials ordered by degree
public void Insert (Polynomial p)
{  
	P.add(p);
}
// Deletes the polynomial at index i-1
public void Delete (int i)
{
	P.remove(i);
}
// Prints out the list of polynomials (beginning with polynomial 1)
public void Print ( )
{  
	for(Polynomial p:P){
		System.out.println(p);
	}
}
}

class Polynomial {
	protected double[] coeffs;

	public Polynomial(double[] coefficients) {
		coeffs = new double[coefficients.length];
		for (int i = 0; i < coeffs.length; i++)
			coeffs[i] = coefficients[i];
	}

	public int getDegree() {
		int d = coeffs.length - 1;
		while ((coeffs[d] == 0) && (d > 0))
			d--;
		return d;
	}

	
	/* = The value of this polynomial evaluated at x */
	public double evaluate(double x) {
		double sum = 0;
		double input = 1;
		for (int k = 0; k < coeffs.length; k++) {
			sum += coeffs[k] * input;
			input *= x;
		}
		return sum;
	}
	public String toString(){
		String res="";
		int d = getDegree();
		for (int i = 0; i < coeffs.length; i++)
			if(i<coeffs.length-1)
			res+=coeffs[i]+"^"+d+"+";
			else
				res+=coeffs[i]+"^"+d;
		return res;
						
	}
}


	