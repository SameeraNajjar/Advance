package org.example.javadb;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import org.example.javadb.models.Employee;
import org.example.javadb.models.services.EmployeeDOAImp;
import javafx.scene.control.TextField;
import java.awt.*;
import java.util.List;
import java.util.Observable;

public class HelloController {
    // EmployeeDOAImp employeeDOAImp = new EmployeeDOAImp();

    @FXML
    private Label welcomeText;
    private EmployeeDOAImp employeeDOAImp = new EmployeeDOAImp();
    @FXML
    private TextField tv_name;
    @FXML
    private TextField tv_email;
    @FXML
    private ListView<String> employeeLV;

    @FXML
    protected void onHelloButtonClick() {

        // welcomeText.setText("Welcome to JavaFX Application!");
//        Employee employee = new Employee();
//        employee.setName("Sameera");
//        employee.setEmail("sameera.najjar14@gmail.com");
//        employee.setPhone("0569383093");
//        employeeDOAImp.save(employee);
        Employee employee = new Employee();
        employee.setName("Sameera");
        employeeDOAImp.insert(employee);

        Employee e = employeeDOAImp.getEmployee(6);
        welcomeText.setText(e.getName());

        employeeDOAImp.delete(64);

    }

    @FXML
    protected void getSomeEmployees() {
        List<Employee> all = employeeDOAImp.getAll();
        ObservableList<String> observableList = FXCollections.observableList(
                all.stream()
                        // .filter(e -> e.getId()==6)
                        .map(Employee::getName).toList()
        );
        this.employeeLV.setItems(observableList);
        //all.stream().map(Employee::getName).forEach(System.out::println);
    }
    @FXML
    public void saveEmployee() {
        Employee employee = new Employee();
        employee.setName(tv_name.getText());
        employee.setEmail(tv_email.getText());
        employeeDOAImp.insert(employee);
    }

}