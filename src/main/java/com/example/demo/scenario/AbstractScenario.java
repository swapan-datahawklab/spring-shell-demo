package com.example.demo.scenario;

import org.springframework.shell.component.view.TerminalUI;
import org.springframework.shell.component.view.control.View;
import org.springframework.shell.component.view.control.ViewService;
import org.springframework.shell.component.view.event.EventLoop;
import org.springframework.shell.style.ThemeResolver;

/**
 * Base implementation of a {@link Scenario} helping to avoid some bloatware.
 *
 * @author Janne Valkealahti
 */
public abstract class AbstractScenario implements Scenario {

    private TerminalUI ui;
    private ViewService viewService;
    private EventLoop eventloop;
    private ThemeResolver themeResolver;
    private String themeName;

    protected ViewService getViewService() {
        return viewService;
    }

    protected EventLoop getEventloop() {
        return eventloop;
    }

    protected ThemeResolver getThemeResolver() {
        return themeResolver;
    }

    protected String getThemeName() {
        return themeName;
    }

    protected TerminalUI getTerminalUI() {
        return ui;
    }

    @Override
    public View build() {
        throw new UnsupportedOperationException("Need to implement via 'buildContext'");
    }

    @Override
    public Scenario configure(TerminalUI ui) {
        this.ui = ui;
        this.themeName = ui.getThemeName();
        this.themeResolver = ui.getThemeResolver();
        this.eventloop = ui.getEventLoop();
        this.viewService = ui.getViewService();
        return this;
    }

    protected void configure(View view) {
        if (ui != null) {
            ui.configure(view);
        }
    }
}