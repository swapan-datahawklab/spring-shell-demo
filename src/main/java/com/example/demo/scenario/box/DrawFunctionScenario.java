package com.example.demo.scenario.box;

import org.springframework.shell.component.view.control.BoxView;
import org.springframework.shell.component.view.control.View;
import org.springframework.shell.geom.HorizontalAlign;
import org.springframework.shell.geom.VerticalAlign;
import com.example.demo.scenario.AbstractScenario;
import com.example.demo.scenario.Scenario;
import com.example.demo.scenario.ScenarioComponent;

@ScenarioComponent(name = "Draw Function", description = "BoxView DrawFunction", category = {
        Scenario.CATEGORY_BOXVIEW })
public class DrawFunctionScenario extends AbstractScenario {

    @Override
    public View build() {
        BoxView view = new BoxView();
        view.setDrawFunction((screen, rect) -> {
            screen.writerBuilder().build().text("Hello World", rect, HorizontalAlign.CENTER, VerticalAlign.CENTER);
            return rect;
        });
        return view;
    }
}