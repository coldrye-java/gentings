/*
 * Copyright 2018 coldrye.eu, Carsten Klein
 * Copyright 2013 axn software UG
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.coldrye.settings.fixtures;

import eu.coldrye.settings.Property;
import eu.coldrye.settings.PropertyClass;

import java.util.List;
import java.util.Map;

/**
 *
 *
 */
@PropertyClass
public class CustomTypeSettingsRoot {

  @Property
  private CustomType customType;

  @Property
  private CustomType[] customTypeArray;

  @Property
  private List<CustomType> customTypeList;

  @Property
  private Map<String, CustomType> customTypeMap;

  public List<CustomType> getCustomTypeList() {

    return customTypeList;
  }

  public void setCustomTypeList(List<CustomType> customTypeList) {

    this.customTypeList = customTypeList;
  }

  public Map<String, CustomType> getCustomTypeMap() {

    return customTypeMap;
  }

  public void setCustomTypeMap(Map<String, CustomType> customTypeMap) {

    this.customTypeMap = customTypeMap;
  }

  public CustomType[] getCustomTypeArray() {

    return customTypeArray;
  }

  public void setCustomTypeArray(CustomType[] customTypeArray) {

    this.customTypeArray = customTypeArray;
  }

  public CustomType getCustomType() {

    return customType;
  }

  public void setCustomType(CustomType customType) {

    this.customType = customType;
  }
}
