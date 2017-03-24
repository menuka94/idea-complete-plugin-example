package com.simpleplugin;

import com.intellij.lang.Language;

/**
 * Created by menuka on 3/24/17.
 */
public class SimpleLanguage extends Language {
    public static final SimpleLanguage INSTANCE = new SimpleLanguage();

    private SimpleLanguage(){
        super("Simple");
    }
}
