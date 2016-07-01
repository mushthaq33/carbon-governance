/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.carbon.governance.taxonomy.beans;

/**
 * This is bean class for keeping rxt meta data
 */
public class RXTBean {
    private String rxtName;
    private String taxonomy;
    private boolean isDeleteAllowed = false;

    public void setRxtName(String setRxtName) {
        this.rxtName = setRxtName;
    }

    public void setTaxonomy(String taxonomy) {
        this.taxonomy = taxonomy;
    }

    public String getRxtName() {
        return rxtName;
    }

    public String getTaxonomy() {
        return taxonomy;
    }

}