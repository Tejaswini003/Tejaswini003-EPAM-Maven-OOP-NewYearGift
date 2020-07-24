package com.code.NewYearGift;

import java.util.ArrayList;

public class GiftGenerator 
{
	private GiftController giftController;

    ArrayList<String> sweets;

    public GiftGenerator() 
    {
        giftController = new GiftController();
    }

    private void process() 
    {
    	int noOfTimes = (int) (Math.random() * 10);
        giftController.generateGift(noOfTimes);
    }
    public void start() 
    {
        process();
    }

}

