import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ElectricityBillingGUI extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField nameField;
    private JTextField unitsField;
    private JTextArea resultArea;

    public ElectricityBillingGUI() {
        setLayout(new GridLayout(4, 2, 10, 10));

        JLabel nameLabel = new JLabel("Customer Name:");
        nameField = new JTextField(20);

        JLabel unitsLabel = new JLabel("Units Consumed:");
        unitsField = new JTextField(10);

        JButton calculateButton = new JButton("Calculate");
        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateBill();
            }
        });

        add(nameLabel);
        add(nameField);
        add(unitsLabel);
        add(unitsField);
        add(new JLabel()); 
        add(calculateButton);
        add(new JLabel("Bill Amount:"));
        add(resultArea);
    }

    private void calculateBill() {
        String name = nameField.getText();
        int unitsConsumed = Integer.parseInt(unitsField.getText());

        Customer customer = new Customer(name, unitsConsumed);
        double billAmount = ElectricityBillingSystem.calculateBill(unitsConsumed);

        resultArea.setText("Customer: " + customer.getName() + "\n"
                + "Units consumed: " + customer.getUnitsConsumed() + "\n"
                + "Bill amount: $" + billAmount);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Electricity Billing System");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new ElectricityBillingGUI());
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}

