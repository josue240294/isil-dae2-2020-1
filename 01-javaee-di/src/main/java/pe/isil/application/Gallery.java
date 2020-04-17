package pe.isil.application;


import pe.isil.socialnetwork.SharingApp;

public class Gallery {

    SharingApp sharingApp;

    public Gallery(){
    }

    public Gallery(SharingApp sharingApp){
        this.sharingApp = sharingApp;
    }

    public void setSharingApp(SharingApp sharingApp){
        this.sharingApp = sharingApp;
    }

    public void shared(){
        this.sharingApp.send();
    }

}
