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

package local.example.seed.view;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import local.example.seed.client.AddressWebClient;
import local.example.seed.layout.MainLayout;
import local.example.seed.model.Address;

@PageTitle("address")
@CssImport("style.css")
@Route(value = "address", layout = MainLayout.class)
public class AddressView
        extends Main {

    private final Grid<Address> addressGrid;
    private final Binder<Address> addressBinder;

    private Address address;
    private AddressWebClient addressWebClient;

    private TextField country;
    private TextField city;
    private TextField street;
    private TextField civic;
    private TextField code;

    private final Button cancel;
    private final Button save;
    private final Button delete;

    private final SplitLayout splitLayout;

    public AddressView(
            // TODO
    ) {
        addClassName("main-view");

        this.addressGrid = new Grid<>(Address.class);
        this.addressBinder = new Binder<>(Address.class);

        this.cancel = new Button("");
        this.save = new Button("");
        this.delete = new Button("");

        this.splitLayout = new SplitLayout();
        this.splitLayout.setSizeFull();

        this.add(this.splitLayout);
    }
}
