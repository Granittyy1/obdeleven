package io.reactivex.internal.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p183oa.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ArrayListSupplier implements Callable<List<Object>>, c<Object, List<Object>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayListSupplier f40970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ArrayListSupplier[] f40971c;

    static {
        ArrayListSupplier arrayListSupplier = new ArrayListSupplier("INSTANCE", 0);
        f40970b = arrayListSupplier;
        f40971c = new ArrayListSupplier[]{arrayListSupplier};
    }

    public ArrayListSupplier() {
        throw null;
    }

    public static ArrayListSupplier valueOf(String str) {
        return (ArrayListSupplier) Enum.valueOf(ArrayListSupplier.class, str);
    }

    public static ArrayListSupplier[] values() {
        return (ArrayListSupplier[]) f40971c.clone();
    }

    @Override // p183oa.c, p311z4.f
    public final Object apply(Object obj) throws Exception {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    public final List<Object> call() throws Exception {
        return new ArrayList();
    }
}
