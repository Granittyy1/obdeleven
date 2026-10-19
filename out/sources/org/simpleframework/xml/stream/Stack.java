package org.simpleframework.xml.stream;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
class Stack<T> extends ArrayList<T> {
    public Stack(int i10) {
        super(i10);
    }

    public T bottom() {
        if (size() <= 0) {
            return null;
        }
        return get(0);
    }

    public T pop() {
        int size = size();
        if (size <= 0) {
            return null;
        }
        return remove(size - 1);
    }

    public T push(T t8) {
        add(t8);
        return t8;
    }

    public T top() {
        int size = size();
        if (size <= 0) {
            return null;
        }
        return get(size - 1);
    }
}
