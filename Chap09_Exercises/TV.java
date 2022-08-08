////////////////////////////////////////////////////////////////////////////////////////////////////
//  TV.java
//  Author: Teo Espero
//          BS Cloud and System Administration
//          BS Software Development
//          Western Governors University
//  Description:
//          Class definition and details for the TV class
//  Date: 08/08/2022
////////////////////////////////////////////////////////////////////////////////////////////////////
public class TV{
    int channel = 0;
    int volumeLevel = 0;
    boolean on = false;
    String TVLocation = "";
    public TV(){
    }
    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }

    public void setChannel(int newChannel){
        if (on && newChannel >= 1 && newChannel <= 120)
            channel = newChannel;
    }

    public void setVolume(int newVolumeLevel){
        if (on && newVolumeLevel >= 0 && newVolumeLevel <= 7)
            volumeLevel = newVolumeLevel;
    }

    public void channelUp(){
        if (on && channel < 120)
            channel++;
    }

    public void channelDown(){
        if (on && channel > 1)
            channel--;
    }

    public void volumeUp(){
        if (on && volumeLevel < 7)
            volumeLevel++;
    }

    public void volumeDown(){
        if (on && volumeLevel > 1)
            volumeLevel--;
    }

    public void setName(String where){
        TVLocation = where;
    }
}