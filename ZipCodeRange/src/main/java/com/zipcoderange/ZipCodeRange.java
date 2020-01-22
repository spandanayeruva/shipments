package com.zipcoderange;


import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.zipcode.test.ZipCodeRangeTest.ZipCodesRestricted;

/**
 * provides minimum number of ranges of zipcodes where packages can be sent to.
 */
public class ZipCodeRange {

	public void zipcodes(List<ZipCodesRestricted> restrictedZipsList) {

		List<ZipCodesRestricted> finalZipCodes = new LinkedList<ZipCodesRestricted>();
		ZipCodesRestricted tmpZip = null;

		// sorting the lower and upper bound of zipcodes 
		Collections.sort(restrictedZipsList, new Comparator<ZipCodesRestricted>() {
			@Override
			public int compare(ZipCodesRestricted zip1, ZipCodesRestricted zip2) {
				return Integer.valueOf(zip1.getLowerBound()).compareTo(zip2.getLowerBound());
			}
		});

		//logic for retrieving the finalzipcodes from the sorted zipcodes list 
		for (ZipCodesRestricted zipRestricted : restrictedZipsList) {
			if (tmpZip == null) {
				tmpZip = zipRestricted;
			} else {
				if (tmpZip.getUpperBound() >= zipRestricted.getLowerBound()) {
					tmpZip.setUpperBound((tmpZip.getUpperBound() >= zipRestricted.getUpperBound()) 
					? tmpZip.getUpperBound() 
					: zipRestricted.getUpperBound());
				} else {
					finalZipCodes.add(tmpZip);
					tmpZip = zipRestricted;
				}
			}
		}
		finalZipCodes.add(tmpZip);
		System.out.println("Minimized Zip's: ");
		for (ZipCodesRestricted minimizedZip : finalZipCodes) {
			System.out.println("["+minimizedZip.getLowerBound() + "," + minimizedZip.getUpperBound()+"]");
		}
	}

	
}
