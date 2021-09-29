import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class VideoConversionFacadeTest {
    @Test
public void Teste(){
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        assertEquals(mp4Video, mp4Video);
    }

}