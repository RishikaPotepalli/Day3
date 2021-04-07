package third;

public class Policy {

	private String policyName;
        private int policyId;
	private int policyAmo;
	private int term;
	Policy(String pname,int pid, int pamo,int pterm){
		this.policyAmount=pamt;
                this.policyName=pname;
		this.policyId=pid;
		this.term=pterm;
	}
	public void policy_Details()
	{
		System.out.println("Details");
		System.out.println("Policy Id: "+getPolicyId() );
		System.out.println("Policy Name: "+getPolicyName());
		System.out.println("Policy Amount: "+getPolicyAmo());
		System.out.println("Policy Term:"+getTerm() );
		
	}

	// GETTER AND SETTERS
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public int getPolicyAmount() {
		return policyAmount;
	}
	public void setPolicyAmount(int policyAmount) {
		this.policyAmount = policyAmount;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	
}