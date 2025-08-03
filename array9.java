import java.awt.*;
import java.awt.event.*;

public class array9 extends Frame  {
    array9(){
        setLayout(new FlowLayout());
        //Label
        Label label =new Label("Enter Description:");
        add(label);
        //TextArea
        TextArea textArea =new TextArea(6,30);
        add(textArea);
        //Checkbox
        Checkbox cb1=new Checkbox("java");
        Checkbox cb2=new Checkbox("Python");
        add(cb1);
        add(cb2);
        //List
        List list =new List(3);
        list.add("1");
        list.add(" 2");
        list.add("3");
        add(list);
        //Choice
        Choice choice =new Choice();
        choice.add("Red");
        choice.add("Green");
        choice.add("Blue");
        add(choice);
        //Scrollbar
        Scrollbar scrollbar =new Scrollbar(Scrollbar.HORIZONTAL,1,1,1,100);
        add(scrollbar);
        //Menu Bar
        MenuBar menuBar = new MenuBar();
        Menu file = new Menu("File");
        MenuItem newTextFile = new MenuItem("New Text File");
        file.add(newTextFile);
        MenuItem newFile =new MenuItem("New File");
        file.add(newFile);
        MenuItem newWindow =new MenuItem("New Window");
        file.add(newWindow);
        MenuItem newWindow1 =new MenuItem("New Window With Profile");
        file.add(newWindow1);
        MenuItem openFile =new MenuItem("Open File");
        file.add(openFile);
        MenuItem openFolder = new MenuItem("Open Folder");
        file.add(openFolder);
        MenuItem openWorkspace = new MenuItem("Open Workspace From File");
        file.add(openWorkspace);
        MenuItem openRecent = new MenuItem("Open Recent");
        file.add(openRecent);
        MenuItem addFolder = new MenuItem("Add Folder To Workspace ");
        file.add(addFolder);
        MenuItem workSpace =new MenuItem("WorkSpace As");
        file.add(workSpace);
        MenuItem duplicae =new MenuItem("Duplicate Workspace");
        file.add(duplicae);
        MenuItem share =new MenuItem("Share");
        file.add(share);
        MenuItem autoSave =new MenuItem("Auto Save");
        file.add(autoSave);
        MenuItem preference =new MenuItem("Preference");
        file.add(preference);
        MenuItem  revert =new MenuItem("Revert File");
        file.add(revert);
        MenuItem close =new MenuItem("Clode Editor");
        file.add(close);
        MenuItem closeFolder = new  MenuItem("Close Folder");
        file.add(closeFolder);
        MenuItem closeWindow =new MenuItem("Close Window");
        file.add(closeWindow);
        MenuItem open = new MenuItem("Open");
        MenuItem save = new MenuItem("Save");
        MenuItem saveAs = new MenuItem("Save As");
        MenuItem exit = new MenuItem("Exit");
        file.add(open);
        file.add(save);
        file.add(saveAs);
        file.add(exit);


        menuBar.add(file);

        Menu help = new Menu("Help");
        MenuItem about = new MenuItem("About");
        help.add(about);
        menuBar.add(help);
        setMenuBar(menuBar);

        //Frame settings
        setTitle("Awt Components Example");
        setSize(400, 500);
        setVisible(true);

        addWindowListener  (new WindowAdapter()
        {
            public void windowClosing(WindowEvent we) {
                dispose();
            }

        });
        
        exit.addActionListener(e->dispose());
    }
      public static void main(String args[])
      {
        new array9();
      }
      }  

	