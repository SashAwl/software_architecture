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
 * * посредством применения метода editModel(Model model)
 */
public class Editor {
    public Model editModel(Model model) {
        return model;
    }
}

/* 
* iRepo - интерфейс, позволяющий предотвратить зависимость более абстрактного класса BusinessLogic 
** от менее абстрактного класса Repository 
*/
public interface iRepo {
    public void saveChanges();
}

/* 
 * Repository - класс, содержащий методы для работы с источниками данных; реализует интерфейс iRepo
 * getModel() - возвращает модель из источника данных
 * saveChanges() - сохраняет произведенные изменения 
 */
public class Repository implements iRepo{
    public Model getModel(){
        return new Model();
    }

    public void saveChanges(){
        System.out.println("Save completed successfully");
    }
}

/*
 * View - класс, содержащий методы для работы с визульной частью редактора
 * класс Editor является компонентом данного класса
 * uploadModel() - обращается к методу getModel() класса Repository, загружая тем самым модель из источника данных, и 
 * * с помощью метода showModel(Model model) отображает ее на экране 
 * considerModel(Model model) - позволяет рассматривать модель, вращая, увеличивая или уменьшая ее
 * selectNewModel()  - позволяет посредством меню выбрать тип создаваемой модели и 
 ** вызывает метод createModel() класса BusinessLogic для непосредственного создания модели
 */ 
public class View {

    public Model editModel(Model model) {

        Editor editor = new Editor();
        return editor.editModel(model);
    }

    public void uploadModel(){

        Model someModel = new Repository().getModel();
        new View().showModel(someModel);
    }

    private void showModel(Model model){
        System.out.println("Model shown");
    }

    public void considerModel(Model model){
        System.out.println("Zoom in and out of the model to see");
    }

    public Model selectNewModel(){
        return new BusinessLogic.createModel();
    }
}

/*
 * BusinessLogic - класс, содержащий методы, относящиеся к логике работы редактора
 * convertationModel(OtherTypeModel otherModel) - метод, конвертирующий переданную модель в нужный нам формат 
 ** посредством применения метода changeFormat() и сохраниения изменений в память с помощью метода saveChanges()
 * createModel() - возвращает новую модель
 * renderModel(Model model) - возвращает рендеринг переданной модели
 */
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
        return new Model();
    }

    public Rendering renderModel(Model model) {
        return new Rendering();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}