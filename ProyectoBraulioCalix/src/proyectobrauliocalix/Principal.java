/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobrauliocalix;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Braulio
 */
public class Principal extends javax.swing.JFrame {

    Pintar pintar = new Pintar();
    Nodo nodo = new Nodo();
    static int[][] Madyacencia = new int[10][10];// se pone un maximo de 10 por pura conveniencia

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Agg_Arista = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Norigen = new javax.swing.JTextField();
        Ndestino = new javax.swing.JTextField();
        Agregar_Arista = new javax.swing.JButton();
        Prueba_ruta = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NorigenRuta = new javax.swing.JTextField();
        NodoDestruta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ingresaciclo = new javax.swing.JDialog();
        Nodociclo1 = new javax.swing.JTextField();
        btnciclo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        LabelGrado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        PanelMapa = new javax.swing.JPanel();
        AgArista = new javax.swing.JButton();
        PruebaRuta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Instrucciones = new javax.swing.JTextArea();
        repintar = new javax.swing.JToggleButton();
        Btn_ciclos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setText("Nodo Origen");

        jLabel4.setText("Nodo Destino");

        Agregar_Arista.setText("Agregar Arista");
        Agregar_Arista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Agregar_AristaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Agg_AristaLayout = new javax.swing.GroupLayout(Agg_Arista.getContentPane());
        Agg_Arista.getContentPane().setLayout(Agg_AristaLayout);
        Agg_AristaLayout.setHorizontalGroup(
            Agg_AristaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Agg_AristaLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(Agg_AristaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(Agg_AristaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Norigen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ndestino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
            .addGroup(Agg_AristaLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(Agregar_Arista)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Agg_AristaLayout.setVerticalGroup(
            Agg_AristaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Agg_AristaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(Agg_AristaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Norigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(Agg_AristaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Ndestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(Agregar_Arista)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel6.setText("Nodo origen");

        jLabel7.setText("Nodo Final");

        jButton1.setText("Comprobar Ruta");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Prueba_rutaLayout = new javax.swing.GroupLayout(Prueba_ruta.getContentPane());
        Prueba_ruta.getContentPane().setLayout(Prueba_rutaLayout);
        Prueba_rutaLayout.setHorizontalGroup(
            Prueba_rutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Prueba_rutaLayout.createSequentialGroup()
                .addGroup(Prueba_rutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Prueba_rutaLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(Prueba_rutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Prueba_rutaLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NodoDestruta, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Prueba_rutaLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(104, 104, 104)
                                .addComponent(NorigenRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(Prueba_rutaLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jButton1)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        Prueba_rutaLayout.setVerticalGroup(
            Prueba_rutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Prueba_rutaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(Prueba_rutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(NorigenRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(Prueba_rutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(NodoDestruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        ingresaciclo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        ingresaciclo.getContentPane().add(Nodociclo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 75, 100, -1));

        btnciclo.setText("ciclos");
        btnciclo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncicloMouseClicked(evt);
            }
        });
        ingresaciclo.getContentPane().add(btnciclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 75, -1, -1));

        jLabel5.setText("En que vertice quiere probar ciclos ");
        ingresaciclo.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 46, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(LabelGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 670, 40));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 670, 50));

        PanelMapa.setBackground(new java.awt.Color(153, 153, 153));
        PanelMapa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelMapaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelMapaLayout = new javax.swing.GroupLayout(PanelMapa);
        PanelMapa.setLayout(PanelMapaLayout);
        PanelMapaLayout.setHorizontalGroup(
            PanelMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        PanelMapaLayout.setVerticalGroup(
            PanelMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        getContentPane().add(PanelMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 330));

        AgArista.setText("Agregar Arista");
        AgArista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgAristaMouseClicked(evt);
            }
        });
        getContentPane().add(AgArista, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 520, -1, -1));

        PruebaRuta.setText("Probar Ruta");
        PruebaRuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PruebaRutaMouseClicked(evt);
            }
        });
        getContentPane().add(PruebaRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 520, -1, -1));

        Instrucciones.setEditable(false);
        Instrucciones.setColumns(20);
        Instrucciones.setRows(5);
        Instrucciones.setText("Para agregar nodos, solo hay que hacer click \nsobre el panel de la izquierda, para agregar \naristas, usar los botones para probar una ruta \nentre nodos, usar el boton e ingresar los datos.\nespero sea de su agrado inge ");
        jScrollPane1.setViewportView(Instrucciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 430, 120));

