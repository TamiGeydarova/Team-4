package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class WishlistPageVK extends AbstractPageVK {
    @FindBy(how = How.CSS, using = "tbody tr")
    private List<WebElement> wishlistItems;

    public WishlistPageVK(WebDriverLib driver) {
        super(driver);
    }

    public boolean isWishlistEmpty() {
        return wishlistItems.size() == 0;
    }

    public int getWishlistItemsCount() {
        return wishlistItems.size();
    }

    public void removeAllWishlistItems() {
        int initialItemsCount = wishlistItems.size();
        for (int i = 0; i < initialItemsCount; i++) {
            WebElement item = driver.findElement(By.cssSelector("tbody tr"));
            item.findElement(By.cssSelector("a[data-original-title=\"Remove\"]")).click();
        }
    }
}
