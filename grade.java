public enum grade {
	A_plus(true), A(true), A_minus(true), F(false);
	
	private final boolean passing;
	
	private grade(boolean p) {
		passing = p;
		}
	public static String getGrade(grade g) {
		return g.toString();
		}
	
	public static void main(String[] args) {
		grade a = grade.A_plus;
		System.out.println(a.getGrade(a));
		}
			
	}
