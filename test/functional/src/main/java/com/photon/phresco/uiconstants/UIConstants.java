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
package com.photon.phresco.uiconstants;


import java.io.IOException;
import java.lang.reflect.Field;

public class UIConstants {
	

	
    private ReadXMLFile readXml;
    public String CREATENEWACC="createnewacc";
    public String NAME="name";
    public String EMAIL="email";
    public String SUBMIT="submit";
    public String LOGIN="login";
    public String LOGINPASSWORD="loginpassword";
    public String SEARCH="search";
    public String MYACC="myacc";
    public String LOGOUT="logout";
    

    
    /**
	 * Reading the UIConstants xml files through UIConstants() Constructor 
	 */
	
	public UIConstants() {
		try {
			readXml = new ReadXMLFile();
			readXml.loadUIConstants();
			Field[] arrayOfField1 = super.getClass().getFields();
			Field[] arrayOfField2 = arrayOfField1;
			int i = arrayOfField2.length;
			for (int j = 0; j < i; ++j) {
				Field localField = arrayOfField2[j];
				Object localObject = localField.get(this);
				if (localObject instanceof String)
					localField
							.set(this, readXml.getValue((String) localObject));

			}
		} catch (Exception localException) {
			throw new RuntimeException("Loading "
					+ super.getClass().getSimpleName() + " failed",
					localException);
		}
	}
}
