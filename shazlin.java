import java.awt.*;
import java.awt.event.*;

class shazlin extends Frame implements ActionListener
{
    Label nameLabel , dobLabel, addressLabel,mobilenumLabel, outputLabel;
    TextField nameField, mobilenumField;
    Choice dobChoice;
    TextArea addressArea;
    Button submitButton;

    public shazlin()
    {
        setLayout(null);
        setSize(400,400);
        setTitle("Registration Form");


        Label name=new Label("Name:");
        name.setBounds(50,50,100,30);
        add(name);

        TextField nameField=new TextField();
        nameField.setBounds(150,50,200,30);
        add(nameField);

        Label mobilenum = new Label("Mobile Number:");
        mobilenum.setBounds(50,75,100,30);
        add(mobilenum);

        mobilenumField = new TextField();
        mobilenumField.setBounds(150,75,200,30);
        add(mobilenumField);

        Label dob = new Label("DOB:");
        dob.setBounds(50,100,100,30);
        add(dob);
        TextField dobField = new TextField();
        dobField.setBounds(150,100,200,30);
        dobChoice = new Choice();
        dobChoice.add("01/01/2000");
        dobChoice.add("02/02/2000");
        dobChoice.add("03/03/2000");
        dobChoice.add("04/04/2000");
        dobChoice.add("05/05/2000");
        dobChoice.setBounds(150, 100, 200, 30);
        add(dobChoice);

        Label address = new Label("Address:");
        address.setBounds(50,150,100,30);
        add(address);


        TextArea textArea = new TextArea(6,30);
        textArea.setBounds(150,150,200,100);
        textArea.setEditable(true);

        add(textArea);

        Button submitButton = new Button("Submit");
        submitButton.setBounds(150,260,100,30);
        submitButton.addActionListener(this);
        add(submitButton);

        outputLabel = new Label();
        outputLabel.setBounds(50,300,300,30);
        add(outputLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String name=nameField.getText();

        String mobilenum=mobilenumField.getText();

        String dob=dobChoice.getSelectedItem();

        //outputLabel.setText("Hello"+name+dob+("Welcome")+"!");

    }
    public static void main(String args[])
    {
        new shazlin();
    }
}