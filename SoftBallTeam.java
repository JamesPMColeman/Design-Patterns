public class SoftBallTeam {
	private final String teamName;
	private final String coach;
	private final String pitcher;
	private final String catcher;
	private final String firstBase;
	private final String secondBase;
	private final String thirdBase;
	private final String shortStop;
	private final String leftField;
	private final String centerLeft;
	private final String centerRight;
	private final String rightField;
	
	public static class Builder {
		/* 
		 * For the sake of learning we'll say only the
		 * team name and the coach are required.
		 */
		private final String teamName;
		private final String coach;
		
		// Every thing else
		private String pitcher 	   = "";
		private String catcher	   = "";
		private String firstBase   = "";
		private String secondBase  = "";
		private String thirdBase   = "";
		private String shortStop   = "";
		private String leftField   = "";
		private String centerLeft  = "";
		private String centerRight = "";
		private String rightField  = "";
		
		
		/* 
		 * builder's constructor is just concerned with 
		 * required parameters
		 */
		public Builder(String teamName, String coach) {
			this.teamName = teamName;
			this.coach    = coach;
		}
		
		// Setters for the non required parameters
		public Builder pitcher(String name)
			{ pitcher = name;		return this; }
		public Builder catcher(String name)
			{ catcher = name;		return this; }
		public Builder firstBase(String name)
			{ firstBase = name;		return this; }
		public Builder secondBase(String name)
			{ secondBase = name;	return this; }
		public Builder thirdBase(String name)
			{ thirdBase = name;		return this; }
		public Builder shortStop(String name)
			{ shortStop = name;		return this; }
		public Builder leftField(String name)
			{ leftField = name;		return this; }
		public Builder centerLeft(String name)
			{ centerLeft = name;	return this; }
		public Builder centerRight(String name)
			{ centerRight = name;	return this; }
		public Builder rightField(String name)
			{ rightField = name;	return this; }
		
		public SoftBallTeam build() {
			return new SoftBallTeam(this);
		}
	}
	
	private SoftBallTeam(Builder builder) {
		teamName	= builder.teamName;
		coach		= builder.coach;
		pitcher		= builder.pitcher;
		catcher		= builder.catcher;
		firstBase	= builder.firstBase;
		secondBase  = builder.secondBase;
		thirdBase	= builder.thirdBase;
		shortStop	= builder.shortStop;
		leftField   = builder.leftField;
		centerLeft  = builder.centerLeft;
		centerRight = builder.centerRight;
		rightField  = builder.rightField;
	}

	public static void main(String[] args) {
		SoftBallTeam meerkats = new SoftBallTeam.Builder("Meerkats", "James Coleman")
				.firstBase("Isaac").catcher("Brad").leftField("Rusty").build();
	
		System.out.print(meerkats.catcher);
	}
}