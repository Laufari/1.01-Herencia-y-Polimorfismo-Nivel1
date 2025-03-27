public class WindInstrument extends Instruments
{
    public WindInstrument(String name, double price)
    {
        super(name, price);
    }
    @Override
    public void play()
    {
        System.out.println("A wind instrument is playing");
    }

}