import org.junit.Before;
import org.junit.Test;

import controleur.Controle;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Hashtable;
import outils.connexion.Connection;
import modele.Joueur;
import modele.Boule;
import modele.JeuServeur;
import modele.Mur;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;

public class TestJoueur {

    //private JeuServeur jeuServeur;
    private Joueur joueur;
    private ArrayList<Mur> lesMurs;
    private Hashtable<Connection, Joueur> lesJoueurs;


    @Mock
    private JeuServeur jeuServeur;

    //private Joueur joueur;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        joueur = new Joueur(jeuServeur);
        Controle controle = new Controle();
        joueur = new Joueur(jeuServeur);
        lesMurs = new ArrayList<>();
        lesJoueurs = new Hashtable<>();
        Boule boulet = new Boule(jeuServeur);
        joueur.setBoulet(boulet);
    }
/*
    @Test
    public void testDepartJoueur() {
        // Utilisation de Mockito pour simuler le comportement du jeuServeur
        when(this.jeuServeur.nouveauLabelJeu(any())).thenReturn(
            joueur.departJoueur()
            
        );
        assertFalse("Le label du joueur ne devrait pas être visible", joueur.getLabel().getjLabel().isVisible());
        assertFalse("Le message du joueur ne devrait pas être visible", joueur.getMessage().getjLabel().isVisible());
        assertFalse("Le label de la boule du joueur ne devrait pas être visible", joueur.getBoulet().getLabel().getjLabel().isVisible());
        joueur.departJoueur();

        // Assertions et vérifications de comportement attendu
    }*/
    @Test
    public void testDepartJoueur() {
        // Utilisation de Mockito pour simuler le comportement du jeuServeur
        doNothing().when(jeuServeur).nouveauLabelJeu(any());

        joueur.departJoueur();

        // Assertions et vérifications de comportement attendu
    }
/*
    @Before
    public void setUp() {
        Controle controle = new Controle();
        jeuServeur = new JeuServeur(controle);
        joueur = new Joueur(jeuServeur);
        lesMurs = new ArrayList<>();
        lesJoueurs = new Hashtable<>();
        Boule boulet = new Boule(jeuServeur);
        joueur.setBoulet(boulet);
    }
*/
    @Test
    public void testGainVie() {
        joueur.GainVie();
        assertEquals("La vie du joueur devrait être augmentée", 11, joueur.getVie());
    }

    @Test
    public void testPerteVie() {
        joueur.PerteVie();
        assertEquals("La vie du joueur devrait être diminuée", 8, joueur.getVie());
    }

    @Test
    public void testEstMort() {
        assertFalse("Le joueur ne devrait pas être mort au début", joueur.EstMort());
        for (int i = 0; i < 10; i++) {
            joueur.PerteVie();
        }
        assertTrue("Le joueur devrait être mort après avoir perdu toute sa vie", joueur.EstMort());
    }
/*
    @Test
    public void testDepartJoueur() {
        joueur.departJoueur();
        assertFalse("Le label du joueur ne devrait pas être visible", joueur.getLabel().getjLabel().isVisible());
        assertFalse("Le message du joueur ne devrait pas être visible", joueur.getMessage().getjLabel().isVisible());
        assertFalse("Le label de la boule du joueur ne devrait pas être visible", joueur.getBoulet().getLabel().getjLabel().isVisible());
    }
*/
    @Test
    public void testInitPerso() {
        joueur.initPerso("Joueur1", 1, lesJoueurs, lesMurs);
        assertEquals("Le pseudo du joueur devrait être 'Joueur1'", "Joueur1", joueur.getPseudo());
        assertEquals("Le numéro du personnage devrait être 1", 1, joueur.getNumPerso());
        assertNotNull("Le label du joueur devrait être initialisé", joueur.getLabel());
        assertNotNull("Le message du joueur devrait être initialisé", joueur.getMessage());
        assertNotNull("La boule du joueur devrait être initialisée", joueur.getBoulet());
    }

    @Test
    public void testAction() {
        joueur.initPerso("Joueur1", 1, lesJoueurs, lesMurs);
        joueur.action(Joueur.GAUCHE, lesJoueurs, lesMurs);
        assertEquals("La position X du joueur devrait être mise à jour après un déplacement vers la gauche", -Joueur.LEPAS, joueur.getPosX());
        joueur.action(Joueur.DROITE, lesJoueurs, lesMurs);
        assertEquals("La position X du joueur devrait être mise à jour après un déplacement vers la droite", 0, joueur.getPosX());
        joueur.action(Joueur.HAUT, lesJoueurs, lesMurs);
        assertEquals("La position Y du joueur devrait être mise à jour après un déplacement vers le haut", -Joueur.LEPAS, joueur.getPosY());
        joueur.action(Joueur.BAS, lesJoueurs, lesMurs);
        assertEquals("La position Y du joueur devrait être mise à jour après un déplacement vers le bas", 0, joueur.getPosY());
        joueur.action(Joueur.TIRE, lesJoueurs, lesMurs);
        assertTrue("Le label de la boule du joueur devrait être visible après avoir tiré", joueur.getBoulet().getLabel().getjLabel().isVisible());
    }
}
