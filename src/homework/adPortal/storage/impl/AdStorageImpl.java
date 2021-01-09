package homework.adPortal.storage.impl;

import homework.adPortal.model.Ad;
import homework.adPortal.model.Category;
import homework.adPortal.model.User;
import homework.adPortal.storage.AdStorage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AdStorageImpl implements AdStorage {

    private List<Ad> adList = new LinkedList<>();

    @Override
    public void add(Ad ad) {
        adList.add(ad);
    }

    @Override
    public void printAllAds() {
        System.out.println(adList);
    }

    @Override
    public void printMyAds(User user) {
        for (Ad ad : adList) {
            if (ad.getUser().equals(user)) {
                System.out.println(ad);
            }
        }
    }

    @Override
    public void printByCategory(Category category) {
        for (Ad ad : adList) {
            if (ad.getCategory() == category) {
                System.out.println(ad);
            }
        }
    }

    @Override
    public void deleteMyAds(User user) {
        for (Ad ad : adList) {
            if (ad.getUser().equals(user)) {
                adList.remove(ad);
            }
        }
    }

    @Override
    public void deleteAdByTitle(String title, User currentUser) {
        Iterator<Ad> iterator = adList.iterator();
        while (iterator.hasNext()) {
            Ad ad = iterator.next();
            if (ad.getTitle().equals(title) && ad.getUser().equals(currentUser)) {
                iterator.remove();
            }
        }
    }
}
