import org.junit.Test;
import static org.junit.Assert.*;
import javax.swing.JLabel;
import modele.Objet;
import modele.Label;

public class TestObjet {

    private static class ObjetConcret extends Objet {
        public ObjetConcret(Label label) {
            this.label = label;
        }
    }

    @Test
    public void testToucheObjet() {

        JLabel jLabel1 = new JLabel();
        jLabel1.setBounds(10, 10, 50, 50); // Exemple de dimensions
        Label label1 = new Label(1, jLabel1);

        JLabel jLabel2 = new JLabel();
        jLabel2.setBounds(15, 15, 50, 50); // Exemple de dimensions
        Label label2 = new Label(2, jLabel2);

        ObjetConcret obj1 = new ObjetConcret(label1);
        ObjetConcret obj2 = new ObjetConcret(label2);

        obj1.setPosX(10);
        obj1.setPosY(10);
        obj2.setPosX(15);
        obj2.setPosY(15);

        // Test si obj1 touche obj2
        assertTrue("Les objets devraient se toucher", obj1.toucheObjet(obj2));

        // Changez les positions pour un test où les objets ne se touchent pas
        obj2.setPosX(100);
        obj2.setPosY(100);

        // Testez à nouveau
        assertFalse("Les objets ne devraient pas se toucher", obj1.toucheObjet(obj2));
    }
}
