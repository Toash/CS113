package CS113.Commons.Exam2;

public class Exam2_10 {
    static class Shoe{
        private int size;
        public Shoe(int size){
            this.size=size;
        }
        public int getSize(){ return size;}
    }

        public static void main(String[] args)
        {
            Shoe[] shoes={new Shoe(7), new Shoe(4),new Shoe(50)};

            // 0th index factored in.
            int maxPos = 0;

            for (int i=1; i<shoes.length; i++)
                if (shoes[i].getSize() > shoes[maxPos].getSize())
                    maxPos = i;
            System.out.println(maxPos);
        }
}
