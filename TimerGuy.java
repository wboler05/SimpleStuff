/*
    Created by: William Boler, v1.0, June 7, 2014
        Small timer that is fast and highly diverse.  Can be used for many
        applications.  To start the timer, initiate an instance with a delay
        time in milliseconds.  To utilize the timer, checkTime() will return 
        true the immediate moment once the delay time has passed, and false all
        other times.  The timer will start over and continue towards infinity.
*/

public class TimerGuy {
    long startTime;
    long changeTime;
    long delay;
    
    TimerGuy(long delay) {
        this.startTime = System.currentTimeMillis();
        this.changeTime = this.startTime;
        this.delay = delay;
    }
    
    public boolean checkTime() {
        long change = System.currentTimeMillis();
        if (change - this.changeTime > this.delay) {
            this.changeTime += this.delay;
            return true;
        } else {
            return false;
        }
    }
}