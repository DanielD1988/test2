public class Test {

    public int addNumbers(int num1,int num2){

        if (num2 > 500) {
            boolean isTrue = true;
            throw new IllegalArgumentException("X should be less than 1000");
        }
        
        return num1 + num2;
    }
}
