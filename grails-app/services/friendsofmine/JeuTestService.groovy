package friendsofmine

import grails.transaction.Transactional

@Transactional
class JeuTestService {

    def createJeuTestFoActivite() {
        int i = 0
        while (Activite.count < 3) {
            new Activite(titre: "activite" + i.toString(), descriptif: "une activite" + i.toString(), responsable: Utilisateur.findById(1)).save()
            i++
        }
    }
}
