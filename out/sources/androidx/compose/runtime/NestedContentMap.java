package androidx.compose.runtime;

import androidx.collection.ObjectList;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class NestedContentMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.collection.K<Object, Object> f12882a = androidx.compose.runtime.collection.b.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.collection.K<Object, Object> f12883b = androidx.compose.runtime.collection.b.b();

    public final void a(final T t8) {
        Object objD = this.f12883b.d(t8);
        if (objD != null) {
            boolean z10 = objD instanceof androidx.collection.I;
            androidx.collection.K<Object, Object> k10 = this.f12882a;
            if (!z10) {
                androidx.compose.runtime.collection.b.d(k10, (Q) objD, new Ia.l<Y, Boolean>() { // from class: androidx.compose.runtime.NestedContentMap$usedContainer$1$1
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final Boolean invoke(Y y10) {
                        return Boolean.valueOf(kotlin.jvm.internal.i.a(y10.f12933b, t8));
                    }
                });
                return;
            }
            ObjectList objectList = (ObjectList) objD;
            Object[] objArr = objectList.f9108a;
            int i10 = objectList.f9109b;
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj = objArr[i11];
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                androidx.compose.runtime.collection.b.d(k10, (Q) obj, new Ia.l<Y, Boolean>() { // from class: androidx.compose.runtime.NestedContentMap$usedContainer$1$1
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final Boolean invoke(Y y10) {
                        return Boolean.valueOf(kotlin.jvm.internal.i.a(y10.f12933b, t8));
                    }
                });
            }
        }
    }
}
