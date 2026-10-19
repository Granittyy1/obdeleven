package androidx.compose.ui.graphics.colorspace;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.ActivityC1347l;
import androidx.media3.exoplayer.h0;
import com.facebook.FacebookException;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements j, j1.j.a, p183oa.d, com.google.gson.internal.f, n4.v.b, p289x6.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13608b;

    public /* synthetic */ n(com.google.gson.d dVar, Type type) {
        this.f13608b = dVar;
    }

    @Override // p183oa.d
    public boolean a(Object obj) {
        CampaignProto$ThickContent campaignProto$ThickContent = (CampaignProto$ThickContent) obj;
        String str = (String) this.f13608b;
        if (str.equals("ON_FOREGROUND") && campaignProto$ThickContent.J()) {
            return true;
        }
        for (S6.f fVar : campaignProto$ThickContent.M()) {
            if (fVar.H().toString().equals(str) || fVar.G().H().equals(str)) {
                Q3.d.B();
                return true;
            }
        }
        return false;
    }

    @Override // n4.v.b
    public void b(Bundle bundle, FacebookException facebookException) {
        p165n4.e this$0 = (p165n4.e) this.f13608b;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        ActivityC1347l activity = this$0.getActivity();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        activity.setResult(-1, intent);
        activity.finish();
    }

    @Override // p289x6.b
    public void c(p289x6.a aVar) {
        p252u6.a aVar2 = (p252u6.a) this.f13608b;
        synchronized (aVar2) {
            try {
                if (aVar2.f47429c instanceof p289x6.c) {
                    aVar2.f47430d.add(aVar);
                }
                aVar2.f47429c.c(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.ui.graphics.colorspace.j
    public double g(double d10) {
        Rgb rgb = (Rgb) this.f13608b;
        return rgb.f13553n.g(Na.l.B(d10, rgb.f13545e, rgb.f13546f));
    }

    @Override // com.google.gson.internal.f
    public Object i() {
        return ((com.google.gson.d) this.f13608b).a();
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((g1.v.c) obj).g0(((h0) this.f13608b).l());
    }

    public /* synthetic */ n(Object obj) {
        this.f13608b = obj;
    }
}
