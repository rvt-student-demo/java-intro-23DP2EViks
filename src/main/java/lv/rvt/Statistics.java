package lv.rvt;


public class Statistics {
    private int sum; 
    private int count;   
    
    public Statistics() {
        this.sum = 0;
        this.count = 0;
          
    }
    
    public void addNumber(int number) {
        this.sum += number;
        this.count++;            
    }
    public int sum() {
        return this.sum;
    }
    public int getCount() {
        return this.count;
    }
    public double average() {
        if (this.count == 0) {
            return 0;
        }
        return(double) this.sum / this.count;
    }
    
}