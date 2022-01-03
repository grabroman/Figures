package app;

public interface RandomNumber {



    static int getRandomBetweenRange(int min, int max){
        int res=((int)(Math.random()*((max-min)+1))+min);


        return  res;


    }
}
