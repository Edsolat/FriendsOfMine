package friendsofmine

import grails.test.mixin.Mock

class Inscription {
    Utilisateur utilisateur
    Activite activite
    Date dateInscription

    static constraints = {
        utilisateur nullable: false, Mock : true
        activite nullable: false, Mock : true
        dateInscription nullable: false
    }
}
