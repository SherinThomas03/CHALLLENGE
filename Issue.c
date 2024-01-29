System.out.println("Fail");

} 

}

void displayDetails()

{

super.displayDetails();

System.out.println("Total mark: "+total);

System.out.println("Percentage: "+pct+"%");

}

}

class exp10

{

public static void main(String arg[])

{

mark m=new mark();

m.read();

m.readmark();

m.totalMark();

m.percentage();

m.displayDetails();

m.grade();

}

}
