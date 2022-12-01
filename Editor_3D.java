import Enumerators.ColorSchema;


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

public class Model {
    private Integer countPoligons;
    private Integer countPicks;
    private String typeGrid;
    private boolean modifiers;
    private boolean texture;
}

public class Rendering {
    private Integer resolutionOx;
    private Integer resolutionOy;
    private Integer scale;
    private ColorSchema colorSchema;

}

public class Editor {
    public Model editModel(Model model) {
        return model;
    }
}

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
