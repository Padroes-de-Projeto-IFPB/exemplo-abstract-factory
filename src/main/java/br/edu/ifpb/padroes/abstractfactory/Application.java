package br.edu.ifpb.padroes.abstractfactory;


import br.edu.ifpb.padroes.abstractfactory.buttons.Button;
import br.edu.ifpb.padroes.abstractfactory.checkboxes.Checkbox;
import br.edu.ifpb.padroes.abstractfactory.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}