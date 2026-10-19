package p033c7;

import android.os.Bundle;
import p123ja.e;
import p192p6.a;

/* JADX INFO: renamed from: c7.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FiamAnalyticsConnectorListener.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1507u implements a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e<String> f22507a;

    @Override // p6.a.b
    public final void a(int i10, Bundle bundle) {
        if (i10 == 2) {
            this.f22507a.c(bundle.getString("events"));
        }
    }
}
