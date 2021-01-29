package week12d02;

import classstructureintegrate.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class Street {

    private List<Site> sites = new ArrayList<>();

    public void sellSite(Site site) {
        sites.add(site);
    }

    public int lastSell() {
        Site lastSite = sites.get(sites.size() - 1);
        int siteNumber = 0;
        if (lastSite.getOddEven() == 0) {
            siteNumber = 0;
        } else {
            siteNumber = -1;
        }
        for (Site currentSite : sites) {
            if (lastSite.getOddEven() == currentSite.getOddEven()) {
                siteNumber += 2;
            }
        }
        return siteNumber;
    }
}


