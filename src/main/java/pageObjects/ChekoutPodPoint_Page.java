package pageObjects;

import java.io.IOException;

public class ChekoutPodPoint_Page extends BasePage {



    public ChekoutPodPoint_Page() throws IOException {
        super();
    }

    public ChekoutPodPoint_Page getUrl(String url) throws IOException {
        getDriver().get(url);
        return new ChekoutPodPoint_Page();
    }
}
