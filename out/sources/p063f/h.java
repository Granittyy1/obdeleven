package p063f;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: IntentSenderRequest.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntentSender f34898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f34899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f34901e;

    /* JADX INFO: compiled from: IntentSenderRequest.kt */
    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel inParcel) {
            i.e(inParcel, "inParcel");
            Parcelable parcelable = inParcel.readParcelable(IntentSender.class.getClassLoader());
            i.b(parcelable);
            return new h((IntentSender) parcelable, (Intent) inParcel.readParcelable(Intent.class.getClassLoader()), inParcel.readInt(), inParcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i10) {
            return new h[i10];
        }
    }

    public h(IntentSender intentSender, Intent intent, int i10, int i11) {
        i.e(intentSender, "intentSender");
        this.f34898b = intentSender;
        this.f34899c = intent;
        this.f34900d = i10;
        this.f34901e = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        i.e(dest, "dest");
        dest.writeParcelable(this.f34898b, i10);
        dest.writeParcelable(this.f34899c, i10);
        dest.writeInt(this.f34900d);
        dest.writeInt(this.f34901e);
    }
}
