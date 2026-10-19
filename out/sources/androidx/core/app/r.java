package androidx.core.app;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* JADX INFO: compiled from: NotificationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f16765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f16766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H[] f16767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f16768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f16770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public final int f16771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CharSequence f16772h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PendingIntent f16773i;

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IconCompat f16774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharSequence f16775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PendingIntent f16776c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f16777d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Bundle f16778e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ArrayList<H> f16779f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f16780g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f16781h;

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle());
        }

        public final r a() {
            if (this.f16781h && this.f16776c == null) {
                throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList<H> arrayList3 = this.f16779f;
            if (arrayList3 != null) {
                for (H h8 : arrayList3) {
                    h8.getClass();
                    arrayList2.add(h8);
                }
            }
            H[] hArr = arrayList.isEmpty() ? null : (H[]) arrayList.toArray(new H[arrayList.size()]);
            return new r(this.f16774a, this.f16775b, this.f16776c, this.f16778e, arrayList2.isEmpty() ? null : (H[]) arrayList2.toArray(new H[arrayList2.size()]), hArr, this.f16777d, this.f16780g, this.f16781h);
        }

        public a(int i10, PendingIntent pendingIntent, String str) {
            this(i10 != 0 ? IconCompat.e(null, "", i10) : null, str, pendingIntent, new Bundle());
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
            this.f16777d = true;
            this.f16780g = true;
            this.f16774a = iconCompat;
            this.f16775b = v.b(charSequence);
            this.f16776c = pendingIntent;
            this.f16778e = bundle;
            this.f16779f = null;
            this.f16777d = true;
            this.f16780g = true;
            this.f16781h = false;
        }
    }

    public r(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, H[] hArr, H[] hArr2, boolean z10, boolean z11, boolean z12) {
        this.f16769e = true;
        this.f16766b = iconCompat;
        if (iconCompat != null) {
            int i10 = iconCompat.f16834a;
            if ((i10 == -1 ? IconCompat.a.c(iconCompat.f16835b) : i10) == 2) {
                this.f16771g = iconCompat.f();
            }
        }
        this.f16772h = v.b(charSequence);
        this.f16773i = pendingIntent;
        this.f16765a = bundle == null ? new Bundle() : bundle;
        this.f16767c = hArr;
        this.f16768d = z10;
        this.f16769e = z11;
        this.f16770f = z12;
    }

    public final IconCompat a() {
        int i10;
        if (this.f16766b == null && (i10 = this.f16771g) != 0) {
            this.f16766b = IconCompat.e(null, "", i10);
        }
        return this.f16766b;
    }
}
