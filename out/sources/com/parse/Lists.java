package com.parse;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class Lists {

    public static class Partition<T> extends AbstractList<List<T>> {
        private final List<T> list;
        private final int size;

        public Partition(List<T> list, int i10) {
            this.list = list;
            this.size = i10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return (int) Math.ceil(((double) this.list.size()) / ((double) this.size));
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> get(int i10) {
            int i11 = this.size;
            int i12 = i10 * i11;
            return this.list.subList(i12, Math.min(i11 + i12, this.list.size()));
        }
    }

    public static <T> List<List<T>> partition(List<T> list, int i10) {
        return new Partition(list, i10);
    }
}
