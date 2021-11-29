package net.mooctest;

import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class ChefTest {

    private Chef testWithFile(String recipe) throws Exception {
        String fileName = "recipe.txt";
        FileOutputStream fos = new FileOutputStream(fileName);
        fos.write(recipe.getBytes());
        fos.close();
        return new Chef(fileName);
    }

    private static Object getField(Object target, String name) throws NoSuchFieldException, IllegalAccessException {
        Field field = target.getClass().getDeclaredField(name);
        field.setAccessible(true);
        return field.get(target);
    }

    @Test
    public void testRecipe3() throws Exception {
        Chef chef = testWithFile("TestRecipe");
        Assert.assertEquals("TestRecipe", chef.mainrecipe.getTitle());
    }

    @Test
    public void testRecipes4() throws Exception {
        Chef chef = testWithFile("TestRecipe.\n\n" + "Ingredients.\n1 level ING1\n2 pinches ING2\n3 level ml ING3\n4 teaspoons ING4\n\n" + "Cooking time: 666 h\n\n" + "Pre-heat oven to 233 degrees Celsius gas mark 77.\n\n" + "Methods.\n\n" + "Serves.555.\n\n");
        Assert.assertEquals(4, chef.mainrecipe.getIngredients().size());
        Assert.assertEquals(1, chef.mainrecipe.getIngredients().get("ing1").getAmount());
        Assert.assertEquals(Ingredient.State.Dry, chef.mainrecipe.getIngredients().get("ing1").getstate());
        Assert.assertEquals(2, chef.mainrecipe.getIngredients().get("ing2").getAmount());
        Assert.assertEquals(Ingredient.State.Dry, chef.mainrecipe.getIngredients().get("ing2").getstate());
        Assert.assertEquals(3, chef.mainrecipe.getIngredients().get("ing3").getAmount());
        Assert.assertEquals(Ingredient.State.Liquid, chef.mainrecipe.getIngredients().get("ing3").getstate());
        Assert.assertEquals(4, chef.mainrecipe.getIngredients().get("ing4").getAmount());
        Assert.assertEquals(Ingredient.State.Dry, chef.mainrecipe.getIngredients().get("ing4").getstate());
        Assert.assertEquals(666, getField(chef.mainrecipe, "cookingtime"));
        Assert.assertEquals(233, getField(chef.mainrecipe, "oventemp"));
        Assert.assertEquals(0, getField(chef.mainrecipe, "gasmark"));
        Assert.assertEquals(555, getField(chef.mainrecipe, "serves"));
    }

    @Test
    public void testHelloWorld() throws Exception {
        Chef chef = testWithFile("Hello World.\n" + "\n" + "Hello World recipe.\n" + "\n" + "Ingredients.\n" + "72 g haricot beans\n" + "101 eggs\n" + "108 g lard\n" + "111 cups oil\n" + "32 zucchinis\n" + "119 ml water\n" + "114 g red salmon\n" + "100 g dijon mustard\n" + "33 potatoes\n" + "\n" + "Method.\n" + "Put potatoes into the mixing bowl. Put dijon mustard into the mixing bowl. Put lard into the mixing bowl. Put red salmon into the mixing bowl. Put oil into the mixing bowl. Put water into the mixing bowl. Put zucchinis into the mixing bowl. Put oil into the mixing bowl. Put lard into the mixing bowl. Put lard into the mixing bowl. Put eggs into the mixing bowl. Put haricot beans into the mixing bowl. Liquefy contents of the mixing bowl. Pour contents of the mixing bowl into the baking dish.\n" + "\n" + "Serves 1.");
        PrintStream sysOut = System.out;
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        System.setOut(new PrintStream(os));
        chef.bake();
        os.close();
        System.setOut(sysOut);
        Assert.assertEquals(1, chef.recipes.size());
        Assert.assertEquals("Hello World.", chef.mainrecipe.getTitle());
        Assert.assertEquals("Hello World recipe.", getField(chef.mainrecipe, "comment"));
        Assert.assertEquals("Hello world!", os.toString().trim());
    }

    @Test
    public void testFib() throws Exception {
        Chef chef = testWithFile("Fibonacci.\n" + "\n" + "Ingredients.\n" + "0 g fiba\n" + "1 g fibb\n" + "16 g iterator\n" + "16 g second iterator\n" + "\n" + "Method.\n" + "Chop the iterator.\n" + "Put fibb into 1st mixing bowl.\n" + "Put fibb into 1st mixing bowl.\n" + "Add fiba into 1st mixing bowl.\n" + "Fold fibb into 1st mixing bowl.\n" + "Fold fiba into 1st mixing bowl.\n" + "Put fiba into 1st mixing bowl.\n" + "Chop the iterator until choped.\n" + "Mash the second iterator.\n" + "Fold fiba into 1st mixing bowl.\n" + "Put fiba into 2nd mixing bowl.\n" + "Mash the second iterator until mashed.\n" + "Pour contents of the 2nd mixing bowl into the 1st baking dish.\n" + "\n" + "Serves 1.");
        PrintStream sysOut = System.out;
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        System.setOut(new PrintStream(os));
        chef.bake();
        os.close();
        System.setOut(sysOut);
        Assert.assertEquals(1, chef.recipes.size());
        Assert.assertEquals("Fibonacci.", chef.mainrecipe.getTitle());
        Assert.assertEquals("1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987", os.toString().trim());
    }
}

