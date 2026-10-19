package com.voltasit.obdeleven.notifications;

import android.os.Bundle;
import com.voltasit.obdeleven.domain.models.NotificationType;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: MegaOffer.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationType f31202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f31204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f31205d;

    public a(NotificationType notificationType, String str, String str2, Bundle bundle) {
        this.f31202a = notificationType;
        this.f31203b = str;
        this.f31204c = str2;
        this.f31205d = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f31202a == aVar.f31202a && i.a(this.f31203b, aVar.f31203b) && i.a(this.f31204c, aVar.f31204c) && i.a(this.f31205d, aVar.f31205d);
    }

    public final int hashCode() {
        return this.f31205d.hashCode() + B1.a.b(this.f31204c, B1.a.b(this.f31203b, this.f31202a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "MegaOffer(type=" + this.f31202a + ", title=" + this.f31203b + ", message=" + this.f31204c + ", bundle=" + this.f31205d + ")";
    }
}
