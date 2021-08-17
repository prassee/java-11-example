package io.github.prassee;

public class Main {
    public static void main(String[] args) {
        System.out.println("print ln");
        name(CricketPlayable.class, 2);
        name(FootBallPlayable.class, 3);
        /*
         * this doesn't work - Player is not subclass of Playable name(Player.class);
         */
    }

    public static <T extends Playable> void name(Class<T> type, int jersey) {
        try {
            T t = type.getDeclaredConstructor().newInstance(jersey);
            t.play();
        } catch (Exception e) {

        }
    }
}

abstract class Playable {
    public abstract void play();
}

class CricketPlayable extends Playable {

    CricketPlayable(int jersey) {

    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
    }

}

class FootBallPlayable extends Playable {

    FootBallPlayable(int jersey) {

    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
    }

}

class Player {
    private String name;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}