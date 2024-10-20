package com.example.demo;

import java.util.List;

import org.springframework.shell.command.annotation.Command;
import org.springframework.shell.component.view.TerminalUIBuilder;
import com.example.demo.scenario.Scenario;
import com.example.demo.catalog.Catalog;
import org.springframework.shell.standard.AbstractShellComponent;
import org.springframework.shell.style.ThemeResolver;

/**
 * Main command access point to view showcase catalog.
 *
 * @author Janne Valkealahti
 */
@Command
public class CatalogCommand extends AbstractShellComponent {

    private final List<Scenario> scenarios;
    private final TerminalUIBuilder terminalUIBuilder;
    private final ThemeResolver themeResolver;

    public CatalogCommand(List<Scenario> scenarios, TerminalUIBuilder terminalUIBuilder, ThemeResolver themeResolver) {
        this.scenarios = scenarios;
        this.terminalUIBuilder = terminalUIBuilder;
        this.themeResolver = themeResolver;
    }

    @Command(command = "catalog")
    public void catalog() {
        Catalog catalog = new Catalog(terminalUIBuilder, themeResolver, scenarios);
        catalog.run();
    }
}