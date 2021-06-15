package icehs.science.chapter10;

public class PersonTest {
	public static void main(String[] args) {
	
		Person[] persons = {
				new Person(),
				new Student(),
				new Teacher(),
				new Staff()
		};
		for(int i = 0; i< persons.length; i++) {
			persons[i].eat();
			persons[i].sleep();
			
			if(persons[i] instanceof Student) {
				((Student)persons[i]).study();
			}else if(persons[i] instanceof Teacher) {
				((Teacher)persons[i]).teach();
			}else if(persons[i] instanceof Staff) {
				((Staff)persons[i]).work();
			}
			System.out.println();
		}

	
//		person1.eat();
//		person1.sleep();
//		System.out.println();
//		
//		student1.eat();
//		student1.sleep();
//		//student1.study();
//		System.out.println();
//		teacher1.eat();
//		teacher1.sleep();
//	//	teacher1.teach();
//		System.out.println();
//		staff1.eat();
//		staff1.sleep();
//	//	staff1.work();
	}
}
