package io.ktor.client.engine.okhttp;

import Ia.l;
import io.ktor.client.plugins.u;
import io.ktor.client.plugins.v;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.i;
import okhttp3.k;
import okhttp3.t;

/* JADX INFO: compiled from: OkHttpEngine.kt */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class OkHttpEngine$clientCache$1 extends FunctionReferenceImpl implements l<u.a, t> {
    /* JADX WARN: Type inference failed for: r0v3, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    @Override // Ia.l
    public final t invoke(u.a aVar) {
        u.a aVar2 = aVar;
        OkHttpConfig okHttpConfig = ((OkHttpEngine) this.receiver).f40295f;
        okHttpConfig.getClass();
        t.a aVarB = OkHttpEngine.f40294k.getValue().b();
        aVarB.f45636a = new k();
        okHttpConfig.f40291a.invoke(aVarB);
        if (aVar2 != null) {
            Long l10 = aVar2.f40406b;
            if (l10 != null) {
                long jLongValue = l10.longValue();
                cc.b bVar = v.f40408a;
                if (jLongValue == Long.MAX_VALUE) {
                    jLongValue = 0;
                }
                TimeUnit unit = TimeUnit.MILLISECONDS;
                i.e(unit, "unit");
                aVarB.f45657w = p172nb.b.b(jLongValue, unit);
            }
            Long l11 = aVar2.f40407c;
            if (l11 != null) {
                long jLongValue2 = l11.longValue();
                cc.b bVar2 = v.f40408a;
                long j = jLongValue2 == Long.MAX_VALUE ? 0L : jLongValue2;
                TimeUnit unit2 = TimeUnit.MILLISECONDS;
                i.e(unit2, "unit");
                aVarB.f45658x = p172nb.b.b(j, unit2);
                aVarB.f45659y = p172nb.b.b(jLongValue2 != Long.MAX_VALUE ? jLongValue2 : 0L, unit2);
            }
        }
        return new t(aVarB);
    }
}
