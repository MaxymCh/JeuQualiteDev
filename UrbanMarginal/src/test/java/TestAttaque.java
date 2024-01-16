// import org.junit.Test;

// import controleur.Controle;

// import static org.junit.Assert.*;
// import java.util.ArrayList;
// import java.util.Hashtable;
// import outils.connexion.Connection;

// import modele.Joueur;
// import modele.JeuServeur;
// import modele.Mur;
// import modele.Attaque;
// import modele.Boule;

// class SocketMock extends java.net.Socket {
//     // Implémentez les méthodes nécessaires pour votre cas de test ici
// }

// public class TestAttaque {

//     @Test
//     public void testToucheMur() {
//         // Créez une instance de la classe Attaque avec les paramètres nécessaires
//         Controle controle = new Controle();
//         Joueur attaquant = new Joueur(new JeuServeur(controle));
//         JeuServeur jsrv = new JeuServeur(controle);
//         ArrayList<Mur> lesmurs = new ArrayList<>();
//         Hashtable<Connection, Joueur> lesjoueurs = new Hashtable<>();
//         Attaque attaque = new Attaque(attaquant, jsrv, lesmurs, lesjoueurs);

//         Boule boule = new Boule(jsrv); // Utilisez Boule réelle
//         attaquant.setBoulet(boule);
        
//         // Ajoutez des murs à la liste des murs
//         Mur mur1 = new Mur();
//         Mur mur2 = new Mur();
//         lesmurs.add(mur1);
//         lesmurs.add(mur2);

//         // Définissez la position de la boule pour qu'elle touche un mur
//         attaquant.getBoulet().setPosX(mur1.getPosX());
//         attaquant.getBoulet().setPosY(mur1.getPosY());

//         // Testez si la boule touche un mur
//         assertTrue("La boule devrait toucher un mur", attaque.toucheMur());
//     }

//     @Test
//     public void testToucheJoueur() {
//         // Créez une instance de la classe Attaque avec les paramètres nécessaires
//         Controle controle = new Controle();
//         Joueur attaquant = new Joueur(new JeuServeur(controle));
//         JeuServeur jsrv = new JeuServeur(controle);
//         ArrayList<Mur> lesmurs = new ArrayList<>();
//         Hashtable<Connection, Joueur> lesjoueurs = new Hashtable<>();
//         Attaque attaque = new Attaque(attaquant, jsrv, lesmurs, lesjoueurs);

//         // Créez un autre joueur et ajoutez-le à la liste des joueurs
//         Joueur joueur1 = new Joueur(jsrv);
//         lesjoueurs.put(new Connection(new SocketMock(), controle), joueur1);

//         // Définissez la position de la boule pour qu'elle touche un joueur
//         attaquant.getBoulet().setPosX(joueur1.getPosX());
//         attaquant.getBoulet().setPosY(joueur1.getPosY());

//         // Testez si la boule touche un joueur
//         assertEquals("La boule devrait toucher le joueur1", joueur1, attaque.toucheJoueur());
//     }
// }
