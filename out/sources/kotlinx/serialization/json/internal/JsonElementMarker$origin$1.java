package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: JsonElementMarker.kt */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class JsonElementMarker$origin$1 extends FunctionReferenceImpl implements Ia.p<p011ab.e, Integer, Boolean> {
    @Override // Ia.p
    public final Boolean invoke(p011ab.e eVar, Integer num) {
        p011ab.e p10 = eVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.i.e(p10, "p0");
        JsonElementMarker jsonElementMarker = (JsonElementMarker) this.receiver;
        jsonElementMarker.getClass();
        boolean z10 = !p10.j(iIntValue) && p10.i(iIntValue).c();
        jsonElementMarker.f43967b = z10;
        return Boolean.valueOf(z10);
    }
}
