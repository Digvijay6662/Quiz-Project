/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tqa.music;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

/**
 *
 * @author DIGVIJAY
 */
public class MyMusic extends Thread {

    public void run() {
        File music = new File("spectre.wav");
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(music));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "SLEEP ERROR : " + ex, "ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
    }
}