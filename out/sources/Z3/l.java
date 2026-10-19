package Z3;

import D2.V;
import android.net.Uri;
import com.braze.Braze;
import com.braze.IBrazeEndpointProvider;
import com.facebook.FacebookException;
import com.facebook.internal.FeatureManager;
import com.google.gson.JsonIOException;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements FeatureManager.a, IBrazeEndpointProvider, com.google.gson.internal.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7849b;

    public /* synthetic */ l(String str) {
        this.f7849b = str;
    }

    @Override // com.facebook.internal.FeatureManager.a
    public void e(boolean z10) {
        String str = this.f7849b;
        int i10 = FacebookException.f24757b;
        if (z10) {
            try {
                p238t4.a aVar = new p238t4.a(str);
                if ((aVar.f47263b == null || aVar.f47264c == null) ? false : true) {
                    V.u(aVar.f47262a, aVar.toString());
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.braze.IBrazeEndpointProvider
    public Uri getApiEndpoint(Uri uri) {
        return Braze.Companion.setConfiguredCustomEndpoint$lambda$12$lambda$11(this.f7849b, uri);
    }

    @Override // com.google.gson.internal.f
    public Object i() {
        throw new JsonIOException(this.f7849b);
    }
}
