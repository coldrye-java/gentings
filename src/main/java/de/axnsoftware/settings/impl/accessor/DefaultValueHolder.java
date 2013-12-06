/*
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
package de.axnsoftware.settings.impl.accessor;

import de.axnsoftware.settings.ITypeMapper;

/**
 * The class DefaultValueHolder models a holder for a default value which was
 * declared by the {@code Property} annotation's {@code defaultValue} property.
 *
 * @author Carsten Klein "cklein" <carsten.klein@axn-software.de>
 * @since 1.0.0
 */
public class DefaultValueHolder {

    private Object cachedValue;
    private String defaultValue;
    private Boolean doNotCacheAgain;
    private Class<?> type;
    private ITypeMapper typeMapper;

    public DefaultValueHolder(final String defaultValue, final Class<?> type, final ITypeMapper typeMapper) {
        this.defaultValue = defaultValue;
        this.doNotCacheAgain = Boolean.FALSE;
        this.type = type;
        this.typeMapper = typeMapper;
    }

    /**
     * Return the mapped default value.
     *
     * @return the mapped default value or null
     */
    public Object getValue() {
        if (this.cachedValue == null && !this.doNotCacheAgain) {
            this.cachedValue = this.typeMapper.valueOf(this.defaultValue, this.type);
            if (this.cachedValue == null || this.defaultValue.equals(this.cachedValue)) {
                this.doNotCacheAgain = Boolean.TRUE;
            }
        }
        return this.cachedValue;
    }
}