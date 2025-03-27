//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        WindInstrument flute = new WindInstrument("Flute", 300.0);
        StringInstrument guitar = new StringInstrument("Guitar", 250.0);
        PercussionInstrument drum = new PercussionInstrument("Drum", 1500.0);

        flute.play();
        guitar.play();
        drum.play();
    }
}