        repintar.setText("REPINTAR");
        repintar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repintarMouseClicked(evt);
            }
        });
        getContentPane().add(repintar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        Btn_ciclos.setText("ciclos");
        Btn_ciclos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_ciclosMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_ciclos, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 520, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Webp.net-resizeimage.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, 250, 200));

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/562290-naruto-asi-son-aldeas-ocultas.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1200, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgAristaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgAristaMouseClicked
        if (Cnodos >= 2) {
            Agg_Arista.pack();
            Agg_Arista.setModal(true);
            Agg_Arista.setLocationRelativeTo(this);
            Agg_Arista.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "se necesitan al menos dos nodos creados para generar aristas \ngracias");
        }
    }//GEN-LAST:event_AgAristaMouseClicked

    private void PanelMapaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMapaMouseClicked
        if (Cnodos < 11) {
            Nodo n = new Nodo(Cnodos, evt.getX(), evt.getY());
            grafo.add(n);
            Pintar.pintarCirculo(PanelMapa.getGraphics(), evt.getX(), evt.getY(), String.valueOf(Cnodos));
            Cnodos++;
        } else {
            JOptionPane.showMessageDialog(this, "no se pueden agregar mas de 10 nodos");
        }
    }//GEN-LAST:event_PanelMapaMouseClicked

    private void Agregar_AristaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Agregar_AristaMouseClicked
        int N1 = 0, N2 = 0;
        try {
            N1 = Integer.parseInt(Norigen.getText());
            N2 = Integer.parseInt(Ndestino.getText());

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "tiene que ingresar numeros");
        }
        if (N1 < 0 || N1 > 15 || N2 < 0 || N2 > 15 || N1 == N2) {
            JOptionPane.showMessageDialog(this, "ha ingresado mal un valor solo se permite un maximo de 15 nodos");
        } else {

        }
        Madyacencia[N1][N2] = 1;
        Madyacencia[N2][N1] = 1;
        int x1 = grafo.get(N1).getVx();
        int y1 = grafo.get(N1).getVy();
        int x2 = grafo.get(N2).getVx();
        int y2 = grafo.get(N2).getVy();
        grafo.get(N1).setGrado(grafo.get(N1).getGrado() + 1);
        grafo.get(N2).setGrado(grafo.get(N2).getGrado() + 1);
        grafo.get(N2).getConexiones().add(grafo.get(N1));
        grafo.get(N1).getConexiones().add(grafo.get(N2));
        Pintar.pintarLinea(PanelMapa.getGraphics(), x1, y1, x2, y2, Color.BLACK);
        String mensaje = "El vertice de menor grado es: ";
        mensaje += gradomenor();
        mensaje += " la suma de los grados es: ";
        mensaje += sumagrador();
        LabelGrado.setText(mensaje);
    }//GEN-LAST:event_Agregar_AristaMouseClicked

    private void PruebaRutaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PruebaRutaMouseClicked
        for (int i = 0; i < grafo.size(); i++) {
            grafo.get(i).setVisitado(false);
        }
        if (Cnodos > 2) {
            Prueba_ruta.pack();
            Prueba_ruta.setModal(true);
            Prueba_ruta.setLocationRelativeTo(this);
            Prueba_ruta.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "se necesitan al menos dos nodos creados para probar una ruta \ngracias");
        }
    }//GEN-LAST:event_PruebaRutaMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        for (int i = 0; i < grafo.size(); i++) {
            grafo.get(i).setVisitado(false);
        }
        int inicio = 0, destino = 0;
        inicio = Integer.parseInt(NorigenRuta.getText());
        destino = Integer.parseInt(NodoDestruta.getText());
        if (grafo.get(inicio).getGrado() > 0 && grafo.get(destino).getGrado() > 0) {
            int Camino[] = new int[10];
            cont = 0;
            Camino = ruta(Camino, inicio, destino);
            System.out.println(llego);
            if (llego) {
            } else {
                for (int i = 0; i < grafo.size(); i++) {
                    grafo.get(i).setVisitado(false);
                }
                Camino = ruta(Camino, destino, inicio);
            }
            cambiarruta(Camino);
        } else {
            JOptionPane.showMessageDialog(this, "No se puede revisar porque minimo un nodo es invalido..");
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void repintarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repintarMouseClicked
        for (int i = 0; i < grafo.size(); i++) {
            for (int j = 0; j < grafo.get(i).getConexiones().size(); j++) {
                Pintar.pintarLinea(PanelMapa.getGraphics(), grafo.get(i).getVx(), grafo.get(i).getVy(),
                        grafo.get(i).getConexiones().get(j).Vx, grafo.get(i).getConexiones().get(j).Vy, Color.BLACK);
            }
        }
    }//GEN-LAST:event_repintarMouseClicked

    private void Btn_ciclosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ciclosMouseClicked
        //que hueva hacer esto dog, al barro
        if (Cnodos > 2) {
            ingresaciclo.pack();
            ingresaciclo.setModal(true);
            ingresaciclo.setLocationRelativeTo(this);
            ingresaciclo.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "se necesitan al menos dos nodos creados para probar un ciclo \ngracias");
        }
    }//GEN-LAST:event_Btn_ciclosMouseClicked

    private void btncicloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncicloMouseClicked
        int C1 = Integer.parseInt(Nodociclo1.getText());
        boolean regreso = false;
        ArrayList cicl = ciclo(regreso, C1, 0);
        String Salida="";
        if (cicl.get(cicl.size()-1).equals(true)) {
            for (int i = 0; i < cicl.size()-1; i++) {
                Salida+=" "+cicl.get(i);
            }
            JOptionPane.showMessageDialog(this,"si hace ciclo con los nodos ");
        }else {
            JOptionPane.showMessageDialog(this, "no se pueden formar ciclos");
        }

    }//GEN-LAST:event_btncicloMouseClicked
    public ArrayList ciclo(boolean regreso, int nodoinicio, int aux) {
        ArrayList conexionesEfectivas= new ArrayList();
        ArrayList conexiones1 = new ArrayList();
        for (int i = 0; i < Madyacencia.length; i++) {
            for (int j = 0; j < Madyacencia[i].length; j++) {
                if (Madyacencia[i][j]==1) {
                    conexiones1.add(j);
                    conexionesEfectivas.add(i);
                    aux = j;
                    
                }
            }
        }
        ArrayList conexiones2 = new ArrayList();
        for (int i = 0; i < Madyacencia.length; i++) {
            for (int j = 0; j < Madyacencia[i].length; j++) {
                if (i == aux) {
                    conexiones2.add(j);
                    conexionesEfectivas.add(i);
                    aux = j;
                }
            }
        }
        ArrayList conexiones3 = new ArrayList();
        for (int i = 0; i < Madyacencia.length; i++) {
            for (int j = 0; j < Madyacencia[i].length; j++) {
                if (i == aux) {
                    conexiones3.add(j);
                    conexionesEfectivas.add(i);
                    aux = j;
                }
            }
        }
        for (int i = 0; i < conexiones3.size(); i++) {
            if (conexiones3.get(i).equals(nodoinicio)) {
                regreso=true;
                conexionesEfectivas.add(true);
            }
        }
        return conexionesEfectivas;
    }

    public static int[] ciclo(int ruta[], int inicio, int aux) {

        return ruta;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    public void cambiarruta(int vertices[]) {
        int conta = 0;
        boolean del0 = false;
        System.out.println("cont" + cont);
        int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        for (int i = 0; i < cont; i++) {
            x1 = grafo.get(vertices[i]).getVx();
            y1 = grafo.get(vertices[i]).getVy();
            x2 = grafo.get(vertices[i + 1]).getVx();
            y2 = grafo.get(vertices[i + 1]).getVy();
            Pintar.pintarLinea(PanelMapa.getGraphics(), x1, y1, x2, y2, Color.MAGENTA);
            if (vertices[i] == 0) {
                x1 = grafo.get(vertices[i]).getVx();
                y1 = grafo.get(vertices[i]).getVy();
                x2 = grafo.get(vertices[i + 1]).getVx();
                y2 = grafo.get(vertices[i + 1]).getVy();
                Pintar.pintarLinea(PanelMapa.getGraphics(), x1, y1, x2, y2, Color.MAGENTA);
                del0 = true;
            }

        }
    }

    public static String gradomenor() {
        String tostring = "";
        int menor = 20;
        int nombre = 0;
        for (int i = 0; i < grafo.size(); i++) {
            if (grafo.get(i).getGrado() < menor) {
                menor = grafo.get(i).getGrado();
                nombre = grafo.get(i).getNombre();

            }
        }
        tostring = String.valueOf(nombre);
        tostring += " : ";
        tostring += String.valueOf(menor);
        return tostring;
    }

    public static int[] ruta(int[] ruta, int actual, int destino) {

        grafo.get(actual).setVisitado(true);
        for (int i = 0; i < Madyacencia.length; i++) {
            for (int j = 0; j < Madyacencia[i].length; j++) {

                if (Madyacencia[i][j] == 1) {

                    if (i == actual) {

                        if (j == destino) {
                            System.out.println(i + "+ " + j);
                            ruta[cont] = actual;
                            ruta[cont + 1] = destino;
                            llego = true;
                            cont++;
                            return ruta;
                        } else if (grafo.get(j).GetVisitado() == false) {
                            ruta[cont] = actual;
                            cont++;
                            actual = j;
                            return ruta(ruta, actual, destino);
                        }
                    }
                }

            }

        }
        return ruta;
    }

    public static int sumagrador() {
        int suma = 0;
        for (int i = 0; i < grafo.size(); i++) {
            suma += grafo.get(i).getGrado();
        }
        return suma;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgArista;
    private javax.swing.JDialog Agg_Arista;
    private javax.swing.JButton Agregar_Arista;
    private javax.swing.JButton Btn_ciclos;
    private javax.swing.JTextArea Instrucciones;
    private javax.swing.JLabel LabelGrado;
    private javax.swing.JTextField Ndestino;
    private javax.swing.JTextField NodoDestruta;
    private javax.swing.JTextField Nodociclo1;
    private javax.swing.JTextField Norigen;
    private javax.swing.JTextField NorigenRuta;
    private javax.swing.JPanel PanelMapa;
    private javax.swing.JButton PruebaRuta;
    private javax.swing.JDialog Prueba_ruta;
    private javax.swing.JButton btnciclo;
    private javax.swing.JDialog ingresaciclo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton repintar;
    // End of variables declaration//GEN-END:variables
/*    SOLICITAR INTERFAZ GRAFICA PARA V TRUE
    SOLICITAR INTERFAZ GRAFICA PARA E TRUE
    REPRESENTAR EN UNA ESTRUCTURA DE DATO TRUE(ARRAYLIST) 
    DIBUJAR EL GRAFO G TRUE
    CALCULAR EL GRADO DEL GRAFO FALSE
    CALCULAR LA SUMA DED LOS GRADOS DE LOS VERTICES V TRUE 
    CALCULAR EL GRADO MENOR ENTRE LOS VERTICES TRUE 
    
    SOLICITAR RUTA Y VALIDARLA FALSE
    CAMBIARLE COLOR A LA RUTA FALSE
    DETECTAR CICLOS EN G FALSE
     */
    static ArrayList<Nodo> grafo = new ArrayList();
    static boolean llego = false;
    int Cnodos = 0; //cantidad de nodos
    static int cont = 0;
}
