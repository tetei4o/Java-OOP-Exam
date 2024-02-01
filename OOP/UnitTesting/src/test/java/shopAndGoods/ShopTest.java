package shopAndGoods;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.naming.OperationNotSupportedException;

public class ShopTest {
    @Test(expected = IllegalArgumentException.class)
    public void testIfAddGoodsFails() throws OperationNotSupportedException {
        Shop shop = new Shop();
        shop.addGoods("shelf", new Goods("something", "code"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIfGetShelfFails() throws OperationNotSupportedException {
        Shop shop = new Shop();
        shop.addGoods("shelf", new Goods("something", "code"));
        shop.getShelves().get("some");
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testIfItemExists() throws OperationNotSupportedException {
        Shop shop = new Shop();
        Goods goods = new Goods("something", "code");
        shop.addGoods("Shelves5", goods);

        boolean itemExist = shop.getShelves().containsValue(goods);

        if (itemExist) {
            throw new OperationNotSupportedException("Goods is already in shelf!");
        }
    }

    @Test
    public void testIfGoodIsAdded() throws OperationNotSupportedException {
        Shop shop = new Shop();
        shop.addGoods("Shelves5", new Goods("something", "code"));
        Goods shelves5 = shop.getShelves().get("Shelves5");
        assertEquals(shelves5, shop.getShelves().get("Shelves5"));
    }

    @Test
    public void testIfGoodIsPrint() throws OperationNotSupportedException {
        Shop shop = new Shop();
        assertEquals("Goods: code is placed successfully!", shop.addGoods("Shelves5", new Goods("something", "code")));

    }

    @Test
    public void testIfBooleanReturnsCorrectly() throws OperationNotSupportedException {
        Shop shop = new Shop();
        Goods goods = new Goods("something", "code");
        shop.addGoods("Shelves5", goods);
        assertTrue(shop.getShelves().containsValue(goods));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIfGoodRemoveFailsShelf() throws OperationNotSupportedException {
        Shop shop = new Shop();
        shop.addGoods("Shelves5", new Goods("something", "code"));
        shop.removeGoods("shlf", new Goods("something", "code"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIfGoodRemoveFailsGoods() throws OperationNotSupportedException {
        Shop shop = new Shop();
        shop.addGoods("Shelves5", new Goods("something", "code"));
        shop.removeGoods("Shelves5", new Goods("other", "code"));
    }

    @Test
    public void testIfGoodRemoves() throws OperationNotSupportedException {
        Shop shop = new Shop();
        Goods goods = new Goods("something", "code");
        shop.addGoods("Shelves5", goods);
        shop.removeGoods("Shelves5", goods);
        assertNull(shop.getShelves().get("Shelves5"));
    }

    @Test
    public void testAddGoodsIfItsCorrect() throws OperationNotSupportedException {
        Shop shop = new Shop();
        Goods goods = new Goods("something", "code");
        shop.addGoods("Shelves1", goods);
        assertEquals(goods, shop.getShelves().get("Shelves1"));
    }

    @Test
    public void testIfGoodRemovePrints() throws OperationNotSupportedException {
        Shop shop = new Shop();
        Goods goods = new Goods("something", "code");
        shop.addGoods("Shelves5", goods);

        assertEquals("Goods: code is removed successfully!", shop.removeGoods("Shelves5", goods));
    }
}