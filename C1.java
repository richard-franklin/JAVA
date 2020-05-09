import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <Applet code=Richard width= 600 height=600> 
</Applet>
*/


public class C1 extends Applet implements ActionListener {
   Button play,stop;
   AudioClip audioClip;

   public void init() {
      play = new Button("Play");
      add(play);
      play.addActionListener(this);
      stop = new Button("Stop");
      add(stop);
      stop.addActionListener(this);
      audioClip = getAudioClip(getCodeBase(), "sound.wav");//here 'sound' can be any .wav extension sound 
   }
   public void actionPerformed(ActionEvent ae) {
      if (ae.getActionCommand().equals("Play")) {
         audioClip.play();
      } else if(ae.getActionCommand().equals("Stop")){
         audioClip.stop();
      }
    else{
    audioClip.stop();
   }
}
}
