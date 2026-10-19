package p045d6;

import p057e6.g;
import p191p5.h;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends p057e6.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f34574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f34575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f34576e;

    public f(g gVar, h hVar) {
        g gVar2 = new g("OnRequestInstallCallback");
        this.f34576e = gVar;
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.f34574c = gVar2;
        this.f34575d = hVar;
    }
}
