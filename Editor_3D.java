import Enumerators.ColorSchema;
import Enumerators.OtherTypeModel;


public enum ColorSchema {
    RGB,
    CMYK,
    HSV,
    CIExyz,
    CIELAB
}

public enum OtherTypeModel {
    OBJ,
    DAE,
    FBX,
    PLY,
    IGS,
    IFC
}

/*
 * Model - сущность 3D-модели с некоторыми атрибутами
 */
public class Model {
    private Integer countPoligons;
    private Integer countPicks;
    private String typeGrid;
    private boolean modifiers;
    private boolean texture;
}

/*
 * Rendering - сущность, полученная путем применения метода renderModel(Model model) 
 */
public class Rendering {
    private Integer resolutionOx;
    private Integer resolutionOy;
    private Integer scale;
    private ColorSchema colorSchema;

}
/*
 * Editor - редактор, позволяющий вносить изменения в переданную(только созданную или загруженную) модель 
 * *посредством применения метода editModel(Model model)
 */
public class Editor {
    public Model editModel(Model model) {
        return model;
    }
}

/* iRepo - интерфейс, позволяющий предотвратить зависимость более абстрактного класса BusinessLogic 
**от менее абстрактного класса Repository 
*/
public interface iRepo {
    public Model getModel();
}


public class Repository implements iRepo{
    public Model getModel(){
        return new Model();
    }

    public void saveChanges(){
        System.out.println("Save completed successfully");
    }
}

public interface iView {
    public void selectNewModel();
}

public class View  implements iView {

    public Model editModel(Model model) {

        Editor editor = new Editor();
        return editor.editModel(model);
    }

    public void uploadModel(){

        iRepo irepo = new Repository();
        Model someModel = irepo.getModel();
        new View().showModel(someModel);
    }

    private void showModel(Model model){
        System.out.println("Model shown");
    }

    public void considerModel(Model model){
        System.out.println("Zoom in and out of the model to see");
    }

    public void selectNewModel(){
        System.out.println("Select of type the model to create");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

public class BusinessLogic{
    public Model convertationModel(OtherTypeModel otherModel){
        new BusinessLogic().changeFormat(otherModel);
        new Repository().saveChanges();
        return new Model();
    }

    private Model changeFormat(OtherTypeModel otherModel){
        return new Model();
    }

    public Model createModel(){
        iView iview = new View();
        iview.selectNewModel();
        return new Model();
    }

    public Rendering renderModel(Model model) {
        return new Rendering();
    }
}