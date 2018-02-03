package sweeper;

public enum Box
{
        zero,
        num1,
        num2,
        num3,
        num4,
        num5,
        num6,
        num7,
        num8,
        bomb,
        opened,
        closed,
        flaged,
        bombed,
        nobomb;

        public Object image;

        Box getNextNumberBox ()
        {
                return Box.values() [this.ordinal() + 1];
        }

        int getNumber ()
        {
                return this.ordinal();
        }


}


