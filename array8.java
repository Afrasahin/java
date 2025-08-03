import java.awt.*;
import java.awt.event.*;

class array8 extends Frame implements ActionListener
{
	Label nameLabel,emailLabel,dobLabel,phonenumLabel,ageLabel,usernameLabel,momLabel,outputLabel;
	Label passwordLabel;

	TextField nameField,emailField,dobField,phonenumField,ageField,usernameField,passwordField,momField;
	Button loginButton;
	Button registerButton;

	public array8()
	{
		setLayout(null);
		setSize(400, 300);
		setTitle("Registration Form");

		setLayout(null);
		setSize(600,300);
		setTitle("Login Form");

		nameLabel =new Label("Name:");
		nameLabel.setBounds(50,50,100,20);
		add(nameLabel);

		momLabel = new Label("momName");
		momLabel.setBounds(50, 70, 100, 20);
		
		add(momLabel);

		nameField =new TextField();
		nameField.setBounds(150,50,150,20);
		add(nameField);

		momField = new TextField();
		momField.setBounds(50,120,30,20);
		add(momField);

		emailLabel =new Label("Email:");
		emailLabel.setBounds(50,80,100,20);
		add(emailLabel);

		emailField =new TextField();
		emailField.setBounds(150,80,150,20);
		add(emailField);



		dobLabel =new Label("DOB");
		dobLabel.setBounds(50,140,100,20);
		add(dobLabel);

		dobField =new TextField();
		dobField.setBounds(150,140,150,20);
		add(dobField);

		phonenumLabel =new Label("Phone Number:");
		phonenumLabel.setBounds(50,170,100,20);
		add(phonenumLabel);

		phonenumField =new TextField();
		phonenumField.setBounds(150,170,150,20);
		add(phonenumField);

		ageLabel =new Label("Age:");
		ageLabel.setBounds(50,200,100,20);
		add(ageLabel);

		ageField =new TextField();
		ageField.setBounds(150,200,150,20);
		add(ageField);

		registerButton =new Button("Register");
		registerButton.addActionListener(this);
		registerButton.setBounds(150,230,100,20);
		add(registerButton);


passwordLabel =new Label("Password:");
		passwordLabel.setBounds(50,320,100,20);
		add(passwordLabel);

		passwordField =new TextField();
		passwordField.setBounds(150,320,150,20);
		add(passwordField);

		
		

		usernameLabel =new Label("Username:");
		usernameLabel.setBounds(50,290,100,20);
		add(usernameLabel);

		usernameField =new TextField();
		usernameField.setBounds(150,290,150,20);
		add(usernameField);





		loginButton =new Button("Login");
		loginButton.addActionListener(this);
		loginButton.setBounds(260,390,160,20);
		add(loginButton);

		outputLabel =new Label();
		outputLabel.setBounds(50,420,300,20);
		add(outputLabel);

		outputLabel =new Label();
		outputLabel.setBounds(50,450,350,20);
		add(outputLabel);

		setVisible(true);

	}
	public void actionPerformed(ActionEvent e) {

		String name = nameField.getText();
		String mom = momField.getText();
		String email = emailField.getText();
		String dob = dobField.getText();
		String phonenum = phonenumField.getText();
		String age = ageField.getText();
		String username = usernameField.getText();
		String password = passwordField.getText();

		outputLabel.setText("Hello"+name+"you have been registered successfully"+"!");
		outputLabel.setText("Hello"+name+"you have been login successfully"+"!");

	
	}
	public static void main(String args[])
	{
		new array8();
	}

	}

	
	
