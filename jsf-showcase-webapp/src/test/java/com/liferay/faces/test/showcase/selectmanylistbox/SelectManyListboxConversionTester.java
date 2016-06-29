/**
 * Copyright (c) 2000-2016 Liferay, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.liferay.faces.test.showcase.selectmanylistbox;

import org.junit.Test;

import com.liferay.faces.test.showcase.selectmanymenu.SelectManyMenuTester;


/**
 * @author  Kyle Stiemann
 * @author  Philip White
 */
public class SelectManyListboxConversionTester extends SelectManyMenuTester {

	@Test
	public void runSelectManyListboxConversionTest() throws Exception {
		runSelectManyConversionTest(TEST_CONTEXT_URL + "/selectmanylistbox/conversion", select1Xpath,
			OPTION_CHILD_XPATH);
	}
}