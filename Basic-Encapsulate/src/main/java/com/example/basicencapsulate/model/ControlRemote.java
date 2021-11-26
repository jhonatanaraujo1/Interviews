package com.example.basicencapsulate.model;

import com.example.basicencapsulate.Interface.Controlator;

public class ControlRemote implements Controlator {

    private int volume;
    private boolean turnOn;
    private boolean playing;

    public ControlRemote() {
      this.volume=50;
      this.turnOn = false;
      this.playing = false;
    }
    // The methods are private because in that case it cannot be changed anywhere else.

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isTurnOn() {
        return turnOn;
    }

    private void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    private boolean isPlaying() {
        return playing;
    }

    private void setPlaying(boolean playing) {
        this.playing = playing;
    }

    @Override
    public void turnOn() {
        this.setTurnOn(true);
    }

    @Override
    public void turnOff() {
        this.setTurnOn(false);
    }

    @Override
    public void openMenu() {
        if(this.isTurnOn()) {
            System.out.println("Menu TV : ");
            System.out.println("Volume: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print("|");
            }
            System.out.println("");
        }
    }

    @Override
    public void closeMenu() {
        if(this.isTurnOn()){
            System.out.println("Closing menu, see ya my friend ");
        }
    }

    @Override
    public void upVolume() {
        if(this.isTurnOn()){
            System.out.println("turning up volume " + (this.getVolume() +5));
            this.setVolume(this.getVolume() +5);
        }
    }

    @Override
    public void downVolume() {
        if(this.isTurnOn()){
            System.out.println("turning down volume " + (this.getVolume() -5));
            this.setVolume(this.getVolume() -5);
        }
    }

    @Override
    public void onMute() {
        if(this.isTurnOn() && this.getVolume() > 0) {
            System.out.println("Muted :| ");
            this.setVolume(0);
        }
    }

    @Override
    public void ofMute() {
        if(this.isTurnOn()){
            if(this.isTurnOn() && this.getVolume() == 0){
                System.out.println("Unmuted :O ");
                this.setVolume(50);
            }

        }
    }

    @Override
    public void play() {
        if(this.isTurnOn() && !(this.isPlaying())){
            this.setPlaying(true);
            System.out.println("Playing");
        }
    }

    @Override
    public void pause() {
        if(this.isTurnOn() && this.isPlaying()){
            this.setPlaying(false);
            System.out.println("Pausing");
        }
    }
}
