package test05;

public class Student {
	String name = "김필규";
	int kor = 15; 
	int eng = 20;
	int mat = 25;
    int tot() {
		return kor+eng+mat;
	}
	double avg() {
		return (this.kor+this.eng+this.mat) / 3.0f;
	}
	void resulting() {
			System.out.println("이름 : "+this.name+", 총점 : "+this.tot()+"평균 : "+this.avg());
	}
}
		
