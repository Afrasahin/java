import java.awt.*;
import java.awt.event.*;

public class array7 extends Frame implements ActionListener
{
    Label nameLabel,genderLabel,countryLabel,addressLabel,outputLabel;
    TextField nameField;
    TextArea addressTextArea;
    CheckboxGroup genderGroup;
    Checkbox male,female;
    Choice countryChoice;
    Button submitButton;
    SetDefaultCloseOperation(EXIT_ON_CLOSE);

    public array7() 
    {
       
         // Set layout and frame properties
        setLayout(null);
        setSize(400, 300);
        setTitle("AWT Form Example");

        // Name Label and TextField

        nameLabel =new Label("Name:");
        nameLabel.setBounds(50, 50, 60, 20);
        add(nameLabel);

        nameField = new TextField();
        nameField.setBounds(120, 50, 150, 20);
        add(nameField);
        
        //gender Label and Radio Buttons
        genderLabel = new Label("Gender:");
        genderLabel.setBounds(50, 90, 60, 20);
        add(genderLabel);

        // Create Checkbox
        genderGroup = new CheckboxGroup();
        male = new Checkbox("Male", genderGroup, false);
        male.setBounds(120,90,60,20);
        female =new Checkbox("Female",genderGroup, true);
        female.setBounds(180,90,70,20);


        add(male);
        add(female);

        // Country Label and ComboBox (Choice)
        countryLabel = new Label("Country:");
        countryLabel.setBounds(50, 130, 60, 20);
        add(countryLabel);
        countryChoice = new Choice();
        countryChoice.setBounds(120, 130, 150, 20);
        countryChoice.add("India");
        countryChoice.add("USA");
        countryChoice.add("UK");
        countryChoice.add("Canada");
        add(countryChoice);

        addressLabel = new Label("Address:");
        addressLabel.setBounds(50, 170, 60, 20);
        add(addressLabel);

        TextArea textArea = new TextArea();
        textArea.setBounds(120, 170, 150, 100);
        add(textArea);
        textArea.setEditable(true);


        // Submit Button
        submitButton = new Button("Submit");
        submitButton.setBounds(120, 280, 100, 20);
        submitButton.addActionListener(this);
        add(submitButton);
        
        // Output Label
        outputLabel = new Label();
        outputLabel.setBounds(120, 310, 200, 20);
        add(outputLabel);

        // Set frame visibility

        setVisible(true);
        }
    public void actionPerformed(ActionEvent e) {
        
            String name = nameField.getText();

            String gender = genderGroup.getSelectedCheckbox().getLabel();

            String country = countryChoice.getSelectedItem();

            outputLabel.setText("Hello " + name +" (" +gender +") from " + country + "!");
    }
    public static void main(String[] args) {
        new array7();
    }
}
        



