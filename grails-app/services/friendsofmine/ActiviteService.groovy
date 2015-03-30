package friendsofmine

import grails.transaction.Transactional

@Transactional
class ActiviteService {

    boolean transactional = true

    Activite insertOrUpdateActiviteForResponsable(Activite uneActivite, Utilisateur unResponsable) {
        //if (!unResponsable.activites && unResponsable.activites.contains(uneActivite))
        //    unResponsable.activites.remove(uneActivite)
        uneActivite.setResponsable(unResponsable)
        unResponsable.addToActivites(uneActivite)
        unResponsable.save()
        uneActivite.save()
        uneActivite
    }


}
