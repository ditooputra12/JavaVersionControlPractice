package com.praktikum.gui;

import com.praktikum.data.Item;
import com.praktikum.main.LoginSystem;
import com.praktikum.users.Mahasiswa;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MahasiswaDashboard {
    private final Scene scene;

    public MahasiswaDashboard(Stage stage, Mahasiswa mhs) {
        Label lblWelcome = new Label("Selamat datang, " + mhs.getNama());

        TextField tfName = new TextField();
        tfName.setPromptText("Nama Barang");
        TextField tfDesc = new TextField();
        tfDesc.setPromptText("Deskripsi");
        TextField tfLoc = new TextField();
        tfLoc.setPromptText("Lokasi");

        Button btnReport = new Button("Laporkan");
        Button btnLogout = new Button("Logout");

        TableView<Item> table = new TableView<>();
        TableColumn<Item, String> colName = new TableColumn<>("Nama");
        colName.setCellValueFactory(new PropertyValueFactory<>("itemname"));
        TableColumn<Item, String> colDesc = new TableColumn<>("Deskripsi");
        colDesc.setCellValueFactory(new PropertyValueFactory<>("description"));
        TableColumn<Item, String> colLoc = new TableColumn<>("Lokasi");
        colLoc.setCellValueFactory(new PropertyValueFactory<>("location"));
        table.getColumns().addAll(colName, colDesc,colLoc);


        ObservableList<Item> data = FXCollections.observableArrayList(LoginSystem.reportedItems);
        table.setItems(data);

        btnReport.setOnAction(e -> {
            String name = tfName.getText().trim();
            String desc = tfDesc.getText().trim();
            String loc  = tfLoc.getText().trim();
            if (!name.isEmpty() && !loc.isEmpty()&&!desc.isEmpty()) {
                Item it = new Item(name, desc, loc);
                it.setStatus("Reported");
                LoginSystem.reportedItems.add(it);
                data.setAll(LoginSystem.reportedItems);
                tfName.clear();
                tfDesc.clear();
                tfLoc.clear();
            }
        });

        btnLogout.setOnAction(e -> stage.setScene(new LoginPane(stage).getScene()));

        HBox inputBox = new HBox(10, tfName, tfDesc, tfLoc, btnReport);
        VBox vbox = new VBox(10, lblWelcome, inputBox, new Label("Daftar Laporan Anda"), table, btnLogout);
        vbox.setPadding(new Insets(20));

        this.scene = new Scene(vbox, 800, 450);
    }

    public Scene getScene() {
        return scene;
    }
}
