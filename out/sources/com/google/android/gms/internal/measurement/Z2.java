package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class Z2 extends AbstractC1914u2<String> implements InterfaceC1790c3, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Object> f25649c;

    static {
        new Z2();
    }

    public Z2(ArrayList<Object> arrayList) {
        super(true);
        this.f25649c = arrayList;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1790c3
    public final void H(zzij zzijVar) {
        d();
        this.f25649c.add(zzijVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        d();
        this.f25649c.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(this.f25649c.size(), collection);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1790c3
    public final InterfaceC1790c3 b() {
        return this.f25868b ? new U3(this) : this;
    }

    @Override // com.google.android.gms.internal.measurement.V2
    public final V2 c(int i10) {
        List<Object> list = this.f25649c;
        if (i10 < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(list);
        return new Z2((ArrayList<Object>) arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        d();
        this.f25649c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        List<Object> list = this.f25649c;
        Object obj = list.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzij) {
            zzij zzijVar = (zzij) obj;
            zzijVar.getClass();
            Charset charset = Q2.f25563a;
            String strS = zzijVar.B() == 0 ? "" : zzijVar.s();
            if (zzijVar.G()) {
                list.set(i10, strS);
            }
            return strS;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, Q2.f25563a);
        C1777a4 c1777a4 = Z3.f25650a;
        int length = bArr.length;
        c1777a4.getClass();
        if (AbstractC1784b4.a(bArr, 0, length)) {
            list.set(i10, str);
        }
        return str;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        d();
        Object objRemove = this.f25649c.remove(i10);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof zzij)) {
            return new String((byte[]) objRemove, Q2.f25563a);
        }
        zzij zzijVar = (zzij) objRemove;
        zzijVar.getClass();
        Charset charset = Q2.f25563a;
        return zzijVar.B() == 0 ? "" : zzijVar.s();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        d();
        Object obj2 = this.f25649c.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof zzij)) {
            return new String((byte[]) obj2, Q2.f25563a);
        }
        zzij zzijVar = (zzij) obj2;
        zzijVar.getClass();
        Charset charset = Q2.f25563a;
        return zzijVar.B() == 0 ? "" : zzijVar.s();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25649c.size();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1790c3
    public final Object w(int i10) {
        return this.f25649c.get(i10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1790c3
    public final List<?> z() {
        return Collections.unmodifiableList(this.f25649c);
    }

    public Z2(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends String> collection) {
        d();
        if (collection instanceof InterfaceC1790c3) {
            collection = ((InterfaceC1790c3) collection).z();
        }
        boolean zAddAll = this.f25649c.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public Z2() {
        super(false);
        this.f25649c = Collections.emptyList();
    }
}
