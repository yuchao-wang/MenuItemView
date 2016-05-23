## MenuItemView For Android

- TagViewGroup is a ViewGroup layout for tags;
- Min sdk on support is 15(Android 4.0.3)

### Demo

[Download](https://codeload.github.com/yuchao-wang/MenuItemView/zip/master)

![pic is here](https://github.com/yuchao-wang/MenuItemView/blob/master/image/screenshot.png)

### Update

#### 1.0.0

- MenuItemViewVertical
- MenuItemViewHorizontal

### Dependence 

```
compile 'wang.yuchao.android.library.view.menuitem:MenuItemViewLibrary:1.0.0'
```

### How To Use

**xml file**

then write like this in xml file

MenuItemViewHorizontal：`xmlns:MenuItemViewHorizontal="http://schemas.android.com/apk/res-auto"`

```
    <wang.yuchao.android.library.view.menuitem.MenuItemViewHorizontal
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        MenuItemViewHorizontal:item_hint_img="@color/blue"
        MenuItemViewHorizontal:item_hint_img_background="@color/green"
        MenuItemViewHorizontal:item_hint_img_visible="true"
        MenuItemViewHorizontal:item_hint_text="测试1"
        MenuItemViewHorizontal:item_hint_text_visible="true"
        MenuItemViewHorizontal:item_icon="@color/green"
        MenuItemViewHorizontal:item_icon_background="@color/red"
        MenuItemViewHorizontal:item_icon_visible="true"
        MenuItemViewHorizontal:item_text="哈哈"/>
```

MenuItemViewVertical:`xmlns:MenuItemViewVertical="http://schemas.android.com/apk/res-auto"`

```
        <wang.yuchao.android.library.view.menuitem.MenuItemViewVertical
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginLeft="1px"
            android:layout_weight="1"
            MenuItemViewVertical:icon_res="@color/green"
            MenuItemViewVertical:text="新浪"/>
```

### Proguard

```
-keep class wang.yuchao.android.library.** { *; }
-dontwarn wang.yuchao.android.library.**
```

### [About Me](http://yuchao.wang)


### License

```
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```