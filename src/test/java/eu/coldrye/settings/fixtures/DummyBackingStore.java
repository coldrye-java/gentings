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

import eu.coldrye.settings.BackingStore;
import eu.coldrye.settings.BackingStoreException;

import java.util.Properties;
import java.util.Set;

/**
 *
 *
 */
public class DummyBackingStore implements BackingStore {

  private Properties properties = new Properties();

  @Override
  public void deleteProperties() throws BackingStoreException {

    ((Properties) this.getProperties()).clear();
  }

  @Override
  public Boolean getBoolean(String key) throws BackingStoreException {

    Boolean result = null;
    String value = this.getString(key);
    if (null != value) {
      result = Boolean.valueOf(value);
    }
    return result;
  }

  @Override
  public Byte getByte(String key) throws BackingStoreException {

    Byte result = null;
    String value = this.getString(key);
    if (null != value) {
      result = Byte.valueOf(value);
    }
    return result;
  }

  @Override
  public Character getCharacter(String key) throws BackingStoreException {

    Character result = null;
    String value = this.getString(key);
    if (null != value) {
      result = Character.valueOf(value.charAt(0));
    }
    return result;
  }

  @Override
  public Double getDouble(String key) throws BackingStoreException {

    Double result = null;
    String value = this.getString(key);
    if (null != value) {
      result = Double.valueOf(value);
    }
    return result;
  }

  @Override
  public Float getFloat(String key) throws BackingStoreException {

    Float result = null;
    String value = this.getString(key);
    if (null != value) {
      result = Float.valueOf(value);
    }
    return result;
  }

  @Override
  public Integer getInteger(String key) throws BackingStoreException {

    Integer result = null;
    String value = this.getString(key);
    if (null != value) {
      result = Integer.valueOf(value);
    }
    return result;
  }

  @Override
  public Long getLong(String key) throws BackingStoreException {

    Long result = null;
    String value = this.getString(key);
    if (null != value) {
      result = Long.valueOf(value);
    }
    return result;
  }

  @Override
  public Object getProperties() throws BackingStoreException {

    return this.properties;
  }

  @Override
  public Short getShort(String key) throws BackingStoreException {

    Short result = null;
    String value = this.getString(key);
    if (null != value) {
      result = Short.valueOf(value);
    }
    return result;
  }

  @Override
  public String getString(String key) throws BackingStoreException {

    return ((Properties) this.getProperties()).getProperty(key);
  }

  @Override
  public Set<String> keySet() throws BackingStoreException {

    return ((Properties) this.getProperties()).stringPropertyNames();
  }

  @Override
  public void loadProperties() throws BackingStoreException {

  }

  @Override
  public void setBoolean(String key, Object value) throws
    BackingStoreException {

    this.setString(key, value.toString());
  }

  @Override
  public void setByte(String key, Byte value) throws BackingStoreException {

    this.setString(key, value.toString());
  }

  @Override
  public void setCharacter(String key, Character value) throws
    BackingStoreException {

    this.setString(key, value.toString());
  }

  @Override
  public void setDouble(String key, Double value) throws BackingStoreException {

    this.setString(key, value.toString());
  }

  @Override
  public void setFloat(String key, Float value) throws BackingStoreException {

    this.setString(key, value.toString());
  }

  @Override
  public void setInteger(String key, Integer value) throws
    BackingStoreException {

    this.setString(key, value.toString());
  }

  @Override
  public void setLong(String key, Long value) throws BackingStoreException {

    this.setString(key, value.toString());
  }

  @Override
  public void setShort(String key, Short value) throws BackingStoreException {

    this.setString(key, value.toString());
  }

  @Override
  public void setString(String key, String value) throws BackingStoreException {

    ((Properties) this.getProperties()).setProperty(key, value);
  }

  @Override
  public void storeProperties() throws BackingStoreException {

  }
}
