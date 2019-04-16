package rocks.zipcode.io.objectorientation;

import java.nio.channels.Channel;

public class Television {
   Integer channel = 0;
   TVChannel tv;
   Boolean on;
    public void turnOn() {
        on = true;
    }

    public void setChannel(Integer channel) {
        if(on){
          this.channel = channel;
        }

    }

    public TVChannel getChannel() {
        return tv;
    }
}
