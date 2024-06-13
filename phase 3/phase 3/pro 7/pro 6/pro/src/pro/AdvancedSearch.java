/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro;

/**
 *
 * @author mohamedmekkkawy
 */
import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdvancedSearch extends JFrame {
    private JTextField priceField;
    private JTextField typeField;
    private JButton searchButton;

    public AdvancedSearch() {
        setTitle("Advanced Search");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        priceField = new JTextField(15);
        typeField = new JTextField(15);
        searchButton = new JButton("Search");

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String price = priceField.getText();
                String type = typeField.getText();
                searchHomes(price, type);
            }
        });

        setLayout(new GroupLayout(getContentPane()));
        GroupLayout layout = (GroupLayout) getContentPane().getLayout();
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(new JLabel("Price:"))
                        .addComponent(new JLabel("Type:"))
                        .addComponent(searchButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(priceField)
                        .addComponent(typeField))
        );
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(new JLabel("Price:"))
                        .addComponent(priceField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(new JLabel("Type:"))
                        .addComponent(typeField))
                .addComponent(searchButton)
        );
    }

    private void searchHomes(String price, String type) {
        String sql = "SELECT * FROM homes WHERE price <= ? AND type = ?";
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, price);
            pstmt.setString(2, type);
            ResultSet rs = pstmt.executeQuery();
            StringBuilder results = new StringBuilder();
            while (rs.next()) {
                results.append("ID: ").append(rs.getInt("id"))
                       .append(", Description: ").append(rs.getString("description"))
                       .append(", Type: ").append(rs.getString("type"))
                       .append(", Price: ").append(rs.getDouble("price")).append("\n");
            }
            JTextArea textArea = new JTextArea(results.toString());
            JScrollPane scrollPane = new JScrollPane(textArea);
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            scrollPane.setPreferredSize(new Dimension(500, 400));
            JOptionPane.showMessageDialog(null, scrollPane, "Search Results", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error performing search.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AdvancedSearch().setVisible(true);
            }
        });
    }
}
