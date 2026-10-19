package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LazyStringArrayList.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2082y extends AbstractC2061c<String> implements InterfaceC2083z, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f29206c;

    static {
        new C2082y(10).f29134b = false;
    }

    public C2082y(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        d();
        this.f29206c.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(this.f29206c.size(), collection);
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        d();
        this.f29206c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        String str;
        ArrayList arrayList = this.f29206c;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            byteString.getClass();
            Charset charset = C2078u.f29200a;
            str = byteString.size() == 0 ? "" : byteString.B();
            if (byteString.q()) {
                arrayList.set(i10, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, C2078u.f29200a);
            Utf8.b bVar = Utf8.f29090a;
            if (Utf8.f29090a.c(bArr, 0, bArr.length) == 0) {
                arrayList.set(i10, str);
            }
        }
        return str;
    }

    @Override // com.google.protobuf.C2078u.d
    public final C2078u.d h(int i10) {
        ArrayList arrayList = this.f29206c;
        if (i10 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i10);
        arrayList2.addAll(arrayList);
        return new C2082y((ArrayList<Object>) arrayList2);
    }

    @Override // com.google.protobuf.InterfaceC2083z
    public final List<?> j() {
        return Collections.unmodifiableList(this.f29206c);
    }

    @Override // com.google.protobuf.InterfaceC2083z
    public final InterfaceC2083z l() {
        return this.f29134b ? new f0(this) : this;
    }

    @Override // com.google.protobuf.InterfaceC2083z
    public final Object m(int i10) {
        return this.f29206c.get(i10);
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        d();
        Object objRemove = this.f29206c.remove(i10);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof ByteString)) {
            return new String((byte[]) objRemove, C2078u.f29200a);
        }
        ByteString byteString = (ByteString) objRemove;
        byteString.getClass();
        Charset charset = C2078u.f29200a;
        return byteString.size() == 0 ? "" : byteString.B();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        d();
        Object obj2 = this.f29206c.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof ByteString)) {
            return new String((byte[]) obj2, C2078u.f29200a);
        }
        ByteString byteString = (ByteString) obj2;
        byteString.getClass();
        Charset charset = C2078u.f29200a;
        return byteString.size() == 0 ? "" : byteString.B();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29206c.size();
    }

    @Override // com.google.protobuf.InterfaceC2083z
    public final void u(ByteString byteString) {
        d();
        this.f29206c.add(byteString);
        ((AbstractList) this).modCount++;
    }

    public C2082y(ArrayList<Object> arrayList) {
        this.f29206c = arrayList;
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends String> collection) {
        d();
        if (collection instanceof InterfaceC2083z) {
            collection = ((InterfaceC2083z) collection).j();
        }
        boolean zAddAll = this.f29206c.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
