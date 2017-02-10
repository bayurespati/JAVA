package Chapter_9.libaray_class_chapter_9;

/**
 * Created by bnamora on 2/10/17.
 */
public class Stopwatch {
        private long startTime;
        private long endTime;

        public Stopwatch(){
            startTime = System.currentTimeMillis();
        }

        public long getStartTime(){
            return startTime;
        }

        public long getEndTime(){
            return endTime;
        }

        public void setStartTime(long startTime){
            this.startTime = startTime;
        }

        public void setEndTime(long endTime){
            this.endTime = endTime;
        }

        public void start(){
            startTime = System.currentTimeMillis();
        }

        public void stop(){
            endTime = System.currentTimeMillis();
        }

        public long getElapsedTime(){
            return endTime - startTime;
        }
}
