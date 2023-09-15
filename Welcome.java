package com.lti.sleepingemps;

 class Welcome
{
	long contact=9494949494l;
	short marks=890;//global variables 
	static String orgName="LTI";
	public static void main(String args[])
	{
		//local variabels
		byte age=78;
		char gender='M';
		float salary=23.2313213123444f;
		double result=43.3232323232993;
		
		System.out.println(result+"Leave US Its break time"+salary);
		System.out.println(Welcome.orgName);
		Welcome wel=new Welcome();
		System.out.println(wel.marks);
		
	}

}

//java-->source code 
//JVM -->binary code/byte code  /machine understandable language 
//compailation->compiler-->javac filename.java  -->.class
//.class-->JVM java classname

//a-z A-z 0-9 _ $