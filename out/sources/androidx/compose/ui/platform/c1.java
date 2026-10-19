package androidx.compose.ui.platform;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.RandomAccess;

/* JADX INFO: compiled from: WeakCache.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RandomAccess f15035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15036b;

    public c1(com.android.billingclient.api.a aVar, ArrayList arrayList) {
        this.f15035a = arrayList;
        this.f15036b = aVar;
    }

    public c1() {
        this.f15035a = new androidx.compose.runtime.collection.c(new Reference[16]);
        this.f15036b = new ReferenceQueue();
    }
}
