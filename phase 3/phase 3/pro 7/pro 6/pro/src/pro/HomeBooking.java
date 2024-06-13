package pro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Properties;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import javax.swing.event.ChangeEvent;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFormattedTextField.AbstractFormatter;

public class HomeBooking extends javax.swing.JFrame {
    private String userId;
    private Home home;
    private JDatePickerImpl checkInDatePicker;
    private JDatePickerImpl checkOutDatePicker;
    private javax.swing.JButton bookButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel homeDescriptionLabel;
    private javax.swing.JLabel homePriceLabel;
    private javax.swing.JLabel paymentLabel;
    private javax.swing.JLabel checkInLabel;
    private javax.swing.JLabel checkOutLabel;
    private javax.swing.JLabel monthsLabel;
    private javax.swing.JLabel totalPriceLabel;
    private javax.swing.JTextField monthsField;
    private javax.swing.JPanel jPanel1;

    public HomeBooking(String userId, Home home) {
        this.userId = userId;
        this.home = home;
        initComponents();
    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon im = new ImageIcon("src/pro/img/logo.jpeg");
                Image i = im.getImage();
                g.drawImage(i, 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        UtilDateModel model1 = new UtilDateModel();
        UtilDateModel model2 = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");

        JDatePanelImpl datePanel1 = new JDatePanelImpl(model1, p);
        checkInDatePicker = new JDatePickerImpl(datePanel1, new DateLabelFormatter());

        JDatePanelImpl datePanel2 = new JDatePanelImpl(model2, p);
        checkOutDatePicker = new JDatePickerImpl(datePanel2, new DateLabelFormatter());

        homeDescriptionLabel = new JLabel();
        homePriceLabel = new JLabel();
        paymentLabel = new JLabel();
        checkInLabel = new JLabel("Check-In Date:");
        checkOutLabel = new JLabel("Check-Out Date:");
        monthsLabel = new JLabel("Number of Months:");
        monthsField = new JTextField();
        monthsField.setEditable(false);
        totalPriceLabel = new JLabel("Total Price: $0.00");
        bookButton = new JButton("Book");
        backButton = new JButton("Back");

        homeDescriptionLabel.setText("<html>" + home.description + "<br/>Price: " + home.price + " per month</html>");
        homePriceLabel.setText("Price: " + home.price);
        paymentLabel.setText("Payment: Cash on delivery");

        bookButton.addActionListener(this::bookButtonActionPerformed);
        backButton.addActionListener(evt -> this.dispose());

        // Add change listeners to update months and total price automatically
        checkInDatePicker.getModel().addChangeListener(this::updateMonthsAndPrice);
        checkOutDatePicker.getModel().addChangeListener(this::updateMonthsAndPrice);

        layoutComponents();
    }

    private void layoutComponents() {
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(homeDescriptionLabel)
                                        .addComponent(homePriceLabel)
                                        .addComponent(paymentLabel)
                                        .addComponent(checkInLabel)
                                        .addComponent(checkInDatePicker)
                                        .addComponent(checkOutLabel)
                                        .addComponent(checkOutDatePicker)
                                        .addComponent(monthsLabel)
                                        .addComponent(monthsField)
                                        .addComponent(totalPriceLabel)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(bookButton, GroupLayout.PREFERRED_SIZE, 100,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 100,
                                                        GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(142, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(homeDescriptionLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(homePriceLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(paymentLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkInLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkInDatePicker)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkOutLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkOutDatePicker)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(monthsLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monthsField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalPriceLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(bookButton)
                                        .addComponent(backButton))
                                .addContainerGap(141, Short.MAX_VALUE)));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }

    private void updateMonthsAndPrice(ChangeEvent evt) {
        Date checkInDate = (Date) checkInDatePicker.getModel().getValue();
        Date checkOutDate = (Date) checkOutDatePicker.getModel().getValue();
        if (checkInDate != null && checkOutDate != null) {
            if (checkInDate.after(checkOutDate)) {
                JOptionPane.showMessageDialog(this, "Check-In date must be before Check-Out date.");
                return;
            }
            long diffInMillies = Math.abs(checkOutDate.getTime() - checkInDate.getTime());
            long diffInDays = diffInMillies / (1000 * 60 * 60 * 24);
            int months = (int) (diffInDays / 30);
            double totalPrice = home.price * months;
            monthsField.setText(String.valueOf(months));
            totalPriceLabel.setText("Total Price: $" + String.format("%.2f", totalPrice));
        }
    }

    private void bookButtonActionPerformed(ActionEvent evt) {
        Date checkInDate = (Date) checkInDatePicker.getModel().getValue();
        Date checkOutDate = (Date) checkOutDatePicker.getModel().getValue();
        if (checkInDate == null || checkOutDate == null) {
            JOptionPane.showMessageDialog(this, "Please select both check-in and check-out dates.");
            return;
        }
        if (checkInDate.after(checkOutDate)) {
            JOptionPane.showMessageDialog(this, "Check-In date must be before Check-Out date.");
            return;
        }

        if (!isHomeAvailable(checkInDate, checkOutDate)) {
            JOptionPane.showMessageDialog(this, "The home is already booked for the selected dates.");
            return;
        }

        long diffInMillies = Math.abs(checkOutDate.getTime() - checkInDate.getTime());
        long diffInDays = diffInMillies / (1000 * 60 * 60 * 24);
        int months = (int) (diffInDays / 30);
        double totalPrice = home.price * months;

        try (Connection conn = DatabaseManager.getConnection()) {
            String query = "INSERT INTO bookings (home_id, client_id, checkin_date, checkout_date, total_price, payment_method) VALUES (?, ?, ?, ?, ?, 'Cash on Delivery')";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setInt(1, home.id);
                pstmt.setInt(2, Integer.parseInt(userId));
                pstmt.setDate(3, new java.sql.Date(checkInDate.getTime()));
                pstmt.setDate(4, new java.sql.Date(checkOutDate.getTime()));
                pstmt.setDouble(5, totalPrice);
                pstmt.executeUpdate();

                JOptionPane.showMessageDialog(this, "Booking successful. Total price: $"
                        + String.format("%.2f", totalPrice) + ". Payment will be collected upon delivery.");
                this.dispose();
                new menu(userId).setVisible(true);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Booking failed. Please try again.");
        }
    }

    private boolean isHomeAvailable(Date checkInDate, Date checkOutDate) {
        try (Connection conn = DatabaseManager.getConnection()) {
            String query = "SELECT COUNT(*) FROM bookings WHERE home_id = ? AND NOT (checkout_date <= ? OR checkin_date >= ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setInt(1, home.id);
                pstmt.setDate(2, new java.sql.Date(checkInDate.getTime()));
                pstmt.setDate(3, new java.sql.Date(checkOutDate.getTime()));
                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) {
                    return rs.getInt(1) == 0; // Return true if no overlapping bookings
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error checking availability. Please try again.");
        }
        return false;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new HomeBooking("user_id_placeholder", new Home(0, "Test Description", "Apartment", 1000, ""))
                    .setVisible(true);
        });
    }
}

class DateLabelFormatter extends AbstractFormatter {
    private String datePattern = "yyyy-MM-dd";
    private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

    @Override
    public Object stringToValue(String text) throws ParseException {
        return dateFormatter.parseObject(text);
    }

    @Override
    public String valueToString(Object value) throws ParseException {
        if (value != null) {
            Calendar cal = (Calendar) value;
            return dateFormatter.format(cal.getTime());
        }
        return "";
    }
}
