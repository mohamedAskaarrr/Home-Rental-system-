package pro;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class test extends javax.swing.JFrame {

    public test() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        scrollbar1 = new java.awt.Scrollbar();
        jPanel1 = new javax.swing.JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon im = new ImageIcon("src/pro/img/admin.jpeg");
                Image i = im.getImage();
                g.drawImage(i, 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };
        jPanel2 = new javax.swing.JPanel();
        jButton2= new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(169, 202, 205));

        jButton2.setFont(new java.awt.Font("Sama Devanagari", 1, 13)); // NOI18N
        jButton2.setText("Add HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Sama Devanagari", 1, 13)); // NOI18N
        jButton3.setText("Edit home data");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Sama Devanagari", 1, 13)); // NOI18N
        jButton4.setText("Remove home");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Sama Devanagari", 1, 13)); // NOI18N
        jButton5.setText("Show home list");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Sama Devanagari", 1, 13)); // NOI18N
        jButton6.setText("Book home");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Sama Devanagari", 1, 13)); // NOI18N
        jButton7.setText("Show booking list");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Sama Devanagari", 1, 13)); // NOI18N
        jButton8.setText("Block a client account");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sama Devanagari", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("         menu");

        jButton9.setFont(new java.awt.Font("Sama Devanagari", 1, 13)); // NOI18N
        jButton9.setText("Search Client Data");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 483, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        
               jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.repaint();

        JTextField idField = new JTextField(15);
        JTextField descriptionField = new JTextField(15);
        JTextField typeField = new JTextField(15);
        JTextField priceField = new JTextField(15);

        JLabel idLabel = new JLabel("Home ID:");
        JLabel descriptionLabel = new JLabel("Description:");
        JLabel priceLabel = new JLabel("Price:");
        JLabel typeLabel = new JLabel("Type:");

        JButton submitButton = new JButton("Submit");

        GroupLayout layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(idLabel)
                    .addComponent(descriptionLabel)
                    .addComponent(typeLabel)
                    .addComponent(priceLabel)
                    .addComponent(submitButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(idField)
                    .addComponent(descriptionField)
                    .addComponent(typeField)
                    .addComponent(priceField))
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(descriptionLabel)
                    .addComponent(descriptionField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLabel)
                    .addComponent(typeField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(priceField))
                .addComponent(submitButton)
        );

        // Define the action for the submit button
        submitButton.addActionListener(evt1 -> {
            String homeId = idField.getText();
            String description = descriptionField.getText();
            String price = priceField.getText();
            String type = typeField.getText();
            String homeData = "ID: "+homeId + "," +" description: " + description +"," +" price: " + price + "," +" type: "+ type;

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("home.txt", true))) {
                writer.write(homeData);
                writer.newLine();
                JOptionPane.showMessageDialog(null, "Home added successfully!");
                new admin().setVisible(true);
                dispose();
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error adding home.");
            }
        });

        jPanel1.revalidate();
        jPanel1.repaint();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // Clear existing components
        jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.repaint();

        // Create and add text fields
       JTextField idField = new JTextField(15);
        JTextField descriptionField = new JTextField(15);
        JTextField typeField = new JTextField(15);
        JTextField priceField = new JTextField(15);

        JLabel idLabel = new JLabel("Home ID:");
        JLabel descriptionLabel = new JLabel("Description:");
        JLabel priceLabel = new JLabel("Price:");
        JLabel typeLabel = new JLabel("Type:");

        JButton submitButton = new JButton("Submit");

        GroupLayout layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(idLabel)
                    .addComponent(descriptionLabel)
                    .addComponent(typeLabel)
                    .addComponent(priceLabel)
                    .addComponent(submitButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(idField)
                    .addComponent(descriptionField)
                    .addComponent(typeField)
                    .addComponent(priceField))
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(descriptionLabel)
                    .addComponent(descriptionField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLabel)
                    .addComponent(typeField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(priceField))
                .addComponent(submitButton)
        );

        // Define the action for the submit button
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String homeId = idField.getText();
                String newdescription = descriptionField.getText();
                 String newtype = typeField.getText();
                String newprice = priceField.getText();
                String newHomeData = "ID: "+ homeId + "," +" description: " +newdescription +  " price: "+ newprice + "," +" type: "+ newtype;

                try {
                    List<String> lines = Files.readAllLines(Paths.get("home.txt"));
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("home.txt"))) {
                        for (String line : lines) {
                            if (line.startsWith(homeId + ",")) {
                                writer.write(newHomeData);
                            } else {
                                writer.write(line);
                            }
                            writer.newLine();
                        }
                    }
                    
                    JOptionPane.showMessageDialog(null, "Home data updated successfully!");
                      new admin().setVisible(true);
                        this.dispose();
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error updating home data.");
                }
            }

            private void dispose() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });

        // Refresh the panel to show new components
        jPanel1.revalidate();
        jPanel1.repaint();
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        // Clear existing components
        jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.repaint();

        // Create and add text fields
        JTextField idField = new JTextField(15);

        JLabel idLabel = new JLabel("Home ID:");

        JButton submitButton = new JButton("Submit");

        GroupLayout layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(idLabel)
                    .addComponent(submitButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(idField))
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idField))
                .addComponent(submitButton)
        );

        // Define the action for the submit button
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String homeId = idField.getText();

                try {
                    List<String> lines = Files.readAllLines(Paths.get("home.txt"));
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("home.txt"))) {
                        for (String line : lines) {
                            if (!line.startsWith(homeId + ",")) {
                                writer.write(line);
                                writer.newLine();
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Home removed successfully!");
                        new admin().setVisible(true);
                        this.dispose();
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error removing home.");
                }
            }

            private void dispose() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            
        });

        // Refresh the panel to show new components
        jPanel1.revalidate();
        jPanel1.repaint();
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        // Show Home List button action listener
        try {
            List<String> lines = Files.readAllLines(Paths.get("home.txt"));
            StringBuilder homeList = new StringBuilder();
            for (String line : lines) {
                homeList.append(line).append("\n");
            }
            JTextArea textArea = new JTextArea(homeList.toString());
            JScrollPane scrollPane = new JScrollPane(textArea);
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            scrollPane.setPreferredSize(new Dimension(500, 400));
            JOptionPane.showMessageDialog(null, scrollPane, "Home List", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error reading home list.");
        }
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        // Clear existing components
        jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.repaint();

        // Create and add text fields
        JTextField idField = new JTextField(15);
        JTextField clientIdField = new JTextField(15);

        JLabel idLabel = new JLabel("Home ID:");
        JLabel clientIdLabel = new JLabel("Client ID:");

        JButton submitButton = new JButton("Submit");

        GroupLayout layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(idLabel)
                    .addComponent(clientIdLabel)
                    .addComponent(submitButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(idField)
                    .addComponent(clientIdField))
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(clientIdLabel)
                    .addComponent(clientIdField))
                .addComponent(submitButton)
        );

        // Define the action for the submit button
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String homeId = idField.getText();
                String clientId = clientIdField.getText();

                try (BufferedWriter writer = new BufferedWriter(new FileWriter("booking.txt", true))) {
                    writer.write("Home ID: " + homeId + ", Client ID: " + clientId);
                    writer.newLine();
                    JOptionPane.showMessageDialog(null, "Home booked successfully!");
                        new admin().setVisible(true);
                        this.dispose();
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error booking home.");
                }
            }

            private void dispose() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });

        // Refresh the panel to show new components
        jPanel1.revalidate();
        jPanel1.repaint();
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        // Show Booking List button action listener
        try {
            List<String> lines = Files.readAllLines(Paths.get("booking.txt"));
            StringBuilder bookingList = new StringBuilder();
            for (String line : lines) {
                bookingList.append(line).append("\n");
            }
            JTextArea textArea = new JTextArea(bookingList.toString());
            JScrollPane scrollPane = new JScrollPane(textArea);
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            scrollPane.setPreferredSize(new Dimension(500, 400));
            JOptionPane.showMessageDialog(null, scrollPane, "Booking List", JOptionPane.INFORMATION_MESSAGE);
                new admin().setVisible(true);
                        this.dispose();
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error reading booking list.");
        }
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        // Clear existing components
        jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.repaint();

        // Create and add text fields
        JTextField clientIdField = new JTextField(15);

        JLabel clientIdLabel = new JLabel("Client ID:");

        JButton submitButton = new JButton("Submit");

        GroupLayout layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(clientIdLabel)
                    .addComponent(submitButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(clientIdField))
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(clientIdLabel)
                    .addComponent(clientIdField))
                .addComponent(submitButton)
        );

        // Define the action for the submit button
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String clientId = clientIdField.getText();

                try {
                    List<String> lines = Files.readAllLines(Paths.get("userinfo.txt"));
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("userinfo.txt"))) {
                        for (String line : lines) {
                            if (line.startsWith(clientId + ",")) {
                                writer.write(line + ",blocked");
                            } else {
                                writer.write(line);
                            }
                            writer.newLine();
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Client account blocked successfully!");
                        new admin().setVisible(true);
                        this.dispose();
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error blocking client account.");
                }
            }

            private void dispose() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });

        // Refresh the panel to show new components
        jPanel1.revalidate();
        jPanel1.repaint();
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
        // Clear existing components
        jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.repaint();

        // Create and add text fields
        JTextField clientIdField = new JTextField(15);

        JLabel clientIdLabel = new JLabel("Client ID:");

        JButton submitButton = new JButton("Submit");

        GroupLayout layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(clientIdLabel)
                    .addComponent(submitButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(clientIdField))
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(clientIdLabel)
                    .addComponent(clientIdField))
                .addComponent(submitButton)
        );

        // Define the action for the submit button
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String clientId = clientIdField.getText();

                try {
                    List<String> lines = Files.readAllLines(Paths.get("userinfo.txt"));
                    StringBuilder clientData = new StringBuilder();
                    for (String line : lines) {
                        if (line.startsWith(clientId + ",")) {
                            clientData.append(line).append("\n");
                        }
                    }
                    JTextArea textArea = new JTextArea(clientData.toString());
                    JScrollPane scrollPane = new JScrollPane(textArea);
                    textArea.setLineWrap(true);
                    textArea.setWrapStyleWord(true);
                    scrollPane.setPreferredSize(new Dimension(500, 400));
                    JOptionPane.showMessageDialog(null, scrollPane, "Client Data", JOptionPane.INFORMATION_MESSAGE);
                        new admin().setVisible(true);
                        this.dispose();
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error reading client data.");
                }
            }

            private void dispose() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });

        // Refresh the panel to show new components
        jPanel1.revalidate();
        jPanel1.repaint();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Scrollbar scrollbar1;
}
