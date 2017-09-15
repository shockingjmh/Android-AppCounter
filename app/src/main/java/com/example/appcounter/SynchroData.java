package com.example.appcounter;

/**
 * Created by shockingjmh on 2017. 5. 29..
 */

public class SynchroData extends Thread{//알림 띄우기위한 쓰레드

    ConnectServer server;
    String packageName;

    public SynchroData(ConnectServer server){
        this.server = server;
        packageName =  "";
    }

    public void run(){
        server.receiveData();
    }
}
