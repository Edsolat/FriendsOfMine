package friendsofmine

class Utilisateur {

    String nom
    String prenom
    String sexe
    Date dateNaissance
    String email

    static hasMany = [activites: Activite]

    static constraints = {
        nom blank: false
        prenom blank: false
        sexe inList: ["F","M"]
        dateNaissance nullable: true
        email email: true
    }
}
