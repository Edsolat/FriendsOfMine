package friendsofmine

import grails.test.mixin.Mock

class Activite {

    String titre
    String descriptif
    Utilisateur responsable


    static constraints = {
        titre blank: false
        descriptif nullable: true, blank: true
        responsable nullable: false, Mock: true
    }
}
