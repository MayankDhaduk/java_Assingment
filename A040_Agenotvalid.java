package Assingmnt;

public class A040_Agenotvalid {

	public class Agenotvalid extends Exception {

		int ag;

		public Agenotvalid(int ag) {

			this.ag = ag;
		}

		public void validag() {

			System.err.println("You need " + ag + " Year to vote");

		}

	}
}