public class SimpleCalculator {

    int value;

    public SimpleCalculator(int value){
        this.value = value;
    }
    public void add(int value) { this.value += value; }
    public void substract(int value) {
        this.value -= value;
    }
    public void multiply(int value) {
        this.value *= value;
    }
    public void divide(int value) {
        this.value /= value;
    }

    public int getSign() {

        if (value > 0) {
            return 1;
        } else if (value == 0){
            return 0;
        } else if (value < 0) {
            return -1;
        }
        return value;
    }

    public void abs() {

        if (value < 0){
            this.value = value * -1;
        }
    }

    public void factorial() {

        int result = 1;
        int counter = 1;
        while (counter <= this.value) {
            result *= counter;
            counter++;
        }
        this.value = result;
    }

    public void power(int value) {
        int result = 1;
        int counter = 1;
        while (counter <= value) {
            result = result * this.value;
            counter++;
        }
        this.value = result;
    }

}
