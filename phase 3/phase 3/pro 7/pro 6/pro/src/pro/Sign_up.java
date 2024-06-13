package pro;

import java.awt.*;
import java.awt.Graphics;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class Sign_up extends javax.swing.JFrame {

    public Sign_up() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        textField1 = new java.awt.TextField();
        jPanel1 = new javax.swing.JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon im = new ImageIcon("src/pro/img/logo.jpeg");
                Image i = im.getImage();
                g.drawImage(i, 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };
        sing_up = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        eField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        textField1.setText("textField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        sing_up.setBackground(new java.awt.Color(0, 255, 190));
        sing_up.setText("Sign Up");
        sing_up.setToolTipText("");
        sing_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sing_upActionPerformed(evt);
            }
        });

        nameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nameField.setToolTipText("");
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sama Devanagari", 1, 18));
        jLabel1.setText("UserName");

        jLabel2.setFont(new java.awt.Font("Sama Devanagari", 1, 18));
        jLabel2.setText("Password");

        eField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sama Devanagari", 1, 18));
        jLabel3.setText("Email");

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setForeground(new java.awt.Color(0, 153, 255));
        jButton1.setText("I have an account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(51, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(eField, javax.swing.GroupLayout.PREFERRED_SIZE, 226,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 226,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 226,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(sing_up, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(48, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(51, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(eField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sing_up, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(12, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));

        pack();
    }

    private void sing_upActionPerformed(java.awt.event.ActionEvent evt) {
        String name = nameField.getText().trim();
        String email = eField.getText().trim();
        String password = new String(passwordField.getPassword()).trim();

        if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "This field is required ", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (checkEmailInDatabase(email)) {
            Frame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "This email already exists.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            UserInfo user = new UserInfo(name, email, password);
            if (writeUserInfoToDatabase(user)) {
                System.out.println("User with ID " + user.getId() + " signed up successfully.");
                new login().setVisible(true);
                this.dispose();
                String message = "Hello, " + user.getName() + "! Your ID is: " + user.getId();
                Frame frame = new JFrame();
                JOptionPane.showMessageDialog(frame, message, "User Information", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error saving user information.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // Handle action event
    }

    private void eFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // Handle action event
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        new login().setVisible(true);
        this.dispose();
    }

    public static void main(String args[]) {
        loadExistingIDs();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_up().setVisible(true);
            }
        });
    }

    private static void loadExistingIDs() {
        System.out.println("Loading existing IDs...");
        try (Connection conn = DatabaseManager.getConnection();
                PreparedStatement stmt = conn.prepareStatement("SELECT id FROM clients")) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                existingIds.add(rs.getInt("id"));
            }
            System.out.println("Existing IDs loaded: " + existingIds);
        } catch (SQLException e) {
            System.err.println("Error loading existing IDs: " + e.getMessage());
        }
    }

    private boolean writeUserInfoToDatabase(UserInfo user) {
        String sql = "INSERT INTO clients (name, email, password, status) VALUES (?, ?, ?, ?)";
        System.out.println("Connecting to database...");
        try (Connection conn = DatabaseManager.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            System.out.println("Preparing statement...");
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.setString(4, "active"); // Assuming default status is "active"
            int affectedRows = stmt.executeUpdate();
            System.out.println("Statement executed. Affected rows: " + affectedRows);

            if (affectedRows > 0) {
                try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        user.setId(generatedKeys.getInt(1));
                        System.out.println("User ID set: " + user.getId());
                        return true;
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("Error writing user information to database: " + e.getMessage());
        }
        return false;
    }

    private boolean checkEmailInDatabase(String email) {
        String sql = "SELECT email FROM clients WHERE email = ?";
        System.out.println("Checking if email exists in database...");
        try (Connection conn = DatabaseManager.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            try (ResultSet rs = stmt.executeQuery()) {
                boolean exists = rs.next();
                System.out.println("Email exists: " + exists);
                return exists;
            }
        } catch (SQLException e) {
            System.err.println("Error checking email in database: " + e.getMessage());
        }
        return false;
    }

    private javax.swing.JTextField eField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton sing_up;
    private java.awt.TextField textField1;

    private static Set<Integer> existingIds = new HashSet<>();
}

class UserInfo {
    private int id;
    private String name;
    private String email;
    private String password;

    public UserInfo(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
