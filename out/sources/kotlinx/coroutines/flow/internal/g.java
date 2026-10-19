package kotlinx.coroutines.flow.internal;

import com.google.android.gms.internal.measurement.Y;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import p293xa.r;

/* JADX INFO: compiled from: Combine.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class g {
    public static final Object a(Ia.a aVar, Ia.q qVar, kotlin.coroutines.c cVar, InterfaceC2687d interfaceC2687d, InterfaceC2686c[] interfaceC2686cArr) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(aVar, qVar, null, interfaceC2687d, interfaceC2686cArr);
        i iVar = new i(cVar, cVar.getContext());
        Object objL = Y.l(iVar, iVar, combineKt$combineInternal$2);
        return objL == CoroutineSingletons.f43038b ? objL : r.f47939a;
    }
}
