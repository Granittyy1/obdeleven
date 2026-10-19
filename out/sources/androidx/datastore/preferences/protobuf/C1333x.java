package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LazyStringArrayList.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1333x extends AbstractC1313c<String> implements InterfaceC1334y, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f17286c;

    static {
        new C1333x(10).f17214b = false;
    }

    public C1333x(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1334y
    public final void D(ByteString byteString) {
        d();
        this.f17286c.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        d();
        this.f17286c.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(this.f17286c.size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        d();
        this.f17286c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        String str;
        ArrayList arrayList = this.f17286c;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            byteString.getClass();
            Charset charset = C1330u.f17280a;
            str = byteString.size() == 0 ? "" : byteString.v();
            if (byteString.k()) {
                arrayList.set(i10, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, C1330u.f17280a);
            Utf8.b bVar = Utf8.f17175a;
            if (Utf8.f17175a.c(bArr, 0, bArr.length) == 0) {
                arrayList.set(i10, str);
            }
        }
        return str;
    }

    @Override // androidx.datastore.preferences.protobuf.C1330u.c
    public final C1330u.c h(int i10) {
        ArrayList arrayList = this.f17286c;
        if (i10 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i10);
        arrayList2.addAll(arrayList);
        return new C1333x((ArrayList<Object>) arrayList2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1334y
    public final List<?> j() {
        return Collections.unmodifiableList(this.f17286c);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1334y
    public final InterfaceC1334y l() {
        return this.f17214b ? new f0(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1334y
    public final Object m(int i10) {
        return this.f17286c.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        d();
        Object objRemove = this.f17286c.remove(i10);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof ByteString)) {
            return new String((byte[]) objRemove, C1330u.f17280a);
        }
        ByteString byteString = (ByteString) objRemove;
        byteString.getClass();
        Charset charset = C1330u.f17280a;
        return byteString.size() == 0 ? "" : byteString.v();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        d();
        Object obj2 = this.f17286c.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof ByteString)) {
            return new String((byte[]) obj2, C1330u.f17280a);
        }
        ByteString byteString = (ByteString) obj2;
        byteString.getClass();
        Charset charset = C1330u.f17280a;
        return byteString.size() == 0 ? "" : byteString.v();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17286c.size();
    }

    public C1333x(ArrayList<Object> arrayList) {
        this.f17286c = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends String> collection) {
        d();
        if (collection instanceof InterfaceC1334y) {
            collection = ((InterfaceC1334y) collection).j();
        }
        boolean zAddAll = this.f17286c.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
