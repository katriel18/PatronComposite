package gui;

import implementacion.ProductoCompuesto;
import implementacion.ProductoPeso;
import implementacion.ProductoUnitario;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JPanel panel1;
    private JTextArea textArea1;
    private JButton button1;
    private JButton Button2;
    private JButton Button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton pack4Button;
    private JTextField textField1;

    ProductoCompuesto pedido=new ProductoCompuesto();

    public Main() {

        Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        panel1.setBorder(padding);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Peso", "Arroz - S/3.00 x kg", 1));

                    pedido.addProducto(new ProductoPeso(peso, 3, "Arroz", "Cereal"));
                    textField1.setText(String.valueOf(pedido.getImporteTotal()));

                    textArea1.setText("");
                    textArea1.setText(pedido.toString());
                }catch (Exception ex){
                    System.out.println("Ingrese peso del producto!");
                }

            }
        });
        Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Double peso=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese Peso","Azucar - S/4.00 x kg",1));
                    pedido.addProducto(new ProductoPeso(peso,4,"Azucar","Vegetal"));

                    textField1.setText(String.valueOf(pedido.getImporteTotal()));

                    textArea1.setText("");
                    textArea1.setText(pedido.toString());
                }catch (Exception ex){
                    System.out.println("Ingrese peso del producto!");
                }
            }
        });
        Button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Integer cant=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Cantidad","Galleta - S/1.00",1));
                    pedido.addProducto(new ProductoUnitario(cant,1,"Galleta","Dulces"));

                    textField1.setText(String.valueOf(pedido.getImporteTotal()));

                    textArea1.setText("");
                    textArea1.setText(pedido.toString());
                }catch (Exception ex){
                    System.out.println("Ingrese cantidad del producto!");
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Integer cant = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Cantidad", "Soda - S/2.00", 1));
                    pedido.addProducto(new ProductoUnitario(cant, 2, "Soda", "Dulces"));

                    textField1.setText(String.valueOf(pedido.getImporteTotal()));

                    textArea1.setText("");
                    textArea1.setText(pedido.toString());
                }catch (Exception ex){
                    System.out.println("Ingrese cantidad del producto!");
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null,"Jabon - S/3.00\nToalla - S/5.00\nChampu - S/2.00");

                ProductoCompuesto pack1=new ProductoCompuesto();
                pack1.addProducto(new ProductoUnitario(1,3,"Jabon","Pack 1"));
                pack1.addProducto(new ProductoUnitario(1,5,"Toalla","Pack 1"));
                pack1.addProducto(new ProductoUnitario(1,2,"Champu","Pack 1"));
                pedido.addProducto(pack1);

                textField1.setText(String.valueOf(pedido.getImporteTotal()));

                textArea1.setText("");
                textArea1.setText(pedido.toString());
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null,"Cafe - S/3.00\nPan - S/1.00\nJamon - S/2.00");

                ProductoCompuesto pack2=new ProductoCompuesto();
                pack2.addProducto(new ProductoUnitario(1,3,"Cafe","Pack 2"));
                pack2.addProducto(new ProductoUnitario(1,1,"Pan","Pack 2"));
                pack2.addProducto(new ProductoUnitario(1,2,"Jamon","Pack 2"));
                pedido.addProducto(pack2);

                textField1.setText(String.valueOf(pedido.getImporteTotal()));

                textArea1.setText("");
                textArea1.setText(pedido.toString());

            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Aceite - S/6.00\nGelatina - S/1.00\nHarina - S/4.00");

                ProductoCompuesto pack3=new ProductoCompuesto();
                pack3.addProducto(new ProductoUnitario(1,6,"Aceite","Pack 3"));
                pack3.addProducto(new ProductoUnitario(1,1,"Gelatina","Pack 3"));
                pack3.addProducto(new ProductoPeso(1,4,"Harina","Pack 3"));
                pedido.addProducto(pack3);

                textField1.setText(String.valueOf(pedido.getImporteTotal()));

                textArea1.setText("");
                textArea1.setText(pedido.toString());
            }
        });
        pack4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Lenteja - S/6.00\nLeche - S/3.00\nSoya - S/4.00");

                ProductoCompuesto pack4=new ProductoCompuesto();
                pack4.addProducto(new ProductoPeso(1,6,"Lenteja","Pack 4"));
                pack4.addProducto(new ProductoUnitario(1,3,"Leche","Pack 4"));
                pack4.addProducto(new ProductoPeso(1,4,"Soya","Pack 4"));
                pedido.addProducto(pack4);

                textField1.setText(String.valueOf(pedido.getImporteTotal()));

                textArea1.setText("");
                textArea1.setText(pedido.toString());

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Punto de Venta");
        frame.setContentPane(new Main().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
