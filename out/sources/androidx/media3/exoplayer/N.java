package androidx.media3.exoplayer;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class N implements com.google.common.base.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Serializable f18059c;

    public /* synthetic */ N(int i10, Serializable serializable) {
        this.f18058b = i10;
        this.f18059c = serializable;
    }

    @Override // com.google.common.base.j
    public final Object get() {
        switch (this.f18058b) {
            case 0:
                return Boolean.valueOf(((AtomicBoolean) this.f18059c).get());
            default:
                try {
                    return (androidx.media3.exoplayer.source.h.a) ((Class) this.f18059c).getConstructor(null).newInstance(null);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}
