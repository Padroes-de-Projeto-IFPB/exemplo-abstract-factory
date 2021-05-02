package br.edu.ifpb.padroes.abstractfactory.factories;

import br.edu.ifpb.padroes.abstractfactory.buttons.Button;
import br.edu.ifpb.padroes.abstractfactory.buttons.WindowsButton;
import br.edu.ifpb.padroes.abstractfactory.checkboxes.Checkbox;
import br.edu.ifpb.padroes.abstractfactory.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}