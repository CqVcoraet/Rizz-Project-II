// Imported Packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rizz {
    // Attributes
    private String name;
    private int age;
    private double rizzStrength;
    private boolean rizzByDefault;
    private double version;
    private String description;

    // Default Constructor
    public Rizz() {
        this.name = "System Default Rizzler";
        this.age = 16;
        this.rizzStrength = 900;
        this.rizzByDefault = true;
        this.version = 1.0;
        this.description = "System Default Rizzler Object";
    }

    // Parameterized Constructor
    public Rizz(String name, int age, double rizzStrength, boolean rizzByDefault, double version, String description) {
        this.name = name;
        this.age = age;
        this.rizzStrength = rizzStrength;
        this.rizzByDefault = rizzByDefault;
        this.version = version;
        this.description = description;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRizzStrength() {
        return rizzStrength;
    }

    public void setRizzStrength(double rizzStrength) {
        this.rizzStrength = rizzStrength;
    }

    public boolean isRizzByDefault() {
        return rizzByDefault;
    }

    public void setRizzByDefault(boolean rizzByDefault) {
        this.rizzByDefault = rizzByDefault;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }   

    public void setDescription(String description) {
        this.description = description;
    }

    public static void main(String[] args) {
        // GUI
        JFrame frame = new JFrame("Rizzler Panel");
        frame.setSize(800, 1600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);

        // Panel for all Components
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(800, 800));

        // GUI Title
        JLabel title = new JLabel("Control Panel");
        title.setBounds(20, 20, 450, 50);
        title.setFont(new Font("Serif", Font.BOLD, 45));
        panel.add(title);

        // Rizz up Someone! (User Input)
        JLabel rizzLabel = new JLabel("Rizz up Someone!");
        rizzLabel.setBounds(20, 80, 300, 50);
        rizzLabel.setFont(new Font("Serif", Font.PLAIN, 25));

        JTextField rizzField = new JTextField();
        rizzField.setBounds(20, 120, 200, 50);
        rizzField.setColumns(10);

        JButton rizzButton = new JButton("Rizz!");
        rizzButton.setBounds(230, 120, 100, 50);

        // ActionListener for the button
        rizzButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String rizzName = rizzField.getText().trim(); // Get the input and trim any whitespace

                // Conditional logic to determine response
                if (rizzName.equalsIgnoreCase("Nick Walborne")) {
                    JOptionPane.showMessageDialog(frame, "Nick was born in a wall, ok.");
                } else if (rizzName.equalsIgnoreCase("Luana")) {
                    JOptionPane.showMessageDialog(frame, "Luana, your makeup makes you look cute! Was a joke only.");
                } else if (rizzName.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please enter a name to rizz!");
                } else if (rizzName.equalsIgnoreCase("EL GOBLINO REAL")) {
                    JOptionPane.showMessageDialog(frame, "NOOOO, HOW COOULD YOU MAAAN YOU CANT DOO THIS TO ME!");
                } else if (rizzName.equalsIgnoreCase("NIGHTMARE RUSH")) {
                    JOptionPane.showMessageDialog(frame, "CANT YOU SEE IM RUSHING HERE!?!?");
                } else {
                    JOptionPane.showMessageDialog(frame, "Rizzing " + rizzName + "!");
                }
            }
        });

        // Adding components to the panel
        panel.add(rizzLabel);
        panel.add(rizzField);
        panel.add(rizzButton);

        // Scrolling
        JScrollPane scrollPane = new JScrollPane(panel);
        frame.add(scrollPane);

        // Visibility Setting (Keep this below everything else regarding the GUI!)
        frame.setVisible(true);
    }
}

