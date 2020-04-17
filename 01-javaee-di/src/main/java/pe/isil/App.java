package pe.isil;

import pe.isil.application.Gallery;
import pe.isil.socialnetwork.Facebook;
import pe.isil.socialnetwork.Instagram;
import pe.isil.socialnetwork.Pinterest;
import pe.isil.socialnetwork.Whatsapp;

public class App {

    public static void main(String[] args) {

        Gallery gallery = new Gallery(new Pinterest());
        gallery.shared();

        gallery.setSharingApp(new Facebook());
        gallery.shared();

        gallery.setSharingApp(new Instagram());
        gallery.shared();

    }

}
