/* Develop a Java program to demonstrate Multiple inheritance using the concepts such as abstract class,
interfaces and final keyword. By creating a class Smartphone which combines the functionalities of
Camera, Phone, and Music player.
 */

abstract class Camera{
    abstract void takephoto();
    abstract void takevideo();
}

interface Phone{
   void call(String number);
   void stopcall();
}
interface MusicPlayer{
    void playingmusic(String SongName);
    void Stopmusic();
}

final class Smartphone extends Camera implements Phone,MusicPlayer{
    @Override
    public void takephoto() {
        System.out.println("Capturing the Photo");
    }
    public void takevideo(){
        System.out.println("Recording a viedo");
    }

    public void call(String number){
        System.out.println("Calling to this number :"+number);
    }
    public void stopcall(){
        System.out.println("ending the call");
    }

    @Override
    public void playingmusic(String SongName) {
        System.out.println("Playing your Song :"+SongName);
    }
    public void Stopmusic(){
        System.out.println("Stopping the music");
    }
}
public class Multiple_Inheritence {
    public static void main(String[] args) {
        Smartphone obj = new Smartphone();
        obj.call("7204779698");
        obj.stopcall();
        obj.takephoto();
        obj.takevideo();
        obj.playingmusic("Kantaara");
        obj.Stopmusic();
    }
}
