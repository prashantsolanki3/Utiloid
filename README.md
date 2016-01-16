# Utiloid
Simple Android Utility Methods

## Utilities

* BASIC UTILS
* CONVERSION UTILS
* DISPLAY UTILS
* FILE UTILS
* TEXT UTILS
* PACKAGE UTILS

* Basic Interfaces of
 * RecyclerView Adapter


## Add to your project

[![Release](https://img.shields.io/github/release/prashantsolanki3/Utiloid.svg?label=jitpack)](https://jitpack.io/#prashantsolanki3/Utiloid)

Add JitPack to repositories in your project's root `build.gradle` file:

```Gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

Add the dependency to your module's `build.gradle` file:

```Gradle
dependencies {
	...
    compile 'com.github.prashantsolanki3:Utiloid:{ latest-version }'
}
```
[Find the latest version here](https://github.com/prashantsolanki3/Utiloid/releases)

## Usage

* Initialize in your `Application` class's `onCreate()`. And Use any where you want.

```Java
    @Override
    public void onCreate() {
        super.onCreate();

        //Simple Initialization
        Utiloid.init(getApplicationContext());

        //You can use utiloid now.
        Utiloid.BASIC_UTILS.isNull(getApplicationContext());
        
    }
```

### Simplify the usage.

Use static imports to simplify usage.

```Java

import static io.github.prashantsolanki3.utiloid.Utiloid.BASIC_UTILS.*;

//Now use Methods of BASIC UTILS directly in your class.

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        
        if(notNull(toolbar)) //notNull is a method of BASIC_UTILS.
        setSupportActionBar(toolbar);

    }

```

##Contribute

Contribute by creating issues (tagged enhancement, bugs) in the repo or create a pull request.

##Using Utiloid in your app? 

If you are using Utiloid in your app and would like to be listed here, please let us know opening a new issue!

###License

Copyright 2016 Prashant Solanki

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
