package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class ParallelStrm_09 {
    public static void main(String[] args) {
        List<Stdent> stList = Arrays.asList(
                new Stdent("Samim", 90),
                new Stdent("Sam", 94),
                new Stdent("kamim", 70),
                new Stdent("mamim", 80),
                new Stdent("hasim", 50),
                new Stdent("Durim", 60),
                new Stdent("Sachin", 50)
        );
        // Stream - with sequencial process
//        stList.stream()
//              .filter(s -> s.getScore() >= 80)
//              .limit(3)
//              .forEach(st -> System.out.println(st.getName() + " " + st.getScore()));
        
        // Parallel Stream
//      stList.parallelStream()
//	      .filter(s -> s.getScore() >= 80)
//	      .limit(3)
//	      .forEach(st -> System.out.println(st.getName() + " " + st.getScore()));
      
      // Converting normal stream() ---> ParalelleStream()
        stList.stream().parallel()
				      .filter(s -> s.getScore() >= 80)
				      .limit(3)
				      .forEach(st -> System.out.println(st.getName() + " " + st.getScore()));
    }
}

class Stdent {
    String name;
    int score;

    public Stdent(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}