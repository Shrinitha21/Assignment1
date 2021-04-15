package testcase;

public class StudentMain {

	public static void main(String[] args) {
	Student obj[] = new Student[10];
	obj[0] = new Student();
    obj[1] = new Student();
    obj[2] = new Student();
    obj[3] = new Student();
    obj[4] = new Student();
    obj[5] = new Student();
    obj[6] = new Student();
    obj[7] = new Student();
    obj[8] = new Student();
    obj[9] = new Student();
   
    obj[0].setInfo(1, "chandan", "kolar");
    obj[1].setInfo(1, "chaithanya", "kolar");
    obj[2].setInfo(1, "chinmai", "kolar");
    obj[3].setInfo(1, "paniraj", "kolar");
    obj[4].setInfo(1, "mani", "kolar");
    obj[5].setInfo(1, "apoorva", "kolar");
    obj[6].setInfo(1, "punya", "kolar");
	obj[7].setInfo(1, "chaitra", "kolar");
	obj[8].setInfo(1, "vishnu", "kolar");
	obj[9].setInfo(1, "gani", "kolar");
	
	for(int i=0;i<=9;i++) {
	obj[i].display();	
	}
	}
}
