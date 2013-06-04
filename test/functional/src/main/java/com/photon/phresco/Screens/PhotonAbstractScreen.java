/**
 * Archetype - phresco-drupal7-archetype
 *
 * Copyright (C) 1999-2013 Photon Infotech Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.photon.phresco.Screens;

import java.io.IOException;


import com.photon.phresco.uiconstants.UIConstants;
import com.photon.phresco.uiconstants.DrupalData;
import com.photon.phresco.uiconstants.UserInfoConstants;

public class PhotonAbstractScreen extends BaseScreen {


	public PhotonAbstractScreen(){
	
	}
	
	/**
	 * Invoking the super class method through passing the vale of Browser,URL, Context, then PhpData,UIConstants,UserInfoConstants Xml Values
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws Exception
	 */

	protected PhotonAbstractScreen(String selectedBrowser,String selectedPlatform , String applicationURL,String applicationContext,DrupalData drupalConstants,UIConstants uiConstants,UserInfoConstants userInfo) throws IOException,
			Exception {
		super(selectedBrowser, selectedPlatform, applicationURL,applicationContext,drupalConstants,uiConstants,userInfo);

	

}
}