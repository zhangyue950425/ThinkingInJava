package Chapter8;



public class Music {
	public static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}

	public static void main(String[] args) {
		Wind w = new Wind();
		tune(w);

	}

}
