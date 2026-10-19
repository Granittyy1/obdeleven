package R4;

import U4.C0804l;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.braze.models.FeatureFlag;
import com.google.android.gms.internal.measurement.InterfaceC1884q;
import com.google.android.gms.internal.measurement.K;
import com.google.android.gms.internal.measurement.Y1;
import com.voltasit.obdeleven.R;
import p191p5.InterfaceC2755a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class E implements InterfaceC2755a, K {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5264c;

    public /* synthetic */ E(Object obj, Object obj2) {
        this.f5263b = obj;
        this.f5264c = obj2;
    }

    public String a(String str) {
        String str2 = (String) this.f5264c;
        Resources resources = (Resources) this.f5263b;
        int identifier = resources.getIdentifier(str, FeatureFlag.PROPERTIES_TYPE_STRING, str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // com.google.android.gms.internal.measurement.K
    public Y1 b(InterfaceC1884q interfaceC1884q) {
        Y1 y1D = ((Y1) this.f5263b).d();
        y1D.e((String) this.f5264c, interfaceC1884q);
        return y1D;
    }

    @Override // p191p5.InterfaceC2755a
    public Object i(p191p5.g gVar) {
        Bundle bundle;
        C0756c c0756c = (C0756c) this.f5263b;
        c0756c.getClass();
        return (gVar.o() && (bundle = (Bundle) gVar.k()) != null && bundle.containsKey("google.messenger")) ? c0756c.a((Bundle) this.f5264c).p(D.f5262b, C.f5261b) : gVar;
    }

    public E(Context context) {
        C0804l.h(context);
        Resources resources = context.getResources();
        this.f5263b = resources;
        this.f5264c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }
}
