package pro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;

public class menu extends javax.swing.JFrame {
    private String userId;

    public menu(String userId) {
        this.userId = userId;
        initComponents();
        displayHomes("");
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon im = new ImageIcon("src/pro/img/bg.jpeg");
                Image i = im.getImage();
                g.drawImage(i, 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };
        jPanel3 = new javax.swing.JPanel();
        hide_menu = new javax.swing.JButton();
        history_book = new javax.swing.JButton();
        profile = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Search = new javax.swing.JButton();
        apartment = new javax.swing.JButton();
        duplex = new javax.swing.JButton();
        villa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new BorderLayout());

        jPanel3.setBackground(new java.awt.Color(144, 170, 178));
        jPanel3.setLayout(new BoxLayout(jPanel3, BoxLayout.Y_AXIS));
        setupMenuPanel();

        jTextField1.setToolTipText("");
        jTextField1.setPreferredSize(new Dimension(200, 30));
        jTextField1.addActionListener(evt -> jTextField1ActionPerformed(evt));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro/img/icons8-search-48.png")));
        jLabel1.setLabelFor(jTextField1);

        Search.setText("Search");
        Search.addActionListener(evt -> SearchActionPerformed(evt));

        apartment.setText("Apartment");
        apartment.addActionListener(evt -> filterHomes("Apartment"));

        duplex.setText("Duplex");
        duplex.addActionListener(evt -> filterHomes("Duplex"));

        villa.setText("Villa");
        villa.addActionListener(evt -> filterHomes("Villa"));

        jLabel2.setFont(new java.awt.Font("Sama Devanagari", 1, 48));
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("Rent Now");

        jPanel4.setOpaque(false);

        setupMainPanelLayout();

