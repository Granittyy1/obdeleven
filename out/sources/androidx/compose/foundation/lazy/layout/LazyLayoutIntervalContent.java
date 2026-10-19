package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval;

/* JADX INFO: compiled from: LazyLayoutIntervalContent.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class LazyLayoutIntervalContent<Interval extends Interval> {

    /* JADX INFO: compiled from: LazyLayoutIntervalContent.kt */
    public interface Interval {
        default Ia.l<Integer, Object> getKey() {
            return null;
        }

        default Ia.l<Integer, Object> getType() {
            return new Ia.l() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval$type$1
                @Override // Ia.l
                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    ((Number) obj).intValue();
                    return null;
                }
            };
        }
    }

    public final Object h(int i10) {
        C0971f c0971fB = i().b(i10);
        return c0971fB.f10717c.getType().invoke(Integer.valueOf(i10 - c0971fB.f10715a));
    }

    public abstract P i();

    public final Object j(int i10) {
        Object objInvoke;
        C0971f c0971fB = i().b(i10);
        int i11 = i10 - c0971fB.f10715a;
        Ia.l<Integer, Object> key = c0971fB.f10717c.getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i11))) == null) ? new C0969d(i10) : objInvoke;
    }
}
