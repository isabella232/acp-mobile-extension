/*
  ADOBE CONFIDENTIAL
  Copyright 2019 Adobe
  All Rights Reserved.
  NOTICE: Adobe permits you to use, modify, and distribute this file in
  accordance with the terms of the Adobe license agreement accompanying
  it. If you have received this file from a source other than Adobe,
  then your use, modification, or distribution of it requires the prior
  written permission of Adobe.
 */

package com.sample.company.extension;

class SkeletonExtensionConstants {
    static final String EVENT_TYPE_EXTENSION = "com.sample.company.eventType.skeletonExtension";
    static final String EVENT_SOURCE_EXTENSION_REQUEST_CONTENT = "com.sample.company.eventSource.requestContent";
    static final String EVENT_SOURCE_EXTENSION_RESPONSE_CONTENT = "com.sample.company.eventSource.responseContent";
    static final String EVENT_TYPE_ADOBE_HUB = "com.adobe.eventType.hub";
    static final String EVENT_SOURCE_ADOBE_SHARED_STATE = "com.adobe.eventSource.sharedState";

    static final String EVENT_SETTER_REQUEST_DATA_KEY = "setterdata";
    static final String EVENT_GETTER_RESPONSE_DATA_KEY = "getterdata";


    class SharedState {
        static final String STATE_OWNER = "stateowner";
        static final String CONFIGURATION = "com.adobe.module.configuration";
        static final String SAMPLE_CONFIG_KEY = "com.sample.company.configkey";

        private SharedState(){}
    }


    private SkeletonExtensionConstants() {}
}
