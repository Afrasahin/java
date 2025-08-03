import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class SwingAllInOne extends JFrame
{
    public SwingAllInOne()
    {
        setTitle("Swing All In One");
        setLayout(new FlowLayout());
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Name:");
        add(label);

        JTextField text = new JTextField(15);
        add(text);

        JCheckBox checkBox = new JCheckBox("Accept Terms");
        add(checkBox);

        JTextArea textArea =new JTextArea(5,20);
        JScrollPane textScrollPane =new JScrollPane(textArea);
        add(textScrollPane);
       
        JButton button =new JButton("Show message");
        add(button);

        button.addActionListener(e ->{
            String name =text.getText();
            boolean accepted =checkBox.isSelected();
            JOptionPane.showMessageDialog(this,"Name:"+name+"\nAccepted:"+accepted,"Info",JOptionPane.INFORMATION_MESSAGE);
        });
            String [] columns ={"ID","Name"};
            String [] [] data = {
                {"1","Alice"},
                {"2","Bob"}
            };
            JTable table = new JTable(new DefaultTableModel(data,columns));
            JScrollPane tableScrollPane =new JScrollPane(table);
            tableScrollPane.setPreferredSize(new Dimension(200,70));
            add(tableScrollPane);

            String [] fruits ={"Apple","Mango","Cherry","Banana"};
            JList <String> fruitList =new JList<>(fruits);
            JScrollPane fruitPane = new JScrollPane(fruitList);
            fruitPane.setPreferredSize(new Dimension(100,70));
            add(fruitPane);

            JScrollBar bar =new JScrollBar(JScrollBar.HORIZONTAL,50,10,0,100);
            add(bar);

            DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
            DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Node 1");
            DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Node 2");
            root.add(node1);
            root.add(node2);
            JTree tree = new JTree(root);
            JScrollPane treePane = new JScrollPane(tree);
            treePane.setPreferredSize(new Dimension(150,100));
            add(treePane);

            JButton dialogButton = new JButton("Open Dialog");
            add(dialogButton);
            dialogButton.addActionListener(e ->
            {
                JDialog dialog = new JDialog(this, "Dialog", true);
                dialog.setSize(200,100);
                dialog.setLayout(new FlowLayout());
                dialog.add(new JLabel("This Is A Diolog"));
                JButton closebtn =new JButton("Close");
                closebtn.addActionListener(event->dialog.dispose());
                dialog.add(closebtn);
                dialog.setVisible(true);
            });
            setVisible(true);
        }
        public static void main(String args[])
        {
            SwingUtilities.invokeLater(SwingAllInOne::new);
        }
    }