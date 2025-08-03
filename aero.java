import java.awt.*;
import java.awt.event.*;

public class aero extends Frame implements ActionListener{

    Label nameLabel,genderLabel,ageLabel,placeLabel,outputLabel;

    TextField nameField;
    TextField ageField;
    CheckboxGroup  genderGroup;
    Checkbox male,female;
    Choice placeChoice;
    Button registerButton;

    public aero(){
        setLayout(null);
        setSize (600,300);
        setTitle("Register form");

        nameLabel =new Label("Name:");
        nameLabel.setBounds(50,50,150,20);
        add(nameLabel);

        nameField =new TextField();
        nameField.setBounds(200,50,150,20);
        add(nameField);


        ageLabel=new Label("Age:");
        ageLabel.setBounds(50,80,150,20);
        add(ageLabel);

        ageField=new TextField();
        ageField.setBounds(200,80,150,20);
        add(ageField);

        

        genderLabel =new Label("Gender:");
        genderLabel.setBounds(50,110,150,20);
        add(genderLabel);

        genderGroup =new CheckboxGroup();
        male =new Checkbox("male",genderGroup,false);
        female =new Checkbox("female",genderGroup,true);
        male.setBounds(200,110,100,20);
        female.setBounds(290,110,110,20);
        add(male);
        add(female);

        placeLabel =new Label("Place:");
        placeLabel.setBounds(50,140,150,20);
        add(placeLabel);

        placeChoice=new Choice();
        
        placeChoice.add("Mayiladuthurai");
        placeChoice.add("Kumbakonam");
        placeChoice.add("Nagapattinam");
        placeChoice.add("thanjavur");
        placeChoice.setBounds(200,140,150,20);
        add(placeChoice);

        registerButton =new Button("Register");
        registerButton.setBounds(200,170,100,20);
        registerButton.addActionListener(this);
        add(registerButton);
        
        outputLabel =new Label();
        outputLabel.setBounds(50,200,300,20);
        add(outputLabel);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {

            String name =nameField.getText();
            String gender =genderGroup.getSelectedCheckbox().getLabel();
            String age =ageField.getText();
            String place =placeChoice.getSelectedItem();
            outputLabel.setText("Hello" + name +age+"("+gender+") from " + place +"!");

    }
    public static void main(String args[])
    {
        new aero();
    }
    }








        




    


