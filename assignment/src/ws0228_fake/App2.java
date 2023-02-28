package ws0228_fake;

public class App2 {

	public static void main(String[] args) {

		Employee[] arrEmp = { new Employee("0001", "Emp1", 1000000), new Employee("0002", "Emp2", 1100000),
				new Employee("0003", "Emp3", 1200000), new Employee("0004", "Emp4", 1300000),
				new Employee("0005", "Emp5", 1400000), };

		Manager[] arrMag = { new Manager("1001", "Mag1", 2000000, 200000), new Manager("1002", "Mag2", 2100000, 210000),
				new Manager("1003", "Mag3", 2200000, 220000), new Manager("1004", "Mag4", 2300000, 230000),
				new Manager("1005", "Mag5", 2400000, 240000), };

//		for (int i = 0; i < arrEmp.length; i++) {
//			String id = arrEmp[i].getName();
//			int AnnSalary = arrEmp[i].getAnnSalary();
//			double Tax = Math.round(arrEmp[i].getTax());
//			System.out.printf("이름은 : %s, 연봉 : %d, 세금 : %f \n", id, AnnSalary, Tax);
////		 System.out.println(arrEmp[i].toString());
//		}

		for (int j = 0; j < 2; j++) {
			for (int i = 0; i < 5; i++) {
				if (j == 0) {
					String id = arrEmp[i].getName();
					int AnnSalary = arrEmp[i].getAnnSalary();
					double Tax = Math.round(arrEmp[i].getTax());
					System.out.printf("이름은 : %s, 연봉 : %d, 세금 : %f \n", id, AnnSalary, Tax);
				}// if문끝
				else {
					String id = arrMag[i].getName();
					int AnnSalary = arrMag[i].getAnnSalary();
					double Tax = Math.round(arrMag[i].getTax());
					int bonus = arrMag[i].getBonus();
					System.out.printf("이름은 : %s, 연봉 : %d, 세금 : %f \n", id, AnnSalary, Tax, bonus);
				} //else문끝
			}//for문 끝
			System.out.println("");
		}

	}

}
