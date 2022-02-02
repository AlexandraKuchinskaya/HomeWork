package HomeWork5.test;

import HomeWork5.dto.RegExSearch;
import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class RegExSearchTest {

    private RegExSearch regExSearch = new RegExSearch();


    @Test
    public void search() {


        String text = "Мама мыла раму у своей мамы вместе с мама";
        long actual = regExSearch.search(text, "Мама");

        Assert.assertEquals(1,actual);


    }
}