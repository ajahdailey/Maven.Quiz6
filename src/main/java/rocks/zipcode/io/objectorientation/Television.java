package rocks.zipcode.io.objectorientation;

import java.nio.channels.Channel;

public class Television {
   Integer channel;
   TVChannel tv;

    public void turnOn() {

    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public TVChannel getChannel() {
        return tv;
    }
}
