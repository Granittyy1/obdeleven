package com.android.billingclient.api;

import B6.c;
import com.google.android.gms.internal.play_billing.C2018x;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f23554c;

    /* JADX INFO: renamed from: com.android.billingclient.api.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    public static class C0244a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f23556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f23557c;

        public final a a() {
            a aVar = new a();
            aVar.f23552a = this.f23555a;
            aVar.f23553b = this.f23556b;
            aVar.f23554c = this.f23557c;
            return aVar;
        }
    }

    public static C0244a a() {
        C0244a c0244a = new C0244a();
        c0244a.f23556b = 0;
        c0244a.f23557c = "";
        return c0244a;
    }

    public final String toString() {
        return c.d("Response Code: ", C2018x.g(this.f23552a), ", Debug Message: ", this.f23554c);
    }
}
