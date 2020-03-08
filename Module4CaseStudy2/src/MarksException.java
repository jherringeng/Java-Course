
class MarksException extends Exception {
	int marks;

	public MarksException (int x) {
		marks = x;
	}

	public String toString() {
		return "\nSorry, your marks of " + marks + " do not meet our qualifying standards.";
	}
}
