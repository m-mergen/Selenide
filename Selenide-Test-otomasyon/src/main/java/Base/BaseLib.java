package Base;

import java.util.Random;

public class BaseLib {
    Random random  =new Random();
    public  int randomNumber(){
        return random.nextInt(1000000);

    }
}
