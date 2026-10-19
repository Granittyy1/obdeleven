package Q9;

import android.app.Application;
import androidx.lifecycle.C1362e;
import io.intercom.android.sdk.AppIdentityInjector;
import io.intercom.android.sdk.survey.ui.models.Answer;
import p011ab.e;
import p037cb.C1536l0;
import p111ia.c;
import p293xa.r;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5136c;

    public /* synthetic */ a(int i10, Object obj) {
        this.f5135b = i10;
        this.f5136c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, xa.g] */
    @Override // Ia.a
    public final Object invoke() {
        switch (this.f5135b) {
            case 0:
                return Answer.MediaAnswer.MediaItem.uploadStatus_delegate$lambda$0((Answer.MediaAnswer.MediaItem) this.f5136c);
            case 1:
                ((C1362e) this.f5136c).f17817m = null;
                return r.f47939a;
            case 2:
                C1536l0 c1536l0 = (C1536l0) this.f5136c;
                return Integer.valueOf(c.f(c1536l0, (e[]) c1536l0.j.getValue()));
            default:
                return AppIdentityInjector.httpClientWithoutHeaders_delegate$lambda$2((Application) this.f5136c);
        }
    }
}
