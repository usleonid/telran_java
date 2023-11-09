package telran.regex.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static telran.regex.utils.PhotoSelector.selectPictures;

class PhotoSelectorTest {

	static final String[] pictures = {
		"Paris\\20140101_090000.jpg",
		"Paris\\20140201_121005.jpg",				
		"Paris\\20150301_211035.jpg",				
		"Paris\\20150401_110023.gif",
		"Paris\\20150401_181705.jpg",				
		"Paris\\20150501_231035.gif",				
		"London\\20140205_090000.jpg",
		"London\\20140205_121005.jpg",				
		"London\\20140601_211035.gif",				
		"London\\20151001_110023.jpg",
		"London\\20151001_121705.jpg",				
		"London\\20151001_231035.jpg",
		"Chicago\\20150301_120001.png",
		"Chicago\\20151111_232000.png"
	};
	
	@Test
	void testAllEuropePictures() {
		String regex = "^(Paris|London)";
		String[] actual = selectPictures(pictures, regex);
		String[] expected = {
			"Paris\\20140101_090000.jpg",
			"Paris\\20140201_121005.jpg",				
			"Paris\\20150301_211035.jpg",				
			"Paris\\20150401_110023.gif",
			"Paris\\20150401_181705.jpg",				
			"Paris\\20150501_231035.gif",				
			"London\\20140205_090000.jpg",
			"London\\20140205_121005.jpg",				
			"London\\20140601_211035.gif",				
			"London\\20151001_110023.jpg",
			"London\\20151001_121705.jpg",				
			"London\\20151001_231035.jpg"
		};
//		assertEquals(expected.length, actual.length);
//		for (int i = 0; i < expected.length; i++) {
//			assertEquals(expected[i], actual[i]);
//		}
		assertArrayEquals(expected, actual); // testing and comparing of the arrays
	}
	
	@Test
	void testAllJpgAndPngPictures() {
		String regex = "\\.(jpg|png)$";
		String[] actual = selectPictures(pictures, regex);
		String[] expected = {
			"Paris\\20140101_090000.jpg",
			"Paris\\20140201_121005.jpg",				
			"Paris\\20150301_211035.jpg",				
			"Paris\\20150401_181705.jpg",								
			"London\\20140205_090000.jpg",
			"London\\20140205_121005.jpg",							
			"London\\20151001_110023.jpg",
			"London\\20151001_121705.jpg",				
			"London\\20151001_231035.jpg",
			"Chicago\\20150301_120001.png",
			"Chicago\\20151111_232000.png"
		};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void testAllAutumnPictures() {
	    String regex = "201[0-9]{2}(09|10|11)";
	    String[] actual = selectPictures(pictures, regex);
	    String[] expected = {
	        "Paris\\20150301_211035.jpg",                
	        "Paris\\20150401_110023.gif",
	        "Paris\\20150401_181705.jpg",                
	        "Paris\\20150501_231035.gif",                                
	        "London\\20140601_211035.gif",                
	        "London\\20151001_110023.jpg",
	        "London\\20151001_121705.jpg",                
	        "London\\20151001_231035.jpg",
	        "Chicago\\20150301_120001.png"
	    };
	    assertArrayEquals(expected, actual);
	}

	@Test
	void testAll2015SpringPictures() {
	    String regex = "2015(03|04|05)";
	    String[] actual = selectPictures(pictures, regex);
	    String[] expected = {
	        "Paris\\20150301_211035.jpg",                
	        "Paris\\20150401_110023.gif",
	        "Paris\\20150401_181705.jpg",                
	        "Paris\\20150501_231035.gif",                                
	        "London\\20151001_110023.jpg",
	        "London\\20151001_121705.jpg",                
	        "London\\20151001_231035.jpg",
	        "Chicago\\20150301_120001.png"
	    };
	    assertArrayEquals(expected, actual);
	}

	@Test
	void testAllNightPictures() {
	    String regex = "_([2][0-3]|[0][0-9])([0-5][0-9]){2}.";
	    String[] actual = selectPictures(pictures, regex);
	    String[] expected = {
	        "Paris\\20150301_211035.jpg",                
	        "Paris\\20150401_181705.jpg",                
	        "Paris\\20150501_231035.gif",                                
	        "London\\20140601_211035.gif",                
	        "London\\20151001_231035.jpg",
	        "Chicago\\20151111_232000.png"
	    };
	    assertArrayEquals(expected, actual);
	}

	@Test
	void testAllNightPicturesFromChicago() {
	    String regex = "^Chicago.*_([2][0-3]|[0][0-9])([0-5][0-9]){2}.";
	    String[] actual = selectPictures(pictures, regex);
	    String[] expected = {
	        "Chicago\\20151111_232000.png"
	    };
	    assertArrayEquals(expected, actual);
	}


}
