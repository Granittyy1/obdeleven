package p166n5;

import Fa.d;
import V4.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends a implements g {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f44965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44966c;

    public h(String str, ArrayList arrayList) {
        this.f44965b = arrayList;
        this.f44966c = str;
    }

    @Override // com.google.android.gms.common.api.g
    public final Status d() {
        return this.f44966c != null ? Status.f25304f : Status.f25307i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = d.o(parcel, 20293);
        ArrayList arrayList = this.f44965b;
        if (arrayList != null) {
            int iO2 = d.o(parcel, 1);
            parcel.writeStringList(arrayList);
            d.p(parcel, iO2);
        }
        d.k(parcel, 2, this.f44966c);
        d.p(parcel, iO);
    }
}
