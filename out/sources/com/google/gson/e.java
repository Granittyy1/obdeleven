package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: JsonArray.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends g implements Iterable<g> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<g> f28824b = new ArrayList<>();

    @Override // com.google.gson.g
    public final String e() {
        ArrayList<g> arrayList = this.f28824b;
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0).e();
        }
        throw new IllegalStateException(J4.i.b(size, "Array must have size 1, but has size "));
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof e) && ((e) obj).f28824b.equals(this.f28824b));
    }

    public final int hashCode() {
        return this.f28824b.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<g> iterator() {
        return this.f28824b.iterator();
    }
}
