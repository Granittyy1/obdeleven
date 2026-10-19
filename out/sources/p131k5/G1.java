package p131k5;

import U4.C0804l;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1898s0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class G1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f41798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f41799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f41800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f41801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1898s0 f41802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f41803h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f41804i;
    public final String j;

    public G1(Context context, C1898s0 c1898s0, Long l10) {
        this.f41803h = true;
        C0804l.h(context);
        Context applicationContext = context.getApplicationContext();
        C0804l.h(applicationContext);
        this.f41796a = applicationContext;
        this.f41804i = l10;
        if (c1898s0 != null) {
            this.f41802g = c1898s0;
            this.f41797b = c1898s0.f25839g;
            this.f41798c = c1898s0.f25838f;
            this.f41799d = c1898s0.f25837e;
            this.f41803h = c1898s0.f25836d;
            this.f41801f = c1898s0.f25835c;
            this.j = c1898s0.f25841i;
            Bundle bundle = c1898s0.f25840h;
            if (bundle != null) {
                this.f41800e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
