package p037cb;

import Ia.l;
import io.intercom.android.sdk.models.OverlayState;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import kotlin.jvm.internal.i;
import p011ab.a;
import p293xa.r;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z0 implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22682c;

    public /* synthetic */ z0(int i10, Object obj) {
        this.f22681b = i10;
        this.f22682c = obj;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f22681b) {
            case 0:
                a buildClassSerialDescriptor = (a) obj;
                i.e(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                A0 a10 = (A0) this.f22682c;
                a.b(buildClassSerialDescriptor, "first", a10.f22532a.getDescriptor());
                a.b(buildClassSerialDescriptor, "second", a10.f22533b.getDescriptor());
                a.b(buildClassSerialDescriptor, "third", a10.f22534c.getDescriptor());
                return r.f47939a;
            default:
                return ((OverlayPresenter) this.f22682c).lambda$new$2((OverlayState) obj);
        }
    }
}
