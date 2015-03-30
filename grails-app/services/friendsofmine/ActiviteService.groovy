package friendsofmine

import grails.transaction.Transactional

@Transactional
class ActiviteService {

    boolean transactional = true

    Activite insertOrUpdateActiviteForResponsable(Activite uneActivite, Utilisateur unResponsable) {
        if (unResponsable.activites.contains(uneActivite))
            unResponsable.activites.remove(uneActivite)
        def resultActivite = new Activite(titre : uneActivite.titre, Utilisateur : unResponsable)
        resultActivite.save()
        resultActivite
    }
}
