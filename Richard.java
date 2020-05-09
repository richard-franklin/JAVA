import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <Applet code=Richard width= 600 height=600> 
</Applet>
*/


public class Richard extends Applet implements ActionListener {
   Button play,stop;
   AudioClip audioClip;

   public void init() {
      play = new Button("Play");
      add(play);
      play.addActionListener(this);
      stop = new Button("Stop");
      add(stop);
      stop.addActionListener(this);
      audioClip = getAudioClip(getCodeBase(), "yes-2.wav");
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