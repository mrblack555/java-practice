package chapter10;

public class Tax {
	int filingStatus;
	public final static int SINGLE_FILER = 0;
	public final static int MARRIED_JOINTLY = 1;
	public final static int MARRIED_SEPARATELY = 2;
	public final static int HEAD_OF_HOUSEHOLD = 3;
	int[][] brackets = {
		{8350, 33950, 52250, 171550, 327950},  //Single filer
		{16700, 67900, 137050, 208851, 327950}, //Married jointly
		{8350, 33950, 68525, 104425, 186475}, //Married separately
		{11950, 45500, 117450, 190200, 372950} //Head of household
};
	double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
	double taxableIncome;
	public Tax() {
		
	}
	
	public Tax(int filingStatus, int[][] brackets, double[] rates,
			double taxableIncome) {
		super();
		this.filingStatus = filingStatus;
		this.brackets = brackets;
		this.rates = rates;
		this.taxableIncome = taxableIncome;
	}

	public int getFilingStatus() {
		return filingStatus;
	}
	public int getSINGLE_FILER() {
		return SINGLE_FILER;
	}
	public int getMARRIED_JOINTLY() {
		return MARRIED_JOINTLY;
	}
	public int getMARRIED_SEPARATELY() {
		return MARRIED_SEPARATELY;
	}
	public int getHEAD_OF_HOUSEHOLD() {
		return HEAD_OF_HOUSEHOLD;
	}
	public int[][] getBrackets() {
		return brackets;
	}
	public double[] getRates() {
		return rates;
	}
	public double getTaxabletaxabletaxableIncome() {
		return taxableIncome;
	}
	public double getTax(){
		double tax = 0;
		if(filingStatus == SINGLE_FILER){
			if(taxableIncome <= 8350)
				tax = taxableIncome * rates[0];
			else if(taxableIncome <= 33950)
				tax = brackets[0][0] * rates[0] + (taxableIncome - brackets[0][0]) * rates[1];
			else if(taxableIncome <= 82250)
				tax = brackets[0][0] * rates[0] + (brackets[0][1] - brackets[0][0]) * rates[1] + (taxableIncome - brackets[0][1])* rates[2];
			else if(taxableIncome <= 171550)
				tax = brackets[0][0] * rates[0] + (brackets[0][1] - brackets[0][0]) * rates[1] +
				(brackets[0][2] - brackets[0][1])* rates[2] + (taxableIncome - brackets[0][2])* rates[3] ;
			else if(taxableIncome <= 372950)
				tax = brackets[0][0] * rates[0] + (brackets[0][1] - brackets[0][0]) * rates[1] +
						(brackets[0][2] - brackets[0][1])* rates[2] + (brackets[0][3] - brackets[0][2])* rates[3] +
						(taxableIncome - brackets[0][3])* rates[4];
			else
				tax = brackets[0][0] * rates[0] + (brackets[0][1] - brackets[0][0]) * rates[1] +
						(brackets[0][2] - brackets[0][1])* rates[2] + (brackets[0][3] - brackets[0][2])* rates[3] +
						(brackets[0][4] - brackets[0][3])* rates[4] + (taxableIncome - brackets[0][4])* rates[5];
		}
		else if(filingStatus == MARRIED_JOINTLY ){
			if(taxableIncome <= 16700)
				tax = taxableIncome * rates[0];
			else if(taxableIncome <= 67900)
				tax = brackets[1][0] * rates[0] + (taxableIncome - brackets[1][0]) * rates[1];
			else if(taxableIncome <= 137050)
				tax = brackets[1][0] * rates[0] + (brackets[1][1] - brackets[1][0]) * rates[1] + (taxableIncome - brackets[1][1])* rates[2];
			else if(taxableIncome <= 208851)
				tax = brackets[1][0] * rates[0] + (brackets[1][1] - brackets[1][0]) * rates[1] +
				(brackets[1][2] - brackets[1][1])* rates[2] + (taxableIncome - brackets[1][2])* rates[3] ;
			else if(taxableIncome <= 372950)
				tax = brackets[1][0] * rates[0] + (brackets[1][1] - brackets[1][0]) * rates[1] +
						(brackets[1][2] - brackets[1][1])* rates[2] + (brackets[1][3] - brackets[1][2])* rates[3] +
						(taxableIncome - brackets[1][3])* rates[4];
			else
				tax = brackets[1][0] * rates[0] + (brackets[1][1] - brackets[1][0]) * rates[1] +
						(brackets[1][2] - brackets[1][1])* rates[2] + (brackets[1][3] - brackets[1][2])* rates[3] +
						(brackets[1][4] - brackets[1][3])* rates[4] + (taxableIncome - brackets[1][4])* rates[5];
		}
		else if(filingStatus == MARRIED_SEPARATELY ){
			if(taxableIncome <= 8350)
				tax = taxableIncome * rates[0];
			else if(taxableIncome <= 33950)
				tax = brackets[2][0] * rates[0] + (taxableIncome - brackets[2][0]) * rates[1];
			else if(taxableIncome <= 68525)
				tax = brackets[2][0] * rates[0] + (brackets[2][1] - brackets[2][0]) * rates[1] + (taxableIncome - brackets[2][1])* rates[2];
			else if(taxableIncome <= 104425)
				tax = brackets[2][0] * rates[0] + (brackets[2][1] - brackets[2][0]) * rates[1] +
				(brackets[2][2] - brackets[2][1])* rates[2] + (taxableIncome - brackets[2][2])* rates[3] ;
			else if(taxableIncome <= 186475)
				tax = brackets[2][0] * rates[0] + (brackets[2][1] - brackets[2][0]) * rates[1] +
						(brackets[2][2] - brackets[2][1])* rates[2] + (brackets[2][3] - brackets[2][2])* rates[3] +
						(taxableIncome - brackets[2][3])* rates[4];
			else
				tax = brackets[2][0] * rates[0] + (brackets[2][1] - brackets[2][0]) * rates[1] +
						(brackets[2][2] - brackets[2][1])* rates[2] + (brackets[2][3] - brackets[2][2])* rates[3] +
						(brackets[2][4] - brackets[2][3])* rates[4] + (taxableIncome - brackets[2][4])* rates[5];
		}
		else if(filingStatus == HEAD_OF_HOUSEHOLD ){
			if(taxableIncome <= 11950)
				tax = taxableIncome * rates[0];
			else if(taxableIncome <= 45500)
				tax = brackets[3][0] * rates[0] + (taxableIncome - brackets[3][0]) * rates[1];
			else if(taxableIncome <= 117450)
				tax = brackets[3][0] * rates[0] + (brackets[3][1] - brackets[3][0]) * rates[1] + (taxableIncome - brackets[3][1])* rates[2];
			else if(taxableIncome <= 190200)
				tax = brackets[3][0] * rates[0] + (brackets[3][1] - brackets[3][0]) * rates[1] +
				(brackets[3][2] - brackets[3][1])* rates[2] + (taxableIncome - brackets[3][2])* rates[3] ;
			else if(taxableIncome <= 372950)
				tax = brackets[3][0] * rates[0] + (brackets[3][1] - brackets[3][0]) * rates[1] +
						(brackets[3][2] - brackets[3][1])* rates[2] + (brackets[3][3] - brackets[3][2])* rates[3] +
						(taxableIncome - brackets[3][3])* rates[4];
			else
				tax = brackets[3][0] * rates[0] + (brackets[3][1] - brackets[3][0]) * rates[1] +
						(brackets[3][2] - brackets[3][1])* rates[2] + (brackets[3][3] - brackets[3][2])* rates[3] +
						(brackets[3][4] - brackets[3][3])* rates[4] + (taxableIncome - brackets[3][4])* rates[5];

		}

		return tax;
	}
	

}
