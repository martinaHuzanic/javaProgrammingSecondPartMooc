package validating;

public class Calculator {

    public int factorial(int num) {
        
        if(num >= 0){
               int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
            
        } else {
            throw new IllegalArgumentException("error factortial");
        }
    }

    public int binomialCoefficent(int setSize, int subsetSize) {

        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
