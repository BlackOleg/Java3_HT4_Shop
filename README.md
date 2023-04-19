# Задача "Задача Магазин"

## Cписок возможностей вашей программы

1. Печать всех товаров
2. Печать всех товаров, которые есть в наличие
3. Печать всех товаров категории "Аlcohol"

## Использование принципов:
```java
 final StringFormatter formatter = ....
 final boolean CYCLE = true;
 String selectedCat= "Alcohol";        // Магические числа
 // Everywhere  -> Правило DRY (Don’t Repeat Yourself)
 public static List<Goods> ShopMaker(List<Goods> shop) // S - (Single Responsibility Principle)
```


