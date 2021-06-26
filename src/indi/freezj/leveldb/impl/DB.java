package indi.freezj.leveldb.impl;

import indi.freezj.leveldb.util.Option;

public class DB {
    public void Open(Option op, String path) {
        native_open(op, path);
    }

    public native void native_open(Option op, String path);
}
