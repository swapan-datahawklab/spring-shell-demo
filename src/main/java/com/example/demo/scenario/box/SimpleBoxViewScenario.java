package com.example.demo.scenario.box;

import org.springframework.shell.component.view.control.BoxView;
import org.springframework.shell.component.view.control.View;
import org.springframework.shell.component.view.screen.Color;
import org.springframework.shell.component.view.screen.ScreenItem;
import org.springframework.shell.geom.HorizontalAlign;
import com.example.demo.scenario.AbstractScenario;
import com.example.demo.scenario.Scenario;
import com.example.demo.scenario.ScenarioComponent;

@ScenarioComponent(name = "Simple boxview", description = "BoxView color and style", category = {
        Scenario.CATEGORY_BOXVIEW })
public class SimpleBoxViewScenario extends AbstractScenario {

    @Override
    public View build() {
        BoxView box = new BoxView();
        configure(box);
        box.setTitle("Title");
        box.setShowBorder(true);
        box.setBackgroundColor(Color.KHAKI4);
        box.setTitleColor(Color.RED);
        box.setTitleStyle(ScreenItem.STYLE_BOLD | ScreenItem.STYLE_ITALIC);
        box.setTitleAlign(HorizontalAlign.CENTER);
        return box;
    }
}