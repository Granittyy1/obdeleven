package androidx.media3.exoplayer;

import android.app.Application;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import io.intercom.android.sdk.fcm.IntercomFcmMessengerService;
import p033c7.C1494g;

/* JADX INFO: renamed from: androidx.media3.exoplayer.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1402u implements j1.j.a, p183oa.b, p183oa.c, p191p5.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18806b;

    public /* synthetic */ C1402u(Object obj) {
        this.f18806b = obj;
    }

    @Override // p183oa.b
    public void a(Object obj) {
        ((C1494g) this.f18806b).f22450d = null;
    }

    @Override // p183oa.c, p311z4.f
    public Object apply(Object obj) {
        return (CampaignProto$ThickContent) this.f18806b;
    }

    @Override // p191p5.c
    public void e(p191p5.g gVar) {
        IntercomFcmMessengerService.lambda$initialize$0((Application) this.f18806b, gVar);
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        h0 h0Var = (h0) this.f18806b;
        ((g1.v.c) obj).Q(h0Var.f18415e, h0Var.f18421l);
    }
}
