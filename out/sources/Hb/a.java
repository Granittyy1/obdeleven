package Hb;

import android.os.Bundle;
import androidx.lifecycle.N;
import androidx.lifecycle.c0;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.b;
import kotlin.jvm.internal.i;
import p014b1.d;
import p248u2.e;

/* JADX INFO: compiled from: BundleExt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static final p014b1.a a(Bundle bundle, c0 viewModelStoreOwner) {
        Object objA;
        i.e(bundle, "<this>");
        i.e(viewModelStoreOwner, "viewModelStoreOwner");
        if (bundle.keySet().isEmpty()) {
            return null;
        }
        try {
            d dVar = new d((Object) null);
            LinkedHashMap linkedHashMap = dVar.f20497a;
            linkedHashMap.put(N.f17762c, bundle);
            linkedHashMap.put(N.f17761b, viewModelStoreOwner);
            linkedHashMap.put(N.f17760a, (e) viewModelStoreOwner);
            objA = dVar;
        } catch (Throwable th) {
            objA = b.a(th);
        }
        return (p014b1.a) (objA instanceof Result.Failure ? null : objA);
    }
}