        pack();
    }

    private void setupMenuPanel() {
        Dimension buttonSize = new Dimension(150, 40);

        hide_menu.setBackground(new java.awt.Color(132, 163, 172));
        hide_menu.setForeground(new java.awt.Color(255, 255, 255));
        hide_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro/img/icons8-menu-50.png")));
        hide_menu.setMaximumSize(buttonSize);
        hide_menu.setMinimumSize(buttonSize);
        hide_menu.setPreferredSize(buttonSize);
        hide_menu.addActionListener(evt -> hide_menuActionPerformed(evt));

        history_book.setText("History booking");
        history_book.setMaximumSize(buttonSize);
        history_book.setMinimumSize(buttonSize);
        history_book.setPreferredSize(buttonSize);
        history_book.addActionListener(evt -> {
            new BookingHistory(userId).setVisible(true);
            this.dispose();
        });

        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro/img/icons8-person-30.png")));
        profile.setText("Profile");
        profile.setMaximumSize(buttonSize);
        profile.setMinimumSize(buttonSize);
        profile.setPreferredSize(buttonSize);
        profile.addActionListener(evt -> profileActionPerformed(evt));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro/img/icons8-log-out-30-2.png")));
        logout.setText("logout");
        logout.setMaximumSize(buttonSize);
        logout.setMinimumSize(buttonSize);
        logout.setPreferredSize(buttonSize);
        logout.addActionListener(evt -> logoutActionPerformed(evt));

        back_button.setText("Back");
        back_button.setMaximumSize(buttonSize);
        back_button.setMinimumSize(buttonSize);
        back_button.setPreferredSize(buttonSize);
        back_button.addActionListener(evt -> backToMenu());

        jPanel3.add(hide_menu);
        jPanel3.add(Box.createVerticalStrut(10));
        jPanel3.add(profile);
        jPanel3.add(Box.createVerticalStrut(10));
        jPanel3.add(history_book);
        jPanel3.add(Box.createVerticalStrut(10));
        jPanel3.add(logout);
        jPanel3.add(Box.createVerticalStrut(10));
        jPanel3.add(back_button);
    }

    private void setupMainPanelLayout() {
        JPanel searchPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        searchPanel.setOpaque(false);
        searchPanel.add(jLabel1);
        searchPanel.add(jTextField1);
        searchPanel.add(Search);

        JPanel filterPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        filterPanel.setOpaque(false);
        filterPanel.add(apartment);
        filterPanel.add(duplex);
        filterPanel.add(villa);

        jPanel2.add(searchPanel, BorderLayout.NORTH);
        jPanel2.add(jLabel2, BorderLayout.CENTER);
        jPanel2.add(filterPanel, BorderLayout.SOUTH);
        jPanel2.add(jPanel4, BorderLayout.CENTER);

        setLayout(new BorderLayout());
        add(jPanel3, BorderLayout.WEST);
        add(jPanel2, BorderLayout.CENTER);
    }

    private void hide_menuActionPerformed(java.awt.event.ActionEvent evt) {
        // Implement the action for hiding the menu
    }

    private void profileActionPerformed(java.awt.event.ActionEvent evt) {
        new UserProfile(userId).setVisible(true);
        this.dispose();
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        SearchActionPerformed(evt);
    }

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {
        new login().setVisible(true);
        this.dispose();
    }

    private void backToMenu() {
        new menu(userId).setVisible(true);
        this.dispose();
    }

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {
        String searchCriteria = jTextField1.getText();
        ArrayList<Home> results = searchProperties(searchCriteria);
        jPanel4.removeAll();
        jPanel4.setLayout(new GridLayout(0, 3, 10, 10));

        for (Home home : results) {
            JButton homeButton = new JButton("<html>" + home.description + "<br/>Price: " + home.price + "</html>");
            homeButton.setHorizontalTextPosition(SwingConstants.CENTER);
            homeButton.setVerticalTextPosition(SwingConstants.BOTTOM);

            if (home.imagePath != null && !home.imagePath.isEmpty()) {
                ImageIcon imageIcon = new ImageIcon(home.imagePath);
                Image image = imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
                homeButton.setIcon(new ImageIcon(image));
            }

            homeButton.setContentAreaFilled(false);
            homeButton.setBorderPainted(false);
            homeButton.setFocusPainted(false);

            homeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    new HomeBooking(userId, home).setVisible(true);
                    menu.this.dispose();
                }
            });

            jPanel4.add(homeButton);
        }

        jPanel4.revalidate();
        jPanel4.repaint();
    }

    private ArrayList<Home> searchProperties(String criteria) {
        ArrayList<Home> homesList = new ArrayList<>();
        String query = "SELECT * FROM homes WHERE description LIKE ? OR type LIKE ?";

        try (Connection conn = DatabaseManager.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, "%" + criteria + "%");
            pstmt.setString(2, "%" + criteria + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String description = rs.getString("description");
                String homeType = rs.getString("type");
                double price = rs.getDouble("price");
                String imagePath = rs.getString("image_path");
                homesList.add(new Home(id, description, homeType, price, imagePath));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return homesList;
    }

    private void filterHomes(String type) {
        displayHomes(type);
    }

    private void displayHomes(String type) {
        ArrayList<Home> homes = getHomesFromDatabase(type);
        jPanel4.removeAll();
        jPanel4.setLayout(new GridLayout(0, 3, 10, 10));

        for (Home home : homes) {
            JButton homeButton = new JButton("<html>" + home.description + "<br/>Price: " + home.price + "</html>");
            homeButton.setHorizontalTextPosition(SwingConstants.CENTER);
            homeButton.setVerticalTextPosition(SwingConstants.BOTTOM);

            if (home.imagePath != null && !home.imagePath.isEmpty()) {
                ImageIcon imageIcon = new ImageIcon(home.imagePath);
                Image image = imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
                homeButton.setIcon(new ImageIcon(image));
            }

            homeButton.setContentAreaFilled(false);
            homeButton.setBorderPainted(false);
            homeButton.setFocusPainted(false);

            homeButton.addActionListener(evt -> {
                new HomeBooking(userId, home).setVisible(true);
                this.dispose();
            });

            jPanel4.add(homeButton);
        }

        jPanel4.revalidate();
        jPanel4.repaint();
    }

    private ArrayList<Home> getHomesFromDatabase(String type) {
        ArrayList<Home> homesList = new ArrayList<>();
        String query = "SELECT * FROM homes";
        if (!type.isEmpty()) {
            query += " WHERE type = ?";
        }

        try (Connection conn = DatabaseManager.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query)) {
            if (!type.isEmpty()) {
                pstmt.setString(1, type);
            }
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String description = rs.getString("description");
                String homeType = rs.getString("type");
                double price = rs.getDouble("price");
                String imagePath = rs.getString("image_path");
                homesList.add(new Home(id, description, homeType, price, imagePath));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return homesList;
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new menu("exampleUserId").setVisible(true));
    }

    private javax.swing.JButton Search;
    private javax.swing.JButton apartment;
    private javax.swing.JButton duplex;
    private javax.swing.JButton hide_menu;
    private javax.swing.JButton history_book;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton logout;
    private javax.swing.JButton profile;
    private javax.swing.JButton back_button;
    private javax.swing.JButton villa;

}