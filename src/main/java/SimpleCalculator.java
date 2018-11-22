public class SimpleCalculator {

    int value;

    public SimpleCalculator(int value){
        this.value = value;
    }
    public void add(int value) {
        this.value += value;
    }
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

    public int abs() {

        if (value < 0){
            return value = value * -1;
        }
        return value;
    }

}
