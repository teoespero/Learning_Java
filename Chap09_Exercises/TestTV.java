////////////////////////////////////////////////////////////////////////////////////////////////////
//  TestTV.java
//  Author: Teo Espero
//          BS Cloud and System Administration
//          BS Software Development
//          Western Governors University
//  Description:
//          Demonstrate the use of objects and methods in Java
//  Date: 08/08/2022
////////////////////////////////////////////////////////////////////////////////////////////////////
public class TestTV {
    public static void main(String[] args){
        //////////////////////////////////////////////////////////////
        // declare the TV object in our java class
        TV livingRoomTV = new TV();

        //////////////////////////////////////////////////////////////
        // define values for our TV
        livingRoomTV.TVLocation = "Living Room";
        livingRoomTV.turnOn();
        livingRoomTV.setChannel(3);
        livingRoomTV.setVolume(5);

        //////////////////////////////////////////////////////////////
        // show the current status of our TV
        System.out.println(livingRoomTV.TVLocation + " Tv is now " + livingRoomTV.on);
        System.out.println(livingRoomTV.TVLocation + " set to channel " + livingRoomTV.channel);
        System.out.println(livingRoomTV.TVLocation + " volume set to " + livingRoomTV.volumeLevel);

        //////////////////////////////////////////////////////////////
        // make changes to our TV

        // lower the volume and change the channel
        livingRoomTV.volumeDown();
        livingRoomTV.channelUp();
        livingRoomTV.channelUp();
        livingRoomTV.channelUp();
        System.out.println(livingRoomTV.TVLocation + " set to channel " + livingRoomTV.channel);
        System.out.println(livingRoomTV.TVLocation + " volume set to " + livingRoomTV.volumeLevel);

        //////////////////////////////////////////////////////////////
        // nothing to watch, turn off the TV
        livingRoomTV.turnOff();
        System.out.println(livingRoomTV.TVLocation + " Tv is now " + livingRoomTV.on);
    }
}



