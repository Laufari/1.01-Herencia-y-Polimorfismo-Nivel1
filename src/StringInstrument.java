public class StringInstrument extends Instruments
{
    public StringInstrument(String name, double price)
    {
        super(name, price);
    }

    @Override
    public void play()
    {
        System.out.println("A string instrument is playing");
    }
}

