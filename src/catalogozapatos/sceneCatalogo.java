package catalogozapatos;

/**
 * Este es nuestro hilo principal, encargado de desplegar únicamente la 
 * ventana principal donde se verán tres botones: agregar modelo de zapatos,
 * remover modelo de zapatos y ver modelos. Se despliega esta ventana.
 * 
 *
 * Comenzamos por importar las librerías necesarías: application por utilizar
 * javaFx, fxmlLoader para poder cargar la ventana principal de interfaz, Parent
 * que es el contenedor de la principal, scene es el marco físico (investigar diferencia
 * con Parent), Stage se encarga de generar la entidad donde depositamos el 
 * contenedor.
*/ 
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author David, Eduardo, Francisco, Héctor, 
 *         Jaime, Ricardo, Roberto, Sadot. 
 * 
 * Generamos la ventana principal, como una aplicación.
 */
public class sceneCatalogo extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        try {
            /** 
            * Esta parte crea instancias de nuestra ventana de archivo FXML (interfaz editada con scene builder)
            * y le da tamaño al despliegue con la instancia de scene
            */     
            Parent root;        
            root = FXMLLoader.load(getClass().getResource("/Recursos/sceneCatalogo.fxml"));
            Scene scene;
            scene = new Scene(root, 500, 500);
               
            /* 
            * Los siguientes métodos, agregan título a nuestra ventana principal y nos despliegan la ventana 
            * en el orden respectivo en que aparecen en el código.
            */
            //primaryStage.setTitle("Catálogo de Zapatos");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(IOException e) {
            // Preguntar a Inés por esta excepción, cómo manipularla ¿Qué  debemos agregar?

        }

    }

    /**
     * La clase main es la encargada de mandar a llamar el enlance de nuestro visual.
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
