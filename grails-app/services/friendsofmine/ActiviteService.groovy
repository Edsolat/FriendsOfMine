package friendsofmine

import grails.transaction.Transactional

@Transactional
class ActiviteService {

    boolean transactional = true

     static Activite insertOrUpdateActiviteForResponsable(Activite uneActivite, Utilisateur unResponsable) {
        //if (!unResponsable.activites && unResponsable.activites.contains(uneActivite))
        //    unResponsable.activites.remove(uneActivite)
        uneActivite.setResponsable(unResponsable)
        unResponsable.addToActivites(uneActivite)
        unResponsable.save()
        uneActivite.save()
        uneActivite
    }

    static Activite insertOrUpdateActivite(Activite uneActivite) {
        //if (!unResponsable.activites && unResponsable.activites.contains(uneActivite))
        //    unResponsable.activites.remove(uneActivite)
        uneActivite.save()
        uneActivite
    }

    static def deleteActivite(Activite uneActivite) {
        if (Activite.findById(uneActivite.id)) {
            //uneActivite.responsable.delete(flush: true)
            uneActivite.responsable = null
            uneActivite.delete(flush: true)
            uneActivite.save(flush: true)
        }
    }
}
