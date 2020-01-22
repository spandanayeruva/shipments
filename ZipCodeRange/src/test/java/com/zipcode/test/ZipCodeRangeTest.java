package com.zipcode.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.zipcoderange.ZipCodeRange;


public class ZipCodeRangeTest {
	
	@Test
    public void initializeZipsTestCase1() {
		ZipCodeRange zp = new ZipCodeRange();
		List<ZipCodesRestricted> restrictedZipsList = new ArrayList<ZipCodesRestricted>();
		restrictedZipsList.add(new ZipCodesRestricted(49679, 52015));
		restrictedZipsList.add(new ZipCodesRestricted(49800, 50000));
		restrictedZipsList.add(new ZipCodesRestricted(51500, 53479));
		restrictedZipsList.add(new ZipCodesRestricted(45012, 46937));
		restrictedZipsList.add(new ZipCodesRestricted(54012, 59607));
		restrictedZipsList.add(new ZipCodesRestricted(45500, 45590));
		restrictedZipsList.add(new ZipCodesRestricted(45999, 47900));
		restrictedZipsList.add(new ZipCodesRestricted(44000, 45000));
		restrictedZipsList.add(new ZipCodesRestricted(43012, 45950));
		zp.zipcodes(restrictedZipsList);
	}
	
	@Test
    public void initializeZipsTestCase2() {
		ZipCodeRange zp = new ZipCodeRange();
		List<ZipCodesRestricted> restrictedZipsList = new ArrayList<ZipCodesRestricted>();
		restrictedZipsList.add(new ZipCodesRestricted(94133,94133));
		restrictedZipsList.add(new ZipCodesRestricted(94200,94299));
		restrictedZipsList.add(new ZipCodesRestricted(94600,94699));
		zp.zipcodes(restrictedZipsList);
	}
	
	@Test
    public void initializeZipsTestCase3() {
		ZipCodeRange zp = new ZipCodeRange();
		List<ZipCodesRestricted> restrictedZipsList = new ArrayList<ZipCodesRestricted>();
		restrictedZipsList.add(new ZipCodesRestricted(94133,94133));
		restrictedZipsList.add(new ZipCodesRestricted(94200,94299));
		restrictedZipsList.add(new ZipCodesRestricted(94226,94399));
		zp.zipcodes(restrictedZipsList);
	}
     
	public class ZipCodesRestricted {
		private int lowerBound;
		private int upperBound;

		public ZipCodesRestricted(int lower, int upper) {
			this.setLowerBound(lower);
			this.setUpperBound(upper);
		}

		public int getUpperBound() {
			return upperBound;
		}

		public void setUpperBound(int upperBound) {
			this.upperBound = upperBound;
		}

		public int getLowerBound() {
			return lowerBound;
		}

		public void setLowerBound(int lowerBound) {
			this.lowerBound = lowerBound;
		}
	}
}
