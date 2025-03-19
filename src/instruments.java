abstract class Instruments
{
    protected String name;
    protected double price;

     public Instruments (String name, double price)
    {
        this.name = name;
        this.price = price;
    }
    public abstract void play();

    static class windInstrument extends Instruments
    {
        public windInstrument(String name, double price)
        {
            super(name, price);
        }
        @Override
        public void play()
        {
            System.out.println("A wind instrument is playing");
        }

    }

    static class stringInstrument extends Instruments
    {
        public stringInstrument(String name, double price)
        {
            super(name, price);
        }
        @Override
        public void play() {
            System.out.println("A string instrument is playing");
        }
    }
    static class percussionInstrument extends Instruments
    {
        public percussionInstrument(String name, double price)
        {
            super(name, price);
        }
        @Override
        public void play()
        {
            System.out.println("A percussion instrument is playing");
        }
    }
}