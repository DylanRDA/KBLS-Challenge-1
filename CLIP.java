import net.sf.clipsrules.jni.Environment;

public class CLIP {
    
    public static Environment clips = new Environment();

    public static void main (String[] args){
        
  clips.load("load-fruta.cpl");
  clips.load("load-fruta-rules.cpl");
        clips.reset();
        clips.run();

    }




}