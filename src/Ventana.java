import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JTextField txtCodigo;
    private JTextField txtNombre;
    private JComboBox cmbTipo;
    private JTextField tsxtCosto;
    private JComboBox cmbPrioridad;
    private JButton agregarButton;
    private JTextArea textArea1;
    private JButton ajustarPresupuestoButton;
    private JButton totalesButton;
    private JPanel Ventana;

    public ColaProyecto cola = new ColaProyecto();


    public Ventana(){

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cod = Integer.parseInt(txtCodigo.getText());
                String nom = txtNombre.getText();
                String tip= cmbTipo.getAction().toString();
                float costo= Float.parseFloat(tsxtCosto.getText().toString());
                int prio= Integer.parseInt(cmbPrioridad.getAction().toString());

                Proyecto proyecto = new Proyecto(cod, nom, tip,costo,prio);

                proyecto.setPrioridad(prio);
                cola.encolar(proyecto);
                textArea1.setText(cola.mostrar());
            }

        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().Ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
