
package newpackage;

import components.AddButton;
import components.DeleteButton;
import components.Filter;
import components.List;
import components.SaveButton;
import components.TextBox;
import components.Title;
import javax.swing.DefaultListModel;
import mediator.Mediator;
import mediator.Editor;

/**
 *
 * @author Andrea Erazo
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
    }
    

