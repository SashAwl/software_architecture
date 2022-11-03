public class public static void main(String[] args) {
    {
        public static void main(String[] args)
        {
            Random random = ThreadLocalRandom.current();
                List<ItemGenerator> generatorList = new ArrayList<>();
                generatorList.add(new GemGenerator());
                generatorList.add(new GoldGenerator());
                generatorList.add(new EquipmentGenerator());
                generatorList.add(new WeaponGenerator());
                generatorList.add(new PartsDNKGenerator());
                generatorList.add(new DollarsGenerator());
                generatorList.add(new SuperpowerGenerator());
                
                for (int i = 0; i < 10; i ++){
                    int indx = Math.abs(random.nextInt() % 7);
                    ItemGenerator itemGenerator = generatorList.get(indx);
                    itemGenerator.openReward();
                }
        }
    }
}

// абстрактный класс для создания наград c 2методами: открытие награды и абстрактный метод создания награды
public abstract class ItemGenerator {

    public void openReward() {
        GameItem gameItem = createItem();
        gameItem.open();
    }


    public abstract GameItem createItem();

}

// основной интерфейс - открытие награды
public interface GameItem {
    void open();
 }


// подключаем интерфейс открытия наград GameItem  ко всем классам наград
public class GoldReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Золото открыто");
    }
}

public class GemReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Алмаз открыт");
    }
}

public class EquipmentReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Снаряжение открыто");
    }
}

public class WeaponReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Оружие открыто");
    }
}

public class PartsDNKReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Часть ДНК открыта");
    }
}

public class DollarsReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Доллар открыт");
    }
}

public class  SuperpowerReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Суперсила открыта");
    }
}

// фабрики наград - создаем награды соответствующего типа
// определяем абстрактный метод createItem() для каждого класса-награды
public class GoldGenerator extends ItemGenerator{
    @Override
    public GameItem createItem() {
        return new GoldReward();
    }
}

public class GemGenerator extends ItemGenerator{
    @Override
    public GameItem createItem() {
        return new GemReward();
    }
}

public class EquipmentGenerator extends ItemGenerator{
    @Override
    public GameItem createItem() {
        return new EquipmentReward();
    }
}

public class WeaponGenerator extends ItemGenerator{
    @Override
    public GameItem createItem() {
        return new WeaponReward();
    }
}

public class PartsDNKGenerator extends ItemGenerator{
    @Override
    public GameItem createItem() {
        return new PartsDNKReward();
    }
}

public class DollarsGenerator extends ItemGenerator{
    @Override
    public GameItem createItem() {
        return new DollarsReward();
    }
}

public class SuperpowerGenerator extends ItemGenerator{
    @Override
    public GameItem createItem() {
        return new SuperpowerReward();
    }
}