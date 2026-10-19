package p297y1;

import com.google.common.base.j;
import p078g1.D;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements j {
    @Override // com.google.common.base.j
    public final Object get() {
        try {
            Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
            Object objInvoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
            objInvoke.getClass();
            return (D.a) objInvoke;
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }
}
