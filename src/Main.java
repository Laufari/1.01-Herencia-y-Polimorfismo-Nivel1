//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Instruments.windInstrument flute = new Instruments.windInstrument("Flute", 300.0);
        Instruments.stringInstrument guitar = new Instruments.stringInstrument("Guitar", 250.0);
        Instruments.percussionInstrument drum = new Instruments.percussionInstrument("Drum", 1500.0);

        flute.play();
        guitar.play();
        drum.play();
    }
}
