package p302y6;

import com.google.firebase.crashlytics.internal.common.a;
import p191p5.B;
import p191p5.f;
import p191p5.g;

/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes3.dex */
public final class v implements f<Boolean, Void> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f48397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f48398c;

    public v(a aVar, B b10) {
        this.f48398c = aVar;
        this.f48397b = b10;
    }

    @Override // p191p5.f
    public final g<Void> c(Boolean bool) throws Exception {
        return this.f48398c.f28086e.b(new u(this, bool));
    }
}
