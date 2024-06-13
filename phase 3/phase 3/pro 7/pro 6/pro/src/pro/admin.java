package pro;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.filechooser.FileNameExtensionFilter;

public class admin extends javax.swing.JFrame {

    public admin() {
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
        addHomeButton = new javax.swing.JButton();
        editHomeButton = new javax.swing.JButton();
        showHomeListButton = new javax.swing.JButton();
        bookHomeButton = new javax.swing.JButton();
        showBookingListButton = new javax.swing.JButton();
        blockClientButton = new javax.swing.JButton();
        searchClientButton = new javax.swing.JButton();
        removeHomeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(169, 202, 205));

        addHomeButton.setFont(new java.awt.Font("Sama Devanagari", 1, 13));
        addHomeButton.setText("Add Home");
        addHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHomeButtonActionPerformed(evt);
            }
        });

        editHomeButton.setFont(new java.awt.Font("Sama Devanagari", 1, 13));
        editHomeButton.setText("Edit Home");
        editHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editHomeButtonActionPerformed(evt);
            }
        });

        showHomeListButton.setFont(new java.awt.Font("Sama Devanagari", 1, 13));
        showHomeListButton.setText("Show Home List");
        showHomeListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showHomeListButtonActionPerformed(evt);
            }
        });

        bookHomeButton.setFont(new java.awt.Font("Sama Devanagari", 1, 13));
        bookHomeButton.setText("Book Home");
        bookHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookHomeButtonActionPerformed(evt);
            }
        });

        showBookingListButton.setFont(new java.awt.Font("Sama Devanagari", 1, 13));
        showBookingListButton.setText("Show Booking List");
        showBookingListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBookingListButtonActionPerformed(evt);
            }
        });

        blockClientButton.setFont(new java.awt.Font("Sama Devanagari", 1, 13));
        blockClientButton.setText("Block Client");
        blockClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blockClientButtonActionPerformed(evt);
            }
        });

        searchClientButton.setFont(new java.awt.Font("Sama Devanagari", 1, 13));
        searchClientButton.setText("Search Client Data");
        searchClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchClientButtonActionPerformed(evt);
            }
        });

        removeHomeButton.setFont(new java.awt.Font("Sama Devanagari", 1, 13));
        removeHomeButton.setText("Remove Home");
        removeHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeHomeButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sama Devanagari", 1, 24));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addHomeButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editHomeButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showHomeListButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bookHomeButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showBookingListButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(blockClientButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchClientButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removeHomeButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showHomeListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bookHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(showBookingListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(blockClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(removeHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(177, Short.MAX_VALUE)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 483, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }

    private void addHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.repaint();

        JTextField idField = new JTextField(15);
        JTextField descriptionField = new JTextField(15);
        JTextField typeField = new JTextField(15);
        JTextField priceField = new JTextField(15);
        JTextField image_pathField = new JTextField(100);

        JLabel idLabel = new JLabel("Home ID:");
        JLabel descriptionLabel = new JLabel("Description:");
        JLabel priceLabel = new JLabel("Price:");
        JLabel typeLabel = new JLabel("Type:");
        JLabel image_pathLabel = new JLabel("Image Path:");
        JButton submitButton = new JButton("Submit");

        JButton backButton = new JButton("Back to Menu");

        JButton selectImageButton = new JButton("Select Image");

        selectImageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                fileChooser.setFileFilter(new FileNameExtensionFilter("Images", "jpg", "jpeg", "png"));
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    String imagePath = selectedFile.getAbsolutePath();
                    image_pathField.setText(imagePath);
                    ImageIcon imageIcon = new ImageIcon(imagePath);
                    JLabel imageLabel = new JLabel(imageIcon);
                    jPanel1.add(imageLabel);
                    jPanel1.revalidate();
                    jPanel1.repaint();
                }
            }
        });

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new admin().setVisible(true);
                dispose();
            }
        });

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
                                .addComponent(image_pathLabel)
                                .addComponent(selectImageButton)
                                .addComponent(submitButton)
                                .addComponent(backButton))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(idField)
                                .addComponent(descriptionField)
                                .addComponent(typeField)
                                .addComponent(priceField)
                                .addComponent(image_pathField)));

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
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(image_pathLabel)
                                .addComponent(image_pathField))
                        .addComponent(selectImageButton)
                        .addComponent(submitButton)
                        .addComponent(backButton));

        submitButton.addActionListener(evt1 -> {
            String homeId = idField.getText();
            String description = descriptionField.getText();
            String price = priceField.getText();
            String type = typeField.getText();
            String image_path = image_pathField.getText();
            if (validateInput(homeId, description, type, price)) {
                try (Connection conn = DatabaseManager.getConnection();
                        PreparedStatement pstmt = conn.prepareStatement(
                                "INSERT INTO homes (id, description, type, price, image_path) VALUES (?, ?, ?, ?, ?)")) {
                    pstmt.setInt(1, Integer.parseInt(homeId));
                    pstmt.setString(2, description);
                    pstmt.setString(3, type);
                    pstmt.setDouble(4, Double.parseDouble(price));
                    pstmt.setString(5, image_path);
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Home added successfully!");
                    new admin().setVisible(true);
                    dispose();
                } catch (SQLException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error adding home.");
                }
            }
        });

        jPanel1.revalidate();
        jPanel1.repaint();
    }

    private void editHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.repaint();

        JTextField idField = new JTextField(15);
        JTextField descriptionField = new JTextField(15);
        JTextField typeField = new JTextField(15);
        JTextField priceField = new JTextField(15);
        JTextField image_pathField = new JTextField(100);

        JLabel idLabel = new JLabel("Home ID:");
        JLabel descriptionLabel = new JLabel("Description:");
        JLabel priceLabel = new JLabel("Price:");
        JLabel typeLabel = new JLabel("Type:");
        JLabel image_pathLabel = new JLabel("Image Path:");
        JButton submitButton = new JButton("Submit");

        JButton backButton = new JButton("Back to Menu");

        JButton selectImageButton = new JButton("Select Image");

        selectImageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                fileChooser.setFileFilter(new FileNameExtensionFilter("Images", "jpg", "jpeg", "png"));
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    String imagePath = selectedFile.getAbsolutePath();
                    image_pathField.setText(imagePath);
                    ImageIcon imageIcon = new ImageIcon(imagePath);
                    JLabel imageLabel = new JLabel(imageIcon);
                    jPanel1.add(imageLabel);
                    jPanel1.revalidate();
                    jPanel1.repaint();
                }
            }
        });

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new admin().setVisible(true);
                dispose();
            }
        });

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
                                .addComponent(image_pathLabel)
                                .addComponent(selectImageButton)
                                .addComponent(submitButton)
                                .addComponent(backButton))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(idField)
                                .addComponent(descriptionField)
                                .addComponent(typeField)
                                .addComponent(priceField)
                                .addComponent(image_pathField)));

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
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(image_pathLabel)
                                .addComponent(image_pathField))
                        .addComponent(selectImageButton)
                        .addComponent(submitButton)
                        .addComponent(backButton));

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String homeId = idField.getText();
                String description = descriptionField.getText();
                String price = priceField.getText();
                String type = typeField.getText();
                String image_path = image_pathField.getText();
                if (validateInput(homeId, description, type, price)) {
                    try (Connection conn = DatabaseManager.getConnection();
                            PreparedStatement pstmt = conn.prepareStatement(
                                    "UPDATE homes SET description = ?, type = ?, price = ?, image_path = ? WHERE id = ?")) {
                        pstmt.setString(1, description);
                        pstmt.setString(2, type);
                        pstmt.setDouble(3, Double.parseDouble(price));
                        pstmt.setString(4, image_path);
                        pstmt.setInt(5, Integer.parseInt(homeId));
                        pstmt.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Home updated successfully!");
                        new admin().setVisible(true);
                        dispose();
                    } catch (SQLException e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error updating home.");
                    }
                }
            }
        });

        jPanel1.revalidate();
        jPanel1.repaint();
    }

    private void removeHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.repaint();

        JTextField idField = new JTextField(15);
        JLabel idLabel = new JLabel("Home ID:");
        JButton submitButton = new JButton("Submit");

        JButton backButton = new JButton("Back to Menu");

        GroupLayout layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(idLabel)
                                .addComponent(submitButton)
                                .addComponent(backButton))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(idField)));

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(idLabel)
                                .addComponent(idField))
                        .addComponent(submitButton)
                        .addComponent(backButton));

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new admin().setVisible(true);
                dispose();
            }
        });

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String homeId = idField.getText();
                if (!homeId.isEmpty()) {
                    try (Connection conn = DatabaseManager.getConnection();
                            PreparedStatement pstmt = conn.prepareStatement("DELETE FROM homes WHERE id = ?")) {
                        pstmt.setInt(1, Integer.parseInt(homeId));
                        pstmt.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Home removed successfully!");
                        new admin().setVisible(true);
                        dispose();
                    } catch (SQLException e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error removing home.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Home ID is required.");
                }
            }
        });

        jPanel1.revalidate();
        jPanel1.repaint();
    }

    private void showHomeListButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.repaint();

        JLabel searchLabel = new JLabel("Search:");
        JTextField searchField = new JTextField(20);
        JTable homeTable = new JTable();
        JScrollPane scrollPane = new JScrollPane(homeTable);
        JButton backButton = new JButton("Back to Menu");

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new admin().setVisible(true);
                dispose();
            }
        });

        DefaultTableModel model = new DefaultTableModel(
                new String[] { "ID", "Description", "Type", "Price", "Edit", "Delete" }, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 4 || column == 5;
            }
        };
        homeTable.setModel(model);

        loadHomeData(model);

        homeTable.getColumn("Edit").setCellRenderer(new ButtonRenderer());
        homeTable.getColumn("Edit").setCellEditor(new ButtonEditor(new JCheckBox(), true));

        homeTable.getColumn("Delete").setCellRenderer(new ButtonRenderer());
        homeTable.getColumn("Delete").setCellEditor(new ButtonEditor(new JCheckBox(), false));

        GroupLayout layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(searchLabel)
                                .addComponent(searchField))
                        .addComponent(scrollPane)
                        .addComponent(backButton));

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(searchLabel)
                                .addComponent(searchField))
                        .addComponent(scrollPane)
                        .addComponent(backButton));

        searchField.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                filterTable(searchField.getText(), model);
            }

            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                filterTable(searchField.getText(), model);
            }

            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                filterTable(searchField.getText(), model);
            }
        });

        jPanel1.revalidate();
        jPanel1.repaint();
    }

    private void loadHomeData(DefaultTableModel model) {
        try (Connection conn = DatabaseManager.getConnection();
                PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM homes")) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[] { rs.getInt("id"), rs.getString("description"), rs.getString("type"),
                        rs.getDouble("price"), "Edit", "Delete" });
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading home data.");
        }
    }

    private void filterTable(String query, DefaultTableModel model) {
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + query));
        homeTable.setRowSorter(sorter);
    }

    class ButtonRenderer extends JButton implements TableCellRenderer {
        public ButtonRenderer() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
                int row, int column) {
            setText((value == null) ? "" : value.toString());
            return this;
        }
    }

    class ButtonEditor extends DefaultCellEditor {
        private String label;
        private boolean isEdit;

        public ButtonEditor(JCheckBox checkBox, boolean isEdit) {
            super(checkBox);
            this.isEdit = isEdit;
        }

        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row,
                int column) {
            label = (value == null) ? "" : value.toString();
            JButton button = new JButton(label);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (isEdit) {
                        editHome(table, row);
                    } else {
                        deleteHome(table, row);
                    }
                    fireEditingStopped();
                }
            });
            return button;
        }

        public Object getCellEditorValue() {
            return label;
        }
    }

    private void editHome(JTable table, int row) {
        int homeId = (int) table.getValueAt(row, 0);
        JTextField descriptionField = new JTextField((String) table.getValueAt(row, 1));
        JTextField typeField = new JTextField((String) table.getValueAt(row, 2));
        JTextField priceField = new JTextField(table.getValueAt(row, 3).toString());

        Object[] message = {
                "Description:", descriptionField,
                "Type:", typeField,
                "Price:", priceField
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Edit Home", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            try (Connection conn = DatabaseManager.getConnection();
                    PreparedStatement pstmt = conn
                            .prepareStatement("UPDATE homes SET description = ?, type = ?, price = ? WHERE id = ?")) {
                pstmt.setString(1, descriptionField.getText());
                pstmt.setString(2, typeField.getText());
                pstmt.setDouble(3, Double.parseDouble(priceField.getText()));
                pstmt.setInt(4, homeId);
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Home updated successfully!");
                showHomeListButtonActionPerformed(null);
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error updating home.");
            }
        }
    }

    private void deleteHome(JTable table, int row) {
        int homeId = (int) table.getValueAt(row, 0);
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this home?", "Delete Home",
                JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            try (Connection conn = DatabaseManager.getConnection();
                    PreparedStatement pstmtCheckBookings = conn
                            .prepareStatement("SELECT COUNT(*) FROM bookings WHERE home_id = ?")) {
                pstmtCheckBookings.setInt(1, homeId);
                ResultSet rs = pstmtCheckBookings.executeQuery();
                if (rs.next() && rs.getInt(1) > 0) {
                    JOptionPane.showMessageDialog(null, "Cannot delete this home as it is currently booked.");
                } else {
                    try (PreparedStatement pstmtDeleteHome = conn.prepareStatement("DELETE FROM homes WHERE id = ?")) {
                        pstmtDeleteHome.setInt(1, homeId);
                        pstmtDeleteHome.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Home deleted successfully!");
                        showHomeListButtonActionPerformed(null); // Refresh the table
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error deleting home.");
            }
        }
    }

    private void bookHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.repaint();

        JTextField idField = new JTextField(15);
        JTextField clientIdField = new JTextField(15);

        JLabel idLabel = new JLabel("Home ID:");
        JLabel clientIdLabel = new JLabel("Client ID:");

        JButton submitButton = new JButton("Submit");

        JButton backButton = new JButton("Back to Menu");

        GroupLayout layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(idLabel)
                                .addComponent(clientIdLabel)
                                .addComponent(submitButton)
                                .addComponent(backButton))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(idField)
                                .addComponent(clientIdField)));

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(idLabel)
                                .addComponent(idField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(clientIdLabel)
                                .addComponent(clientIdField))
                        .addComponent(submitButton)
                        .addComponent(backButton));

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new admin().setVisible(true);
                dispose();
            }
        });

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String homeId = idField.getText();
                String clientId = clientIdField.getText();
                if (!homeId.isEmpty() && !clientId.isEmpty()) {
                    try (Connection conn = DatabaseManager.getConnection();
                            PreparedStatement pstmt = conn
                                    .prepareStatement("INSERT INTO bookings (home_id, client_id) VALUES (?, ?)")) {
                        pstmt.setInt(1, Integer.parseInt(homeId));
                        pstmt.setInt(2, Integer.parseInt(clientId));
                        pstmt.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Home booked successfully!");
                        new admin().setVisible(true);
                        dispose();
                    } catch (SQLException e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error booking home.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Both Home ID and Client ID are required.");
                }
            }
        });

        jPanel1.revalidate();
        jPanel1.repaint();
    }

    private void showBookingListButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try (Connection conn = DatabaseManager.getConnection();
                PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM bookings")) {
            ResultSet rs = pstmt.executeQuery();
            StringBuilder bookingList = new StringBuilder();
            while (rs.next()) {
                bookingList.append("Booking ID: ").append(rs.getInt("id"))
                        .append(", Home ID: ").append(rs.getInt("home_id"))
                        .append(", Client ID: ").append(rs.getInt("client_id")).append("\n");
            }
            JTextArea textArea = new JTextArea(bookingList.toString());
            JScrollPane scrollPane = new JScrollPane(textArea);
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            scrollPane.setPreferredSize(new Dimension(500, 400));
            JOptionPane.showMessageDialog(null, scrollPane, "Booking List", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error reading booking list.");
        }
    }

    private void blockClientButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.repaint();

        JTextField clientIdField = new JTextField(15);

        JLabel clientIdLabel = new JLabel("Client ID:");

        JButton submitButton = new JButton("Submit");

        JButton backButton = new JButton("Back to Menu");

        GroupLayout layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(clientIdLabel)
                                .addComponent(submitButton)
                                .addComponent(backButton))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(clientIdField)));

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(clientIdLabel)
                                .addComponent(clientIdField))
                        .addComponent(submitButton)
                        .addComponent(backButton));

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new admin().setVisible(true);
                dispose();
            }
        });

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String clientId = clientIdField.getText();
                if (!clientId.isEmpty()) {
                    try (Connection conn = DatabaseManager.getConnection();
                            PreparedStatement pstmt = conn
                                    .prepareStatement("UPDATE clients SET status = 'blocked' WHERE id = ?")) {
                        pstmt.setInt(1, Integer.parseInt(clientId));
                        pstmt.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Client account blocked successfully!");
                        new admin().setVisible(true);
                        dispose();
                    } catch (SQLException e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error blocking client account.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Client ID is required.");
                }
            }
        });

        jPanel1.revalidate();
        jPanel1.repaint();
    }

    private void searchClientButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.repaint();

        JTextField clientIdField = new JTextField(15);

        JLabel clientIdLabel = new JLabel("Client ID:");

        JButton submitButton = new JButton("Submit");

        JButton backButton = new JButton("Back to Menu");

        GroupLayout layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(clientIdLabel)
                                .addComponent(submitButton)
                                .addComponent(backButton))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(clientIdField)));

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(clientIdLabel)
                                .addComponent(clientIdField))
                        .addComponent(submitButton)
                        .addComponent(backButton));

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new admin().setVisible(true);
                dispose();
            }
        });

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String clientId = clientIdField.getText();
                if (!clientId.isEmpty()) {
                    try (Connection conn = DatabaseManager.getConnection();
                            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM clients WHERE id = ?")) {
                        pstmt.setInt(1, Integer.parseInt(clientId));
                        ResultSet rs = pstmt.executeQuery();
                        StringBuilder clientData = new StringBuilder();
                        while (rs.next()) {
                            clientData.append("ID: ").append(rs.getInt("id"))
                                    .append(", Name: ").append(rs.getString("name"))
                                    .append(", Email: ").append(rs.getString("email"))
                                    .append(", Status: ").append(rs.getString("status")).append("\n");
                        }
                        JTextArea textArea = new JTextArea(clientData.toString());
                        JScrollPane scrollPane = new JScrollPane(textArea);
                        textArea.setLineWrap(true);
                        textArea.setWrapStyleWord(true);
                        scrollPane.setPreferredSize(new Dimension(500, 400));
                        JOptionPane.showMessageDialog(null, scrollPane, "Client Data", JOptionPane.INFORMATION_MESSAGE);
                    } catch (SQLException e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error reading client data.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Client ID is required.");
                }
            }
        });

        jPanel1.revalidate();
        jPanel1.repaint();
    }

    private boolean validateInput(String id, String description, String type, String price) {
        if (id.isEmpty() || description.isEmpty() || type.isEmpty() || price.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required.");
            return false;
        }
        try {
            Double.parseDouble(price);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Price must be a valid number.");
            return false;
        }
        return true;
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
    private javax.swing.JButton addHomeButton;
    private javax.swing.JButton editHomeButton;
    private javax.swing.JButton showHomeListButton;
    private javax.swing.JButton bookHomeButton;
    private javax.swing.JButton showBookingListButton;
    private javax.swing.JButton blockClientButton;
    private javax.swing.JButton searchClientButton;

    private javax.swing.JButton removeHomeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Scrollbar scrollbar1;
    private JTable homeTable;
}
