package R4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: R4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0754a extends V4.a {
    public static final Parcelable.Creator<C0754a> CREATOR = new C0757d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f5265b;

    public C0754a(Intent intent) {
        this.f5265b = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = Fa.d.o(parcel, 20293);
        Fa.d.j(parcel, 1, this.f5265b, i10);
        Fa.d.p(parcel, iO);
    }
}
