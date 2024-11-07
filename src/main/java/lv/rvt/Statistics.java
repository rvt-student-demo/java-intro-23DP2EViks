package lv.rvt;


public class Statistics {
        private int count;
        private int sum;
    
        public Statistics() {
            this.count = 0;
          
        }
    
        public void addNumber(int number) {
            this.count++;
            
        }
    
        public int getCount() {
            return this.count;
        }
    }