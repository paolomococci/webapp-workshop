/**
 *
 * Copyright 2020 paolo mococci
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed following in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package local.example.seed.layout;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentUtil;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.tabs.TabsVariant;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

import java.util.Optional;

@Theme(value = Lumo.class, variant = Lumo.DARK)
public class MainLayout
        extends AppLayout {

    private final Tabs menu;
    private H1 title;

    public MainLayout() {
        setPrimarySection(Section.DRAWER);
        addToNavbar(true, createHeaderContent());
        this.menu = createMenu();
        addToDrawer(createDrawerContent(this.menu));
    }

    private Component createHeaderContent() {
        HorizontalLayout horizontalLayout = new HorizontalLayout();
        horizontalLayout.setWidthFull();
        horizontalLayout.setSpacing(false);
        horizontalLayout.setAlignItems(FlexComponent.Alignment.BASELINE);
        horizontalLayout.add(new DrawerToggle());
        this.title = new H1();
        horizontalLayout.add(this.title);
        return horizontalLayout;
    }

    private Component createDrawerContent(Tabs tabs) {
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.setSizeFull();
        verticalLayout.setPadding(true);
        verticalLayout.setSpacing(false);
        verticalLayout.setAlignItems(FlexComponent.Alignment.CENTER);
        HorizontalLayout horizontalLayout = new HorizontalLayout();
        horizontalLayout.setAlignItems(FlexComponent.Alignment.END);
        horizontalLayout.add(new H1("empty"));
        verticalLayout.add(horizontalLayout, tabs);
        return verticalLayout;
    }

    private Tabs createMenu() {
        final Tabs tabs = new Tabs();
        tabs.setOrientation(Tabs.Orientation.VERTICAL);
        tabs.addThemeVariants(TabsVariant.LUMO_MINIMAL);
        tabs.add(createMenuItems());
        return tabs;
    }

    private Component[] createMenuItems() {
        // TODO
        return new Component[0];
    }

    private Optional<Tab> getTabForComponent(Component component) {
        return this.menu.getChildren()
                .filter(
                        tab -> ComponentUtil.getData(
                                tab,
                                Class.class).equals(component.getClass()
                        )
                ).findFirst().map(Tab.class::cast);
    }

    private static Tab createTab() {
        // TODO
        return null;
    }

    private String getCurrentPageTitle() {
        return getContent()
                .getClass()
                .getAnnotation(PageTitle.class)
                .value();
    }

    @Override
    protected void afterNavigation() {
        super.afterNavigation();
        // TODO
    }
}
