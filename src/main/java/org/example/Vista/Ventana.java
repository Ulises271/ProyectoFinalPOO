package org.example.Vista;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private JLabel lblid;
    private JLabel lblNombre;
    private JLabel lblCasa;
    private JLabel lblTipoMago;
    private JLabel lblVocacion;
    private JLabel lblUrl;
    private JLabel lblNwNombre;
    private JLabel lblNwCasa;
    private JLabel lblNwTipoMAgo;
    private JLabel lblNwVocacion;
    private JLabel lblNwUrl;
    private JTextField txtid;
    private JTextField txtNombre;
    private JTextField txtCasa;
    private JTextField txtTipoMago;
    private JTextField txtVocacion;
    private JTextField txtUrl;
    private JTextField txtNwNombre;
    private JTextField txtNwCasa;
    private JTextField txtNwTipoMago;
    private JTextField txtNwVocacion;
    private JTextField txtNwUrl;
    private JButton btnAgregar;
    private JButton btnCargar;
    private JButton btnActualizar;
    private JButton btnBorrar;
    private JTable tblMagos;
    private JScrollPane scrollPane;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel ImagenMagos;

    public Ventana(String title) throws HeadlessException {

        //panel 1
        super(title);
        this.setSize(1200, 800);
        this.layout = new GridLayout(2, 2);
        this.getContentPane().setLayout(this.layout);
        this.panel1 = new JPanel(new FlowLayout());
        this.panel1.setBackground(new Color(97,160,175));
        this.lblid = new JLabel("id: ");
        this.lblNombre = new JLabel("Nombre: ");
        this.lblCasa = new JLabel("Casa: ");
        this.lblTipoMago = new JLabel("Tipo de Mago: ");
        this.lblVocacion = new JLabel("Vocacion: ");
        this.lblUrl= new JLabel("Url de la imagen: ");
        this.txtid = new JTextField(25);
        this.txtid.setText("0");
        this.txtid.setEnabled(false);
        this.txtNombre = new JTextField(35);
        this.txtCasa = new JTextField(35);
        this.txtTipoMago = new JTextField(35);
        this.txtVocacion = new JTextField(35);
        this.txtUrl = new JTextField(35);
        this.btnAgregar = new JButton("Agregar");
        this.panel1.add(this.lblid);
        this.panel1.add(this.txtid);
        this.panel1.add(this.lblNombre);
        this.panel1.add(this.txtNombre);
        this.panel1.add(this.lblCasa);
        this.panel1.add(this.txtCasa);
        this.panel1.add(this.lblTipoMago);
        this.panel1.add(this.txtTipoMago);
        this.panel1.add(this.lblVocacion);
        this.panel1.add(this.txtVocacion);
        this.panel1.add(this.lblUrl);
        this.panel1.add(this.txtUrl);
        this.panel1.add(this.btnAgregar);

        this.getContentPane().add(this.panel1, 0);


        //panel 2

        this.panel2 = new JPanel(new FlowLayout());
        this.panel2.setBackground(new Color(76,44,105));
        this.btnCargar = new JButton("Cargar");
        this.panel2.add(this.btnCargar);
        this.tblMagos = new JTable();
        this.scrollPane = new JScrollPane(this.tblMagos);
        this.panel2.add(this.scrollPane);

        this.getContentPane().add(this.panel2, 1);


        //panel 3

        this.panel3 = new JPanel(new FlowLayout());
        this.panel3.setBackground(new Color(255,159,229));
        this.ImagenMagos = new JLabel("");
        this.panel3.add(this.ImagenMagos);

        this.getContentPane().add(this.panel3, 2);

        //panel 4

        this.panel4 = new JPanel(new FlowLayout());
        this.panel4.setBackground(new Color(216,17,89));
        this.lblNwNombre = new JLabel("Nuevo Nombre: ");
        this.lblNwCasa = new JLabel("Nueva Casa: ");
        this.lblNwTipoMAgo = new JLabel("Nuevo Tipo de mago: ");
        this.lblNwVocacion = new JLabel("Nueva Vocacion: ");
        this.lblNwUrl = new JLabel("New url:");
        this.txtNwNombre = new JTextField(30);
        this.txtNwCasa = new JTextField(30);
        this.txtNwTipoMago = new JTextField(30);
        this.txtNwVocacion = new JTextField(30);
        this.txtNwUrl = new JTextField(30);
        this.btnActualizar = new JButton("Actualizar");
        this.btnBorrar = new JButton("Borrar");
        this.panel4.add(this.btnBorrar);
        this.panel4.add(this.lblNwNombre);
        this.panel4.add(this.txtNwNombre);
        this.panel4.add(this.lblNwCasa);
        this.panel4.add(this.txtNwCasa);
        this.panel4.add(this.lblNwTipoMAgo);
        this.panel4.add(this.txtNwTipoMago);
        this.panel4.add(this.lblNwVocacion);
        this.panel4.add(this.txtNwVocacion);
        this.panel4.add(this.lblNwUrl);
        this.panel4.add(this.txtNwUrl);
        this.panel4.add(this.btnActualizar);

        this.getContentPane().add(this.panel4, 3);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setVisible(true);
    }

    public JLabel getLblid() {
        return lblid;
    }

    public void setLblid(JLabel lblid) {
        this.lblid = lblid;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblCasa() {
        return lblCasa;
    }

    public void setLblCasa(JLabel lblCasa) {
        this.lblCasa = lblCasa;
    }

    public JLabel getLblTipoMago() {
        return lblTipoMago;
    }

    public void setLblTipoMago(JLabel lblTipoMago) {
        this.lblTipoMago = lblTipoMago;
    }

    public JLabel getLblVocacion() {
        return lblVocacion;
    }

    public void setLblVocacion(JLabel lblVocacion) {
        this.lblVocacion = lblVocacion;
    }

    public JLabel getLblUrl() {
        return lblUrl;
    }

    public void setLblUrl(JLabel lblUrl) {
        this.lblUrl = lblUrl;
    }

    public JLabel getLblNwNombre() {
        return lblNwNombre;
    }

    public void setLblNwNombre(JLabel lblNwNombre) {
        this.lblNwNombre = lblNwNombre;
    }

    public JLabel getLblNwCasa() {
        return lblNwCasa;
    }

    public void setLblNwCasa(JLabel lblNwCasa) {
        this.lblNwCasa = lblNwCasa;
    }

    public JLabel getLblNwTipoMAgo() {
        return lblNwTipoMAgo;
    }

    public void setLblNwTipoMAgo(JLabel lblNwTipoMAgo) {
        this.lblNwTipoMAgo = lblNwTipoMAgo;
    }

    public JLabel getLblNwVocacion() {
        return lblNwVocacion;
    }

    public void setLblNwVocacion(JLabel lblNwVocacion) {
        this.lblNwVocacion = lblNwVocacion;
    }

    public JLabel getLblNwUrl() {
        return lblNwUrl;
    }

    public void setLblNwUrl(JLabel lblNwUrl) {
        this.lblNwUrl = lblNwUrl;
    }

    public JTextField getTxtid() {
        return txtid;
    }

    public void setTxtid(JTextField txtid) {
        this.txtid = txtid;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtCasa() {
        return txtCasa;
    }

    public void setTxtCasa(JTextField txtCasa) {
        this.txtCasa = txtCasa;
    }

    public JTextField getTxtTipoMago() {
        return txtTipoMago;
    }

    public void setTxtTipoMago(JTextField txtTipoMago) {
        this.txtTipoMago = txtTipoMago;
    }

    public JTextField getTxtVocacion() {
        return txtVocacion;
    }

    public void setTxtVocacion(JTextField txtVocacion) {
        this.txtVocacion = txtVocacion;
    }

    public JTextField getTxtUrl() {
        return txtUrl;
    }

    public void setTxtUrl(JTextField txtUrl) {
        this.txtUrl = txtUrl;
    }

    public JTextField getTxtNwNombre() {
        return txtNwNombre;
    }

    public void setTxtNwNombre(JTextField txtNwNombre) {
        this.txtNwNombre = txtNwNombre;
    }

    public JTextField getTxtNwCasa() {
        return txtNwCasa;
    }

    public void setTxtNwCasa(JTextField txtNwCasa) {
        this.txtNwCasa = txtNwCasa;
    }

    public JTextField getTxtNwTipoMago() {
        return txtNwTipoMago;
    }

    public void setTxtNwTipoMago(JTextField txtNwTipoMago) {
        this.txtNwTipoMago = txtNwTipoMago;
    }

    public JTextField getTxtNwVocacion() {
        return txtNwVocacion;
    }

    public void setTxtNwVocacion(JTextField txtNwVocacion) {
        this.txtNwVocacion = txtNwVocacion;
    }

    public JTextField getTxtNwUrl() {
        return txtNwUrl;
    }

    public void setTxtNwUrl(JTextField txtNwUrl) {
        this.txtNwUrl = txtNwUrl;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnBorrar() {
        return btnBorrar;
    }

    public void setBtnBorrar(JButton btnBorrar) {
        this.btnBorrar = btnBorrar;
    }

    public JTable getTblMagos() {
        return tblMagos;
    }

    public void setTblMagos(JTable tblMagos) {
        this.tblMagos = tblMagos;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JLabel getImagenMagos() {
        return ImagenMagos;
    }

    public void setImagenMagos(JLabel imagenMagos) {
        ImagenMagos = imagenMagos;
    }
    public void limpiar() {
        this.txtNombre.setText("");
        this.txtCasa.setText("");
        this.txtTipoMago.setText("");
        this.txtVocacion.setText("");
        this.txtUrl.setText("");
    }
}
