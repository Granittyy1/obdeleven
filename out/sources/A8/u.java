package A8;

import G8.B;
import java.util.Map;

/* JADX INFO: compiled from: TextTableDBMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@p293xa.d
public final class u {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public static p255u9.v a(B b10) {
        p255u9.v vVar = new p255u9.v();
        for (Map.Entry entry : b10.f3404a.entrySet()) {
            vVar.put((String) entry.getKey(), (String) entry.getValue());
        }
        vVar.setObjectId(b10.f3405b);
        return vVar;
    }
}
