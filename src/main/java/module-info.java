// Original module-info.java file
module com.mycompany.realestateapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.mycompany.realestateapp to javafx.fxml;
    exports com.mycompany.realestateapp;
    
    // requires mysql.connector.java
    requires java.sql;
    
    // javafx.swing
    
}
