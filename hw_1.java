public class HW_1
{
    public class InMemoryModel
    {
        Class ModelStore 
        {
            public PoligonalModel models;
            public Scene scenes;
            public Flash flashes;
            public Camera cameras;
            
            public modelStore()
            {
                models = new PoligonalModel(Poligon somePoligon);
                flashes = new Flash();
                cameras = new Camera();
                scenes = new Scene(PoligonalModel models, Flash flashes, Camera cameras);
            }
            
            public getScena(Int i): Scene
            {
                Scene scenOne = new Scene();
                return scenOne;
            } 
        }
    }

    public class ModelElements
    {
        public class PoligonalModel
        {
            public Poligon poligons;
            public Texture textures;

            public PoligonalModel(Poligon somePoligon)
            {
                poligons = somePoligon;
                textures = new Texture();
            }
        }

        public class Texture
        {
        }

        public class Poligon
        {
            public Point3D points;
        }

        public class Flash
        {
            public Point3D location;
            public Angle3d angle;
            public Color color;
            public Float power;

            public void rotate(Angle3D a)
            {
                Angle3D angleOne = new Angle3D();
            }

            public void move(Point3D p)
            {
                Point3D pointOne = new Point3D();
            }
        }

        public class Camera
        {
            public Point3D location;
            public Angle3d angle;

            public void rotate(Angle3D a)
            {
                Angle3D angleOne = new Angle3D();
            }

            public void move(Point3D p) 
            {
                Point3D pointOne = new Point3D();
            }
        }

        public class Scene
        {
            public Int id;
            public PoligonalModel models;
            public Flash flashes;

            public Scene(PoligonalModel somePoligonalModel, Flash someFlash, Camera someCamera)
            {
                models = somePoligonalModel;
                flashes = someFlash;
                cameras = someCamera;
            }

            public Type method1(Type m)
            {
                return m;
            }

            public Type method2(Type m1, Type m2)
            {
                return m1;
            }
        }
    }
}